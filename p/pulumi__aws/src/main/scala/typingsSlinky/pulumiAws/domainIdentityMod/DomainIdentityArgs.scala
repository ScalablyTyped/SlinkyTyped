package typingsSlinky.pulumiAws.domainIdentityMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainIdentityArgs extends js.Object {
  /**
    * The domain name to assign to SES
    */
  val domain: Input[String] = js.native
}

object DomainIdentityArgs {
  @scala.inline
  def apply(domain: Input[String]): DomainIdentityArgs = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainIdentityArgs]
  }
  @scala.inline
  implicit class DomainIdentityArgsOps[Self <: DomainIdentityArgs] (val x: Self) extends AnyVal {
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

