package typingsSlinky.reactTether.mod.ReactTether

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.reactTether.reactTetherStrings.window
  - typingsSlinky.reactTether.reactTetherStrings.scrollParent
  - typingsSlinky.std.HTMLElement
*/
trait ContraintsTo extends js.Object

object ContraintsTo {
  @scala.inline
  def window: typingsSlinky.reactTether.reactTetherStrings.window = "window".asInstanceOf[typingsSlinky.reactTether.reactTetherStrings.window]
  @scala.inline
  def scrollParent: typingsSlinky.reactTether.reactTetherStrings.scrollParent = "scrollParent".asInstanceOf[typingsSlinky.reactTether.reactTetherStrings.scrollParent]
  @scala.inline
  implicit def apply(value: HTMLElement): ContraintsTo = value.asInstanceOf[ContraintsTo]
  @scala.inline
  implicit def apply(value: String): ContraintsTo = value.asInstanceOf[ContraintsTo]
}

