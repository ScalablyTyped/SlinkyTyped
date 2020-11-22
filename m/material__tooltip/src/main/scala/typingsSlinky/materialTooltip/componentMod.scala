package typingsSlinky.materialTooltip

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialTooltip.anon.XPos
import typingsSlinky.materialTooltip.constantsMod.AnchorBoundaryType
import typingsSlinky.materialTooltip.foundationMod.MDCTooltipFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/tooltip/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  
  @js.native
  class MDCTooltip () extends MDCComponent[MDCTooltipFoundation] {
    
    def setAnchorBoundaryType(`type`: AnchorBoundaryType): Unit = js.native
    
    def setTooltipPosition(position: XPos): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCTooltip extends js.Object {
    
    def attachTo(root: Element): MDCTooltip = js.native
  }
}
