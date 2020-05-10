package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCompatibleElasticsearchVersionsResponse extends js.Object {
  /**
    *  A map of compatible Elasticsearch versions returned as part of the  GetCompatibleElasticsearchVersions  operation. 
    */
  var CompatibleElasticsearchVersions: js.UndefOr[CompatibleElasticsearchVersionsList] = js.native
}

object GetCompatibleElasticsearchVersionsResponse {
  @scala.inline
  def apply(): GetCompatibleElasticsearchVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCompatibleElasticsearchVersionsResponse]
  }
  @scala.inline
  implicit class GetCompatibleElasticsearchVersionsResponseOps[Self <: GetCompatibleElasticsearchVersionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompatibleElasticsearchVersions(value: CompatibleElasticsearchVersionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompatibleElasticsearchVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompatibleElasticsearchVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompatibleElasticsearchVersions")(js.undefined)
        ret
    }
  }
  
}

