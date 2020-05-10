package typingsSlinky.formik.typesMod

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLFormElement
import slinky.core.SyntheticEvent
import slinky.web.SyntheticFocusEvent
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormikHandlers extends js.Object {
  def handleBlur(e: SyntheticFocusEvent[_]): Unit = js.native
  def handleBlur[T](fieldOrEvent: T): Unit | (js.Function1[/* e */ js.Any, Unit]) = js.native
  def handleChange(e: ChangeEvent[_]): Unit = js.native
  def handleChange[T](field: T): (js.Function1[/* e */ js.Any | ChangeEvent[_], Unit]) | Unit = js.native
  def handleReset(): Unit = js.native
  def handleSubmit(): Unit = js.native
  def handleSubmit(e: SyntheticEvent[EventTarget with HTMLFormElement, Event_]): Unit = js.native
}

