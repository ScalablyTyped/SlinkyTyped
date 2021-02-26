package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.IconSymbol3DLayer
import typingsSlinky.arcgisJsApi.esri.IconSymbol3DLayerConstructor
import typingsSlinky.arcgisJsApi.esri.IconSymbol3DLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconSymbol3DLayerMod extends Shortcut {
  
  @JSImport("esri/symbols/IconSymbol3DLayer", JSImport.Namespace)
  @js.native
  val ^ : IconSymbol3DLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/IconSymbol3DLayer", JSImport.Namespace)
  @js.native
  /**
    * IconSymbol3DLayer is used to render [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries using a flat 2D icon (e.g.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html)
    */
  class Class () extends IconSymbol3DLayer {
    def this(properties: IconSymbol3DLayerProperties) = this()
  }
  
  type _To = IconSymbol3DLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `iconSymbol3DLayerMod.foo` */
  override def _to: IconSymbol3DLayerConstructor = ^
}
