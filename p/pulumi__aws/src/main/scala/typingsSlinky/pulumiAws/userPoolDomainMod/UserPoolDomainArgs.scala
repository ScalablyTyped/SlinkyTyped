package typingsSlinky.pulumiAws.userPoolDomainMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolDomainArgs extends js.Object {
  /**
    * The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
    */
  val certificateArn: js.UndefOr[Input[String]] = js.native
  /**
    * The domain string.
    */
  val domain: Input[String] = js.native
  /**
    * The user pool ID.
    */
  val userPoolId: Input[String] = js.native
}

object UserPoolDomainArgs {
  @scala.inline
  def apply(domain: Input[String], userPoolId: Input[String]): UserPoolDomainArgs = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolDomainArgs]
  }
  @scala.inline
  implicit class UserPoolDomainArgsOps[Self <: UserPoolDomainArgs] (val x: Self) extends AnyVal {
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
    def withUserPoolId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificateArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateArn")(js.undefined)
        ret
    }
  }
  
}

