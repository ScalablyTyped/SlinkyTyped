package typingsSlinky.reactGamepad

import typingsSlinky.reactGamepad.mod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonXBOX extends js.Object {
  var XBOX: Layout = js.native
}

object AnonXBOX {
  @scala.inline
  def apply(XBOX: Layout): AnonXBOX = {
    val __obj = js.Dynamic.literal(XBOX = XBOX.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXBOX]
  }
  @scala.inline
  implicit class AnonXBOXOps[Self <: AnonXBOX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXBOX(value: Layout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XBOX")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

