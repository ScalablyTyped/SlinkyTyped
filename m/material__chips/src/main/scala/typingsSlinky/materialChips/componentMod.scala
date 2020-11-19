package typingsSlinky.materialChips

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialChips.chipComponentMod.MDCChip
import typingsSlinky.materialChips.chipComponentMod.MDCChipFactory
import typingsSlinky.materialChips.foundationMod.MDCChipSetFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/chips/chip-set/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  
  @js.native
  class MDCChipSet () extends MDCComponent[MDCChipSetFoundation] {
    
    /**
      * Adds a new chip object to the chip set from the given chip element.
      */
    def addChip(chipEl: Element): Unit = js.native
    
    def chips: js.Array[MDCChip] = js.native
    
    /**
      * @param chipFactory A function which creates a new MDCChip.
      */
    def initialize(): Unit = js.native
    def initialize(chipFactory: MDCChipFactory): Unit = js.native
    
    /**
      * @return An array of the IDs of all selected chips.
      */
    def selectedChipIds: js.Array[String] = js.native
  }
  /* static members */
  @js.native
  object MDCChipSet extends js.Object {
    
    def attachTo(root: Element): MDCChipSet = js.native
  }
}
