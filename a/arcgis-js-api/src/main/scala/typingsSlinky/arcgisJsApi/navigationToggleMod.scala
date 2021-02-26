package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.NavigationToggle
import typingsSlinky.arcgisJsApi.esri.NavigationToggleConstructor
import typingsSlinky.arcgisJsApi.esri.NavigationToggleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationToggleMod extends Shortcut {
  
  @JSImport("esri/widgets/NavigationToggle", JSImport.Namespace)
  @js.native
  val ^ : NavigationToggleConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/NavigationToggle", JSImport.Namespace)
  @js.native
  /**
    * Provides two simple buttons for toggling the [navigation mode](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle-NavigationToggleViewModel.html#navigationMode) of a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle.html)
    */
  class Class () extends NavigationToggle {
    def this(properties: NavigationToggleProperties) = this()
  }
  
  type _To = NavigationToggleConstructor
  
  /* This means you don't have to write `^`, but can instead just say `navigationToggleMod.foo` */
  override def _to: NavigationToggleConstructor = ^
}
