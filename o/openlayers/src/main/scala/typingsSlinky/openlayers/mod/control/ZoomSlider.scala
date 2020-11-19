package typingsSlinky.openlayers.mod.control

import typingsSlinky.openlayers.mod.MapEvent
import typingsSlinky.openlayers.mod.olx.control.ZoomSliderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * A slider type of control for zooming.
  *
  * Example:
  *
  *     map.addControl(new ol.control.ZoomSlider());
  *
  * @param opt_options Zoom slider options.
  * @api stable
  */
@JSImport("openlayers", "control.ZoomSlider")
@js.native
/**
  * @classdesc
  * A slider type of control for zooming.
  *
  * Example:
  *
  *     map.addControl(new ol.control.ZoomSlider());
  *
  * @param opt_options Zoom slider options.
  * @api stable
  */
class ZoomSlider () extends Control {
  def this(opt_options: ZoomSliderOptions) = this()
}
/* static members */
@JSImport("openlayers", "control.ZoomSlider")
@js.native
object ZoomSlider extends js.Object {
  
  /**
    * Update the zoomslider element.
    * @param mapEvent Map event.
    * @api
    */
  def render(mapEvent: MapEvent): Unit = js.native
}
