package typingsSlinky.prettier.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CursorNodeStart extends js.Object {
  var cursorNodeStart: js.UndefOr[Double] = js.native
  var cursorNodeText: js.UndefOr[String] = js.native
  var formatted: String = js.native
}

object CursorNodeStart {
  @scala.inline
  def apply(formatted: String): CursorNodeStart = {
    val __obj = js.Dynamic.literal(formatted = formatted.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorNodeStart]
  }
  @scala.inline
  implicit class CursorNodeStartOps[Self <: CursorNodeStart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursorNodeStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorNodeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorNodeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorNodeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorNodeText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorNodeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorNodeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorNodeText")(js.undefined)
        ret
    }
  }
  
}

