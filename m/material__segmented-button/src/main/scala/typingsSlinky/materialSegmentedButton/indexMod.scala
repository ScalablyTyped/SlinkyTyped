package typingsSlinky.materialSegmentedButton

import org.scalajs.dom.raw.Element
import typingsSlinky.materialSegmentedButton.anon.PartialMDCSegmentedButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexMod {
  
  @JSImport("@material/segmented-button/segmented-button/index", "MDCSegmentedButton")
  @js.native
  class MDCSegmentedButton protected ()
    extends typingsSlinky.materialSegmentedButton.componentMod.MDCSegmentedButton {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typingsSlinky.materialSegmentedButton.foundationMod.MDCSegmentedButtonFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCSegmentedButton {
    
    @JSImport("@material/segmented-button/segmented-button/index", "MDCSegmentedButton.attachTo")
    @js.native
    def attachTo(root: Element): typingsSlinky.materialSegmentedButton.componentMod.MDCSegmentedButton = js.native
  }
  
  @JSImport("@material/segmented-button/segmented-button/index", "MDCSegmentedButtonFoundation")
  @js.native
  class MDCSegmentedButtonFoundation ()
    extends typingsSlinky.materialSegmentedButton.foundationMod.MDCSegmentedButtonFoundation {
    def this(adapter: PartialMDCSegmentedButton) = this()
  }
}
