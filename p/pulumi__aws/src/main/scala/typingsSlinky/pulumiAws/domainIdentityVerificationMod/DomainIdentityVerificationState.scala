package typingsSlinky.pulumiAws.domainIdentityVerificationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainIdentityVerificationState extends js.Object {
  /**
    * The ARN of the domain identity.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The domain name of the SES domain identity to verify.
    */
  val domain: js.UndefOr[Input[String]] = js.native
}

object DomainIdentityVerificationState {
  @scala.inline
  def apply(): DomainIdentityVerificationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainIdentityVerificationState]
  }
  @scala.inline
  implicit class DomainIdentityVerificationStateOps[Self <: DomainIdentityVerificationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
  }
  
}

