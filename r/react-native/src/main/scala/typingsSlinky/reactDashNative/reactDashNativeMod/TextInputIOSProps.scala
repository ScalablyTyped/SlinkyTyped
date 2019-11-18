package typingsSlinky.reactDashNative.reactDashNativeMod

import typingsSlinky.reactDashNative.reactDashNativeStrings.URL
import typingsSlinky.reactDashNative.reactDashNativeStrings.`unless-editing`
import typingsSlinky.reactDashNative.reactDashNativeStrings.`while-editing`
import typingsSlinky.reactDashNative.reactDashNativeStrings.addressCity
import typingsSlinky.reactDashNative.reactDashNativeStrings.addressCityAndState
import typingsSlinky.reactDashNative.reactDashNativeStrings.addressState
import typingsSlinky.reactDashNative.reactDashNativeStrings.always
import typingsSlinky.reactDashNative.reactDashNativeStrings.countryName
import typingsSlinky.reactDashNative.reactDashNativeStrings.creditCardNumber
import typingsSlinky.reactDashNative.reactDashNativeStrings.dark
import typingsSlinky.reactDashNative.reactDashNativeStrings.default
import typingsSlinky.reactDashNative.reactDashNativeStrings.emailAddress
import typingsSlinky.reactDashNative.reactDashNativeStrings.familyName
import typingsSlinky.reactDashNative.reactDashNativeStrings.fullStreetAddress
import typingsSlinky.reactDashNative.reactDashNativeStrings.givenName
import typingsSlinky.reactDashNative.reactDashNativeStrings.jobTitle
import typingsSlinky.reactDashNative.reactDashNativeStrings.light
import typingsSlinky.reactDashNative.reactDashNativeStrings.location
import typingsSlinky.reactDashNative.reactDashNativeStrings.middleName
import typingsSlinky.reactDashNative.reactDashNativeStrings.name
import typingsSlinky.reactDashNative.reactDashNativeStrings.namePrefix
import typingsSlinky.reactDashNative.reactDashNativeStrings.nameSuffix
import typingsSlinky.reactDashNative.reactDashNativeStrings.never
import typingsSlinky.reactDashNative.reactDashNativeStrings.newPassword
import typingsSlinky.reactDashNative.reactDashNativeStrings.nickname
import typingsSlinky.reactDashNative.reactDashNativeStrings.none
import typingsSlinky.reactDashNative.reactDashNativeStrings.oneTimeCode
import typingsSlinky.reactDashNative.reactDashNativeStrings.organizationName
import typingsSlinky.reactDashNative.reactDashNativeStrings.password
import typingsSlinky.reactDashNative.reactDashNativeStrings.postalCode
import typingsSlinky.reactDashNative.reactDashNativeStrings.streetAddressLine1
import typingsSlinky.reactDashNative.reactDashNativeStrings.streetAddressLine2
import typingsSlinky.reactDashNative.reactDashNativeStrings.sublocality
import typingsSlinky.reactDashNative.reactDashNativeStrings.telephoneNumber
import typingsSlinky.reactDashNative.reactDashNativeStrings.username
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputIOSProps extends js.Object {
  /**
    * enum('never', 'while-editing', 'unless-editing', 'always')
    * When the clear button should appear on the right side of the text view
    */
  var clearButtonMode: js.UndefOr[never | `while-editing` | `unless-editing` | always] = js.undefined
  /**
    * If true, clears the text field automatically when editing begins
    */
  var clearTextOnFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines the types of data converted to clickable URLs in the text input.
    * Only valid if `multiline={true}` and `editable={false}`.
    * By default no data types are detected.
    *
    * You can provide one type or an array of many types.
    *
    * Possible values for `dataDetectorTypes` are:
    *
    * - `'phoneNumber'`
    * - `'link'`
    * - `'address'`
    * - `'calendarEvent'`
    * - `'none'`
    * - `'all'`
    */
  var dataDetectorTypes: js.UndefOr[DataDetectorTypes | js.Array[DataDetectorTypes]] = js.undefined
  /**
    * If true, the keyboard disables the return key when there is no text and automatically enables it when there is text.
    * The default value is false.
    */
  var enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines the color of the keyboard.
    */
  var keyboardAppearance: js.UndefOr[default | light | dark] = js.undefined
  /**
    * If false, scrolling of the text view will be disabled. The default value is true. Only works with multiline={true}
    */
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * See DocumentSelectionState.js, some state that is responsible for maintaining selection information for a document
    */
  var selectionState: js.UndefOr[DocumentSelectionState] = js.undefined
  /**
    * If false, disables spell-check style (i.e. red underlines). The default value is inherited from autoCorrect
    */
  var spellCheck: js.UndefOr[Boolean] = js.undefined
  /**
    * Give the keyboard and the system information about the expected
    * semantic meaning for the content that users enter.
    *
    * For iOS 11+ you can set `textContentType` to `username` or `password` to
    * enable autofill of login details from the device keychain.
    *
    * For iOS 12+ `newPassword` can be used to indicate a new password input the
    * user may want to save in the keychain, and `oneTimeCode` can be used to indicate
    * that a field can be autofilled by a code arriving in an SMS.
    *
    * To disable autofill, set textContentType to `none`.
    *
    * Possible values for `textContentType` are:
    *
    *  - `'none'`
    *  - `'URL'`
    *  - `'addressCity'`
    *  - `'addressCityAndState'`
    *  - `'addressState'`
    *  - `'countryName'`
    *  - `'creditCardNumber'`
    *  - `'emailAddress'`
    *  - `'familyName'`
    *  - `'fullStreetAddress'`
    *  - `'givenName'`
    *  - `'jobTitle'`
    *  - `'location'`
    *  - `'middleName'`
    *  - `'name'`
    *  - `'namePrefix'`
    *  - `'nameSuffix'`
    *  - `'nickname'`
    *  - `'organizationName'`
    *  - `'postalCode'`
    *  - `'streetAddressLine1'`
    *  - `'streetAddressLine2'`
    *  - `'sublocality'`
    *  - `'telephoneNumber'`
    *  - `'username'`
    *  - `'password'`
    *  - `'newPassword'`
    *  - `'oneTimeCode'`
    *
    */
  var textContentType: js.UndefOr[
    none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
  ] = js.undefined
}

