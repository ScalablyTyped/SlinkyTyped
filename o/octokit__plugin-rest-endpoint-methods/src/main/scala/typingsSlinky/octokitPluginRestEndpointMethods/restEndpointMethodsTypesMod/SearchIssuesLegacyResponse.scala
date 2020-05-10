package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchIssuesLegacyResponse extends js.Object {
  var issues: js.Array[SearchIssuesLegacyResponseIssuesItem] = js.native
}

object SearchIssuesLegacyResponse {
  @scala.inline
  def apply(issues: js.Array[SearchIssuesLegacyResponseIssuesItem]): SearchIssuesLegacyResponse = {
    val __obj = js.Dynamic.literal(issues = issues.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchIssuesLegacyResponse]
  }
  @scala.inline
  implicit class SearchIssuesLegacyResponseOps[Self <: SearchIssuesLegacyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIssues(value: js.Array[SearchIssuesLegacyResponseIssuesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

