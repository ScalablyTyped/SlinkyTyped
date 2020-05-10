package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapNavigationButtonsZoomOutOptions extends js.Object {
  /**
    * (Highmaps) The alignment of the navigation buttons.
    */
  var align: js.UndefOr[AlignValue] = js.native
  /**
    * (Highmaps) What box to align the buttons to. Possible values are
    * `plotBox` and `spacingBox`.
    */
  var alignTo: js.UndefOr[ButtonRelativeToValue] = js.native
  /**
    * (Highmaps) The pixel height of the map navigation buttons.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * (Highmaps) Click handler for the button.
    */
  var onclick: js.UndefOr[js.Function] = js.native
  /**
    * (Highmaps) Padding for the navigation buttons.
    */
  var padding: js.UndefOr[Double] = js.native
  /**
    * (Highmaps) Text styles for the map navigation buttons.
    */
  var style: js.UndefOr[CSSObject] = js.native
  /**
    * (Highmaps) The text for the button. The tooltip (title) is a language
    * option given by lang.zoomOut.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * (Highmaps) A configuration object for the button theme. The object
    * accepts SVG properties like `stroke-width`, `stroke` and `fill`.
    * Tri-state button styles are supported by the `states.hover` and
    * `states.select` objects.
    */
  var theme: js.UndefOr[SVGAttributes] = js.native
  /**
    * (Highmaps) The vertical alignment of the buttons. Individual alignment
    * can be adjusted by each button's `y` offset.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.native
  /**
    * (Highmaps) The width of the map navigation buttons.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * (Highmaps) The X offset of the buttons relative to its `align` setting.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * (Highmaps) The position of the zoomOut button relative to the vertical
    * alignment.
    */
  var y: js.UndefOr[Double] = js.native
}

object MapNavigationButtonsZoomOutOptions {
  @scala.inline
  def apply(): MapNavigationButtonsZoomOutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapNavigationButtonsZoomOutOptions]
  }
  @scala.inline
  implicit class MapNavigationButtonsZoomOutOptionsOps[Self <: MapNavigationButtonsZoomOutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: AlignValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignTo(value: ButtonRelativeToValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignTo")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withOnclick(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(js.undefined)
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
    def withStyle(value: CSSObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
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
    def withTheme(value: SVGAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlign(value: VerticalAlignValue): Self = {
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
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

