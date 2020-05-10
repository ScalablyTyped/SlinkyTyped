package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceNowParameters extends js.Object {
  /**
    * URL of the base site.
    */
  var SiteBaseUrl: typingsSlinky.awsSdk.quicksightMod.SiteBaseUrl = js.native
}

object ServiceNowParameters {
  @scala.inline
  def apply(SiteBaseUrl: SiteBaseUrl): ServiceNowParameters = {
    val __obj = js.Dynamic.literal(SiteBaseUrl = SiteBaseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceNowParameters]
  }
  @scala.inline
  implicit class ServiceNowParametersOps[Self <: ServiceNowParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSiteBaseUrl(value: SiteBaseUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SiteBaseUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

