package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.Symbol3DLayer
import typingsSlinky.arcgisJsApi.esri.Symbol3DLayerConstructor
import typingsSlinky.arcgisJsApi.esri.Symbol3DLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symbol3DLayerMod extends Shortcut {
  
  @JSImport("esri/symbols/Symbol3DLayer", JSImport.Namespace)
  @js.native
  val ^ : Symbol3DLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/Symbol3DLayer", JSImport.Namespace)
  @js.native
  /**
    * Symbol layers are used to define the visualization of [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html), [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html), [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html), and mesh geometries rendered with [3D symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3DLayer.html)
    */
  class Class () extends Symbol3DLayer {
    def this(properties: Symbol3DLayerProperties) = this()
  }
  
  type _To = Symbol3DLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `symbol3DLayerMod.foo` */
  override def _to: Symbol3DLayerConstructor = ^
}
