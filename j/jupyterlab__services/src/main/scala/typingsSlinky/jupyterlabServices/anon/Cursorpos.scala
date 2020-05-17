package typingsSlinky.jupyterlabServices.anon

import typingsSlinky.jupyterlabServices.jupyterlabServicesNumbers.`0`
import typingsSlinky.jupyterlabServices.jupyterlabServicesNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cursorpos extends js.Object {
  var code: String = js.native
  var cursor_pos: Double = js.native
  var detail_level: `0` | `1` = js.native
}

object Cursorpos {
  @scala.inline
  def apply(code: String, cursor_pos: Double, detail_level: `0` | `1`): Cursorpos = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], cursor_pos = cursor_pos.asInstanceOf[js.Any], detail_level = detail_level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cursorpos]
  }
  @scala.inline
  implicit class CursorposOps[Self <: Cursorpos] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursor_pos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor_pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetail_level(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail_level")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

