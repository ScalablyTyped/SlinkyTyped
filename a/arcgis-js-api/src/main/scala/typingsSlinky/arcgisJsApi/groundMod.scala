package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.Ground
import typingsSlinky.arcgisJsApi.esri.GroundConstructor
import typingsSlinky.arcgisJsApi.esri.GroundProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groundMod extends Shortcut {
  
  @JSImport("esri/Ground", JSImport.Namespace)
  @js.native
  val ^ : GroundConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/Ground", JSImport.Namespace)
  @js.native
  /**
    * The Ground class contains properties that specify how the ground surface is displayed in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html)
    */
  class Class () extends Ground {
    def this(properties: GroundProperties) = this()
  }
  
  type _To = GroundConstructor
  
  /* This means you don't have to write `^`, but can instead just say `groundMod.foo` */
  override def _to: GroundConstructor = ^
}
