package typingsSlinky.materialChips

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialChips.chipComponentMod.MDCChip
import typingsSlinky.materialChips.chipComponentMod.MDCChipFactory
import typingsSlinky.materialChips.foundationMod.MDCChipSetFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/chips/chip-set/component", "MDCChipSet")
  @js.native
  class MDCChipSet protected () extends MDCComponent[MDCChipSetFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCChipSetFoundation, args: js.Any*) = this()
    
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
  object MDCChipSet {
    
    @JSImport("@material/chips/chip-set/component", "MDCChipSet.attachTo")
    @js.native
    def attachTo(root: Element): MDCChipSet = js.native
  }
}
