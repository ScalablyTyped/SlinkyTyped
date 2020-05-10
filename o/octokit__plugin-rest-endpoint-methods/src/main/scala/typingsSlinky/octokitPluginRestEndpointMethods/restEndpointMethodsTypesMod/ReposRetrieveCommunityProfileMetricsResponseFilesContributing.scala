package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposRetrieveCommunityProfileMetricsResponseFilesContributing extends js.Object {
  var html_url: String = js.native
  var url: String = js.native
}

object ReposRetrieveCommunityProfileMetricsResponseFilesContributing {
  @scala.inline
  def apply(html_url: String, url: String): ReposRetrieveCommunityProfileMetricsResponseFilesContributing = {
    val __obj = js.Dynamic.literal(html_url = html_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposRetrieveCommunityProfileMetricsResponseFilesContributing]
  }
  @scala.inline
  implicit class ReposRetrieveCommunityProfileMetricsResponseFilesContributingOps[Self <: ReposRetrieveCommunityProfileMetricsResponseFilesContributing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

