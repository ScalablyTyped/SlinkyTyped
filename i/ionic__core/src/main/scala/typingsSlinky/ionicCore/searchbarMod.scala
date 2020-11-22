package typingsSlinky.ionicCore

import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.KeyboardEvent
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonSearchbarElement
import typingsSlinky.ionicCore.ionicCoreStrings.always
import typingsSlinky.ionicCore.ionicCoreStrings.decimal
import typingsSlinky.ionicCore.ionicCoreStrings.done
import typingsSlinky.ionicCore.ionicCoreStrings.email
import typingsSlinky.ionicCore.ionicCoreStrings.enter
import typingsSlinky.ionicCore.ionicCoreStrings.focus
import typingsSlinky.ionicCore.ionicCoreStrings.go
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
import typingsSlinky.ionicCore.mod.StyleEventDetail
import typingsSlinky.ionicCore.searchbarInterfaceMod.SearchbarChangeEventDetail
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/core/dist/types/components/searchbar/searchbar", JSImport.Namespace)
@js.native
object searchbarMod extends js.Object {
  
  @js.native
  class Searchbar () extends ComponentInterface {
    
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
      * Set the cancel button icon. Only applies to `md` mode.
      * Defaults to `"arrow-back-sharp"`.
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
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MSearchbar(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MSearchbar(): Unit = js.native
    
    /**
      * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke. This also impacts form bindings such as `ngModel` or `v-model`.
      */
    var debounce: Double = js.native
    
    /* protected */ def debounceChanged(): Unit = js.native
    
    /**
      * If `true`, the user cannot interact with the input.
      */
    var disabled: Boolean = js.native
    
    var el: HTMLIonSearchbarElement = js.native
    
    var emitStyle: js.Any = js.native
    
    /**
      * A hint to the browser for which enter key to display.
      * Possible values: `"enter"`, `"done"`, `"go"`, `"next"`,
      * `"previous"`, `"search"`, and `"send"`.
      */
    var enterkeyhint: js.UndefOr[enter | done | go | next | previous | search | send] = js.native
    
    var focused: Boolean = js.native
    
    /**
      * Returns the native `<input>` element used under the hood.
      */
    def getInputElement(): js.Promise[HTMLInputElement] = js.native
    
    var getValue: js.Any = js.native
    
    var hasValue: js.Any = js.native
    
    /**
      * A hint to the browser for which keyboard to display.
      * Possible values: `"none"`, `"text"`, `"tel"`, `"url"`,
      * `"email"`, `"numeric"`, `"decimal"`, and `"search"`.
      */
    var inputmode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
    
    /**
      * Emitted when the input loses focus.
      */
    var ionBlur: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the cancel button is clicked.
      */
    var ionCancel: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the value has changed.
      */
    var ionChange: EventEmitter[SearchbarChangeEventDetail] = js.native
    
    /**
      * Emitted when the clear input button is clicked.
      */
    var ionClear: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the input has focus.
      */
    var ionFocus: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when a keyboard input occurred.
      */
    var ionInput: EventEmitter[KeyboardEvent] = js.native
    
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    
    var isCancelVisible: js.Any = js.native
    
    var nativeInput: js.Any = js.native
    
    var noAnimate: Boolean = js.native
    
    /**
      * Sets the Searchbar to not focused and checks if it should align left
      * based on whether there is a value in the searchbar or not.
      */
    var onBlur: js.Any = js.native
    
    /**
      * Clears the input field and tells the input to blur since
      * the clearInput function doesn't want the input to blur
      * then calls the custom cancel function if the user passed one in.
      */
    var onCancelSearchbar: js.Any = js.native
    
    /**
      * Clears the input field and triggers the control change.
      */
    var onClearInput: js.Any = js.native
    
    /**
      * Sets the Searchbar to focused and active on input focus.
      */
    var onFocus: js.Any = js.native
    
    /**
      * Update the Searchbar input value when the input changes
      */
    var onInput: js.Any = js.native
    
    /**
      * Set the input's placeholder.
      * `placeholder` can accept either plaintext or HTML as a string.
      * To display characters normally reserved for HTML, they
      * must be escaped. For example `<Ionic>` would become
      * `&lt;Ionic&gt;`
      *
      * For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
      */
    var placeholder: String = js.native
    
    /**
      * Show the iOS Cancel button on focus, hide it offscreen otherwise
      */
    var positionCancelButton: js.Any = js.native
    
    /**
      * Positions the input search icon, placeholder, and the cancel button
      * based on the input value and if it is focused. (ios only)
      */
    var positionElements: js.Any = js.native
    
    /**
      * Positions the input placeholder
      */
    var positionPlaceholder: js.Any = js.native
    
    @JSName("render")
    def render_MSearchbar(): js.Any = js.native
    
    /**
      * The icon to use as the search icon. Defaults to `"search-outline"` in
      * `ios` mode and `"search-sharp"` in `md` mode.
      */
    var searchIcon: js.UndefOr[String] = js.native
    
    /**
      * Sets focus on the specified `ion-searchbar`. Use this method instead of the global
      * `input.focus()`.
      */
    def setFocus(): js.Promise[Unit] = js.native
    
    var shouldAlignLeft: js.Any = js.native
    
    /**
      * Determines whether or not the cancel button should be visible onscreen.
      * Cancel button should be shown if one of two conditions applies:
      * 1. `showCancelButton` is set to `always`.
      * 2. `showCancelButton` is set to `focus`, and the searchbar has been focused.
      */
    var shouldShowCancelButton: js.Any = js.native
    
    /**
      * Sets the behavior for the cancel button. Defaults to `"never"`.
      * Setting to `"focus"` shows the cancel button on focus.
      * Setting to `"never"` hides the cancel button.
      * Setting to `"always"` shows the cancel button regardless
      * of focus state.
      */
    var showCancelButton: never | focus | always = js.native
    
    /* protected */ def showCancelButtonChanged(): Unit = js.native
    
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
    
    /* protected */ def valueChanged(): Unit = js.native
  }
}
