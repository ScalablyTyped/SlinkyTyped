package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.LayerSearchSource
import typingsSlinky.arcgisJsApi.esri.LayerSearchSourceConstructor
import typingsSlinky.arcgisJsApi.esri.LayerSearchSourceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerSearchSourceMod extends Shortcut {
  
  @JSImport("esri/widgets/Search/LayerSearchSource", JSImport.Namespace)
  @js.native
  val ^ : LayerSearchSourceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Search/LayerSearchSource", JSImport.Namespace)
  @js.native
  /**
    * The following properties define a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)-based [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#sources) whose features may be searched by a [Search](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html) widget instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html)
    */
  class Class () extends LayerSearchSource {
    def this(properties: LayerSearchSourceProperties) = this()
  }
  
  type _To = LayerSearchSourceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `layerSearchSourceMod.foo` */
  override def _to: LayerSearchSourceConstructor = ^
}
