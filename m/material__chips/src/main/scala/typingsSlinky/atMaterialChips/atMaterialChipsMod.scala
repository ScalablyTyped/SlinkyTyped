package typingsSlinky.atMaterialChips

import org.scalajs.dom.raw.Element
import typingsSlinky.atMaterialChips.chipAdapterMod.MDCChipAdapter
import typingsSlinky.atMaterialChips.chipDashSetAdapterMod.MDCChipSetAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/chips", JSImport.Namespace)
@js.native
object atMaterialChipsMod extends js.Object {
  @js.native
  class MDCChip ()
    extends typingsSlinky.atMaterialChips.chipMod.MDCChip
  
  @js.native
  class MDCChipFoundation ()
    extends typingsSlinky.atMaterialChips.chipMod.MDCChipFoundation
  
  @js.native
  class MDCChipSet ()
    extends typingsSlinky.atMaterialChips.chipDashSetMod.MDCChipSet
  
  @js.native
  class MDCChipSetFoundation ()
    extends typingsSlinky.atMaterialChips.chipDashSetMod.MDCChipSetFoundation
  
  /* static members */
  @js.native
  object MDCChip extends js.Object {
    def attachTo(root: Element): typingsSlinky.atMaterialChips.chipMod.MDCChip = js.native
  }
  
  /* static members */
  @js.native
  object MDCChipFoundation extends js.Object {
    val cssClasses: typingsSlinky.atMaterialChips.chipConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCChipAdapter = js.native
    val strings: typingsSlinky.atMaterialChips.chipConstantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCChipSet extends js.Object {
    def attachTo(root: js.Any): typingsSlinky.atMaterialChips.chipDashSetMod.MDCChipSet = js.native
  }
  
  /* static members */
  @js.native
  object MDCChipSetFoundation extends js.Object {
    val cssClasses: typingsSlinky.atMaterialChips.chipDashSetConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCChipSetAdapter = js.native
    val strings: typingsSlinky.atMaterialChips.chipDashSetConstantsMod.strings = js.native
  }
  
}

