package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.LayersMixin
import typingsSlinky.arcgisJsApi.esri.LayersMixinConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layersMixinMod extends Shortcut {
  
  @JSImport("esri/support/LayersMixin", JSImport.Namespace)
  @js.native
  val ^ : LayersMixinConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/support/LayersMixin", JSImport.Namespace)
  @js.native
  class Class () extends LayersMixin
  
  type _To = LayersMixinConstructor
  
  /* This means you don't have to write `^`, but can instead just say `layersMixinMod.foo` */
  override def _to: LayersMixinConstructor = ^
}
