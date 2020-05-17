package typingsSlinky.oracleOraclejet.anon

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

@js.native
trait EndConnectorType extends js.Object {
  var color: String = js.native
  var endConnectorType: arrowOpen | arrow | arrowConcave | circle | rectangle | rectangleRounded | none = js.native
  var labelStyle: js.Object = js.native
  var startConnectorType: arrowOpen | arrow | arrowConcave | circle | rectangle | rectangleRounded | none = js.native
  var svgClassName: String = js.native
  var svgStyle: js.Object = js.native
  var width: Double = js.native
}

object EndConnectorType {
  @scala.inline
  def apply(
    color: String,
    endConnectorType: arrowOpen | arrow | arrowConcave | circle | rectangle | rectangleRounded | none,
    labelStyle: js.Object,
    startConnectorType: arrowOpen | arrow | arrowConcave | circle | rectangle | rectangleRounded | none,
    svgClassName: String,
    svgStyle: js.Object,
    width: Double
  ): EndConnectorType = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], endConnectorType = endConnectorType.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], startConnectorType = startConnectorType.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndConnectorType]
  }
  @scala.inline
  implicit class EndConnectorTypeOps[Self <: EndConnectorType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndConnectorType(value: arrowOpen | arrow | arrowConcave | circle | rectangle | rectangleRounded | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endConnectorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartConnectorType(value: arrowOpen | arrow | arrowConcave | circle | rectangle | rectangleRounded | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startConnectorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSvgClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSvgStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

