package typingsSlinky.gapiPlus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverInfo extends js.Object {
  var coverInfo: LeftImageOffset = js.native
  var coverPhoto: Height = js.native
  var layout: String = js.native
}

object CoverInfo {
  @scala.inline
  def apply(coverInfo: LeftImageOffset, coverPhoto: Height, layout: String): CoverInfo = {
    val __obj = js.Dynamic.literal(coverInfo = coverInfo.asInstanceOf[js.Any], coverPhoto = coverPhoto.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverInfo]
  }
  @scala.inline
  implicit class CoverInfoOps[Self <: CoverInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoverInfo(value: LeftImageOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoverPhoto(value: Height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverPhoto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

