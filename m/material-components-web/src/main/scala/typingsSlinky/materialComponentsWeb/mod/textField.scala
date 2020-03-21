package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materialTextfield.adapterMod.FoundationMapType
import typingsSlinky.materialTextfield.adapterMod.MDCTextFieldAdapter
import typingsSlinky.materialTextfield.helperTextAdapterMod.MDCTextFieldHelperTextAdapter
import typingsSlinky.materialTextfield.iconAdapterMod.MDCTextFieldIconAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "textField")
@js.native
object textField extends js.Object {
  @js.native
  class MDCTextField ()
    extends typingsSlinky.materialTextfield.mod.MDCTextField
  
  @js.native
  class MDCTextFieldFoundation protected ()
    extends typingsSlinky.materialTextfield.mod.MDCTextFieldFoundation {
    def this(adapter: MDCTextFieldAdapter) = this()
    def this(adapter: MDCTextFieldAdapter, foundationMap: FoundationMapType) = this()
  }
  
  @js.native
  class MDCTextFieldHelperText ()
    extends typingsSlinky.materialTextfield.mod.MDCTextFieldHelperText
  
  @js.native
  class MDCTextFieldHelperTextFoundation ()
    extends typingsSlinky.materialTextfield.mod.MDCTextFieldHelperTextFoundation
  
  @js.native
  class MDCTextFieldIcon ()
    extends typingsSlinky.materialTextfield.mod.MDCTextFieldIcon
  
  @js.native
  class MDCTextFieldIconFoundation ()
    extends typingsSlinky.materialTextfield.mod.MDCTextFieldIconFoundation
  
  /* static members */
  @js.native
  object MDCTextField extends js.Object {
    def attachTo(root: Element): typingsSlinky.materialTextfield.mod.MDCTextField = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldFoundation extends js.Object {
    val cssClasses: typingsSlinky.materialTextfield.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTextFieldAdapter = js.native
    val numbers: typingsSlinky.materialTextfield.constantsMod.numbers = js.native
    val strings: typingsSlinky.materialTextfield.constantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldHelperText extends js.Object {
    def attachTo(root: Element): typingsSlinky.materialTextfield.helperTextMod.MDCTextFieldHelperText = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldHelperTextFoundation extends js.Object {
    val cssClasses: typingsSlinky.materialTextfield.helperTextConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTextFieldHelperTextAdapter = js.native
    val strings: typingsSlinky.materialTextfield.helperTextConstantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldIcon extends js.Object {
    def attachTo(root: Element): typingsSlinky.materialTextfield.iconMod.MDCTextFieldIcon = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldIconFoundation extends js.Object {
    val defaultAdapter: MDCTextFieldIconAdapter = js.native
    val strings: typingsSlinky.materialTextfield.iconConstantsMod.strings = js.native
  }
  
}

