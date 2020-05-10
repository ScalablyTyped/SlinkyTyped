package typingsSlinky.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableTextLabelsBody extends js.Object {
  var noMatch: String = js.native
  var toolTip: String = js.native
}

object MUIDataTableTextLabelsBody {
  @scala.inline
  def apply(noMatch: String, toolTip: String): MUIDataTableTextLabelsBody = {
    val __obj = js.Dynamic.literal(noMatch = noMatch.asInstanceOf[js.Any], toolTip = toolTip.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableTextLabelsBody]
  }
  @scala.inline
  implicit class MUIDataTableTextLabelsBodyOps[Self <: MUIDataTableTextLabelsBody] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolTip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTip")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

