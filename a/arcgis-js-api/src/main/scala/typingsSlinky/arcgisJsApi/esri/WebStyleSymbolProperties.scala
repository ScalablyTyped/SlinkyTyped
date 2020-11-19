package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebStyleSymbolProperties extends SymbolProperties {
  
  /**
    * The name of the symbol within the web style. Each symbol in a web style is identified by a unique name. Only [Esri Web Style Symbols (2D)](https://developers.arcgis.com/javascript/latest/guide/esri-web-style-symbols-2d/index.html) and [Esri Web Style Symbols (3D)](https://developers.arcgis.com/javascript/latest/guide/esri-web-style-symbols-3d/index.html) can be referenced here.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#name)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The portal that contains the web style this symbol refers to. Only required when [styleName](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleName) is set.  Defaults to the value in [config.portalUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#portalUrl) (e.g. https://www.arcgis.com).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#portal)
    */
  var portal: js.UndefOr[PortalProperties] = js.native
  
  /**
    * A registered web style name. Only [Esri Web Style Symbols (2D)](https://developers.arcgis.com/javascript/latest/guide/esri-web-style-symbols-2d/index.html) and [Esri Web Style Symbols (3D)](https://developers.arcgis.com/javascript/latest/guide/esri-web-style-symbols-3d/index.html) can be referenced here. Note that the 2D web style symbols are only supported in 2D and 3D web style symbols are only supported in 3D with an exception of [`EsriIconsStyle`](https://developers.arcgis.com/javascript/latest/guide/esri-web-style-symbols-3d/index.html#icons) which can be used in both 2D and 3D.  Requires [portal](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#portal) property to be set. Can not be used in conjunction with [styleUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleUrl).  See class description for example.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleName)
    */
  var styleName: js.UndefOr[String] = js.native
  
  /**
    * URL that points to the web style definition. Cannot be used in conjunction with [styleName](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleName) and [portal](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#portal).  See class description for example.
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
  implicit class WebStyleSymbolPropertiesOps[Self <: WebStyleSymbolProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPortal(value: PortalProperties): Self = this.set("portal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortal: Self = this.set("portal", js.undefined)
    
    @scala.inline
    def setStyleName(value: String): Self = this.set("styleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleName: Self = this.set("styleName", js.undefined)
    
    @scala.inline
    def setStyleUrl(value: String): Self = this.set("styleUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleUrl: Self = this.set("styleUrl", js.undefined)
  }
}
