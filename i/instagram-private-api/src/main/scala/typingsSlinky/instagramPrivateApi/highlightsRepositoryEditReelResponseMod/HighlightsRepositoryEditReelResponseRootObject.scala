package typingsSlinky.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightsRepositoryEditReelResponseRootObject extends js.Object {
  var reel: HighlightsRepositoryEditReelResponseReel = js.native
  var status: String = js.native
}

object HighlightsRepositoryEditReelResponseRootObject {
  @scala.inline
  def apply(reel: HighlightsRepositoryEditReelResponseReel, status: String): HighlightsRepositoryEditReelResponseRootObject = {
    val __obj = js.Dynamic.literal(reel = reel.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseRootObject]
  }
  @scala.inline
  implicit class HighlightsRepositoryEditReelResponseRootObjectOps[Self <: HighlightsRepositoryEditReelResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReel(value: HighlightsRepositoryEditReelResponseReel): Self = {
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

