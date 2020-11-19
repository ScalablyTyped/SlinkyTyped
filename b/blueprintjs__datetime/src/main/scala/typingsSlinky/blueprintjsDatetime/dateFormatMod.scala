package typingsSlinky.blueprintjsDatetime

import typingsSlinky.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typingsSlinky.blueprintjsDatetime.datePickerCoreMod.IDatePickerBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/datetime/lib/esm/dateFormat", JSImport.Namespace)
@js.native
object dateFormatMod extends js.Object {
  
  def getFormattedDateString(date: Null, props: IDateFormatProps with IDatePickerBaseProps): String = js.native
  def getFormattedDateString(date: Null, props: IDateFormatProps with IDatePickerBaseProps, ignoreRange: Boolean): String = js.native
  def getFormattedDateString(date: js.Date, props: IDateFormatProps with IDatePickerBaseProps): String = js.native
  def getFormattedDateString(date: js.Date, props: IDateFormatProps with IDatePickerBaseProps, ignoreRange: Boolean): String = js.native
  @JSName("getFormattedDateString")
  def getFormattedDateString_false(date: `false`, props: IDateFormatProps with IDatePickerBaseProps): String = js.native
  @JSName("getFormattedDateString")
  def getFormattedDateString_false(date: `false`, props: IDateFormatProps with IDatePickerBaseProps, ignoreRange: Boolean): String = js.native
  
  @js.native
  trait IDateFormatProps extends js.Object {
    
    /**
      * Function to render a JavaScript `Date` to a string.
      * Optional `locale` argument comes directly from the prop on this component:
      * if the prop is defined, then the argument will be too.
      */
    def formatDate(date: js.Date): String = js.native
    def formatDate(date: js.Date, locale: String): String = js.native
    
    /**
      * The error message to display when the date selected is invalid.
      * @default "Invalid date"
      */
    var invalidDateMessage: js.UndefOr[String] = js.native
    
    /**
      * The locale name, which is passed to `formatDate`, `parseDate`, and the functions in `localeUtils`.
      */
    var locale: js.UndefOr[String] = js.native
    
    /**
      * The error message to display when the date selected is out of range.
      * @default "Out of range"
      */
    var outOfRangeMessage: js.UndefOr[String] = js.native
    
    /**
      * Function to deserialize user input text to a JavaScript `Date` object.
      * Return `false` if the string is an invalid date.
      * Return `null` to represent the absence of a date.
      * Optional `locale` argument comes directly from the prop on this component.
      */
    def parseDate(str: String): js.Date | `false` | Null = js.native
    def parseDate(str: String, locale: String): js.Date | `false` | Null = js.native
    
    /**
      * Placeholder text to display in empty input fields.
      * Recommended practice is to indicate the expected date format.
      */
    var placeholder: js.UndefOr[String] = js.native
  }
}
