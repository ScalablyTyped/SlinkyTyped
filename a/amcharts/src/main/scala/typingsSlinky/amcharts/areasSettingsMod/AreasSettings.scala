package typingsSlinky.amcharts.areasSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreasSettings extends js.Object {
  /**
    * Opacity of areas.
    * @default 1
    */
  var alpha: Double = js.native
  /**
    * Specifies if the areas should be zoomed-in when user clicks on them, event if zoom properties are not set.
    */
  var autoZoom: Boolean = js.native
  /**
    * Text which is displayed in a roll-over balloon. You can use the following tags:
    * [[title]], [[description]], [[value]] and [[percent]] [[title]]
    */
  var balloonText: String = js.native
  /**
    * Color of the areas.
    * @default "#FFCC00"
    */
  var color: String = js.native
  /**
    * Color of area with highest value.
    * Colors for areas with values less then highest will be colored with intermediate colors
    * between color and colorSolid.
    * Use colorSteps property of AmMap to change the number of intermediate colors.
    * @default "#990000"
    */
  var colorSolid: String = js.native
  /**
    * Height of a description window.
    */
  var descriptionWindowHeight: Double = js.native
  /**
    * Width of a description window.
    * @default 250
    */
  var descriptionWindowWidth: Double = js.native
  /**
    * X position of a description window.
    */
  var descriptionWindowX: Double = js.native
  /**
    * Y position of a description window.
    */
  var descriptionWindowY: Double = js.native
  /**
    * Opacity of area's outline.
    * @default 1
    */
  var outlineAlpha: Double = js.native
  /**
    * Color of area's outline. #FFFFFF
    */
  var outlineColor: String = js.native
  /**
    * Thickness of area's outline. 0.5
    */
  var outlineThickness: Double = js.native
  /**
    * Color of area when user rolls-over it. undefined
    */
  var rollOverColor: String = js.native
  /**
    * Color of area's outline when user rolls-over it. #CC0000
    */
  var rollOverOutlineColor: String = js.native
  /**
    * Color of area which is currently selected. #CC0000
    */
  var selectedColor: String = js.native
  /**
    * Opacity of all areas which are in the map svg file, but not listed as areas in DataSet.
    * @default 1
    */
  var unlistedAreasAlpha: Double = js.native
  /**
    * Color of all areas which are in the map svg file, but not listed as areas in DataSet. #DDDDDD
    */
  var unlistedAreasColor: String = js.native
  /**
    * Opacity of all areas' outline which are in the map svg file, but not listed as areas in DataSet.
    * @default 1
    */
  var unlistedAreasOutlineAlpha: Double = js.native
  /**
    * Color of all areas' outline which are in the map svg file, but not listed as areas in DataSet. #FFFFFF
    */
  var unlistedAreasOutlineColor: String = js.native
}

object AreasSettings {
  @scala.inline
  def apply(
    alpha: Double,
    autoZoom: Boolean,
    balloonText: String,
    color: String,
    colorSolid: String,
    descriptionWindowHeight: Double,
    descriptionWindowWidth: Double,
    descriptionWindowX: Double,
    descriptionWindowY: Double,
    outlineAlpha: Double,
    outlineColor: String,
    outlineThickness: Double,
    rollOverColor: String,
    rollOverOutlineColor: String,
    selectedColor: String,
    unlistedAreasAlpha: Double,
    unlistedAreasColor: String,
    unlistedAreasOutlineAlpha: Double,
    unlistedAreasOutlineColor: String
  ): AreasSettings = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], autoZoom = autoZoom.asInstanceOf[js.Any], balloonText = balloonText.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colorSolid = colorSolid.asInstanceOf[js.Any], descriptionWindowHeight = descriptionWindowHeight.asInstanceOf[js.Any], descriptionWindowWidth = descriptionWindowWidth.asInstanceOf[js.Any], descriptionWindowX = descriptionWindowX.asInstanceOf[js.Any], descriptionWindowY = descriptionWindowY.asInstanceOf[js.Any], outlineAlpha = outlineAlpha.asInstanceOf[js.Any], outlineColor = outlineColor.asInstanceOf[js.Any], outlineThickness = outlineThickness.asInstanceOf[js.Any], rollOverColor = rollOverColor.asInstanceOf[js.Any], rollOverOutlineColor = rollOverOutlineColor.asInstanceOf[js.Any], selectedColor = selectedColor.asInstanceOf[js.Any], unlistedAreasAlpha = unlistedAreasAlpha.asInstanceOf[js.Any], unlistedAreasColor = unlistedAreasColor.asInstanceOf[js.Any], unlistedAreasOutlineAlpha = unlistedAreasOutlineAlpha.asInstanceOf[js.Any], unlistedAreasOutlineColor = unlistedAreasOutlineColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreasSettings]
  }
  @scala.inline
  implicit class AreasSettingsOps[Self <: AreasSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBalloonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balloonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorSolid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSolid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescriptionWindowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionWindowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescriptionWindowWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionWindowWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescriptionWindowX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionWindowX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescriptionWindowY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionWindowY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlineAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlineThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRollOverColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollOverColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRollOverOutlineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollOverOutlineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnlistedAreasAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlistedAreasAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnlistedAreasColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlistedAreasColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnlistedAreasOutlineAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlistedAreasOutlineAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnlistedAreasOutlineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlistedAreasOutlineColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

