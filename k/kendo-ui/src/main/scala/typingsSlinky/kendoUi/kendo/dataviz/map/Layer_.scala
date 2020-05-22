package typingsSlinky.kendoUi.kendo.dataviz.map

import typingsSlinky.kendoUi.kendo.Class
import typingsSlinky.kendoUi.kendo.dataviz.ui.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layer_ extends Class {
  var map: Map
  var options: LayerOptions
  def hide(): Unit
  def show(): Unit
}

object Layer_ {
  @scala.inline
  def apply(hide: () => Unit, map: Map, options: LayerOptions, show: () => Unit): Layer_ = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), map = map.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Layer_]
  }
}

