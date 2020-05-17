package typingsSlinky.reactNative.mod

import slinky.core.SyntheticEvent
import typingsSlinky.reactNative.anon.Start
import typingsSlinky.reactNative.reactNativeStrings.characters
import typingsSlinky.reactNative.reactNativeStrings.none
import typingsSlinky.reactNative.reactNativeStrings.sentences
import typingsSlinky.reactNative.reactNativeStrings.words
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextInputProps
  extends ViewProps
     with TextInputIOSProps
     with TextInputAndroidProps {
  /**
    * Specifies whether fonts should scale to respect Text Size accessibility settings.
    * The default is `true`.
    */
  var allowFontScaling: js.UndefOr[Boolean] = js.native
  /**
    * Can tell TextInput to automatically capitalize certain characters.
    *      characters: all characters,
    *      words: first letter of each word
    *      sentences: first letter of each sentence (default)
    *      none: don't auto capitalize anything
    *
    * https://facebook.github.io/react-native/docs/textinput.html#autocapitalize
    */
  var autoCapitalize: js.UndefOr[none | sentences | words | characters] = js.native
  /**
    * If false, disables auto-correct.
    * The default value is true.
    */
  var autoCorrect: js.UndefOr[Boolean] = js.native
  /**
    * If true, focuses the input on componentDidMount.
    * The default value is false.
    */
  var autoFocus: js.UndefOr[Boolean] = js.native
  /**
    * If true, the text field will blur when submitted.
    * The default value is true.
    */
  var blurOnSubmit: js.UndefOr[Boolean] = js.native
  /**
    * If true, caret is hidden. The default value is false.
    */
  var caretHidden: js.UndefOr[Boolean] = js.native
  /**
    * If true, context menu is hidden. The default value is false.
    */
  var contextMenuHidden: js.UndefOr[Boolean] = js.native
  /**
    * Provides an initial value that will change when the user starts typing.
    * Useful for simple use-cases where you don't want to deal with listening to events
    * and updating the value prop to keep the controlled state in sync.
    */
  var defaultValue: js.UndefOr[String] = js.native
  /**
    * If false, text is not editable. The default value is true.
    */
  var editable: js.UndefOr[Boolean] = js.native
  /**
    * Used to connect to an InputAccessoryView. Not part of react-natives documentation, but present in examples and
    * code.
    * See https://facebook.github.io/react-native/docs/inputaccessoryview.html for more information.
    */
  var inputAccessoryViewID: js.UndefOr[String] = js.native
  /**
    * enum("default", 'numeric', 'email-address', "ascii-capable", 'numbers-and-punctuation', 'url', 'number-pad', 'phone-pad', 'name-phone-pad',
    * 'decimal-pad', 'twitter', 'web-search', 'visible-password')
    * Determines which keyboard to open, e.g.numeric.
    * The following values work across platforms: - default - numeric - email-address - phone-pad
    * The following values work on iOS: - ascii-capable - numbers-and-punctuation - url - number-pad - name-phone-pad - decimal-pad - twitter - web-search
    * The following values work on Android: - visible-password
    */
  var keyboardType: js.UndefOr[KeyboardTypeOptions] = js.native
  /**
    * Specifies largest possible scale a font can reach when allowFontScaling is enabled. Possible values:
    * - null/undefined (default): inherit from the parent node or the global default (0)
    * - 0: no max, ignore parent/global default
    * - >= 1: sets the maxFontSizeMultiplier of this node to this value
    */
  var maxFontSizeMultiplier: js.UndefOr[Double | Null] = js.native
  /**
    * Limits the maximum number of characters that can be entered.
    * Use this instead of implementing the logic in JS to avoid flicker.
    */
  var maxLength: js.UndefOr[Double] = js.native
  /**
    * If true, the text input can be multiple lines. The default value is false.
    */
  var multiline: js.UndefOr[Boolean] = js.native
  /**
    * Callback that is called when the text input is blurred
    */
  var onBlur: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputFocusEventData], Unit]] = js.native
  /**
    * Callback that is called when the text input's text changes.
    */
  var onChange: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputChangeEventData], Unit]] = js.native
  /**
    * Callback that is called when the text input's text changes.
    * Changed text is passed as an argument to the callback handler.
    */
  var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.native
  /**
    * Callback that is called when the text input's content size changes.
    * This will be called with
    * `{ nativeEvent: { contentSize: { width, height } } }`.
    *
    * Only called for multiline text inputs.
    */
  var onContentSizeChange: js.UndefOr[
    js.Function1[SyntheticEvent[NodeHandle, TextInputContentSizeChangeEventData], Unit]
  ] = js.native
  /**
    * Callback that is called when text input ends.
    */
  var onEndEditing: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputEndEditingEventData], Unit]] = js.native
  /**
    * Callback that is called when the text input is focused
    */
  var onFocus: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputFocusEventData], Unit]] = js.native
  /**
    * Callback that is called when a key is pressed.
    * This will be called with
    *  `{ nativeEvent: { key: keyValue } }`
    * where keyValue is 'Enter' or 'Backspace' for respective keys and the typed-in character otherwise including ' ' for space.
    *
    * Fires before onChange callbacks.
    * Note: on Android only the inputs from soft keyboard are handled, not the hardware keyboard inputs.
    */
  var onKeyPress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputKeyPressEventData], Unit]] = js.native
  /**
    * Invoked on content scroll with
    *  `{ nativeEvent: { contentOffset: { x, y } } }`.
    *
    * May also contain other properties from ScrollEvent but on Android contentSize is not provided for performance reasons.
    */
  var onScroll: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputScrollEventData], Unit]] = js.native
  /**
    * Callback that is called when the text input selection is changed.
    */
  var onSelectionChange: js.UndefOr[
    js.Function1[SyntheticEvent[NodeHandle, TextInputSelectionChangeEventData], Unit]
  ] = js.native
  /**
    * Callback that is called when the text input's submit button is pressed.
    */
  var onSubmitEditing: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputSubmitEditingEventData], Unit]] = js.native
  /**
    * The string that will be rendered before text input has been entered
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * The text color of the placeholder string
    */
  var placeholderTextColor: js.UndefOr[String] = js.native
  /**
    * enum('default', 'go', 'google', 'join', 'next', 'route', 'search', 'send', 'yahoo', 'done', 'emergency-call')
    * Determines how the return key should look.
    */
  var returnKeyType: js.UndefOr[ReturnKeyTypeOptions] = js.native
  /**
    * If true, the text input obscures the text entered so that sensitive text like passwords stay secure.
    * The default value is false.
    */
  var secureTextEntry: js.UndefOr[Boolean] = js.native
  /**
    * If true, all text will automatically be selected on focus
    */
  var selectTextOnFocus: js.UndefOr[Boolean] = js.native
  /**
    * The start and end of the text input's selection. Set start and end to
    * the same value to position the cursor.
    */
  var selection: js.UndefOr[Start] = js.native
  /**
    * The highlight (and cursor on ios) color of the text input
    */
  var selectionColor: js.UndefOr[String] = js.native
  /**
    * Styles
    */
  @JSName("style")
  var style_TextInputProps: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * The value to show for the text input. TextInput is a controlled component,
    * which means the native value will be forced to match this value prop if provided.
    * For most uses this works great, but in some cases this may cause flickering - one common cause is preventing edits by keeping value the same.
    * In addition to simply setting the same value, either set editable={false},
    * or set/update maxLength to prevent unwanted edits without flicker.
    */
  var value: js.UndefOr[String] = js.native
}

