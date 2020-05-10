package typingsSlinky.canvasFit

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("canvas-fit", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait resize extends js.Object {
    /**
      * Dynamically change the canvas' target scale.
      * Note that you still need to manually trigger a resize after doing this.
      * Instead of filling a given element, explicitly set the width and height of the canvas.
      * Note that this value will still be scaled up according to resize.scale
      */
    var parent: js.UndefOr[Element | (js.Function0[js.Tuple2[Double, Double]])] = js.native
    /**
      * Dynamically change the canvas' target scale.
      * Note that you still need to manually trigger a resize after doing this.
      */
    var scale: js.UndefOr[Double] = js.native
    def apply(ev: js.Any): js.Any = js.native
  }
  
  def apply(canvas: HTMLCanvasElement): resize = js.native
  def apply(canvas: HTMLCanvasElement, parent: Document_): resize = js.native
  def apply(canvas: HTMLCanvasElement, parent: Document_, scale: String): resize = js.native
  def apply(canvas: HTMLCanvasElement, parent: Document_, scale: Double): resize = js.native
  def apply(canvas: HTMLCanvasElement, parent: EventTarget): resize = js.native
  def apply(canvas: HTMLCanvasElement, parent: EventTarget, scale: String): resize = js.native
  def apply(canvas: HTMLCanvasElement, parent: EventTarget, scale: Double): resize = js.native
  def apply(canvas: HTMLCanvasElement, parent: HTMLElement): resize = js.native
  def apply(canvas: HTMLCanvasElement, parent: HTMLElement, scale: String): resize = js.native
  def apply(canvas: HTMLCanvasElement, parent: HTMLElement, scale: Double): resize = js.native
  def apply(canvas: SVGElement): resize = js.native
  def apply(canvas: SVGElement, parent: Document_): resize = js.native
  def apply(canvas: SVGElement, parent: Document_, scale: String): resize = js.native
  def apply(canvas: SVGElement, parent: Document_, scale: Double): resize = js.native
  def apply(canvas: SVGElement, parent: EventTarget): resize = js.native
  def apply(canvas: SVGElement, parent: EventTarget, scale: String): resize = js.native
  def apply(canvas: SVGElement, parent: EventTarget, scale: Double): resize = js.native
  def apply(canvas: SVGElement, parent: HTMLElement): resize = js.native
  def apply(canvas: SVGElement, parent: HTMLElement, scale: String): resize = js.native
  def apply(canvas: SVGElement, parent: HTMLElement, scale: Double): resize = js.native
}

