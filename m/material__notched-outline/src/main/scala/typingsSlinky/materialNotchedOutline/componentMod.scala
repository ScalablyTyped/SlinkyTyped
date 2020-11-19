package typingsSlinky.materialNotchedOutline

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialNotchedOutline.foundationMod.MDCNotchedOutlineFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/notched-outline/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  
  @js.native
  class MDCNotchedOutline () extends MDCComponent[MDCNotchedOutlineFoundation] {
    
    /**
      * Updates classes and styles to close the notch.
      */
    def closeNotch(): Unit = js.native
    
    /**
      * Updates classes and styles to open the notch to the specified width.
      * @param notchWidth The notch width in the outline.
      */
    def notch(notchWidth: Double): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCNotchedOutline extends js.Object {
    
    def attachTo(root: Element): MDCNotchedOutline = js.native
  }
  
  type MDCNotchedOutlineFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCNotchedOutlineFoundation], 
    MDCNotchedOutline
  ]
}
