package typingsSlinky.atOracleOraclejet.ojthematicmapMod

import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.auto
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.bottom
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.center
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.circle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.diamond
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ellipse
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.human
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.off
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.plus
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.rectangle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.solid
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.square
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.star
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.top
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.triangleDown
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.triangleUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojThematicMapMarkerSettableProperties extends JetSettableProperties {
  var borderColor: String
  var borderStyle: solid | none
  var borderWidth: Double
  var categories: js.Array[String]
  var color: String
  var height: Double
  var label: String
  var labelPosition: bottom | center | top
  var labelStyle: js.Object
  var location: String
  var opacity: Double
  var rotation: Double
  var selectable: auto | off
  var shape: js.UndefOr[
    circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String
  ] = js.undefined
  var shortDesc: String
  var source: String
  var sourceHover: String
  var sourceHoverSelected: String
  var sourceSelected: String
  var svgClassName: String
  var svgStyle: js.Object
  var value: Double
  var width: Double
  var x: Double | Null
  var y: Double | Null
}

object ojThematicMapMarkerSettableProperties {
  @scala.inline
  def apply(
    borderColor: String,
    borderStyle: solid | none,
    borderWidth: Double,
    categories: js.Array[String],
    color: String,
    height: Double,
    label: String,
    labelPosition: bottom | center | top,
    labelStyle: js.Object,
    location: String,
    opacity: Double,
    rotation: Double,
    selectable: auto | off,
    shortDesc: String,
    source: String,
    sourceHover: String,
    sourceHoverSelected: String,
    sourceSelected: String,
    svgClassName: String,
    svgStyle: js.Object,
    value: Double,
    width: Double,
    shape: circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): ojThematicMapMarkerSettableProperties = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderStyle = borderStyle.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelPosition = labelPosition.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], shortDesc = shortDesc.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceHover = sourceHover.asInstanceOf[js.Any], sourceHoverSelected = sourceHoverSelected.asInstanceOf[js.Any], sourceSelected = sourceSelected.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojThematicMapMarkerSettableProperties]
  }
}

