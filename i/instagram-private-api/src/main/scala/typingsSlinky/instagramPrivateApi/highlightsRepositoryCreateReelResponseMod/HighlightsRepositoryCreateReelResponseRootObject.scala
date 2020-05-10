package typingsSlinky.instagramPrivateApi.highlightsRepositoryCreateReelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightsRepositoryCreateReelResponseRootObject extends js.Object {
  var reel: HighlightsRepositoryCreateReelResponseReel = js.native
  var status: String = js.native
}

object HighlightsRepositoryCreateReelResponseRootObject {
  @scala.inline
  def apply(reel: HighlightsRepositoryCreateReelResponseReel, status: String): HighlightsRepositoryCreateReelResponseRootObject = {
    val __obj = js.Dynamic.literal(reel = reel.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryCreateReelResponseRootObject]
  }
  @scala.inline
  implicit class HighlightsRepositoryCreateReelResponseRootObjectOps[Self <: HighlightsRepositoryCreateReelResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReel(value: HighlightsRepositoryCreateReelResponseReel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