object TextInputProps {
  @scala.inline
  def apply(): TextInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInputProps]
  }
  @scala.inline
  implicit class TextInputPropsOps[Self <: TextInputProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowFontScaling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFontScaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFontScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFontScaling")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCapitalize(value: none | sentences | words | characters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCapitalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCapitalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCapitalize")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCorrect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCorrect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCorrect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCorrect")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withBlurOnSubmit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurOnSubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlurOnSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurOnSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withCaretHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaretHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenuHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenuHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withInputAccessoryViewID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputAccessoryViewID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputAccessoryViewID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputAccessoryViewID")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardType(value: KeyboardTypeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardType")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFontSizeMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFontSizeMultiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFontSizeMultiplier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFontSizeMultiplier")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFontSizeMultiplierNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFontSizeMultiplier")(null)
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: SyntheticEvent[NodeHandle, TextInputFocusEventData] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: SyntheticEvent[NodeHandle, TextInputChangeEventData] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChangeText(value: /* text */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChangeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContentSizeChange(value: SyntheticEvent[NodeHandle, TextInputContentSizeChangeEventData] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentSizeChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContentSizeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentSizeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEndEditing(value: SyntheticEvent[NodeHandle, TextInputEndEditingEventData] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndEditing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEndEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: SyntheticEvent[NodeHandle, TextInputFocusEventData] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyPress(value: SyntheticEvent[NodeHandle, TextInputKeyPressEventData] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: SyntheticEvent[NodeHandle, TextInputScrollEventData] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChange(value: SyntheticEvent[NodeHandle, TextInputSelectionChangeEventData] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmitEditing(value: SyntheticEvent[NodeHandle, TextInputSubmitEditingEventData] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmitEditing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSubmitEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmitEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnKeyType(value: ReturnKeyTypeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnKeyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnKeyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnKeyType")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureTextEntry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureTextEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureTextEntry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureTextEntry")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectTextOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectTextOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectTextOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectTextOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: Start): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

