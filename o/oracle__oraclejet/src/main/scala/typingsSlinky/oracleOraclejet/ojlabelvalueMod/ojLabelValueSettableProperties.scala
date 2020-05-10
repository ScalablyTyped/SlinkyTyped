package typingsSlinky.oracleOraclejet.ojlabelvalueMod

import typingsSlinky.oracleOraclejet.mod.JetSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.inherit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojLabelValueSettableProperties extends JetSettableProperties {
  var labelEdge: start | top | inherit = js.native
  var labelWidth: String = js.native
}

object ojLabelValueSettableProperties {
  @scala.inline
  def apply(labelEdge: start | top | inherit, labelWidth: String): ojLabelValueSettableProperties = {
    val __obj = js.Dynamic.literal(labelEdge = labelEdge.asInstanceOf[js.Any], labelWidth = labelWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLabelValueSettableProperties]
  }
  @scala.inline
  implicit class ojLabelValueSettablePropertiesOps[Self <: ojLabelValueSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelEdge(value: start | top | inherit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

