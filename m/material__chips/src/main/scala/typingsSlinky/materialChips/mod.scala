package typingsSlinky.materialChips

import org.scalajs.dom.raw.Element
import typingsSlinky.materialChips.adapterMod.MDCChipSetAdapter
import typingsSlinky.materialChips.chipAdapterMod.MDCChipAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/chips", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCChip ()
    extends typingsSlinky.materialChips.chipMod.MDCChip
  
  @js.native
  class MDCChipFoundation ()
    extends typingsSlinky.materialChips.chipMod.MDCChipFoundation
  
  @js.native
  class MDCChipSet ()
    extends typingsSlinky.materialChips.chipSetMod.MDCChipSet
  
  @js.native
  class MDCChipSetFoundation ()
    extends typingsSlinky.materialChips.chipSetMod.MDCChipSetFoundation
  
  /* static members */
  @js.native
  object MDCChip extends js.Object {
    def attachTo(root: Element): typingsSlinky.materialChips.chipMod.MDCChip = js.native
  }
  
  /* static members */
  @js.native
  object MDCChipFoundation extends js.Object {
    val cssClasses: typingsSlinky.materialChips.chipConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCChipAdapter = js.native
    val strings: typingsSlinky.materialChips.chipConstantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCChipSet extends js.Object {
    def attachTo(root: js.Any): typingsSlinky.materialChips.chipSetMod.MDCChipSet = js.native
  }
  
  /* static members */
  @js.native
  object MDCChipSetFoundation extends js.Object {
    val cssClasses: typingsSlinky.materialChips.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCChipSetAdapter = js.native
    val strings: typingsSlinky.materialChips.constantsMod.strings = js.native
  }
  
}

