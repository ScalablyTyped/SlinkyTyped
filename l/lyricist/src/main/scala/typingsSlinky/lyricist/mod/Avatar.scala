package typingsSlinky.lyricist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Avatar extends js.Object {
  var medium: AvatarConfig = js.native
  var small: AvatarConfig = js.native
  var thumb: AvatarConfig = js.native
  var tiny: AvatarConfig = js.native
}

object Avatar {
  @scala.inline
  def apply(medium: AvatarConfig, small: AvatarConfig, thumb: AvatarConfig, tiny: AvatarConfig): Avatar = {
    val __obj = js.Dynamic.literal(medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any], tiny = tiny.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avatar]
  }
  @scala.inline
  implicit class AvatarOps[Self <: Avatar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMedium(value: AvatarConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmall(value: AvatarConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumb(value: AvatarConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiny(value: AvatarConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiny")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

