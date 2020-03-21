package typingsSlinky.materialChips

import org.scalajs.dom.raw.Element
import typingsSlinky.materialChips.adapterMod.MDCChipSetAdapter
import typingsSlinky.materialChips.chipMod.MDCChip
import typingsSlinky.materialChips.foundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/chips/chip-set", JSImport.Namespace)
@js.native
object chipSetMod extends js.Object {
  @js.native
  class MDCChipSet ()
    extends typingsSlinky.materialBase.componentMod.default[MDCChipSetAdapter, default] {
    /**
      * Creates a new chip in the chip set with the given text, leading icon, and trailing icon.
      */
    def addChip(text: String): Unit = js.native
    def addChip(text: String, leadingIcon: Null, trailingIcon: Element): Unit = js.native
    def addChip(text: String, leadingIcon: typingsSlinky.std.Element): Unit = js.native
    def addChip(text: String, leadingIcon: typingsSlinky.std.Element, trailingIcon: Element): Unit = js.native
    def initialize(): Unit = js.native
    def initialize(chipFactory: js.Function1[/* el */ Element, MDCChip]): Unit = js.native
  }
  
  @js.native
  class MDCChipSetFoundation () extends default
  
  /* static members */
  @js.native
  object MDCChipSet extends js.Object {
    def attachTo(root: js.Any): MDCChipSet = js.native
  }
  
  /* static members */
  @js.native
  object MDCChipSetFoundation extends js.Object {
    val cssClasses: typingsSlinky.materialChips.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCChipSetAdapter = js.native
    val strings: typingsSlinky.materialChips.constantsMod.strings = js.native
  }
  
}

