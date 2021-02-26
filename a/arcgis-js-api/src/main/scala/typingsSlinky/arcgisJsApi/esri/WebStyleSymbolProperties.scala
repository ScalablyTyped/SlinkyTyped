package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebStyleSymbolProperties extends SymbolProperties {
  
  /**
    * The name of the symbol within the web style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#name)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The portal that contains the web style this symbol refers to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#portal)
    */
  var portal: js.UndefOr[PortalProperties] = js.native
  
  /**
    * A registered web style name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleName)
    */
  var styleName: js.UndefOr[String] = js.native
  
  /**
    * URL that points to the web style definition.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleUrl)
    */
  var styleUrl: js.UndefOr[String] = js.native
}
object WebStyleSymbolProperties {
  
  @scala.inline
  def apply(): WebStyleSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebStyleSymbolProperties]
  }
  
  @scala.inline
  implicit class WebStyleSymbolPropertiesMutableBuilder[Self <: WebStyleSymbolProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPortal(value: PortalProperties): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
    
    @scala.inline
    def setStyleName(value: String): Self = StObject.set(x, "styleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNameUndefined: Self = StObject.set(x, "styleName", js.undefined)
    
    @scala.inline
    def setStyleUrl(value: String): Self = StObject.set(x, "styleUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUrlUndefined: Self = StObject.set(x, "styleUrl", js.undefined)
  }
}
