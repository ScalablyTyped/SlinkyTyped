package typingsSlinky.materialSegmentedButton

import org.scalajs.dom.raw.Element
import typingsSlinky.materialSegmentedButton.adapterMod.MDCSegmentedButtonAdapter
import typingsSlinky.materialSegmentedButton.anon.PartialMDCSegmentedButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/segmented-button/segmented-button", JSImport.Namespace)
@js.native
object segmentedButtonMod extends js.Object {
  
  @js.native
  class MDCSegmentedButton ()
    extends typingsSlinky.materialSegmentedButton.componentMod.MDCSegmentedButton
  /* static members */
  @js.native
  object MDCSegmentedButton extends js.Object {
    
    def attachTo(root: Element): typingsSlinky.materialSegmentedButton.componentMod.MDCSegmentedButton = js.native
  }
  
  @js.native
  class MDCSegmentedButtonFoundation ()
    extends typingsSlinky.materialSegmentedButton.foundationMod.MDCSegmentedButtonFoundation {
    def this(adapter: PartialMDCSegmentedButton) = this()
  }
  /* static members */
  @js.native
  object MDCSegmentedButtonFoundation extends js.Object {
    
    def defaultAdapter: MDCSegmentedButtonAdapter = js.native
  }
}
