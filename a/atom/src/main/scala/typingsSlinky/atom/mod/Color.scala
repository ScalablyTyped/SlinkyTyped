package typingsSlinky.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  /** Returns a string in the form '#abcdef'. */
  def toHexString(): String = js.native
  /** Returns a string in the form 'rgba(25, 50, 75, .9)'. */
  def toRGBAString(): String = js.native
}

object Color {
  @scala.inline
  def apply(toHexString: () => String, toRGBAString: () => String): Color = {
    val __obj = js.Dynamic.literal(toHexString = js.Any.fromFunction0(toHexString), toRGBAString = js.Any.fromFunction0(toRGBAString))
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToHexString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toHexString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToRGBAString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toRGBAString")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

