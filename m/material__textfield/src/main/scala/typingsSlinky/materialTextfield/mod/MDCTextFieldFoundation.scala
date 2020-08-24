package typingsSlinky.materialTextfield.mod

import typingsSlinky.materialTextfield.adapterMod.MDCTextFieldAdapter
import typingsSlinky.materialTextfield.anon.ARIACONTROLS
import typingsSlinky.materialTextfield.anon.DISABLED
import typingsSlinky.materialTextfield.anon.LABELSCALE
import typingsSlinky.materialTextfield.anon.PartialMDCTextFieldAdapte
import typingsSlinky.materialTextfield.anon.PartialMDCTextFieldFounda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/textfield", "MDCTextFieldFoundation")
@js.native
/**
  * @param adapter
  * @param foundationMap Map from subcomponent names to their subfoundations.
  */
class MDCTextFieldFoundation ()
  extends typingsSlinky.materialTextfield.materialTextfieldFoundationMod.MDCTextFieldFoundation {
  def this(adapter: PartialMDCTextFieldAdapte) = this()
  def this(adapter: js.UndefOr[scala.Nothing], foundationMap: PartialMDCTextFieldFounda) = this()
  def this(adapter: PartialMDCTextFieldAdapte, foundationMap: PartialMDCTextFieldFounda) = this()
}

/* static members */
@JSImport("@material/textfield", "MDCTextFieldFoundation")
@js.native
object MDCTextFieldFoundation extends js.Object {
  def cssClasses: DISABLED = js.native
  /**
    * See {@link MDCTextFieldAdapter} for typing information on parameters and return types.
    */
  def defaultAdapter: MDCTextFieldAdapter = js.native
  def numbers: LABELSCALE = js.native
  def strings: ARIACONTROLS = js.native
}

