package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.HeatmapColorStop
import typingsSlinky.arcgisJsApi.esri.HeatmapColorStopConstructor
import typingsSlinky.arcgisJsApi.esri.HeatmapColorStopProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heatmapColorStopMod extends Shortcut {
  
  @JSImport("esri/renderers/support/HeatmapColorStop", JSImport.Namespace)
  @js.native
  val ^ : HeatmapColorStopConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/support/HeatmapColorStop", JSImport.Namespace)
  @js.native
  class Class () extends HeatmapColorStop {
    def this(properties: HeatmapColorStopProperties) = this()
  }
  
  type _To = HeatmapColorStopConstructor
  
  /* This means you don't have to write `^`, but can instead just say `heatmapColorStopMod.foo` */
  override def _to: HeatmapColorStopConstructor = ^
}
