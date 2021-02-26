package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.BaseElevationLayer
import typingsSlinky.arcgisJsApi.esri.BaseElevationLayerConstructor
import typingsSlinky.arcgisJsApi.esri.BaseElevationLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseElevationLayerMod extends Shortcut {
  
  @JSImport("esri/layers/BaseElevationLayer", JSImport.Namespace)
  @js.native
  val ^ : BaseElevationLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/BaseElevationLayer", JSImport.Namespace)
  @js.native
  /**
    * BaseElevationLayer is intended to be extended for creating custom elevation layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html)
    */
  class Class () extends BaseElevationLayer {
    def this(properties: BaseElevationLayerProperties) = this()
  }
  
  type _To = BaseElevationLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `baseElevationLayerMod.foo` */
  override def _to: BaseElevationLayerConstructor = ^
}
