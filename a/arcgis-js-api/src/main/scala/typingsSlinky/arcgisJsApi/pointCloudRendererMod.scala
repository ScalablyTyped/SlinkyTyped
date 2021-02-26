package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.PointCloudRenderer
import typingsSlinky.arcgisJsApi.esri.PointCloudRendererConstructor
import typingsSlinky.arcgisJsApi.esri.PointCloudRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointCloudRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/PointCloudRenderer", JSImport.Namespace)
  @js.native
  val ^ : PointCloudRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/PointCloudRenderer", JSImport.Namespace)
  @js.native
  class Class () extends PointCloudRenderer {
    def this(properties: PointCloudRendererProperties) = this()
  }
  
  type _To = PointCloudRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `pointCloudRendererMod.foo` */
  override def _to: PointCloudRendererConstructor = ^
}
