package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`feature-unsupported`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.active
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.disabled
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullscreenViewModel extends Accessor {
  
  /**
    * The [HTMLElement](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement) to present in fullscreen mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Fullscreen-FullscreenViewModel.html#element)
    */
  var element: HTMLElement = js.native
  
  /**
    * Enter fullscreen.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Fullscreen-FullscreenViewModel.html#enter)
    */
  def enter(): Unit = js.native
  
  /**
    * Exit fullscreen.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Fullscreen-FullscreenViewModel.html#exit)
    */
  def exit(): Unit = js.native
  
  /**
    * The view model's state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Fullscreen-FullscreenViewModel.html#state)
    */
  val state: active | ready | `feature-unsupported` | disabled = js.native
  
  /**
    * Toggle fullscreen.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Fullscreen-FullscreenViewModel.html#toggle)
    */
  def toggle(): Unit = js.native
  
  /**
    * The view associated with the widget instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Fullscreen-FullscreenViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
}
