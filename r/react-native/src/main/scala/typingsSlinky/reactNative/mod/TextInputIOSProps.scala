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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextInputIOSProps extends StObject {
  
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
  implicit class TextInputIOSPropsMutableBuilder[Self <: TextInputIOSProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearButtonMode(value: never | `while-editing` | `unless-editing` | always): Self = StObject.set(x, "clearButtonMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearButtonModeUndefined: Self = StObject.set(x, "clearButtonMode", js.undefined)
    
    @scala.inline
    def setClearTextOnFocus(value: Boolean): Self = StObject.set(x, "clearTextOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearTextOnFocusUndefined: Self = StObject.set(x, "clearTextOnFocus", js.undefined)
    
    @scala.inline
    def setDataDetectorTypes(value: DataDetectorTypes | js.Array[DataDetectorTypes]): Self = StObject.set(x, "dataDetectorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataDetectorTypesUndefined: Self = StObject.set(x, "dataDetectorTypes", js.undefined)
    
    @scala.inline
    def setDataDetectorTypesVarargs(value: DataDetectorTypes*): Self = StObject.set(x, "dataDetectorTypes", js.Array(value :_*))
    
    @scala.inline
    def setEnablesReturnKeyAutomatically(value: Boolean): Self = StObject.set(x, "enablesReturnKeyAutomatically", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablesReturnKeyAutomaticallyUndefined: Self = StObject.set(x, "enablesReturnKeyAutomatically", js.undefined)
    
    @scala.inline
    def setKeyboardAppearance(value: default | light | dark): Self = StObject.set(x, "keyboardAppearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardAppearanceUndefined: Self = StObject.set(x, "keyboardAppearance", js.undefined)
    
    @scala.inline
    def setPasswordRules(value: String): Self = StObject.set(x, "passwordRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordRulesNull: Self = StObject.set(x, "passwordRules", null)
    
    @scala.inline
    def setPasswordRulesUndefined: Self = StObject.set(x, "passwordRules", js.undefined)
    
    @scala.inline
    def setRejectResponderTermination(value: Boolean): Self = StObject.set(x, "rejectResponderTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectResponderTerminationNull: Self = StObject.set(x, "rejectResponderTermination", null)
    
    @scala.inline
    def setRejectResponderTerminationUndefined: Self = StObject.set(x, "rejectResponderTermination", js.undefined)
    
    @scala.inline
    def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
    
    @scala.inline
    def setSelectionState(value: DocumentSelectionState): Self = StObject.set(x, "selectionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionStateUndefined: Self = StObject.set(x, "selectionState", js.undefined)
    
    @scala.inline
    def setSpellCheck(value: Boolean): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
    
    @scala.inline
    def setTextContentType(
      value: none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
    ): Self = StObject.set(x, "textContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextContentTypeUndefined: Self = StObject.set(x, "textContentType", js.undefined)
  }
}
