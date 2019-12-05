package typingsSlinky.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InputType extends js.Object

/**
  * A subset of input types that fits to a simple API returning one string.Not available on purpose:
  * button, checkbox, hidden, image, password, radio, range, reset, search, submit.
  */
@JSGlobal("sap.m.InputType")
@js.native
object InputType extends js.Object {
  @js.native
  sealed trait Date extends InputType
  
  @js.native
  sealed trait Datetime extends InputType
  
  @js.native
  sealed trait DatetimeLocale extends InputType
  
  @js.native
  sealed trait Email extends InputType
  
  @js.native
  sealed trait Month extends InputType
  
  @js.native
  sealed trait Number extends InputType
  
  @js.native
  sealed trait Password extends InputType
  
  @js.native
  sealed trait Tel extends InputType
  
  @js.native
  sealed trait Text extends InputType
  
  @js.native
  sealed trait Time extends InputType
  
  @js.native
  sealed trait Url extends InputType
  
  @js.native
  sealed trait Week extends InputType
  
  /* 0 */ val Date: typingsSlinky.openui5.sap.m.InputType.Date with Double = js.native
  /* 1 */ val Datetime: typingsSlinky.openui5.sap.m.InputType.Datetime with Double = js.native
  /* 2 */ val DatetimeLocale: typingsSlinky.openui5.sap.m.InputType.DatetimeLocale with Double = js.native
  /* 3 */ val Email: typingsSlinky.openui5.sap.m.InputType.Email with Double = js.native
  /* 4 */ val Month: typingsSlinky.openui5.sap.m.InputType.Month with Double = js.native
  /* 5 */ val Number: typingsSlinky.openui5.sap.m.InputType.Number with Double = js.native
  /* 6 */ val Password: typingsSlinky.openui5.sap.m.InputType.Password with Double = js.native
  /* 7 */ val Tel: typingsSlinky.openui5.sap.m.InputType.Tel with Double = js.native
  /* 8 */ val Text: typingsSlinky.openui5.sap.m.InputType.Text with Double = js.native
  /* 9 */ val Time: typingsSlinky.openui5.sap.m.InputType.Time with Double = js.native
  /* 10 */ val Url: typingsSlinky.openui5.sap.m.InputType.Url with Double = js.native
  /* 11 */ val Week: typingsSlinky.openui5.sap.m.InputType.Week with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputType with Double] = js.native
}

