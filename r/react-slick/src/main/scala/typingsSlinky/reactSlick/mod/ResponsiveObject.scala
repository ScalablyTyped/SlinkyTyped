package typingsSlinky.reactSlick.mod

import typingsSlinky.reactSlick.reactSlickStrings.unslick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponsiveObject extends js.Object {
  var breakpoint: Double = js.native
  var settings: unslick | Settings = js.native
}

object ResponsiveObject {
  @scala.inline
  def apply(breakpoint: Double, settings: unslick | Settings): ResponsiveObject = {
    val __obj = js.Dynamic.literal(breakpoint = breakpoint.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveObject]
  }
  @scala.inline
  implicit class ResponsiveObjectOps[Self <: ResponsiveObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakpoint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettings(value: unslick | Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

