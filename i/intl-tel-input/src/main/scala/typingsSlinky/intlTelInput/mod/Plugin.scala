package typingsSlinky.intlTelInput.mod

import typingsSlinky.intlTelInput.mod.intlTelInputUtils.CountryData
import typingsSlinky.intlTelInput.mod.intlTelInputUtils.numberFormat
import typingsSlinky.intlTelInput.mod.intlTelInputUtils.numberType
import typingsSlinky.intlTelInput.mod.intlTelInputUtils.placeholderNumberType
import typingsSlinky.intlTelInput.mod.intlTelInputUtils.validationError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plugin extends StObject {
  
  /**
    * Remove the plugin from the input, and unbind any event listeners.
    */
  def destroy(): Unit = js.native
  
  /**
    * Get the extension from the current number.
    * Requires the utilsScript option.
    * e.g. if the input value was "(702) 555-5555 ext. 1234", this would
    * return "1234".
    */
  def getExtension(): String = js.native
  
  /**
    * Get the current number in the given format (defaults to E.164 standard).
    * The different formats are available in the enum
    * intlTelInputUtils.numberFormat - taken from here.
    * Requires the utilsScript option.
    * Note that even if nationalMode is enabled, this can still return a full
    * international number.
    * @param numberFormat the format in which the number will be returned.
    */
  def getNumber(): String = js.native
  def getNumber(numberFormat: numberFormat): String = js.native
  
  /**
    * Get the type (fixed-line/mobile/toll-free etc) of the current number.
    * Requires the utilsScript option.
    * Returns an integer, which you can match against the various options in the
    * global enum intlTelInputUtils.numberType.
    * Note that in the US there's no way to differentiate between fixed-line and
    * mobile numbers, so instead it will return FIXED_LINE_OR_MOBILE.
    */
  def getNumberType(): numberType = js.native
  
  /**
    * Get the country data for the currently selected flag.
    */
  def getSelectedCountryData(): CountryData = js.native
  
  /**
    * Get more information about a validation error.
    * Requires the utilsScript option.
    * Returns an integer, which you can match against the various options in the
    * global enum ValidationError
    */
  def getValidationError(): validationError = js.native
  
  /**
    * Validate the current number. Expects an internationally formatted number
    * (unless nationalMode is enabled). If validation fails, you can use
    * getValidationError to get more information.
    * Requires the utilsScript option.
    * Also see getNumberType if you want to make sure the user enters a certain
    * type of number e.g. a mobile number.
    */
  def isValidNumber(): Boolean = js.native
  
  var promise: js.Promise[Unit] = js.native
  
  /**
    * Change the country selection (e.g. when the user is entering their address).
    * @param countryCode country code of the country to be set.
    */
  def setCountry(countryCode: String): Unit = js.native
  
  /**
    * Insert a number, and update the selected flag accordingly.
    * Note that by default, if nationalMode is enabled it will try to use
    * national formatting.
    * @param aNumber number to be set.
    */
  def setNumber(aNumber: String): Unit = js.native
  
  /**
    * Set the type of the placeholder number
    * @param type Placeholder number type to be set
    */
  def setPlaceholderNumberType(`type`: placeholderNumberType): Unit = js.native
}
