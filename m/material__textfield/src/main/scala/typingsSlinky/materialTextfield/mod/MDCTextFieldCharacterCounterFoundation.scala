package typingsSlinky.materialTextfield.mod

import typingsSlinky.materialTextfield.anon.PartialMDCTextFieldCharac
import typingsSlinky.materialTextfield.anon.ROOT
import typingsSlinky.materialTextfield.anon.ROOTSELECTOR
import typingsSlinky.materialTextfield.characterCounterAdapterMod.MDCTextFieldCharacterCounterAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/textfield", "MDCTextFieldCharacterCounterFoundation")
@js.native
class MDCTextFieldCharacterCounterFoundation ()
  extends typingsSlinky.materialTextfield.indexMod.MDCTextFieldCharacterCounterFoundation {
  def this(adapter: PartialMDCTextFieldCharac) = this()
}

/* static members */
@JSImport("@material/textfield", "MDCTextFieldCharacterCounterFoundation")
@js.native
object MDCTextFieldCharacterCounterFoundation extends js.Object {
  def cssClasses: ROOT = js.native
  /**
    * See {@link MDCTextFieldCharacterCounterAdapter} for typing information on parameters and return types.
    */
  def defaultAdapter: MDCTextFieldCharacterCounterAdapter = js.native
  def strings: ROOTSELECTOR = js.native
}

