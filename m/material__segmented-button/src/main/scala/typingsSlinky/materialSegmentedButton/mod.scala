package typingsSlinky.materialSegmentedButton

import org.scalajs.dom.raw.Element
import typingsSlinky.materialSegmentedButton.anon.PartialMDCSegmentedButton
import typingsSlinky.materialSegmentedButton.anon.PartialMDCSegmentedButtonAddClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/segmented-button", "MDCSegmentedButton")
  @js.native
  class MDCSegmentedButton protected ()
    extends typingsSlinky.materialSegmentedButton.indexMod.MDCSegmentedButton {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typingsSlinky.materialSegmentedButton.foundationMod.MDCSegmentedButtonFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCSegmentedButton {
    
    @JSImport("@material/segmented-button", "MDCSegmentedButton.attachTo")
    @js.native
    def attachTo(root: Element): typingsSlinky.materialSegmentedButton.componentMod.MDCSegmentedButton = js.native
  }
  
  @JSImport("@material/segmented-button", "MDCSegmentedButtonFoundation")
  @js.native
  class MDCSegmentedButtonFoundation ()
    extends typingsSlinky.materialSegmentedButton.indexMod.MDCSegmentedButtonFoundation {
    def this(adapter: PartialMDCSegmentedButton) = this()
  }
  
  @JSImport("@material/segmented-button", "MDCSegmentedButtonSegment")
  @js.native
  class MDCSegmentedButtonSegment protected ()
    extends typingsSlinky.materialSegmentedButton.segmentIndexMod.MDCSegmentedButtonSegment {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typingsSlinky.materialSegmentedButton.segmentFoundationMod.MDCSegmentedButtonSegmentFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCSegmentedButtonSegment {
    
    @JSImport("@material/segmented-button", "MDCSegmentedButtonSegment.attachTo")
    @js.native
    def attachTo(root: Element): typingsSlinky.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegment = js.native
  }
  
  @JSImport("@material/segmented-button", "MDCSegmentedButtonSegmentFoundation")
  @js.native
  class MDCSegmentedButtonSegmentFoundation ()
    extends typingsSlinky.materialSegmentedButton.segmentIndexMod.MDCSegmentedButtonSegmentFoundation {
    def this(adapter: PartialMDCSegmentedButtonAddClass) = this()
  }
}
