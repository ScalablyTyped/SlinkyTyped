package typingsSlinky.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMuiName extends js.Object {
  var muiName: String = js.native
}

object AnonMuiName {
  @scala.inline
  def apply(muiName: String): AnonMuiName = {
    val __obj = js.Dynamic.literal(muiName = muiName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMuiName]
  }
  @scala.inline
  implicit class AnonMuiNameOps[Self <: AnonMuiName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMuiName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muiName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

