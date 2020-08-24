package typingsSlinky.materialChips

import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialChips.adapterMod.MDCChipSetAdapter
import typingsSlinky.materialChips.anon.CHIPSELECTOR
import typingsSlinky.materialChips.anon.CHOICE
import typingsSlinky.materialChips.anon.PartialMDCChipSetAdapter
import typingsSlinky.materialChips.typesMod.MDCChipInteractionEventDetail
import typingsSlinky.materialChips.typesMod.MDCChipNavigationEventDetail
import typingsSlinky.materialChips.typesMod.MDCChipRemovalEventDetail
import typingsSlinky.materialChips.typesMod.MDCChipSelectionEventDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/chips/chip-set/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class MDCChipSetFoundation () extends MDCFoundation[MDCChipSetAdapter] {
    def this(adapter: PartialMDCChipSetAdapter) = this()
    /**
      * Returns an array of the IDs of all selected chips.
      */
    def getSelectedChipIds(): js.Array[String] = js.native
    /**
      * Handles a chip interaction event
      */
    def handleChipInteraction(hasChipId: MDCChipInteractionEventDetail): Unit = js.native
    /**
      * Handles a chip navigation event.
      */
    def handleChipNavigation(hasChipIdKeySource: MDCChipNavigationEventDetail): Unit = js.native
    /**
      * Handles the event when a chip is removed.
      */
    def handleChipRemoval(hasChipIdRemovedAnnouncement: MDCChipRemovalEventDetail): Unit = js.native
    /**
      * Handles a chip selection event, used to handle discrepancy when selection state is set directly on the Chip.
      */
    def handleChipSelection(hasChipIdSelectedShouldIgnore: MDCChipSelectionEventDetail): Unit = js.native
    /**
      * Selects the chip with the given id. Deselects all other chips if the chip set is of the choice variant.
      * Does not notify clients of the updated selection state.
      */
    def select(chipId: String): Unit = js.native
  }
  
  @js.native
  class default () extends MDCChipSetFoundation {
    def this(adapter: PartialMDCChipSetAdapter) = this()
  }
  
  /* static members */
  @js.native
  object MDCChipSetFoundation extends js.Object {
    def cssClasses: CHOICE = js.native
    def defaultAdapter: MDCChipSetAdapter = js.native
    def strings: CHIPSELECTOR = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def cssClasses: CHOICE = js.native
    def defaultAdapter: MDCChipSetAdapter = js.native
    def strings: CHIPSELECTOR = js.native
  }
  
}

