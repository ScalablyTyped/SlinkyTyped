package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.IHandle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`locate-error`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.disabled
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.locating
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocateViewModel
  extends Accessor
     with Evented
     with GeolocationPositioning
     with GoTo {
  
  /**
    * This function provides the ability to interrupt and cancel the process of programmatically obtaining the location of the user's device.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html#cancelLocate)
    */
  def cancelLocate(): Unit = js.native
  
  /**
    * Animates the view to the user's location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html#locate)
    */
  def locate(): js.Promise[_] = js.native
  
  @JSName("on")
  def on_locateerror(name: `locate-error`, eventHandler: LocateViewModelLocateErrorEventHandler): IHandle = js.native
  
  /**
    * The current state of the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html#state)
    */
  val state: disabled | ready | locating = js.native
}
