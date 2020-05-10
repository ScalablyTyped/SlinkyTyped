package typingsSlinky.pulumiAws.domainIdentityVerificationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainIdentityVerificationArgs extends js.Object {
  /**
    * The domain name of the SES domain identity to verify.
    */
  val domain: Input[String] = js.native
}

object DomainIdentityVerificationArgs {
  @scala.inline
  def apply(domain: Input[String]): DomainIdentityVerificationArgs = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainIdentityVerificationArgs]
  }
  @scala.inline
  implicit class DomainIdentityVerificationArgsOps[Self <: DomainIdentityVerificationArgs] (val x: Self) extends AnyVal {
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
  }
  
}

