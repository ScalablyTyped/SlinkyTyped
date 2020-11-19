package typingsSlinky.gaugejs.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gaugejs", "Gauge")
@js.native
class Gauge protected () extends BaseGauge {
  /**
    * Creates a new gauge renderer for the given canvas element.
    * @param canvas The canvas element to render to.
    */
  def this(canvas: HTMLCanvasElement) = this()
  
  /**
    * The max gauge value.
    */
  var maxValue: Double = js.native
  
  /**
    * Sets the current value of the gauge pointer.
    * @param value
    */
  def set(value: Double): Boolean = js.native
}
