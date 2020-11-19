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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonTextarea extends js.Object {
  
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
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke.
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
    * Sets focus on the specified `ion-textarea`. Use this method instead of the global `input.focus()`.
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
    getInputElement: () => js.Promise[HTMLTextAreaElement],
    name: String,
    readonly: Boolean,
    required: Boolean,
    setFocus: () => js.Promise[Unit],
    spellcheck: Boolean
  ): IonTextarea = {
    val __obj = js.Dynamic.literal(autoGrow = autoGrow.asInstanceOf[js.Any], autocapitalize = autocapitalize.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], clearOnEdit = clearOnEdit.asInstanceOf[js.Any], debounce = debounce.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], getInputElement = js.Any.fromFunction0(getInputElement), name = name.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], setFocus = js.Any.fromFunction0(setFocus), spellcheck = spellcheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonTextarea]
  }
  
  @scala.inline
  implicit class IonTextareaOps[Self <: IonTextarea] (val x: Self) extends AnyVal {
    
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
    def setAutoGrow(value: Boolean): Self = this.set("autoGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutocapitalize(value: String): Self = this.set("autocapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutofocus(value: Boolean): Self = this.set("autofocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearOnEdit(value: Boolean): Self = this.set("clearOnEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebounce(value: Double): Self = this.set("debounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetInputElement(value: () => js.Promise[HTMLTextAreaElement]): Self = this.set("getInputElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFocus(value: () => js.Promise[Unit]): Self = this.set("setFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSpellcheck(value: Boolean): Self = this.set("spellcheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    
    @scala.inline
    def setEnterkeyhint(value: enter | done | go | next | previous | search | send): Self = this.set("enterkeyhint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterkeyhint: Self = this.set("enterkeyhint", js.undefined)
    
    @scala.inline
    def setInputmode(value: none | text | tel | url | email | numeric | decimal | search): Self = this.set("inputmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputmode: Self = this.set("inputmode", js.undefined)
    
    @scala.inline
    def setMaxlength(value: Double): Self = this.set("maxlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxlength: Self = this.set("maxlength", js.undefined)
    
    @scala.inline
    def setMinlength(value: Double): Self = this.set("minlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinlength: Self = this.set("minlength", js.undefined)
    
    @scala.inline
    def setMode(value: ios | md): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPlaceholderNull: Self = this.set("placeholder", null)
    
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
    
    @scala.inline
    def setWrap(value: hard | soft | off): Self = this.set("wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
}
