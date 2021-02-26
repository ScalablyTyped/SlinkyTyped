package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.PictureMarkerSymbol
import typingsSlinky.arcgisJsApi.esri.PictureMarkerSymbolConstructor
import typingsSlinky.arcgisJsApi.esri.PictureMarkerSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pictureMarkerSymbolMod extends Shortcut {
  
  @JSImport("esri/symbols/PictureMarkerSymbol", JSImport.Namespace)
  @js.native
  val ^ : PictureMarkerSymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/PictureMarkerSymbol", JSImport.Namespace)
  @js.native
  /**
    * PictureMarkerSymbol renders [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) graphics in either a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) using an image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html)
    */
  class Class () extends PictureMarkerSymbol {
    def this(properties: PictureMarkerSymbolProperties) = this()
  }
  
  type _To = PictureMarkerSymbolConstructor
  
  /* This means you don't have to write `^`, but can instead just say `pictureMarkerSymbolMod.foo` */
  override def _to: PictureMarkerSymbolConstructor = ^
}
