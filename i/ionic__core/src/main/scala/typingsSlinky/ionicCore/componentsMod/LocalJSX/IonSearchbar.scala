package typingsSlinky.ionicCore.componentsMod.LocalJSX

import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.ionicCore.ionicCoreStrings.decimal
import typingsSlinky.ionicCore.ionicCoreStrings.email
import typingsSlinky.ionicCore.ionicCoreStrings.ios
import typingsSlinky.ionicCore.ionicCoreStrings.md
import typingsSlinky.ionicCore.ionicCoreStrings.none
import typingsSlinky.ionicCore.ionicCoreStrings.number
import typingsSlinky.ionicCore.ionicCoreStrings.numeric
import typingsSlinky.ionicCore.ionicCoreStrings.off
import typingsSlinky.ionicCore.ionicCoreStrings.on
import typingsSlinky.ionicCore.ionicCoreStrings.password
import typingsSlinky.ionicCore.ionicCoreStrings.search
import typingsSlinky.ionicCore.ionicCoreStrings.tel
import typingsSlinky.ionicCore.ionicCoreStrings.text
import typingsSlinky.ionicCore.ionicCoreStrings.url
import typingsSlinky.ionicCore.mod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonSearchbar extends js.Object {
  /**
    * If `true`, enable searchbar animation.
    */
  var animated: js.UndefOr[Boolean] = js.native
  /**
    * Set the input's autocomplete property.
    */
  var autocomplete: js.UndefOr[on | off] = js.native
  /**
    * Set the input's autocorrect property.
    */
  var autocorrect: js.UndefOr[on | off] = js.native
  /**
    * Set the cancel button icon. Only applies to `md` mode.
    */
  var cancelButtonIcon: js.UndefOr[String] = js.native
  /**
    * Set the the cancel button text. Only applies to `ios` mode.
    */
  var cancelButtonText: js.UndefOr[String] = js.native
  /**
    * Set the clear icon. Defaults to `"close-circle"` for `ios` and `"close"` for `md`.
    */
  var clearIcon: js.UndefOr[String] = js.native
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.native
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke.
    */
  var debounce: js.UndefOr[Double] = js.native
  /**
    * If `true`, the user cannot interact with the input.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * A hint to the browser for which keyboard to display. Possible values: `"none"`, `"text"`, `"tel"`, `"url"`, `"email"`, `"numeric"`, `"decimal"`, and `"search"`.
    */
  var inputmode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  /**
    * Emitted when the input loses focus.
    */
  var onIonBlur: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the cancel button is clicked.
    */
  var onIonCancel: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the value has changed.
    */
  var onIonChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the clear input button is clicked.
    */
  var onIonClear: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the input has focus.
    */
  var onIonFocus: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when a keyboard input ocurred.
    */
  var onIonInput: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Set the input's placeholder. `placeholder` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * The icon to use as the search icon.
    */
  var searchIcon: js.UndefOr[String] = js.native
  /**
    * Sets the behavior for the cancel button. Defaults to `"never"`. Setting to `"focus"` shows the cancel button on focus. Setting to `"never"` hides the cancel button. Setting to `"always"` shows the cancel button regardless of focus state.
    */
  var showCancelButton: js.UndefOr[Boolean | String] = js.native
  /**
    * If `true`, enable spellcheck on the input.
    */
  var spellcheck: js.UndefOr[Boolean] = js.native
  /**
    * Set the type of the input.
    */
  var `type`: js.UndefOr[text | password | email | number | search | tel | url] = js.native
  /**
    * the value of the searchbar.
    */
  var value: js.UndefOr[String | Null] = js.native
}

object IonSearchbar {
  @scala.inline
  def apply(): IonSearchbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonSearchbar]
  }
  @scala.inline
  implicit class IonSearchbarOps[Self <: IonSearchbar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withAutocomplete(value: on | off): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutocomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAutocorrect(value: on | off): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocorrect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutocorrect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocorrect")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelButtonIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelButtonIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withClearIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDebounce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounce")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInputmode(value: none | text | tel | url | email | numeric | decimal | search): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputmode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputmode")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: ios | md): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonBlur(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonCancel(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonCancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonChange(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonClear(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonClear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonClear")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonFocus(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonInput(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonInput")(js.undefined)
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
    def withSearchIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCancelButton(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCancelButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCancelButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCancelButton")(js.undefined)
        ret
    }
    @scala.inline
    def withSpellcheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellcheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellcheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellcheck")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: text | password | email | number | search | tel | url): Self = {
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
    @scala.inline
    def withValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

