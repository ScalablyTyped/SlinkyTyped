package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`backward-diagonal`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`diagonal-cross`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`forward-diagonal`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`simple-fill`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.cross
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.horizontal
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.solid
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.arcgisJsApi.esri.Symbol2D3D because Already inherited
- typingsSlinky.arcgisJsApi.esri.symbols.Symbol2D3D because Already inherited */ @js.native
trait SimpleFillSymbol
  extends Symbol2D
     with FillSymbol
     with typingsSlinky.arcgisJsApi.esri.symbols.FillSymbol
     with typingsSlinky.arcgisJsApi.esri.symbols.Symbol2D
     with symbolsFillSymbol {
  
  /**
    * The fill style. Possible values are listed in the table below:
    *
    * Value | Description
    * ------|-------------
    * backward-diagonal | ![sfs-backward-diagonal](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sfs-backward-diagonal.png)
    * cross | ![sfs-cross](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sfs-cross.png)
    * diagonal-cross | ![sfs-diagonal-cross](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sfs-diagonal-cross.png)
    * forward-diagonal | ![sfs-forward-diagonal](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sfs-forward-diagonal.png)
    * horizontal | ![sfs-horizontal](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sfs-horizontal.png)
    * none | The polygon has no fill.
    * solid | ![sfs-solid](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sfs-solid.png)
    * vertical | ![sfs-vertical](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sfs-vertical.png)
    *
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html#style)
    *
    * @default solid
    */
  var style: `backward-diagonal` | cross | `diagonal-cross` | `forward-diagonal` | horizontal | none | solid | vertical = js.native
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html#type)
    */
  @JSName("type")
  val type_SimpleFillSymbol: `simple-fill` = js.native
}
