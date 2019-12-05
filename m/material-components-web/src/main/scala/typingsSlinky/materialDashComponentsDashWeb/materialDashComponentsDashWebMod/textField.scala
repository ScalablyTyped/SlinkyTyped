package typingsSlinky.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import org.scalajs.dom.raw.Element
import typingsSlinky.atMaterialTextfield.adapterMod.FoundationMapType
import typingsSlinky.atMaterialTextfield.adapterMod.MDCTextFieldAdapter
import typingsSlinky.atMaterialTextfield.helperDashTextAdapterMod.MDCTextFieldHelperTextAdapter
import typingsSlinky.atMaterialTextfield.iconAdapterMod.MDCTextFieldIconAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "textField")
@js.native
object textField extends js.Object {
  @js.native
  class MDCTextField ()
    extends typingsSlinky.atMaterialTextfield.atMaterialTextfieldMod.MDCTextField
  
  @js.native
  class MDCTextFieldFoundation protected ()
    extends typingsSlinky.atMaterialTextfield.atMaterialTextfieldMod.MDCTextFieldFoundation {
    def this(adapter: MDCTextFieldAdapter) = this()
    def this(adapter: MDCTextFieldAdapter, foundationMap: FoundationMapType) = this()
  }
  
  @js.native
  class MDCTextFieldHelperText ()
    extends typingsSlinky.atMaterialTextfield.atMaterialTextfieldMod.MDCTextFieldHelperText
  
  @js.native
  class MDCTextFieldHelperTextFoundation ()
    extends typingsSlinky.atMaterialTextfield.atMaterialTextfieldMod.MDCTextFieldHelperTextFoundation
  
  @js.native
  class MDCTextFieldIcon ()
    extends typingsSlinky.atMaterialTextfield.atMaterialTextfieldMod.MDCTextFieldIcon
  
  @js.native
  class MDCTextFieldIconFoundation ()
    extends typingsSlinky.atMaterialTextfield.atMaterialTextfieldMod.MDCTextFieldIconFoundation
  
  /* static members */
  @js.native
  object MDCTextField extends js.Object {
    def attachTo(root: Element): typingsSlinky.atMaterialTextfield.atMaterialTextfieldMod.MDCTextField = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldFoundation extends js.Object {
    val cssClasses: typingsSlinky.atMaterialTextfield.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTextFieldAdapter = js.native
    val numbers: typingsSlinky.atMaterialTextfield.constantsMod.numbers = js.native
    val strings: typingsSlinky.atMaterialTextfield.constantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldHelperText extends js.Object {
    def attachTo(root: Element): typingsSlinky.atMaterialTextfield.helperDashTextMod.MDCTextFieldHelperText = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldHelperTextFoundation extends js.Object {
    val cssClasses: typingsSlinky.atMaterialTextfield.helperDashTextConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTextFieldHelperTextAdapter = js.native
    val strings: typingsSlinky.atMaterialTextfield.helperDashTextConstantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldIcon extends js.Object {
    def attachTo(root: Element): typingsSlinky.atMaterialTextfield.iconMod.MDCTextFieldIcon = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldIconFoundation extends js.Object {
    val defaultAdapter: MDCTextFieldIconAdapter = js.native
    val strings: typingsSlinky.atMaterialTextfield.iconConstantsMod.strings = js.native
  }
  
}

