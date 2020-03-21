package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.arrow
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.arrowConcave
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.arrowOpen
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.circle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rectangle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rectangleRounded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStartConnectorType extends js.Object {
  var color: String
  var endConnectorType: arrowOpen | arrow | arrowConcave | circle | rectangle | rectangleRounded | none
  var startConnectorType: arrowOpen | arrow | arrowConcave | circle | rectangle | rectangleRounded | none
  var svgClassName: String
  var svgStyle: js.Object
  var width: Double
}

object AnonStartConnectorType {
  @scala.inline
  def apply(
    color: String,
    endConnectorType: arrowOpen | arrow | arrowConcave | circle | rectangle | rectangleRounded | none,
    startConnectorType: arrowOpen | arrow | arrowConcave | circle | rectangle | rectangleRounded | none,
    svgClassName: String,
    svgStyle: js.Object,
    width: Double
  ): AnonStartConnectorType = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], endConnectorType = endConnectorType.asInstanceOf[js.Any], startConnectorType = startConnectorType.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStartConnectorType]
  }
}

