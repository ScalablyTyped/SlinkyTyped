package typingsSlinky.canvasGauges.CanvasGauges

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.HTMLElement
*/
trait RenderTarget extends js.Object

object RenderTarget {
  @scala.inline
  implicit def apply(value: HTMLElement): RenderTarget = value.asInstanceOf[RenderTarget]
  @scala.inline
  implicit def apply(value: String): RenderTarget = value.asInstanceOf[RenderTarget]
}

