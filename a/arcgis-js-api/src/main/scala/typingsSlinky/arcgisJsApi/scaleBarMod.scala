package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.ScaleBar
import typingsSlinky.arcgisJsApi.esri.ScaleBarConstructor
import typingsSlinky.arcgisJsApi.esri.ScaleBarProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleBarMod extends Shortcut {
  
  @JSImport("esri/widgets/ScaleBar", JSImport.Namespace)
  @js.native
  val ^ : ScaleBarConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/ScaleBar", JSImport.Namespace)
  @js.native
  /**
    * The ScaleBar widget displays a scale bar on the map or in a specified HTML node.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html)
    */
  class Class () extends ScaleBar {
    def this(properties: ScaleBarProperties) = this()
  }
  
  type _To = ScaleBarConstructor
  
  /* This means you don't have to write `^`, but can instead just say `scaleBarMod.foo` */
  override def _to: ScaleBarConstructor = ^
}
