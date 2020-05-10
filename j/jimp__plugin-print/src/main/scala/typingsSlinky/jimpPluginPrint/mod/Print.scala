package typingsSlinky.jimpPluginPrint.mod

import typingsSlinky.jimpPluginPrint.AnonFONTSANS10BLACK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Print extends js.Object {
  var `class`: PrintClass = js.native
  var constants: AnonFONTSANS10BLACK = js.native
}

object Print {
  @scala.inline
  def apply(`class`: PrintClass, constants: AnonFONTSANS10BLACK): Print = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Print]
  }
  @scala.inline
  implicit class PrintOps[Self <: Print] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClass(value: PrintClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstants(value: AnonFONTSANS10BLACK): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constants")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

