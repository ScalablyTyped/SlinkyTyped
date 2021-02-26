package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.ColormapInfo
import typingsSlinky.arcgisJsApi.esri.ColormapInfoConstructor
import typingsSlinky.arcgisJsApi.esri.ColormapInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colormapInfoMod extends Shortcut {
  
  @JSImport("esri/renderers/support/ColormapInfo", JSImport.Namespace)
  @js.native
  val ^ : ColormapInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/support/ColormapInfo", JSImport.Namespace)
  @js.native
  class Class () extends ColormapInfo {
    def this(properties: ColormapInfoProperties) = this()
  }
  
  type _To = ColormapInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `colormapInfoMod.foo` */
  override def _to: ColormapInfoConstructor = ^
}
