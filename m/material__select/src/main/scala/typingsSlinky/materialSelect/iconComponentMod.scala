package typingsSlinky.materialSelect

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialSelect.iconFoundationMod.MDCSelectIconFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconComponentMod {
  
  @JSImport("@material/select/icon/component", "MDCSelectIcon")
  @js.native
  class MDCSelectIcon protected () extends MDCComponent[MDCSelectIconFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCSelectIconFoundation, args: js.Any*) = this()
    
    def foundationForSelect: MDCSelectIconFoundation = js.native
  }
  /* static members */
  object MDCSelectIcon {
    
    @JSImport("@material/select/icon/component", "MDCSelectIcon.attachTo")
    @js.native
    def attachTo(root: Element): MDCSelectIcon = js.native
  }
  
  type MDCSelectIconFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCSelectIconFoundation], 
    MDCSelectIcon
  ]
}
