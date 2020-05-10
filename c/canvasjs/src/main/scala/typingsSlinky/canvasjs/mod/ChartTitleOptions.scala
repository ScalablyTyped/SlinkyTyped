package typingsSlinky.canvasjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartTitleOptions extends js.Object {
  /**
    * Sets the background color of Chart Title. Values can be "HTML Color Name" or "hex" code.
    * Default: null
    * Example: "red", "#FF0000" ..
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * Sets the color of border around Chart Title. Values of borderColor can be "HTML Color Name" or "hex" code .
    * Default: "black"
    * Example: "red", "#FF0000" ..
    */
  var borderColor: js.UndefOr[String] = js.native
  /**
    * Sets the thickness of border around the Title in pixels. To display border around title, set the borderThickness to a number greater than zero.
    * Default: 0
    * Example: 2,4 ..
    */
  var borderThickness: js.UndefOr[Double] = js.native
  /**
    * To display rounded borders around the title, set the cornerRadius of title. Higher the value, more rounded are the corners.
    * Default: 0
    * Options: 5,8 ..
    */
  var cornerRadius: js.UndefOr[Double] = js.native
  /**
    * When dockInsidePlotArea is set to true, title renders inside the plot area there by giving more space to plot area.
    * Default: false
    * Example: false, true.
    */
  var dockInsidePlotArea: js.UndefOr[Boolean] = js.native
  /**
    * Sets the font color of Chart Title. The value of fontColor can be a "HTML Color Name" or "hex" code .
    * Default: "black"
    * Example: "red", "#FAC003" ..
    */
  var fontColor: js.UndefOr[String] = js.native
  /**
    * Sets the Font Family of Chart Title.
    * Default: "calibri, Optima, Candara, verdana, Geneva, sans-serif"
    * Example: "arial" , "tahoma", "verdana" ..
    */
  var fontFamily: js.UndefOr[String] = js.native
  /**
    * Sets the font Size of Chart Title in pixels.
    * Default: 20
    * Example: 16,18,22 ..
    */
  var fontSize: js.UndefOr[Double] = js.native
  /**
    * Sets the fontStyle of Chart Title. fontStyle can be set to one of the below options.
    * Default: "normal"
    * Options: "normal", "italic" , "oblique"
    */
  var fontStyle: js.UndefOr[String] = js.native
  /**
    * Sets the Font Weight used in the Chart Title.
    * Default: "normal"
    * Options: "lighter", "normal", "bold" , "bolder"
    */
  var fontWeight: js.UndefOr[String] = js.native
  /**
    * This property lets you align the Chart Title horizontally.
    * Default: "center"
    * Options: "left", "right", "center"
    */
  var horizontalAlign: js.UndefOr[String] = js.native
  /**
    * This property lets you set margin around the Chart Title in pixels.
    * Default: 5
    * Example: 4,12 ..
    */
  var margin: js.UndefOr[Double] = js.native
  /**
    * Sets the maximum width of title after which it gets wrapped or clipped depending on whether wrap is set to true (default) or false.
    * Default: Automatically calculated based on the chart size.
    * Example: 200, 400 ..
    */
  var maxWidth: js.UndefOr[Double] = js.native
  /**
    * This property allows you to set the padding for Chart Title
    * Default: 0
    * Example: 5, 8 ..
    */
  var padding: js.UndefOr[Double] = js.native
  /**
    * Sets the Title’s text.
    * Default: null
    * Example: "Chart title"
    */
  var text: js.UndefOr[String] = js.native
  /**
    * This property lets you align the Chart Title vertically.
    * Default: "top"
    * Options: "top", "center", "bottom"
    */
  var verticalAlign: js.UndefOr[String] = js.native
  /**
    * Wrap specifies whether to wrap the title once its width crosses maxWidth or not. If it is set to false, title gets clipped after reaching maxWidth.
    * Default: true;
    * Example : true, false
    */
  var wrap: js.UndefOr[Boolean] = js.native
}

object ChartTitleOptions {
  @scala.inline
  def apply(): ChartTitleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTitleOptions]
  }
  @scala.inline
  implicit class ChartTitleOptionsOps[Self <: ChartTitleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withCornerRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withDockInsidePlotArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockInsidePlotArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDockInsidePlotArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockInsidePlotArea")(js.undefined)
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
    def withFontStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
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
    def withVerticalAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.undefined)
        ret
    }
  }
  
}

