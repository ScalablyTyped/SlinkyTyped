package typingsSlinky.oracleOraclejet.ojformlayoutMod

import typingsSlinky.oracleOraclejet.mod.JetSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.column
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.row
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.top
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.truncate
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojFormLayoutSettableProperties extends JetSettableProperties {
  var direction: column | row = js.native
  var labelEdge: start | top = js.native
  var labelWidth: String = js.native
  var labelWrapping: truncate | wrap = js.native
  var maxColumns: Double = js.native
}

object ojFormLayoutSettableProperties {
  @scala.inline
  def apply(
    direction: column | row,
    labelEdge: start | top,
    labelWidth: String,
    labelWrapping: truncate | wrap,
    maxColumns: Double
  ): ojFormLayoutSettableProperties = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], labelEdge = labelEdge.asInstanceOf[js.Any], labelWidth = labelWidth.asInstanceOf[js.Any], labelWrapping = labelWrapping.asInstanceOf[js.Any], maxColumns = maxColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojFormLayoutSettableProperties]
  }
  @scala.inline
  implicit class ojFormLayoutSettablePropertiesOps[Self <: ojFormLayoutSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: column | row): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelEdge(value: start | top): Self = {
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
    @scala.inline
    def withLabelWrapping(value: truncate | wrap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColumns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

