package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapNavigationButtonsZoomOutOptions extends StObject {
  
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
  implicit class MapNavigationButtonsZoomOutOptionsMutableBuilder[Self <: MapNavigationButtonsZoomOutOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: AlignValue): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignTo(value: ButtonRelativeToValue): Self = StObject.set(x, "alignTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignToUndefined: Self = StObject.set(x, "alignTo", js.undefined)
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setOnclick(value: js.Function): Self = StObject.set(x, "onclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTheme(value: SVGAttributes): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: VerticalAlignValue): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
