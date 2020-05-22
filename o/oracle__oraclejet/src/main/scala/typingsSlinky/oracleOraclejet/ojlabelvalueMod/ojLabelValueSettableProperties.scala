package typingsSlinky.oracleOraclejet.ojlabelvalueMod

import typingsSlinky.oracleOraclejet.mod.JetSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.inherit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojLabelValueSettableProperties extends JetSettableProperties {
  var labelEdge: start | top | inherit
  var labelWidth: String
}

object ojLabelValueSettableProperties {
  @scala.inline
  def apply(labelEdge: start | top | inherit, labelWidth: String): ojLabelValueSettableProperties = {
    val __obj = js.Dynamic.literal(labelEdge = labelEdge.asInstanceOf[js.Any], labelWidth = labelWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLabelValueSettableProperties]
  }
}

