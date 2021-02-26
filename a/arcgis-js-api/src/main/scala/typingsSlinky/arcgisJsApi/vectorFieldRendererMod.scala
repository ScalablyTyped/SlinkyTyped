package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.VectorFieldRenderer
import typingsSlinky.arcgisJsApi.esri.VectorFieldRendererConstructor
import typingsSlinky.arcgisJsApi.esri.VectorFieldRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorFieldRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/VectorFieldRenderer", JSImport.Namespace)
  @js.native
  val ^ : VectorFieldRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/VectorFieldRenderer", JSImport.Namespace)
  @js.native
  /**
    * The VectorFieldRenderer allows you to display your raster data with vector symbols.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html)
    */
  class Class () extends VectorFieldRenderer {
    def this(properties: VectorFieldRendererProperties) = this()
  }
  
  type _To = VectorFieldRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `vectorFieldRendererMod.foo` */
  override def _to: VectorFieldRendererConstructor = ^
}
