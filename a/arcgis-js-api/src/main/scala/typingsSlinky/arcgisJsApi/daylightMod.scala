package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.Daylight
import typingsSlinky.arcgisJsApi.esri.DaylightConstructor
import typingsSlinky.arcgisJsApi.esri.DaylightProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object daylightMod extends Shortcut {
  
  @JSImport("esri/widgets/Daylight", JSImport.Namespace)
  @js.native
  val ^ : DaylightConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Daylight", JSImport.Namespace)
  @js.native
  /**
    * The daylight widget can be used to manipulate the time and date and to toggle shadows in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html)
    */
  class Class () extends Daylight {
    def this(properties: DaylightProperties) = this()
  }
  
  type _To = DaylightConstructor
  
  /* This means you don't have to write `^`, but can instead just say `daylightMod.foo` */
  override def _to: DaylightConstructor = ^
}
