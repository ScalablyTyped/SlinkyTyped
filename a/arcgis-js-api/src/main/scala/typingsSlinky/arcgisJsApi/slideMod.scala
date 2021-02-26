package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.Slide
import typingsSlinky.arcgisJsApi.esri.SlideConstructor
import typingsSlinky.arcgisJsApi.esri.SlideProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slideMod extends Shortcut {
  
  @JSImport("esri/webscene/Slide", JSImport.Namespace)
  @js.native
  val ^ : SlideConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webscene/Slide", JSImport.Namespace)
  @js.native
  /**
    * A slide stores a snapshot of several pre-set properties of the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html) and [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html), such as the [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#basemap), [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#viewpoint) and [visible layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#visibleLayers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html)
    */
  class Class () extends Slide {
    def this(properties: SlideProperties) = this()
  }
  
  type _To = SlideConstructor
  
  /* This means you don't have to write `^`, but can instead just say `slideMod.foo` */
  override def _to: SlideConstructor = ^
}
