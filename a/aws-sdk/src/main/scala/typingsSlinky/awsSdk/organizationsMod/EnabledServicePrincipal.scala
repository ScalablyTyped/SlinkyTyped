package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnabledServicePrincipal extends js.Object {
  /**
    * The date that the service principal was enabled for integration with AWS Organizations.
    */
  var DateEnabled: js.UndefOr[js.Date] = js.native
  /**
    * The name of the service principal. This is typically in the form of a URL, such as:  servicename.amazonaws.com.
    */
  var ServicePrincipal: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.ServicePrincipal] = js.native
}

object EnabledServicePrincipal {
  @scala.inline
  def apply(): EnabledServicePrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnabledServicePrincipal]
  }
  @scala.inline
  implicit class EnabledServicePrincipalOps[Self <: EnabledServicePrincipal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateEnabled(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withServicePrincipal(value: ServicePrincipal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServicePrincipal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServicePrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServicePrincipal")(js.undefined)
        ret
    }
  }
  
}

