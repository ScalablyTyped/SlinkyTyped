package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`cumulative-from-end`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`cumulative-from-start`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`time-window`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.disabled
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.instant
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.playing
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeSliderViewModel extends Accessor {
  
  /**
    * Defined specific locations on the timeline that the handles will snap to when manipulated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#effectiveStops)
    */
  val effectiveStops: js.Array[js.Date] = js.native
  
  /**
    * The temporal extent of the entire slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#fullTimeExtent)
    */
  var fullTimeExtent: TimeExtent = js.native
  
  /**
    * If animating, the time indicator(s) will restart if they reach the edge.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#loop)
    */
  var loop: Boolean = js.native
  
  /**
    * The time slider mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#mode)
    */
  var mode: instant | `time-window` | `cumulative-from-start` | `cumulative-from-end` = js.native
  
  /**
    * Incrementally moves the time extent forward one stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#next)
    */
  def next(): Unit = js.native
  
  /**
    * Initiates the time slider's temporal playback.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#play)
    */
  def play(): Unit = js.native
  
  /**
    * The time (in milliseconds) between playback steps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#playRate)
    */
  var playRate: Double = js.native
  
  /**
    * Incrementally moves the time extent back one stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#previous)
    */
  def previous(): Unit = js.native
  
  /**
    * The view model's state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#state)
    */
  val state: disabled | ready | playing = js.native
  
  /**
    * Stops the time slider's temporal playback.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#stop)
    */
  def stop(): Unit = js.native
  
  /**
    * Defines specific locations on the time slider where thumbs will snap to when manipulated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#stops)
    */
  var stops: StopsByDates | StopsByCount | StopsByInterval = js.native
  
  /**
    * The current time extent of the time slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#timeExtent)
    */
  val timeExtent: TimeExtent = js.native
  
  /**
    * The user defined time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#values)
    */
  var values: js.Array[js.Date] = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
}
