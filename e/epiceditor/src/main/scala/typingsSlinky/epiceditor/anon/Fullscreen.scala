package typingsSlinky.epiceditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fullscreen extends js.Object {
  var fullscreen: Double = js.native
  var modifier: Double = js.native
  var preview: Double = js.native
}

object Fullscreen {
  @scala.inline
  def apply(fullscreen: Double, modifier: Double, preview: Double): Fullscreen = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any], modifier = modifier.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fullscreen]
  }
  @scala.inline
  implicit class FullscreenOps[Self <: Fullscreen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullscreen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreview(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

