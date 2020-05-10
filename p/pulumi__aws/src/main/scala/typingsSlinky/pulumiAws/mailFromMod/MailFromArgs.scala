package typingsSlinky.pulumiAws.mailFromMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailFromArgs extends js.Object {
  /**
    * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
    */
  val behaviorOnMxFailure: js.UndefOr[Input[String]] = js.native
  /**
    * Verified domain name to generate DKIM tokens for.
    */
  val domain: Input[String] = js.native
  /**
    * Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
    */
  val mailFromDomain: Input[String] = js.native
}

object MailFromArgs {
  @scala.inline
  def apply(domain: Input[String], mailFromDomain: Input[String]): MailFromArgs = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], mailFromDomain = mailFromDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailFromArgs]
  }
  @scala.inline
  implicit class MailFromArgsOps[Self <: MailFromArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomain(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMailFromDomain(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailFromDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBehaviorOnMxFailure(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaviorOnMxFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBehaviorOnMxFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaviorOnMxFailure")(js.undefined)
        ret
    }
  }
  
}

