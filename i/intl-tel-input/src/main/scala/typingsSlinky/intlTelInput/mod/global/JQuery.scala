package typingsSlinky.intlTelInput.mod.global

import typingsSlinky.intlTelInput.intlTelInputStrings.destroy
import typingsSlinky.intlTelInput.intlTelInputStrings.getExtension
import typingsSlinky.intlTelInput.intlTelInputStrings.getNumber
import typingsSlinky.intlTelInput.intlTelInputStrings.getNumberType
import typingsSlinky.intlTelInput.intlTelInputStrings.getSelectedCountryData
import typingsSlinky.intlTelInput.intlTelInputStrings.getValidationError
import typingsSlinky.intlTelInput.intlTelInputStrings.isValidNumber
import typingsSlinky.intlTelInput.intlTelInputStrings.setCountry
import typingsSlinky.intlTelInput.intlTelInputStrings.setNumber
import typingsSlinky.intlTelInput.intlTelInputStrings.setPlaceholderNumberType
import typingsSlinky.intlTelInput.mod.JQueryPlugin
import typingsSlinky.intlTelInput.mod.Options
import typingsSlinky.intlTelInput.mod.intlTelInputUtils.CountryData
import typingsSlinky.intlTelInput.mod.intlTelInputUtils.numberFormat
import typingsSlinky.intlTelInput.mod.intlTelInputUtils.numberType
import typingsSlinky.intlTelInput.mod.intlTelInputUtils.placeholderNumberType
import typingsSlinky.intlTelInput.mod.intlTelInputUtils.validationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  /**
    * initialise the plugin with optional options.
    * @param options options that can be provided during initialization.
    */
  def intlTelInput(): js.Any = js.native
  def intlTelInput(method: String, numberFormat: numberFormat): String = js.native
  def intlTelInput(options: Options): js.Any = js.native
  @JSName("intlTelInput")
  var intlTelInput_Original: JQueryPlugin = js.native
  /**
    * Remove the plugin from the input, and unbind any event listeners.
    */
  @JSName("intlTelInput")
  def intlTelInput_destroy(method: destroy): Unit = js.native
  /**
    * Get the extension from the current number.
    * Requires the utilsScript option.
    * e.g. if the input value was "(702) 555-5555 ext. 1234", this would
    * return "1234".
    */
  @JSName("intlTelInput")
  def intlTelInput_getExtension(method: getExtension): String = js.native
  /**
    * Get the current number in the given format (defaults to E.164 standard).
    * The different formats are available in the enum
    * intlTelInputUtils.numberFormat - taken from here.
    * Requires the utilsScript option.
    * Note that even if nationalMode is enabled, this can still return a full
    * international number.
    * @param numberFormat the format in which the number will be returned.
    */
  @JSName("intlTelInput")
  def intlTelInput_getNumber(method: getNumber): String = js.native
  @JSName("intlTelInput")
  def intlTelInput_getNumber(method: getNumber, numberFormat: numberFormat): String = js.native
  /**
    * Get the type (fixed-line/mobile/toll-free etc) of the current number.
    * Requires the utilsScript option.
    * Returns an integer, which you can match against the various options in the
    * global enum intlTelInputUtils.numberType.
    * Note that in the US there's no way to differentiate between fixed-line and
    * mobile numbers, so instead it will return FIXED_LINE_OR_MOBILE.
    */
  @JSName("intlTelInput")
  def intlTelInput_getNumberType(method: getNumberType): numberType = js.native
  /**
    * Get the country data for the currently selected flag.
    */
  @JSName("intlTelInput")
  def intlTelInput_getSelectedCountryData(method: getSelectedCountryData): CountryData = js.native
  /**
    * Get more information about a validation error.
    * Requires the utilsScript option.
    * Returns an integer, which you can match against the various options in the
    * global enum ValidationError
    */
  @JSName("intlTelInput")
  def intlTelInput_getValidationError(method: getValidationError): validationError = js.native
  /**
    * Validate the current number. Expects an internationally formatted number
    * (unless nationalMode is enabled). If validation fails, you can use
    * getValidationError to get more information.
    * Requires the utilsScript option.
    * Also see getNumberType if you want to make sure the user enters a certain
    * type of number e.g. a mobile number.
    */
  @JSName("intlTelInput")
  def intlTelInput_isValidNumber(method: isValidNumber): Boolean = js.native
  /**
    * Change the country selection (e.g. when the user is entering their address).
    * @param countryCode country code of the country to be set.
    */
  @JSName("intlTelInput")
  def intlTelInput_setCountry(method: setCountry, countryCode: String): Unit = js.native
  /**
    * Insert a number, and update the selected flag accordingly.
    * Note that by default, if nationalMode is enabled it will try to use
    * national formatting.
    * @param aNumber number to be set.
    */
  @JSName("intlTelInput")
  def intlTelInput_setNumber(method: setNumber, aNumber: String): Unit = js.native
  /**
    * Set the type of the placeholder number
    * @param type Placeholder number type to be set
    */
  @JSName("intlTelInput")
  def intlTelInput_setPlaceholderNumberType(method: setPlaceholderNumberType, `type`: placeholderNumberType): Unit = js.native
}
