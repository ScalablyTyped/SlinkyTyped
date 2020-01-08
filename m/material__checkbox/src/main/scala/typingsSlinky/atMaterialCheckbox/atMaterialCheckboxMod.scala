package typingsSlinky.atMaterialCheckbox

import org.scalajs.dom.raw.Element
import typingsSlinky.atMaterialCheckbox.adapterMod.MDCCheckboxAdapter
import typingsSlinky.atMaterialCheckbox.foundationMod.default
import typingsSlinky.atMaterialRipple.atMaterialRippleMod.MDCRipple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/checkbox", JSImport.Namespace)
@js.native
object atMaterialCheckboxMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.atMaterialSelectionDashControl.atMaterialSelectionDashControlMod.MDCSelectionControl because Inheritance from two classes. Inlined ripple */ @js.native
  class MDCCheckbox ()
    extends typingsSlinky.atMaterialBase.componentMod.default[MDCCheckboxAdapter, default] {
    var checked: Boolean = js.native
    var disabled: Boolean = js.native
    var indeterminate: Boolean = js.native
    val ripple: MDCRipple = js.native
    var value: String = js.native
  }
  
  @js.native
  class MDCCheckboxFoundation () extends default
  
  /* static members */
  @js.native
  object MDCCheckbox extends js.Object {
    def attachTo(root: Element): MDCCheckbox = js.native
  }
  
  /* static members */
  @js.native
  object MDCCheckboxFoundation extends js.Object {
    val cssClasses: typingsSlinky.atMaterialCheckbox.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCCheckboxAdapter = js.native
    val numbers: typingsSlinky.atMaterialCheckbox.constantsMod.numbers = js.native
    val strings: typingsSlinky.atMaterialCheckbox.constantsMod.strings = js.native
  }
  
}

