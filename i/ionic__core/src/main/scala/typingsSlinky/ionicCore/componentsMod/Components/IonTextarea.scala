package typingsSlinky.ionicCore.componentsMod.Components

import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsSlinky.ionicCore.ionicCoreStrings.decimal
import typingsSlinky.ionicCore.ionicCoreStrings.done
import typingsSlinky.ionicCore.ionicCoreStrings.email
import typingsSlinky.ionicCore.ionicCoreStrings.enter
import typingsSlinky.ionicCore.ionicCoreStrings.go
import typingsSlinky.ionicCore.ionicCoreStrings.hard
import typingsSlinky.ionicCore.ionicCoreStrings.ios
import typingsSlinky.ionicCore.ionicCoreStrings.md
import typingsSlinky.ionicCore.ionicCoreStrings.next
import typingsSlinky.ionicCore.ionicCoreStrings.none
import typingsSlinky.ionicCore.ionicCoreStrings.numeric
import typingsSlinky.ionicCore.ionicCoreStrings.off
import typingsSlinky.ionicCore.ionicCoreStrings.previous
import typingsSlinky.ionicCore.ionicCoreStrings.search
import typingsSlinky.ionicCore.ionicCoreStrings.send
import typingsSlinky.ionicCore.ionicCoreStrings.soft
import typingsSlinky.ionicCore.ionicCoreStrings.tel
import typingsSlinky.ionicCore.ionicCoreStrings.text
import typingsSlinky.ionicCore.ionicCoreStrings.url
import typingsSlinky.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonTextarea extends StObject {
  
  /**
    * If `true`, the element height will increase based on the value.
    */
  var autoGrow: Boolean = js.native
  
  /**
    * Indicates whether and how the text value should be automatically capitalized as it is entered/edited by the user.
    */
  var autocapitalize: String = js.native
  
  /**
    * This Boolean attribute lets you specify that a form control should have input focus when the page loads.
    */
  var autofocus: Boolean = js.native
  
  /**
    * If `true`, the value will be cleared after focus upon edit. Defaults to `true` when `type` is `"password"`, `false` for all other types.
    */
  var clearOnEdit: Boolean = js.native
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.native
  
  /**
    * The visible width of the text control, in average character widths. If it is specified, it must be a positive integer.
    */
  var cols: js.UndefOr[Double] = js.native
  
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke. This also impacts form bindings such as `ngModel` or `v-model`.
    */
  var debounce: Double = js.native
  
  /**
    * If `true`, the user cannot interact with the textarea.
    */
  var disabled: Boolean = js.native
  
  /**
    * A hint to the browser for which enter key to display. Possible values: `"enter"`, `"done"`, `"go"`, `"next"`, `"previous"`, `"search"`, and `"send"`.
    */
  var enterkeyhint: js.UndefOr[enter | done | go | next | previous | search | send] = js.native
  
  /**
    * This is required for a WebKit bug which requires us to blur and focus an input to properly focus the input in an item with delegatesFocus. It will no longer be needed with iOS 14.
    */
  var fireFocusEvents: Boolean = js.native
  
  /**
    * Returns the native `<textarea>` element used under the hood.
    */
  def getInputElement(): js.Promise[HTMLTextAreaElement] = js.native
  
  /**
    * A hint to the browser for which keyboard to display. Possible values: `"none"`, `"text"`, `"tel"`, `"url"`, `"email"`, `"numeric"`, `"decimal"`, and `"search"`.
    */
  var inputmode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  
  /**
    * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the maximum number of characters that the user can enter.
    */
  var maxlength: js.UndefOr[Double] = js.native
  
  /**
    * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the minimum number of characters that the user can enter.
    */
  var minlength: js.UndefOr[Double] = js.native
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: String = js.native
  
  /**
    * Instructional text that shows before the input has a value.
    */
  var placeholder: js.UndefOr[String | Null] = js.native
  
  /**
    * If `true`, the user cannot modify the value.
    */
  var readonly: Boolean = js.native
  
  /**
    * If `true`, the user must fill in a value before submitting a form.
    */
  var required: Boolean = js.native
  
  /**
    * The number of visible text lines for the control.
    */
  var rows: js.UndefOr[Double] = js.native
  
  /**
    * Sets blur on the native `textarea` in `ion-textarea`. Use this method instead of the global `textarea.blur()`.
    */
  def setBlur(): js.Promise[Unit] = js.native
  
  /**
    * Sets focus on the native `textarea` in `ion-textarea`. Use this method instead of the global `textarea.focus()`.
    */
  def setFocus(): js.Promise[Unit] = js.native
  
  /**
    * If `true`, the element will have its spelling and grammar checked.
    */
  var spellcheck: Boolean = js.native
  
  /**
    * The value of the textarea.
    */
  var value: js.UndefOr[String | Null] = js.native
  
  /**
    * Indicates how the control wraps text.
    */
  var wrap: js.UndefOr[hard | soft | off] = js.native
}
object IonTextarea {
  
  @scala.inline
  def apply(
    autoGrow: Boolean,
    autocapitalize: String,
    autofocus: Boolean,
    clearOnEdit: Boolean,
    debounce: Double,
    disabled: Boolean,
    fireFocusEvents: Boolean,
    getInputElement: () => js.Promise[HTMLTextAreaElement],
    name: String,
    readonly: Boolean,
    required: Boolean,
    setBlur: () => js.Promise[Unit],
    setFocus: () => js.Promise[Unit],
    spellcheck: Boolean
  ): IonTextarea = {
    val __obj = js.Dynamic.literal(autoGrow = autoGrow.asInstanceOf[js.Any], autocapitalize = autocapitalize.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], clearOnEdit = clearOnEdit.asInstanceOf[js.Any], debounce = debounce.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], fireFocusEvents = fireFocusEvents.asInstanceOf[js.Any], getInputElement = js.Any.fromFunction0(getInputElement), name = name.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], setBlur = js.Any.fromFunction0(setBlur), setFocus = js.Any.fromFunction0(setFocus), spellcheck = spellcheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonTextarea]
  }
  
  @scala.inline
  implicit class IonTextareaMutableBuilder[Self <: IonTextarea] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoGrow(value: Boolean): Self = StObject.set(x, "autoGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutocapitalize(value: String): Self = StObject.set(x, "autocapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearOnEdit(value: Boolean): Self = StObject.set(x, "clearOnEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    @scala.inline
    def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterkeyhint(value: enter | done | go | next | previous | search | send): Self = StObject.set(x, "enterkeyhint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterkeyhintUndefined: Self = StObject.set(x, "enterkeyhint", js.undefined)
    
    @scala.inline
    def setFireFocusEvents(value: Boolean): Self = StObject.set(x, "fireFocusEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetInputElement(value: () => js.Promise[HTMLTextAreaElement]): Self = StObject.set(x, "getInputElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInputmode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputmodeUndefined: Self = StObject.set(x, "inputmode", js.undefined)
    
    @scala.inline
    def setMaxlength(value: Double): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
    
    @scala.inline
    def setMinlength(value: Double): Self = StObject.set(x, "minlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinlengthUndefined: Self = StObject.set(x, "minlength", js.undefined)
    
    @scala.inline
    def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setSetBlur(value: () => js.Promise[Unit]): Self = StObject.set(x, "setBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFocus(value: () => js.Promise[Unit]): Self = StObject.set(x, "setFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSpellcheck(value: Boolean): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWrap(value: hard | soft | off): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
