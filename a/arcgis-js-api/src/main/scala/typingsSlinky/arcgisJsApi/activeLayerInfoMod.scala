package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.ActiveLayerInfo
import typingsSlinky.arcgisJsApi.esri.ActiveLayerInfoConstructor
import typingsSlinky.arcgisJsApi.esri.ActiveLayerInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activeLayerInfoMod extends Shortcut {
  
  @JSImport("esri/widgets/Legend/support/ActiveLayerInfo", JSImport.Namespace)
  @js.native
  val ^ : ActiveLayerInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Legend/support/ActiveLayerInfo", JSImport.Namespace)
  @js.native
  class Class () extends ActiveLayerInfo {
    def this(properties: ActiveLayerInfoProperties) = this()
  }
  
  type _To = ActiveLayerInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `activeLayerInfoMod.foo` */
  override def _to: ActiveLayerInfoConstructor = ^
}
