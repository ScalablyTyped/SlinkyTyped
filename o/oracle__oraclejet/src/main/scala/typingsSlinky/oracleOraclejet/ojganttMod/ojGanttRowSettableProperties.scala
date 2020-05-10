package typingsSlinky.oracleOraclejet.ojganttMod

import typingsSlinky.oracleOraclejet.mod.JetSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojGanttRowSettableProperties extends JetSettableProperties {
  var label: String = js.native
  var labelStyle: js.Object = js.native
}

object ojGanttRowSettableProperties {
  @scala.inline
  def apply(label: String, labelStyle: js.Object): ojGanttRowSettableProperties = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttRowSettableProperties]
  }
  @scala.inline
  implicit class ojGanttRowSettablePropertiesOps[Self <: ojGanttRowSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

