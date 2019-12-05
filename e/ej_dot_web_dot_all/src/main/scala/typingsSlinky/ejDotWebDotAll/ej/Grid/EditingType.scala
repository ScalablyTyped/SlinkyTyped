package typingsSlinky.ejDotWebDotAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditingType extends js.Object

@JSGlobal("ej.Grid.EditingType")
@js.native
object EditingType extends js.Object {
  ///Specifies editing type as boolean edit.
  @js.native
  sealed trait Boolean extends EditingType
  
  ///Specifies editing type as datepicker.
  @js.native
  sealed trait DatePicker extends EditingType
  
  ///Specifies editing type as datetime picker.
  @js.native
  sealed trait DateTimePicker extends EditingType
  
  ///Specifies editing type as dropdown edit.
  @js.native
  sealed trait Dropdown extends EditingType
  
  ///Specifies editing type as numeric edit.
  @js.native
  sealed trait Numeric extends EditingType
  
  ///Specifies editing type as string edit.
  @js.native
  sealed trait String extends EditingType
  
  /* 1 */ val Boolean: typingsSlinky.ejDotWebDotAll.ej.Grid.EditingType.Boolean with Double = js.native
  /* 4 */ val DatePicker: typingsSlinky.ejDotWebDotAll.ej.Grid.EditingType.DatePicker with Double = js.native
  /* 5 */ val DateTimePicker: typingsSlinky.ejDotWebDotAll.ej.Grid.EditingType.DateTimePicker with Double = js.native
  /* 3 */ val Dropdown: typingsSlinky.ejDotWebDotAll.ej.Grid.EditingType.Dropdown with Double = js.native
  /* 2 */ val Numeric: typingsSlinky.ejDotWebDotAll.ej.Grid.EditingType.Numeric with Double = js.native
  /* 0 */ val String: typingsSlinky.ejDotWebDotAll.ej.Grid.EditingType.String with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditingType with Double] = js.native
}

