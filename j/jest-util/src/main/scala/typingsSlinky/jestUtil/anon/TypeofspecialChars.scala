package typingsSlinky.jestUtil.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofspecialChars extends js.Object {
  val ARROW: /* " \\u203A " */ String = js.native
  val CLEAR: String = js.native
  val ICONS: Failed = js.native
}

object TypeofspecialChars {
  @scala.inline
  def apply(ARROW: /* " \\u203A " */ String, CLEAR: String, ICONS: Failed): TypeofspecialChars = {
    val __obj = js.Dynamic.literal(ARROW = ARROW.asInstanceOf[js.Any], CLEAR = CLEAR.asInstanceOf[js.Any], ICONS = ICONS.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofspecialChars]
  }
  @scala.inline
  implicit class TypeofspecialCharsOps[Self <: TypeofspecialChars] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARROW(value: /* " \\u203A " */ String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARROW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCLEAR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLEAR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withICONS(value: Failed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ICONS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

