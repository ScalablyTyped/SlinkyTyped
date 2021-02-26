package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`dash-dot`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`long-dash-dot-dot`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`long-dash-dot`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`long-dash`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`short-dash-dot-dot`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`short-dash-dot`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`short-dash`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`short-dot`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.bevel
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.butt
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.dash
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.dot
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.miter
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.round
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.solid
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleLineSymbolProperties extends LineSymbolProperties {
  
  /**
    * Specifies the cap style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html#cap)
    */
  var cap: js.UndefOr[butt | round | square] = js.native
  
  /**
    * Specifies the join style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html#join)
    */
  var join: js.UndefOr[miter | round | bevel] = js.native
  
  /**
    * Specifies the color, style, and placement of a symbol marker on the line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html#marker)
    */
  var marker: js.UndefOr[LineSymbolMarkerProperties] = js.native
  
  /**
    * Maximum allowed ratio of the width of a miter join to the line width.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html#miterLimit)
    */
  var miterLimit: js.UndefOr[Double] = js.native
  
  /**
    * Specifies the line style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html#style)
    */
  var style: js.UndefOr[
    dash | `dash-dot` | dot | `long-dash` | `long-dash-dot` | `long-dash-dot-dot` | none | `short-dash` | `short-dash-dot` | `short-dash-dot-dot` | `short-dot` | solid
  ] = js.native
}
object SimpleLineSymbolProperties {
  
  @scala.inline
  def apply(): SimpleLineSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleLineSymbolProperties]
  }
  
  @scala.inline
  implicit class SimpleLineSymbolPropertiesMutableBuilder[Self <: SimpleLineSymbolProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCap(value: butt | round | square): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapUndefined: Self = StObject.set(x, "cap", js.undefined)
    
    @scala.inline
    def setJoin(value: miter | round | bevel): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
    
    @scala.inline
    def setMarker(value: LineSymbolMarkerProperties): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiterLimitUndefined: Self = StObject.set(x, "miterLimit", js.undefined)
    
    @scala.inline
    def setStyle(
      value: dash | `dash-dot` | dot | `long-dash` | `long-dash-dot` | `long-dash-dot-dot` | none | `short-dash` | `short-dash-dot` | `short-dash-dot-dot` | `short-dot` | solid
    ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
