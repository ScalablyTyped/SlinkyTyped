package typingsSlinky.ionicCore.componentsMod.Components

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.ionicCore.ionicCoreStrings.always
import typingsSlinky.ionicCore.ionicCoreStrings.decimal
import typingsSlinky.ionicCore.ionicCoreStrings.done
import typingsSlinky.ionicCore.ionicCoreStrings.email
import typingsSlinky.ionicCore.ionicCoreStrings.enter
import typingsSlinky.ionicCore.ionicCoreStrings.focus
import typingsSlinky.ionicCore.ionicCoreStrings.go
import typingsSlinky.ionicCore.ionicCoreStrings.ios
import typingsSlinky.ionicCore.ionicCoreStrings.md
import typingsSlinky.ionicCore.ionicCoreStrings.never
import typingsSlinky.ionicCore.ionicCoreStrings.next
import typingsSlinky.ionicCore.ionicCoreStrings.none
import typingsSlinky.ionicCore.ionicCoreStrings.number
import typingsSlinky.ionicCore.ionicCoreStrings.numeric
import typingsSlinky.ionicCore.ionicCoreStrings.off
import typingsSlinky.ionicCore.ionicCoreStrings.on
import typingsSlinky.ionicCore.ionicCoreStrings.password
import typingsSlinky.ionicCore.ionicCoreStrings.previous
import typingsSlinky.ionicCore.ionicCoreStrings.search
import typingsSlinky.ionicCore.ionicCoreStrings.send
import typingsSlinky.ionicCore.ionicCoreStrings.tel
import typingsSlinky.ionicCore.ionicCoreStrings.text
import typingsSlinky.ionicCore.ionicCoreStrings.url
import typingsSlinky.ionicCore.mod.AutocompleteTypes
import typingsSlinky.ionicCore.mod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonSearchbar extends js.Object {
  
  /**
    * If `true`, enable searchbar animation.
    */
  var animated: Boolean = js.native
  
  /**
    * Set the input's autocomplete property.
    */
  var autocomplete: AutocompleteTypes = js.native
  
  /**
    * Set the input's autocorrect property.
    */
  var autocorrect: on | off = js.native
  
  /**
    * Set the cancel button icon. Only applies to `md` mode. Defaults to `"arrow-back-sharp"`.
    */
  var cancelButtonIcon: String = js.native
  
  /**
    * Set the the cancel button text. Only applies to `ios` mode.
    */
  var cancelButtonText: String = js.native
  
  /**
    * Set the clear icon. Defaults to `"close-circle"` for `ios` and `"close-sharp"` for `md`.
    */
  var clearIcon: js.UndefOr[String] = js.native
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.native
  
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke. This also impacts form bindings such as `ngModel` or `v-model`.
    */
  var debounce: Double = js.native
  
  /**
    * If `true`, the user cannot interact with the input.
    */
  var disabled: Boolean = js.native
  
  /**
    * A hint to the browser for which enter key to display. Possible values: `"enter"`, `"done"`, `"go"`, `"next"`, `"previous"`, `"search"`, and `"send"`.
    */
  var enterkeyhint: js.UndefOr[enter | done | go | next | previous | search | send] = js.native
  
  /**
    * Returns the native `<input>` element used under the hood.
    */
  def getInputElement(): js.Promise[HTMLInputElement] = js.native
  
  /**
    * A hint to the browser for which keyboard to display. Possible values: `"none"`, `"text"`, `"tel"`, `"url"`, `"email"`, `"numeric"`, `"decimal"`, and `"search"`.
    */
  var inputmode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  
  /**
    * Set the input's placeholder. `placeholder` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var placeholder: String = js.native
  
  /**
    * The icon to use as the search icon. Defaults to `"search-outline"` in `ios` mode and `"search-sharp"` in `md` mode.
    */
  var searchIcon: js.UndefOr[String] = js.native
  
  /**
    * Sets focus on the specified `ion-searchbar`. Use this method instead of the global `input.focus()`.
    */
  def setFocus(): js.Promise[Unit] = js.native
  
  /**
    * Sets the behavior for the cancel button. Defaults to `"never"`. Setting to `"focus"` shows the cancel button on focus. Setting to `"never"` hides the cancel button. Setting to `"always"` shows the cancel button regardless of focus state.
    */
  var showCancelButton: never | focus | always = js.native
  
  /**
    * If `true`, enable spellcheck on the input.
    */
  var spellcheck: Boolean = js.native
  
  /**
    * Set the type of the input.
    */
  var `type`: text | password | email | number | search | tel | url = js.native
  
  /**
    * the value of the searchbar.
    */
  var value: js.UndefOr[String | Null] = js.native
}
object IonSearchbar {
  
  @scala.inline
  def apply(
    animated: Boolean,
    autocomplete: AutocompleteTypes,
    autocorrect: on | off,
    cancelButtonIcon: String,
    cancelButtonText: String,
    debounce: Double,
    disabled: Boolean,
    getInputElement: () => js.Promise[HTMLInputElement],
    placeholder: String,
    setFocus: () => js.Promise[Unit],
    showCancelButton: never | focus | always,
    spellcheck: Boolean,
    `type`: text | password | email | number | search | tel | url
  ): IonSearchbar = {
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], autocorrect = autocorrect.asInstanceOf[js.Any], cancelButtonIcon = cancelButtonIcon.asInstanceOf[js.Any], cancelButtonText = cancelButtonText.asInstanceOf[js.Any], debounce = debounce.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], getInputElement = js.Any.fromFunction0(getInputElement), placeholder = placeholder.asInstanceOf[js.Any], setFocus = js.Any.fromFunction0(setFocus), showCancelButton = showCancelButton.asInstanceOf[js.Any], spellcheck = spellcheck.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonSearchbar]
  }
  
  @scala.inline
  implicit class IonSearchbarOps[Self <: IonSearchbar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutocomplete(value: AutocompleteTypes): Self = this.set("autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutocorrect(value: on | off): Self = this.set("autocorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelButtonIcon(value: String): Self = this.set("cancelButtonIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelButtonText(value: String): Self = this.set("cancelButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebounce(value: Double): Self = this.set("debounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetInputElement(value: () => js.Promise[HTMLInputElement]): Self = this.set("getInputElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFocus(value: () => js.Promise[Unit]): Self = this.set("setFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowCancelButton(value: never | focus | always): Self = this.set("showCancelButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellcheck(value: Boolean): Self = this.set("spellcheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: text | password | email | number | search | tel | url): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearIcon(value: String): Self = this.set("clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearIcon: Self = this.set("clearIcon", js.undefined)
    
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setEnterkeyhint(value: enter | done | go | next | previous | search | send): Self = this.set("enterkeyhint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterkeyhint: Self = this.set("enterkeyhint", js.undefined)
    
    @scala.inline
    def setInputmode(value: none | text | tel | url | email | numeric | decimal | search): Self = this.set("inputmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputmode: Self = this.set("inputmode", js.undefined)
    
    @scala.inline
    def setMode(value: ios | md): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setSearchIcon(value: String): Self = this.set("searchIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchIcon: Self = this.set("searchIcon", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
