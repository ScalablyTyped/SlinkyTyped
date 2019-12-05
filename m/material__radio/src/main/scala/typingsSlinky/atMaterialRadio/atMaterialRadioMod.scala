package typingsSlinky.atMaterialRadio

import org.scalajs.dom.raw.Element
import typingsSlinky.atMaterialRadio.adapterMod.MDCRadioAdapter
import typingsSlinky.atMaterialRadio.atMaterialRadioMod.MDCRadio
import typingsSlinky.atMaterialRadio.foundationMod.default
import typingsSlinky.atMaterialRipple.atMaterialRippleMod.MDCRipple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/radio", JSImport.Namespace)
@js.native
object atMaterialRadioMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.atMaterialSelectionDashControl.atMaterialSelectionDashControlMod.MDCSelectionControl because Inheritance from two classes. Inlined ripple */ @js.native
  class MDCRadio ()
    extends typingsSlinky.atMaterialBase.componentMod.default[MDCRadioAdapter, default] {
    var checked: Boolean = js.native
    var disabled: Boolean = js.native
    val ripple: MDCRipple = js.native
    var value: String = js.native
  }
  
  @js.native
  class MDCRadioFoundation () extends default
  
  /* static members */
  @js.native
  object MDCRadio extends js.Object {
    def attachTo(root: Element): MDCRadio = js.native
  }
  
  /* static members */
  @js.native
  object MDCRadioFoundation extends js.Object {
    val cssClasses: typingsSlinky.atMaterialRadio.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCRadioAdapter = js.native
    val strings: typingsSlinky.atMaterialRadio.constantsMod.strings = js.native
  }
  
}

