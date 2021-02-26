package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.DefaultUI
import typingsSlinky.arcgisJsApi.esri.DefaultUIConstructor
import typingsSlinky.arcgisJsApi.esri.DefaultUIProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultUIMod extends Shortcut {
  
  @JSImport("esri/views/ui/DefaultUI", JSImport.Namespace)
  @js.native
  val ^ : DefaultUIConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/ui/DefaultUI", JSImport.Namespace)
  @js.native
  /**
    * The DefaultUI class exposes the default [widget](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html) [components](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-DefaultUI.html#components) available in either a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-DefaultUI.html)
    */
  class Class () extends DefaultUI {
    def this(properties: DefaultUIProperties) = this()
  }
  
  type _To = DefaultUIConstructor
  
  /* This means you don't have to write `^`, but can instead just say `defaultUIMod.foo` */
  override def _to: DefaultUIConstructor = ^
}
