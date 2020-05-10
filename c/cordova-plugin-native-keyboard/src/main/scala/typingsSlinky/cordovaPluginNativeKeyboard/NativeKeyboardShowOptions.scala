package typingsSlinky.cordovaPluginNativeKeyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeKeyboardShowOptions extends js.Object {
  /**
    * Makes the messenger bar slide in from the bottom.
    *
    * Default: false
    */
  var animated: js.UndefOr[Boolean] = js.native
  /**
    * Options are: "light", "dark".
    *
    * Default: "default"
    */
  var appearance: js.UndefOr[String] = js.native
  /**
    * DOM element, which should be scrolled automatically
    */
  var autoscrollElement: js.UndefOr[js.Any] = js.native
  /**
    * The background color of the messenger bar.
    *
    * Default: #F6F6F6
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * Options are: "none", "split", "countdown", "countdownreversed".
    * Note that if maxChars is set, "none" will still show a counter.
    *
    * Default: "none"
    */
  var counterStyle: js.UndefOr[String] = js.native
  /**
    * Boolean value indicating if the keyboard should be kept open after submitting the entered
    * text
    *
    * Default: false
    */
  var keepOpenAfterSubmit: js.UndefOr[Boolean] = js.native
  /**
    * The left button of the messenger bar
    */
  var leftButton: js.UndefOr[LeftButtonOptions] = js.native
  /**
    * Maximum amount of chars that can be entered
    */
  var maxChars: js.UndefOr[Double] = js.native
  /**
    * Callback function which is being executed as soon as the keyboard did hide
    */
  var onKeyboardDidHide: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback function which is being executed as soon as the keyboard did show
    */
  var onKeyboardDidShow: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback function which is being executed as soon as the keyboard will hide
    */
  var onKeyboardWillHide: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback function which is being executed as soon as the keyboard will show
    */
  var onKeyboardWillShow: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback function which is being executed as soon as the entered text changes. Will
    * return the new text
    */
  var onTextChanged: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.native
  /**
    * A placeholder which will be in the messenger bar, when opening and the input field is
    * empty
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * The color of the placeholder.
    *
    * Default: #ccc
    */
  var placeholderColor: js.UndefOr[String] = js.native
  /**
    * The right button of the messenger bar
    */
  var rightButton: js.UndefOr[ButtonOptions] = js.native
  /**
    * Boolean value indicating if the content should be scrolled to the end after the messenger is
    * shown
    */
  var scrollToBottomAfterMessengerShows: js.UndefOr[Boolean] = js.native
  /**
    * Disables things like the Emoji keyboard and the Predicive text entry bar
    *
    * Default: false
    */
  var secure: js.UndefOr[Boolean] = js.native
  /**
    * Open the keyboard when showing the messenger.
    *
    * Default: false
    */
  var showKeyboard: js.UndefOr[Boolean] = js.native
  /**
    * A text which will be in the messenger bar, when opening
    */
  var text: js.UndefOr[String] = js.native
  /**
    * The color of the typed text in HEX.
    *
    * Default: #444
    */
  var textColor: js.UndefOr[String] = js.native
  /**
    * The background color of the textview. Looks nicest on Android
    * if it's the same color as the backgroundColor property.
    *
    * Default: #F6F6F6
    */
  var textViewBackgroundColor: js.UndefOr[String] = js.native
  /**
    * The border color of the textview.
    *
    * Default: #666666
    */
  var textViewBorderColor: js.UndefOr[String] = js.native
  /**
    * Options are: "default", "decimalpad", "phonepad", "numberpad", "namephonepad",
    * "number", "email", "twitter", "url", "alphabet", "search", "ascii"
    *
    * Default: "default"
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Callback function, which is being called as soon as the user submits
    */
  def onSubmit(text: String): Unit = js.native
}

object NativeKeyboardShowOptions {
  @scala.inline
  def apply(onSubmit: String => Unit): NativeKeyboardShowOptions = {
    val __obj = js.Dynamic.literal(onSubmit = js.Any.fromFunction1(onSubmit))
    __obj.asInstanceOf[NativeKeyboardShowOptions]
  }
  @scala.inline
  implicit class NativeKeyboardShowOptionsOps[Self <: NativeKeyboardShowOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnSubmit(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnimated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(js.undefined)
        ret
    }
    @scala.inline
    def withAppearance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppearance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearance")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoscrollElement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscrollElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoscrollElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscrollElement")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCounterStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counterStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounterStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counterStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepOpenAfterSubmit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepOpenAfterSubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepOpenAfterSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepOpenAfterSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftButton(value: LeftButtonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftButton")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxChars(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxChars")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyboardDidHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyboardDidHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnKeyboardDidHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyboardDidHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyboardDidShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyboardDidShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnKeyboardDidShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyboardDidShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyboardWillHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyboardWillHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnKeyboardWillHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyboardWillHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyboardWillShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyboardWillShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnKeyboardWillShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyboardWillShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTextChanged(value: /* text */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTextChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTextChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTextChanged")(js.undefined)
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
    def withPlaceholderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRightButton(value: ButtonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightButton")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToBottomAfterMessengerShows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToBottomAfterMessengerShows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToBottomAfterMessengerShows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToBottomAfterMessengerShows")(js.undefined)
        ret
    }
    @scala.inline
    def withSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(js.undefined)
        ret
    }
    @scala.inline
    def withShowKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showKeyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showKeyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextViewBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textViewBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextViewBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textViewBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextViewBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textViewBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextViewBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textViewBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

