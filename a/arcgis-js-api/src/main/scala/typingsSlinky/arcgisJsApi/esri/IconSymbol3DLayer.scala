package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`bottom-left`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`bottom-right`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`top-left`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`top-right`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.bottom
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.center
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.icon
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.left
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.relative
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.right
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconSymbol3DLayer
  extends Symbol3DLayer
     with typingsSlinky.arcgisJsApi.esri.symbols.Symbol3DLayer
     with symbolsSymbol3DLayer {
  
  /**
    * The positioning of the icon relative to the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchor)
    */
  var anchor: center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right` | relative = js.native
  
  /**
    * Defines the [anchor](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchor) relative to the center of the icon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchorPosition)
    */
  var anchorPosition: IconSymbol3DLayerAnchorPosition = js.native
  
  /**
    * The material used to shade the icon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#material)
    */
  var material: IconSymbol3DLayerMaterial = js.native
  
  /**
    * The outline of the icon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#outline)
    */
  var outline: IconSymbol3DLayerOutline = js.native
  
  /**
    * The shape (`primitive`) or image URL (`href`) used to visualize the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#resource)
    */
  var resource: IconSymbol3DLayerResource = js.native
  
  /**
    * The size of the icon in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#size)
    */
  var size: Double = js.native
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#type)
    */
  @JSName("type")
  val type_IconSymbol3DLayer: icon = js.native
}
