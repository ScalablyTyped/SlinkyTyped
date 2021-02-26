package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.MapImage
import typingsSlinky.arcgisJsApi.esri.MapImageConstructor
import typingsSlinky.arcgisJsApi.esri.MapImageProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapImageMod extends Shortcut {
  
  @JSImport("esri/layers/support/MapImage", JSImport.Namespace)
  @js.native
  val ^ : MapImageConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/MapImage", JSImport.Namespace)
  @js.native
  class Class () extends MapImage {
    def this(properties: MapImageProperties) = this()
  }
  
  type _To = MapImageConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mapImageMod.foo` */
  override def _to: MapImageConstructor = ^
}
