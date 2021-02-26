package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.PixelBlock
import typingsSlinky.arcgisJsApi.esri.PixelBlockConstructor
import typingsSlinky.arcgisJsApi.esri.PixelBlockProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pixelBlockMod extends Shortcut {
  
  @JSImport("esri/layers/support/PixelBlock", JSImport.Namespace)
  @js.native
  val ^ : PixelBlockConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/PixelBlock", JSImport.Namespace)
  @js.native
  class Class () extends PixelBlock {
    def this(properties: PixelBlockProperties) = this()
  }
  
  type _To = PixelBlockConstructor
  
  /* This means you don't have to write `^`, but can instead just say `pixelBlockMod.foo` */
  override def _to: PixelBlockConstructor = ^
}
