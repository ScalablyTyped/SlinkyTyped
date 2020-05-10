package typingsSlinky.reactWeui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDot extends js.Object {
  var dot: Boolean = js.native
  var preset: String = js.native
}

object AnonDot {
  @scala.inline
  def apply(dot: Boolean, preset: String): AnonDot = {
    val __obj = js.Dynamic.literal(dot = dot.asInstanceOf[js.Any], preset = preset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDot]
  }
  @scala.inline
  implicit class AnonDotOps[Self <: AnonDot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

