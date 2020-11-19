package typingsSlinky.googleAppsScript.GoogleAppsScript.CardService

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An input field that allows inputing a date.
  */
@js.native
trait DateTimePicker extends js.Object {
  
  def setFieldName(fieldName: String): DateTimePicker = js.native
  
  def setOnChangeAction(action: Action): DateTimePicker = js.native
  
  def setTimeZoneOffsetInMins(timeZoneOffsetMins: Integer): DateTimePicker = js.native
  
  def setTitle(title: String): DateTimePicker = js.native
  
  def setValueInMsSinceEpoch(valueMsEpoch: String): DateTimePicker = js.native
  def setValueInMsSinceEpoch(valueMsEpoch: Double): DateTimePicker = js.native
}
