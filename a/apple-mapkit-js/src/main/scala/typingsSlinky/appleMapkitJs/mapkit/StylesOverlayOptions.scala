package typingsSlinky.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An observable set of style attributes for an overlay.
  */
@js.native
trait StylesOverlayOptions extends OverlayOptions {
  var style: js.UndefOr[Style] = js.native
}

object StylesOverlayOptions {
  @scala.inline
  def apply(): StylesOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StylesOverlayOptions]
  }
  @scala.inline
  implicit class StylesOverlayOptionsOps[Self <: StylesOverlayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyle(value: Style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

