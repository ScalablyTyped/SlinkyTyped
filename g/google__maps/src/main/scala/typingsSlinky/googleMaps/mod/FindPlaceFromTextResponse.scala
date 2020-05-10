package typingsSlinky.googleMaps.mod

import typingsSlinky.googleMaps.PartialPlaceSearchResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindPlaceFromTextResponse extends js.Object {
  var candidates: js.Array[PartialPlaceSearchResult] = js.native
  var status: SearchResponseStatus = js.native
}

object FindPlaceFromTextResponse {
  @scala.inline
  def apply(candidates: js.Array[PartialPlaceSearchResult], status: SearchResponseStatus): FindPlaceFromTextResponse = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindPlaceFromTextResponse]
  }
  @scala.inline
  implicit class FindPlaceFromTextResponseOps[Self <: FindPlaceFromTextResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCandidates(value: js.Array[PartialPlaceSearchResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candidates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: SearchResponseStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

