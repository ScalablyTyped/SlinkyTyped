package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`backward-diagonal`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`diagonal-cross`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`forward-diagonal`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.cross
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.horizontal
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.solid
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleFillSymbolProperties extends FillSymbolProperties {
  
  /**
    * The fill style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html#style)
    */
  var style: js.UndefOr[
    `backward-diagonal` | cross | `diagonal-cross` | `forward-diagonal` | horizontal | none | solid | vertical
  ] = js.native
}
object SimpleFillSymbolProperties {
  
  @scala.inline
  def apply(): SimpleFillSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleFillSymbolProperties]
  }
  
  @scala.inline
  implicit class SimpleFillSymbolPropertiesMutableBuilder[Self <: SimpleFillSymbolProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyle(
      value: `backward-diagonal` | cross | `diagonal-cross` | `forward-diagonal` | horizontal | none | solid | vertical
    ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
