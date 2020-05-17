package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - X
  - typingsSlinky.puppeteer.mod.ElementHandle[X]
*/
trait WrapElementHandle[X] extends js.Object

object WrapElementHandle {
  @scala.inline
  implicit def apply[X](value: ElementHandle[X]): WrapElementHandle[X] = value.asInstanceOf[WrapElementHandle[X]]
  @scala.inline
  implicit def apply[X](value: X): WrapElementHandle[X] = value.asInstanceOf[WrapElementHandle[X]]
}

