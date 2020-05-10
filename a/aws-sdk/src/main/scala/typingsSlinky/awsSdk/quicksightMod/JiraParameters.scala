package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JiraParameters extends js.Object {
  /**
    * The base URL of the Jira site.
    */
  var SiteBaseUrl: typingsSlinky.awsSdk.quicksightMod.SiteBaseUrl = js.native
}

object JiraParameters {
  @scala.inline
  def apply(SiteBaseUrl: SiteBaseUrl): JiraParameters = {
    val __obj = js.Dynamic.literal(SiteBaseUrl = SiteBaseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[JiraParameters]
  }
  @scala.inline
  implicit class JiraParametersOps[Self <: JiraParameters] (val x: Self) extends AnyVal {
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

