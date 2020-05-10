package typingsSlinky.prettier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CursorOptions extends Options {
  /**
    * Specify where the cursor is.
    */
  var cursorOffset: Double = js.native
}

object CursorOptions {
  @scala.inline
  def apply(cursorOffset: Double): CursorOptions = {
    val __obj = js.Dynamic.literal(cursorOffset = cursorOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorOptions]
  }
  @scala.inline
  implicit class CursorOptionsOps[Self <: CursorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCursorOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorOffset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

