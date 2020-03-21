package typingsSlinky.fabric.fabricImplMod

import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBrightnessFilter extends IBaseFilter {
  /**
  	 * Applies filter to canvas element
  	 * @param canvasEl Canvas element to apply filter to
  	 */
  def applyTo(canvasEl: HTMLCanvasElement): Unit = js.native
}

