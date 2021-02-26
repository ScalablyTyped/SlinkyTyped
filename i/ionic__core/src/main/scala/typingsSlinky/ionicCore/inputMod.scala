package typingsSlinky.ionicCore

import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.KeyboardEvent
import typingsSlinky.ionicCore.inputInterfaceMod.InputChangeEventDetail
import typingsSlinky.ionicCore.ionicCoreStrings.decimal
import typingsSlinky.ionicCore.ionicCoreStrings.done
import typingsSlinky.ionicCore.ionicCoreStrings.email
import typingsSlinky.ionicCore.ionicCoreStrings.enter
import typingsSlinky.ionicCore.ionicCoreStrings.go
import typingsSlinky.ionicCore.ionicCoreStrings.next
import typingsSlinky.ionicCore.ionicCoreStrings.none
import typingsSlinky.ionicCore.ionicCoreStrings.numeric
import typingsSlinky.ionicCore.ionicCoreStrings.off
import typingsSlinky.ionicCore.ionicCoreStrings.on
import typingsSlinky.ionicCore.ionicCoreStrings.previous
import typingsSlinky.ionicCore.ionicCoreStrings.search
import typingsSlinky.ionicCore.ionicCoreStrings.send
import typingsSlinky.ionicCore.ionicCoreStrings.tel
import typingsSlinky.ionicCore.ionicCoreStrings.text
import typingsSlinky.ionicCore.ionicCoreStrings.url
import typingsSlinky.ionicCore.mod.AutocompleteTypes
import typingsSlinky.ionicCore.mod.Color
import typingsSlinky.ionicCore.mod.StyleEventDetail
import typingsSlinky.ionicCore.mod.TextFieldTypes
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  @JSImport("@ionic/core/dist/types/components/input/input", "Input")
  @js.native
  class Input () extends ComponentInterface {
    
    /**
      * If the value of the type attribute is `"file"`, then this attribute will indicate the types of files that the server accepts, otherwise it will be ignored. The value must be a comma-separated list of unique content type specifiers.
      */
    var accept: js.UndefOr[String] = js.native
    
    /**
      * Indicates whether and how the text value should be automatically capitalized as it is entered/edited by the user.
      */
    var autocapitalize: String = js.native
    
    /**
      * Indicates whether the value of the control can be automatically completed by the browser.
      */
    var autocomplete: AutocompleteTypes = js.native
    
    /**
      * Whether auto correction should be enabled when the user is entering/editing the text value.
      */
    var autocorrect: on | off = js.native
    
    /**
      * This Boolean attribute lets you specify that a form control should have input focus when the page loads.
      */
    var autofocus: Boolean = js.native
    
    /**
      * If `true`, a clear icon will appear in the input when there is a value. Clicking it clears the input.
      */
    var clearInput: Boolean = js.native
    
    /**
      * If `true`, the value will be cleared after focus upon edit. Defaults to `true` when `type` is `"password"`, `false` for all other types.
      */
    var clearOnEdit: js.UndefOr[Boolean] = js.native
    
    var clearTextInput: js.Any = js.native
    
    var clearTextOnEnter: js.Any = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MInput(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MInput(): Unit = js.native
    
    /**
      * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke. This also impacts form bindings such as `ngModel` or `v-model`.
      */
    var debounce: Double = js.native
    
    /* protected */ def debounceChanged(): Unit = js.native
    
    var didBlurAfterEdit: js.Any = js.native
    
    /**
      * If `true`, the user cannot interact with the input.
      */
    var disabled: Boolean = js.native
    
    /* protected */ def disabledChanged(): Unit = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MInput(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    var emitStyle: js.Any = js.native
    
    /**
      * A hint to the browser for which enter key to display.
      * Possible values: `"enter"`, `"done"`, `"go"`, `"next"`,
      * `"previous"`, `"search"`, and `"send"`.
      */
    var enterkeyhint: js.UndefOr[enter | done | go | next | previous | search | send] = js.native
    
    /**
      * This is required for a WebKit bug which requires us to
      * blur and focus an input to properly focus the input in
      * an item with delegatesFocus. It will no longer be needed
      * with iOS 14.
      *
      * @internal
      */
    var fireFocusEvents: Boolean = js.native
    
    var focusChanged: js.Any = js.native
    
    /**
      * Returns the native `<input>` element used under the hood.
      */
    def getInputElement(): js.Promise[HTMLInputElement] = js.native
    
    var getValue: js.Any = js.native
    
    var hasFocus: Boolean = js.native
    
    var hasValue: js.Any = js.native
    
    var inheritedAttributes: js.Any = js.native
    
    var inputId: js.Any = js.native
    
    /**
      * A hint to the browser for which keyboard to display.
      * Possible values: `"none"`, `"text"`, `"tel"`, `"url"`,
      * `"email"`, `"numeric"`, `"decimal"`, and `"search"`.
      */
    var inputmode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
    
    /**
      * Emitted when the input loses focus.
      */
    var ionBlur: EventEmitter[FocusEvent] = js.native
    
    /**
      * Emitted when the value has changed.
      */
    var ionChange: EventEmitter[InputChangeEventDetail] = js.native
    
    /**
      * Emitted when the input has focus.
      */
    var ionFocus: EventEmitter[FocusEvent] = js.native
    
    /**
      * Emitted when a keyboard input occurred.
      */
    var ionInput: EventEmitter[KeyboardEvent] = js.native
    
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    
    /**
      * The maximum value, which must not be less than its minimum (min attribute) value.
      */
    var max: js.UndefOr[String] = js.native
    
    /**
      * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the maximum number of characters that the user can enter.
      */
    var maxlength: js.UndefOr[Double] = js.native
    
    /**
      * The minimum value, which must not be greater than its maximum (max attribute) value.
      */
    var min: js.UndefOr[String] = js.native
    
    /**
      * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the minimum number of characters that the user can enter.
      */
    var minlength: js.UndefOr[Double] = js.native
    
    /**
      * If `true`, the user can enter more than one value. This attribute applies when the type attribute is set to `"email"` or `"file"`, otherwise it is ignored.
      */
    var multiple: js.UndefOr[Boolean] = js.native
    
    /**
      * The name of the control, which is submitted with the form data.
      */
    var name: String = js.native
    
    var nativeInput: js.Any = js.native
    
    var onBlur: js.Any = js.native
    
    var onFocus: js.Any = js.native
    
    var onInput: js.Any = js.native
    
    var onKeydown: js.Any = js.native
    
    /**
      * A regular expression that the value is checked against. The pattern must match the entire value, not just some subset. Use the title attribute to describe the pattern to help the user. This attribute applies when the value of the type attribute is `"text"`, `"search"`, `"tel"`, `"url"`, `"email"`, `"date"`, or `"password"`, otherwise it is ignored. When the type attribute is `"date"`, `pattern` will only be used in browsers that do not support the `"date"` input type natively. See https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/date for more information.
      */
    var pattern: js.UndefOr[String] = js.native
    
    /**
      * Instructional text that shows before the input has a value.
      */
    var placeholder: js.UndefOr[String | Null] = js.native
    
    /**
      * If `true`, the user cannot modify the value.
      */
    var readonly: Boolean = js.native
    
    @JSName("render")
    def render_MInput(): js.Any = js.native
    
    /**
      * If `true`, the user must fill in a value before submitting a form.
      */
    var required: Boolean = js.native
    
    /**
      * Sets blur on the native `input` in `ion-input`. Use this method instead of the global
      * `input.blur()`.
      * @internal
      */
    def setBlur(): js.Promise[Unit] = js.native
    
    /**
      * Sets focus on the native `input` in `ion-input`. Use this method instead of the global
      * `input.focus()`.
      */
    def setFocus(): js.Promise[Unit] = js.native
    
    var shouldClearOnEdit: js.Any = js.native
    
    /**
      * The initial size of the control. This value is in pixels unless the value of the type attribute is `"text"` or `"password"`, in which case it is an integer number of characters. This attribute applies only when the `type` attribute is set to `"text"`, `"search"`, `"tel"`, `"url"`, `"email"`, or `"password"`, otherwise it is ignored.
      */
    var size: js.UndefOr[Double] = js.native
    
    /**
      * If `true`, the element will have its spelling and grammar checked.
      */
    var spellcheck: Boolean = js.native
    
    /**
      * Works with the min and max attributes to limit the increments at which a value can be set.
      * Possible values are: `"any"` or a positive floating point number.
      */
    var step: js.UndefOr[String] = js.native
    
    /**
      * The type of control to display. The default type is text.
      */
    var `type`: TextFieldTypes = js.native
    
    /**
      * The value of the input.
      */
    var value: js.UndefOr[String | Double | Null] = js.native
    
    /**
      * Update the native input element when the value changes
      */
    /* protected */ def valueChanged(): Unit = js.native
  }
}
