package typingsSlinky.oracleOraclejet.ojthematicmapMod

import typingsSlinky.oracleOraclejet.AnonLocation
import typingsSlinky.oracleOraclejet.mod.JetSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojThematicMapLinkSettableProperties extends JetSettableProperties {
  var categories: js.Array[String] = js.native
  var color: String = js.native
  var endLocation: AnonLocation = js.native
  var selectable: auto | off = js.native
  var shortDesc: String = js.native
  var startLocation: AnonLocation = js.native
  var svgClassName: String = js.native
  var svgStyle: js.Object = js.native
  var width: Double = js.native
}

object ojThematicMapLinkSettableProperties {
  @scala.inline
  def apply(
    categories: js.Array[String],
    color: String,
    endLocation: AnonLocation,
    selectable: auto | off,
    shortDesc: String,
    startLocation: AnonLocation,
    svgClassName: String,
    svgStyle: js.Object,
    width: Double
  ): ojThematicMapLinkSettableProperties = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], endLocation = endLocation.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], shortDesc = shortDesc.asInstanceOf[js.Any], startLocation = startLocation.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojThematicMapLinkSettableProperties]
  }
  @scala.inline
  implicit class ojThematicMapLinkSettablePropertiesOps[Self <: ojThematicMapLinkSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndLocation(value: AnonLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectable(value: auto | off): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartLocation(value: AnonLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLocation")(value.asInstanceOf[js.Any])
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

