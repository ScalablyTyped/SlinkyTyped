package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materialSegmentedButton.anon.PartialMDCSegmentedButton
import typingsSlinky.materialSegmentedButton.anon.PartialMDCSegmentedButtonAddClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentedButton {
  
  @JSImport("material-components-web", "segmentedButton.MDCSegmentedButton")
  @js.native
  class MDCSegmentedButton protected ()
    extends typingsSlinky.materialSegmentedButton.mod.MDCSegmentedButton {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typingsSlinky.materialSegmentedButton.foundationMod.MDCSegmentedButtonFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCSegmentedButton {
    
    @JSImport("material-components-web", "segmentedButton.MDCSegmentedButton.attachTo")
    @js.native
    def attachTo(root: Element): typingsSlinky.materialSegmentedButton.componentMod.MDCSegmentedButton = js.native
  }
  
  @JSImport("material-components-web", "segmentedButton.MDCSegmentedButtonFoundation")
  @js.native
  class MDCSegmentedButtonFoundation ()
    extends typingsSlinky.materialSegmentedButton.mod.MDCSegmentedButtonFoundation {
    def this(adapter: PartialMDCSegmentedButton) = this()
  }
  
  @JSImport("material-components-web", "segmentedButton.MDCSegmentedButtonSegment")
  @js.native
  class MDCSegmentedButtonSegment protected ()
    extends typingsSlinky.materialSegmentedButton.mod.MDCSegmentedButtonSegment {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typingsSlinky.materialSegmentedButton.segmentFoundationMod.MDCSegmentedButtonSegmentFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCSegmentedButtonSegment {
    
    @JSImport("material-components-web", "segmentedButton.MDCSegmentedButtonSegment.attachTo")
    @js.native
    def attachTo(root: Element): typingsSlinky.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegment = js.native
  }
  
  @JSImport("material-components-web", "segmentedButton.MDCSegmentedButtonSegmentFoundation")
  @js.native
  class MDCSegmentedButtonSegmentFoundation ()
    extends typingsSlinky.materialSegmentedButton.mod.MDCSegmentedButtonSegmentFoundation {
    def this(adapter: PartialMDCSegmentedButtonAddClass) = this()
  }
}
