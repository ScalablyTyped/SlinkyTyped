package typingsSlinky.materialSegmentedButton

import org.scalajs.dom.raw.Element
import typingsSlinky.materialSegmentedButton.anon.PartialMDCSegmentedButtonAddClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentMod {
  
  @JSImport("@material/segmented-button/segment", "MDCSegmentedButtonSegment")
  @js.native
  class MDCSegmentedButtonSegment protected ()
    extends typingsSlinky.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegment {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typingsSlinky.materialSegmentedButton.segmentFoundationMod.MDCSegmentedButtonSegmentFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCSegmentedButtonSegment {
    
    @JSImport("@material/segmented-button/segment", "MDCSegmentedButtonSegment.attachTo")
    @js.native
    def attachTo(root: Element): typingsSlinky.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegment = js.native
  }
  
  @JSImport("@material/segmented-button/segment", "MDCSegmentedButtonSegmentFoundation")
  @js.native
  class MDCSegmentedButtonSegmentFoundation ()
    extends typingsSlinky.materialSegmentedButton.segmentFoundationMod.MDCSegmentedButtonSegmentFoundation {
    def this(adapter: PartialMDCSegmentedButtonAddClass) = this()
  }
}
