package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.URL
import typingsSlinky.reactNative.reactNativeStrings.`unless-editing`
import typingsSlinky.reactNative.reactNativeStrings.`while-editing`
import typingsSlinky.reactNative.reactNativeStrings.addressCity
import typingsSlinky.reactNative.reactNativeStrings.addressCityAndState
import typingsSlinky.reactNative.reactNativeStrings.addressState
import typingsSlinky.reactNative.reactNativeStrings.always
import typingsSlinky.reactNative.reactNativeStrings.countryName
import typingsSlinky.reactNative.reactNativeStrings.creditCardNumber
import typingsSlinky.reactNative.reactNativeStrings.dark
import typingsSlinky.reactNative.reactNativeStrings.default
import typingsSlinky.reactNative.reactNativeStrings.emailAddress
import typingsSlinky.reactNative.reactNativeStrings.familyName
import typingsSlinky.reactNative.reactNativeStrings.fullStreetAddress
import typingsSlinky.reactNative.reactNativeStrings.givenName
import typingsSlinky.reactNative.reactNativeStrings.jobTitle
import typingsSlinky.reactNative.reactNativeStrings.light
import typingsSlinky.reactNative.reactNativeStrings.location
import typingsSlinky.reactNative.reactNativeStrings.middleName
import typingsSlinky.reactNative.reactNativeStrings.name
import typingsSlinky.reactNative.reactNativeStrings.namePrefix
import typingsSlinky.reactNative.reactNativeStrings.nameSuffix
import typingsSlinky.reactNative.reactNativeStrings.never
import typingsSlinky.reactNative.reactNativeStrings.newPassword
import typingsSlinky.reactNative.reactNativeStrings.nickname
import typingsSlinky.reactNative.reactNativeStrings.none
import typingsSlinky.reactNative.reactNativeStrings.oneTimeCode
import typingsSlinky.reactNative.reactNativeStrings.organizationName
import typingsSlinky.reactNative.reactNativeStrings.password
import typingsSlinky.reactNative.reactNativeStrings.postalCode
import typingsSlinky.reactNative.reactNativeStrings.streetAddressLine1
import typingsSlinky.reactNative.reactNativeStrings.streetAddressLine2
import typingsSlinky.reactNative.reactNativeStrings.sublocality
import typingsSlinky.reactNative.reactNativeStrings.telephoneNumber
import typingsSlinky.reactNative.reactNativeStrings.username
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextInputIOSProps extends js.Object {
  /**
    * enum('never', 'while-editing', 'unless-editing', 'always')
    * When the clear button should appear on the right side of the text view
    */
  var clearButtonMode: js.UndefOr[never | `while-editing` | `unless-editing` | always] = js.native
  /**
    * If true, clears the text field automatically when editing begins
    */
  var clearTextOnFocus: js.UndefOr[Boolean] = js.native
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
  var dataDetectorTypes: js.UndefOr[DataDetectorTypes | js.Array[DataDetectorTypes]] = js.native
  /**
    * If true, the keyboard disables the return key when there is no text and automatically enables it when there is text.
    * The default value is false.
    */
  var enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.native
  /**
    * Determines the color of the keyboard.
    */
  var keyboardAppearance: js.UndefOr[default | light | dark] = js.native
  /**
    * Provide rules for your password.
    * For example, say you want to require a password with at least eight characters consisting of a mix of uppercase and lowercase letters, at least one number, and at most two consecutive characters.
    * "required: upper; required: lower; required: digit; max-consecutive: 2; minlength: 8;"
    */
  var passwordRules: js.UndefOr[String | Null] = js.native
  /**
    * If `true`, allows TextInput to pass touch events to the parent component.
    * This allows components to be swipeable from the TextInput on iOS,
    * as is the case on Android by default.
    * If `false`, TextInput always asks to handle the input (except when disabled).
    */
  var rejectResponderTermination: js.UndefOr[Boolean | Null] = js.native
  /**
    * If false, scrolling of the text view will be disabled. The default value is true. Only works with multiline={true}
    */
  var scrollEnabled: js.UndefOr[Boolean] = js.native
  /**
    * See DocumentSelectionState.js, some state that is responsible for maintaining selection information for a document
    */
  var selectionState: js.UndefOr[DocumentSelectionState] = js.native
  /**
    * If false, disables spell-check style (i.e. red underlines). The default value is inherited from autoCorrect
    */
  var spellCheck: js.UndefOr[Boolean] = js.native
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
  ] = js.native
}

object TextInputIOSProps {
  @scala.inline
  def apply(): TextInputIOSProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInputIOSProps]
  }
  @scala.inline
  implicit class TextInputIOSPropsOps[Self <: TextInputIOSProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearButtonMode(value: never | `while-editing` | `unless-editing` | always): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearButtonMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearButtonMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearButtonMode")(js.undefined)
        ret
    }
    @scala.inline
    def withClearTextOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTextOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearTextOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTextOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withDataDetectorTypes(value: DataDetectorTypes | js.Array[DataDetectorTypes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDetectorTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataDetectorTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDetectorTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablesReturnKeyAutomatically(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablesReturnKeyAutomatically")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablesReturnKeyAutomatically: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablesReturnKeyAutomatically")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardAppearance(value: default | light | dark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardAppearance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardAppearance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardAppearance")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordRules(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordRules")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordRulesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordRules")(null)
        ret
    }
    @scala.inline
    def withRejectResponderTermination(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectResponderTermination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectResponderTermination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectResponderTermination")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectResponderTerminationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectResponderTermination")(null)
        ret
    }
    @scala.inline
    def withScrollEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionState(value: DocumentSelectionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionState")(js.undefined)
        ret
    }
    @scala.inline
    def withSpellCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withTextContentType(
      value: none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textContentType")(js.undefined)
        ret
    }
  }
  
}

