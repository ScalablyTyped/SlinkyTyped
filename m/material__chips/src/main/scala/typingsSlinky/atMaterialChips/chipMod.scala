package typingsSlinky.atMaterialChips

import org.scalajs.dom.raw.Element
import typingsSlinky.atMaterialChips.chipAdapterMod.MDCChipAdapter
import typingsSlinky.atMaterialChips.chipFoundationMod.default
import typingsSlinky.atMaterialChips.chipMod.MDCChip
import typingsSlinky.atMaterialRipple.atMaterialRippleMod.MDCRipple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/chips/chip", JSImport.Namespace)
@js.native
object chipMod extends js.Object {
  @js.native
  class MDCChip ()
    extends typingsSlinky.atMaterialBase.componentMod.default[MDCChipAdapter, default] {
    val foundation: default = js.native
    val ripple: MDCRipple = js.native
    /**
      * Returns true if the chip is selected.
      */
    def isSelected(): Boolean = js.native
    /**
      * Destroys the chip and removes the root element from the DOM.
      */
    def remove(): Unit = js.native
  }
  
  @js.native
  class MDCChipFoundation () extends default
  
  /* static members */
  @js.native
  object MDCChip extends js.Object {
    def attachTo(root: Element): MDCChip = js.native
  }
  
  /* static members */
  @js.native
  object MDCChipFoundation extends js.Object {
    val cssClasses: typingsSlinky.atMaterialChips.chipConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCChipAdapter = js.native
    val strings: typingsSlinky.atMaterialChips.chipConstantsMod.strings = js.native
  }
  
}

