package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchDeveloperMetadataResponse extends js.Object {
  var matchedDeveloperMetadata: js.UndefOr[js.Array[MatchedDeveloperMetadata]] = js.native
}

object SearchDeveloperMetadataResponse {
  @scala.inline
  def apply(): SearchDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchDeveloperMetadataResponse]
  }
  @scala.inline
  implicit class SearchDeveloperMetadataResponseOps[Self <: SearchDeveloperMetadataResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatchedDeveloperMetadata(value: js.Array[MatchedDeveloperMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchedDeveloperMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchedDeveloperMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchedDeveloperMetadata")(js.undefined)
        ret
    }
  }
  
}

