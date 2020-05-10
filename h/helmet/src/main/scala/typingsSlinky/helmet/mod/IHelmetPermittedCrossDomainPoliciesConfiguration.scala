package typingsSlinky.helmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHelmetPermittedCrossDomainPoliciesConfiguration extends js.Object {
  var permittedPolicies: js.UndefOr[String] = js.native
}

object IHelmetPermittedCrossDomainPoliciesConfiguration {
  @scala.inline
  def apply(): IHelmetPermittedCrossDomainPoliciesConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHelmetPermittedCrossDomainPoliciesConfiguration]
  }
  @scala.inline
  implicit class IHelmetPermittedCrossDomainPoliciesConfigurationOps[Self <: IHelmetPermittedCrossDomainPoliciesConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPermittedPolicies(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permittedPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermittedPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permittedPolicies")(js.undefined)
        ret
    }
  }
  
}

