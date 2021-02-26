package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.Slice
import typingsSlinky.arcgisJsApi.esri.SliceConstructor
import typingsSlinky.arcgisJsApi.esri.SliceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliceMod extends Shortcut {
  
  @JSImport("esri/widgets/Slice", JSImport.Namespace)
  @js.native
  val ^ : SliceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Slice", JSImport.Namespace)
  @js.native
  /**
    * The slice widget is a 3D analysis tool that can be used to reveal occluded content in a {@link module:esri/views/SceneView}.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice.html)
    */
  class Class () extends Slice {
    def this(properties: SliceProperties) = this()
  }
  
  type _To = SliceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `sliceMod.foo` */
  override def _to: SliceConstructor = ^
}
