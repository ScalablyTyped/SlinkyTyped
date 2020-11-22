package typingsSlinky.materialSegmentedButton

import org.scalajs.dom.raw.Element
import typingsSlinky.materialSegmentedButton.adapterMod.MDCSegmentedButtonAdapter
import typingsSlinky.materialSegmentedButton.anon.PartialMDCSegmentedButton
import typingsSlinky.materialSegmentedButton.anon.PartialMDCSegmentedButtonAddClass
import typingsSlinky.materialSegmentedButton.segmentAdapterMod.MDCSegmentedButtonSegmentAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/segmented-button", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class MDCSegmentedButton ()
    extends typingsSlinky.materialSegmentedButton.indexMod.MDCSegmentedButton
  /* static members */
  @js.native
  object MDCSegmentedButton extends js.Object {
    
    def attachTo(root: Element): typingsSlinky.materialSegmentedButton.componentMod.MDCSegmentedButton = js.native
  }
  
  @js.native
  class MDCSegmentedButtonFoundation ()
    extends typingsSlinky.materialSegmentedButton.indexMod.MDCSegmentedButtonFoundation {
    def this(adapter: PartialMDCSegmentedButton) = this()
  }
  /* static members */
  @js.native
  object MDCSegmentedButtonFoundation extends js.Object {
    
    def defaultAdapter: MDCSegmentedButtonAdapter = js.native
  }
  
  @js.native
  class MDCSegmentedButtonSegment ()
    extends typingsSlinky.materialSegmentedButton.segmentIndexMod.MDCSegmentedButtonSegment
  /* static members */
  @js.native
  object MDCSegmentedButtonSegment extends js.Object {
    
    def attachTo(root: Element): typingsSlinky.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegment = js.native
  }
  
  @js.native
  class MDCSegmentedButtonSegmentFoundation ()
    extends typingsSlinky.materialSegmentedButton.segmentIndexMod.MDCSegmentedButtonSegmentFoundation {
    def this(adapter: PartialMDCSegmentedButtonAddClass) = this()
  }
  /* static members */
  @js.native
  object MDCSegmentedButtonSegmentFoundation extends js.Object {
    
    def defaultAdapter: MDCSegmentedButtonSegmentAdapter = js.native
  }
}
