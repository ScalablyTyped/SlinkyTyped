package typingsSlinky.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dot extends js.Object {
  var dot: Boolean = js.native
  var preset: String = js.native
}

object Dot {
  @scala.inline
  def apply(dot: Boolean, preset: String): Dot = {
    val __obj = js.Dynamic.literal(dot = dot.asInstanceOf[js.Any], preset = preset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dot]
  }
  @scala.inline
  implicit class DotOps[Self <: Dot] (val x: Self) extends AnyVal {
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