object TextInputIOSProps {
  @scala.inline
  def apply(
    clearButtonMode: never | `while-editing` | `unless-editing` | always = null,
    clearTextOnFocus: js.UndefOr[Boolean] = js.undefined,
    dataDetectorTypes: DataDetectorTypes | js.Array[DataDetectorTypes] = null,
    enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.undefined,
    keyboardAppearance: default | light | dark = null,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    selectionState: DocumentSelectionState = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    textContentType: none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode = null
  ): TextInputIOSProps = {
    val __obj = js.Dynamic.literal()
    if (clearButtonMode != null) __obj.updateDynamic("clearButtonMode")(clearButtonMode.asInstanceOf[js.Any])
    if (!js.isUndefined(clearTextOnFocus)) __obj.updateDynamic("clearTextOnFocus")(clearTextOnFocus.asInstanceOf[js.Any])
    if (dataDetectorTypes != null) __obj.updateDynamic("dataDetectorTypes")(dataDetectorTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(enablesReturnKeyAutomatically)) __obj.updateDynamic("enablesReturnKeyAutomatically")(enablesReturnKeyAutomatically.asInstanceOf[js.Any])
    if (keyboardAppearance != null) __obj.updateDynamic("keyboardAppearance")(keyboardAppearance.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled.asInstanceOf[js.Any])
    if (selectionState != null) __obj.updateDynamic("selectionState")(selectionState.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (textContentType != null) __obj.updateDynamic("textContentType")(textContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputIOSProps]
  }
}

