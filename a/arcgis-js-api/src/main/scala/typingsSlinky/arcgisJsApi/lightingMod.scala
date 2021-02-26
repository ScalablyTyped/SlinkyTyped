package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.Lighting
import typingsSlinky.arcgisJsApi.esri.LightingConstructor
import typingsSlinky.arcgisJsApi.esri.LightingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightingMod extends Shortcut {
  
  @JSImport("esri/webscene/Lighting", JSImport.Namespace)
  @js.native
  val ^ : LightingConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webscene/Lighting", JSImport.Namespace)
  @js.native
  class Class () extends Lighting {
    def this(properties: LightingProperties) = this()
  }
  
  type _To = LightingConstructor
  
  /* This means you don't have to write `^`, but can instead just say `lightingMod.foo` */
  override def _to: LightingConstructor = ^
}
