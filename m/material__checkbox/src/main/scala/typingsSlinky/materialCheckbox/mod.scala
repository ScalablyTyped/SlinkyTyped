package typingsSlinky.materialCheckbox

import org.scalajs.dom.raw.Element
import typingsSlinky.materialCheckbox.adapterMod.MDCCheckboxAdapter
import typingsSlinky.materialCheckbox.anon.ANIMCHECKEDINDETERMINATE
import typingsSlinky.materialCheckbox.anon.ANIMENDLATCHMS
import typingsSlinky.materialCheckbox.anon.ARIACHECKEDATTR
import typingsSlinky.materialCheckbox.anon.PartialMDCCheckboxAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/checkbox", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class MDCCheckbox ()
    extends typingsSlinky.materialCheckbox.componentMod.MDCCheckbox
  /* static members */
  @js.native
  object MDCCheckbox extends js.Object {
    
    def attachTo(root: Element): typingsSlinky.materialCheckbox.componentMod.MDCCheckbox = js.native
  }
  
  @js.native
  class MDCCheckboxFoundation ()
    extends typingsSlinky.materialCheckbox.foundationMod.MDCCheckboxFoundation {
    def this(adapter: PartialMDCCheckboxAdapter) = this()
  }
  /* static members */
  @js.native
  object MDCCheckboxFoundation extends js.Object {
    
    def cssClasses: ANIMCHECKEDINDETERMINATE = js.native
    
    def defaultAdapter: MDCCheckboxAdapter = js.native
    
    def numbers: ANIMENDLATCHMS = js.native
    
    def strings: ARIACHECKEDATTR = js.native
  }
  
  @js.native
  object cssClasses extends js.Object {
    
    var ANIM_CHECKED_INDETERMINATE: String = js.native
    
    var ANIM_CHECKED_UNCHECKED: String = js.native
    
    var ANIM_INDETERMINATE_CHECKED: String = js.native
    
    var ANIM_INDETERMINATE_UNCHECKED: String = js.native
    
    var ANIM_UNCHECKED_CHECKED: String = js.native
    
    var ANIM_UNCHECKED_INDETERMINATE: String = js.native
    
    var BACKGROUND: String = js.native
    
    var CHECKED: String = js.native
    
    var CHECKMARK: String = js.native
    
    var CHECKMARK_PATH: String = js.native
    
    var DISABLED: String = js.native
    
    var INDETERMINATE: String = js.native
    
    var MIXEDMARK: String = js.native
    
    var NATIVE_CONTROL: String = js.native
    
    var ROOT: String = js.native
    
    var SELECTED: String = js.native
    
    var UPGRADED: String = js.native
  }
  
  @js.native
  object numbers extends js.Object {
    
    var ANIM_END_LATCH_MS: Double = js.native
  }
  
  @js.native
  object strings extends js.Object {
    
    var ARIA_CHECKED_ATTR: String = js.native
    
    var ARIA_CHECKED_INDETERMINATE_VALUE: String = js.native
    
    var DATA_INDETERMINATE_ATTR: String = js.native
    
    var NATIVE_CONTROL_SELECTOR: String = js.native
    
    var TRANSITION_STATE_CHECKED: String = js.native
    
    var TRANSITION_STATE_INDETERMINATE: String = js.native
    
    var TRANSITION_STATE_INIT: String = js.native
    
    var TRANSITION_STATE_UNCHECKED: String = js.native
  }
}
