package typingsSlinky.materialCheckbox

import org.scalajs.dom.raw.Element
import typingsSlinky.materialCheckbox.adapterMod.MDCCheckboxAdapter
import typingsSlinky.materialCheckbox.foundationMod.default
import typingsSlinky.materialRipple.mod.MDCRipple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/checkbox", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsSlinky.materialSelectionControl.mod.MDCSelectionControl because Inheritance from two classes. Inlined ripple */ @js.native
  class MDCCheckbox ()
    extends typingsSlinky.materialBase.componentMod.default[MDCCheckboxAdapter, default] {
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
    val cssClasses: typingsSlinky.materialCheckbox.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCCheckboxAdapter = js.native
    val numbers: typingsSlinky.materialCheckbox.constantsMod.numbers = js.native
    val strings: typingsSlinky.materialCheckbox.constantsMod.strings = js.native
  }
  
}

