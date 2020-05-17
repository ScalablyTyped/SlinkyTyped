package typingsSlinky.materialDrawer.focusTrapMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.HTMLElement
  - java.lang.String
  - js.Function0[typingsSlinky.std.HTMLElement]
*/
trait FocusTarget extends js.Object

object FocusTarget {
  @scala.inline
  implicit def apply(value: js.Function0[HTMLElement]): FocusTarget = value.asInstanceOf[FocusTarget]
  @scala.inline
  implicit def apply(value: HTMLElement): FocusTarget = value.asInstanceOf[FocusTarget]
  @scala.inline
  implicit def apply(value: String): FocusTarget = value.asInstanceOf[FocusTarget]
}

