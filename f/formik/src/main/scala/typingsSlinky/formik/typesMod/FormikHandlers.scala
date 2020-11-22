package typingsSlinky.formik.typesMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLFormElement
import slinky.core.SyntheticEvent
import slinky.web.SyntheticFocusEvent
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormikHandlers extends js.Object {
  
  def getFieldHelpers[Value](name: String): FieldHelperProps[Value] = js.native
  
  def getFieldMeta[Value](name: String): FieldMetaProps[Value] = js.native
  
  def getFieldProps[Value](props: js.Any): FieldInputProps[Value] = js.native
  
  def handleBlur(e: SyntheticFocusEvent[_]): Unit = js.native
  def handleBlur[T](fieldOrEvent: T): Unit | (js.Function1[/* e */ js.Any, Unit]) = js.native
  
  def handleChange(e: ChangeEvent[_]): Unit = js.native
  def handleChange[T](field: T): (js.Function1[/* e */ String | ChangeEvent[_], Unit]) | Unit = js.native
  
  /** Reset form event handler  */
  def handleReset(): Unit = js.native
  def handleReset(e: SyntheticEvent[Event, _]): Unit = js.native
  
  /** Form submit handler */
  def handleSubmit(): Unit = js.native
  def handleSubmit(e: SyntheticEvent[EventTarget with HTMLFormElement, Event]): Unit = js.native
}
