package typingsSlinky.atOracleOraclejet.ojformlayoutMod

import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.column
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.row
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.start
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.top
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.truncate
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojFormLayoutSettableProperties extends JetSettableProperties {
  var direction: column | row
  var labelEdge: start | top
  var labelWidth: String
  var labelWrapping: truncate | wrap
  var maxColumns: Double
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
}

