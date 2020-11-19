package typingsSlinky.materialLineRipple

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialLineRipple.foundationMod.MDCLineRippleFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/line-ripple/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  
  @js.native
  class MDCLineRipple () extends MDCComponent[MDCLineRippleFoundation] {
    
    /**
      * Activates the line ripple
      */
    def activate(): Unit = js.native
    
    /**
      * Deactivates the line ripple
      */
    def deactivate(): Unit = js.native
    
    /**
      * Sets the transform origin given a user's click location.
      * The `rippleCenter` is the x-coordinate of the middle of the ripple.
      */
    def setRippleCenter(xCoordinate: Double): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCLineRipple extends js.Object {
    
    def attachTo(root: Element): MDCLineRipple = js.native
  }
  
  type MDCLineRippleFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCLineRippleFoundation], 
    MDCLineRipple
  ]
}
