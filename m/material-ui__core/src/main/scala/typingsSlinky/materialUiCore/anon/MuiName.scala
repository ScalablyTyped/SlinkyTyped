package typingsSlinky.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MuiName extends js.Object {
  var muiName: String = js.native
}

object MuiName {
  @scala.inline
  def apply(muiName: String): MuiName = {
    val __obj = js.Dynamic.literal(muiName = muiName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuiName]
  }
  @scala.inline
  implicit class MuiNameOps[Self <: MuiName] (val x: Self) extends AnyVal {
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

