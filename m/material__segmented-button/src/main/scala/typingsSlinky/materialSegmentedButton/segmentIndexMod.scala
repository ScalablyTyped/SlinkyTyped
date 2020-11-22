package typingsSlinky.materialSegmentedButton

import org.scalajs.dom.raw.Element
import typingsSlinky.materialSegmentedButton.anon.PartialMDCSegmentedButtonAddClass
import typingsSlinky.materialSegmentedButton.segmentAdapterMod.MDCSegmentedButtonSegmentAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/segmented-button/segment/index", JSImport.Namespace)
@js.native
object segmentIndexMod extends js.Object {
  
  @js.native
  class MDCSegmentedButtonSegment ()
    extends typingsSlinky.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegment
  /* static members */
  @js.native
  object MDCSegmentedButtonSegment extends js.Object {
    
    def attachTo(root: Element): typingsSlinky.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegment = js.native
  }
  
  @js.native
  class MDCSegmentedButtonSegmentFoundation ()
    extends typingsSlinky.materialSegmentedButton.segmentFoundationMod.MDCSegmentedButtonSegmentFoundation {
    def this(adapter: PartialMDCSegmentedButtonAddClass) = this()
  }
  /* static members */
  @js.native
  object MDCSegmentedButtonSegmentFoundation extends js.Object {
    
    def defaultAdapter: MDCSegmentedButtonSegmentAdapter = js.native
  }
}
