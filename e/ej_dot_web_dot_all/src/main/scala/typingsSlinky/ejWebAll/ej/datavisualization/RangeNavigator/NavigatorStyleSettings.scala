package typingsSlinky.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorStyleSettings extends js.Object {
  /** Specifies the background color of range navigator.
    * @Default {#dddddd}
    */
  var background: js.UndefOr[String] = js.native
  /** Options for customizing the border color and width of range navigator.
    */
  var border: js.UndefOr[NavigatorStyleSettingsBorder] = js.native
  /** Contains the options for highlighting the range navigator on mouse over.
    */
  var highlightSettings: js.UndefOr[NavigatorStyleSettingsHighlightSettings] = js.native
  /** Specifies the left side thumb template in range navigator we can give either div id or HTML string
    * @Default {null}
    */
  var leftThumbTemplate: js.UndefOr[String] = js.native
  /** Options for customizing the major grid lines.
    */
  var majorGridLineStyle: js.UndefOr[NavigatorStyleSettingsMajorGridLineStyle] = js.native
  /** Options for customizing the minor grid lines.
    */
  var minorGridLineStyle: js.UndefOr[NavigatorStyleSettingsMinorGridLineStyle] = js.native
  /** Specifies the opacity of RangeNavigator.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Specifies the right side thumb template in range navigator we can give either div id or HTML string
    * @Default {null}
    */
  var rightThumbTemplate: js.UndefOr[String] = js.native
  /** Specifies the color of the selected region in range navigator.
    * @Default {#EFEFEF}
    */
  var selectedRegionColor: js.UndefOr[String] = js.native
  /** Specifies the opacity of Selected Region.
    * @Default {0}
    */
  var selectedRegionOpacity: js.UndefOr[Double] = js.native
  /** Contains the options for selection the range navigator on mouse over.
    */
  var selectionSettings: js.UndefOr[NavigatorStyleSettingsSelectionSettings] = js.native
  /** Specifies the color of the thumb in range navigator.
    * @Default {#2382C3}
    */
  var thumbColor: js.UndefOr[String] = js.native
  /** Specifies the radius of the thumb in range navigator.
    * @Default {10}
    */
  var thumbRadius: js.UndefOr[Double] = js.native
  /** Specifies the stroke color of the thumb in range navigator.
    * @Default {#303030}
    */
  var thumbStroke: js.UndefOr[String] = js.native
  /** Specifies the color of the unselected region in range navigator.
    * @Default {#5EABDE}
    */
  var unselectedRegionColor: js.UndefOr[String] = js.native
  /** Specifies the opacity of Unselected Region.
    * @Default {0.3}
    */
  var unselectedRegionOpacity: js.UndefOr[Double] = js.native
}

object NavigatorStyleSettings {
  @scala.inline
  def apply(): NavigatorStyleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorStyleSettings]
  }
  @scala.inline
  implicit class NavigatorStyleSettingsOps[Self <: NavigatorStyleSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: NavigatorStyleSettingsBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightSettings(value: NavigatorStyleSettingsHighlightSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftThumbTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftThumbTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftThumbTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftThumbTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorGridLineStyle(value: NavigatorStyleSettingsMajorGridLineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorGridLineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorGridLineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorGridLineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorGridLineStyle(value: NavigatorStyleSettingsMinorGridLineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorGridLineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorGridLineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorGridLineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withRightThumbTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightThumbTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightThumbTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightThumbTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRegionColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRegionColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRegionColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRegionColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRegionOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRegionOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRegionOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRegionOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionSettings(value: NavigatorStyleSettingsSelectionSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbColor")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withUnselectedRegionColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectedRegionColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnselectedRegionColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectedRegionColor")(js.undefined)
        ret
    }
    @scala.inline
    def withUnselectedRegionOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectedRegionOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnselectedRegionOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectedRegionOpacity")(js.undefined)
        ret
    }
  }
  
}

