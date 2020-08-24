package typingsSlinky.materialChips

import org.scalajs.dom.raw.Element
import typingsSlinky.materialChips.anon.ARIAHIDDEN
import typingsSlinky.materialChips.anon.PartialMDCChipTrailingAct
import typingsSlinky.materialChips.trailingactionAdapterMod.MDCChipTrailingActionAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/chips/trailingaction/index", JSImport.Namespace)
@js.native
object trailingactionIndexMod extends js.Object {
  @js.native
  class MDCChipTrailingAction ()
    extends typingsSlinky.materialChips.trailingactionComponentMod.MDCChipTrailingAction
  
  @js.native
  class MDCChipTrailingActionFoundation ()
    extends typingsSlinky.materialChips.trailingactionFoundationMod.MDCChipTrailingActionFoundation {
    def this(adapter: PartialMDCChipTrailingAct) = this()
  }
  
  /* static members */
  @js.native
  object MDCChipTrailingAction extends js.Object {
    def attachTo(root: Element): typingsSlinky.materialChips.trailingactionComponentMod.MDCChipTrailingAction = js.native
  }
  
  /* static members */
  @js.native
  object MDCChipTrailingActionFoundation extends js.Object {
    def defaultAdapter: MDCChipTrailingActionAdapter = js.native
    def strings: ARIAHIDDEN = js.native
  }
  
  @js.native
  object trailingActionStrings extends js.Object {
    var ARIA_HIDDEN: String = js.native
    var INTERACTION_EVENT: String = js.native
    var NAVIGATION_EVENT: String = js.native
    var TAB_INDEX: String = js.native
  }
  
}

