package typingsSlinky.ejWebAll.ej.datavisualization.HeatMapLegend

import typingsSlinky.ejWebAll.ej.datavisualization.HeatMap.TextDecoration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorMappingCollectionLabel extends js.Object {
  /** Enables/disables the bold style of the heatmap legend label.
    * @Default {false}
    */
  var bold: js.UndefOr[Boolean] = js.native
  /** Specifies the font color of the heatmap legend label.
    * @Default {black}
    */
  var fontColor: js.UndefOr[String] = js.native
  /** Specifies the font family of the heatmap legend label.
    * @Default {Arial}
    */
  var fontFamily: js.UndefOr[String] = js.native
  /** Specifies the font size of the heatmap legend label.
    * @Default {10}
    */
  var fontSize: js.UndefOr[Double] = js.native
  /** Enables/disables the italic style of the heatmap legend label.
    * @Default {false}
    */
  var italic: js.UndefOr[Boolean] = js.native
  /** specifies the text value of the heatmap legend label.
    */
  var text: js.UndefOr[String] = js.native
  /** Specifies the text style of the heatmap legend label.
    * @Default {ej.HeatMap.TextDecoration.None}
    */
  var textDecoration: js.UndefOr[TextDecoration | String] = js.native
}

object ColorMappingCollectionLabel {
  @scala.inline
  def apply(): ColorMappingCollectionLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorMappingCollectionLabel]
  }
  @scala.inline
  implicit class ColorMappingCollectionLabelOps[Self <: ColorMappingCollectionLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bold")(js.undefined)
        ret
    }
    @scala.inline
    def withFontColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withItalic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("italic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItalic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("italic")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDecoration(value: TextDecoration | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecoration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDecoration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecoration")(js.undefined)
        ret
    }
  }
  
}

