package typingsSlinky.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Thumb extends js.Object {
  var thumb: js.UndefOr[`0`] = js.native
  var track: js.UndefOr[ColorHeight] = js.native
}

object Thumb {
  @scala.inline
  def apply(): Thumb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thumb]
  }
  @scala.inline
  implicit class ThumbOps[Self <: Thumb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThumb(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumb")(js.undefined)
        ret
    }
    @scala.inline
    def withTrack(value: ColorHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(js.undefined)
        ret
    }
  }
  
}

