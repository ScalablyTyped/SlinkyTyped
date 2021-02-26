package typingsSlinky.materialLineRipple

import org.scalajs.dom.raw.TransitionEvent
import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialLineRipple.adapterMod.MDCLineRippleAdapter
import typingsSlinky.materialLineRipple.anon.PartialMDCLineRippleAdapt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/line-ripple/foundation", JSImport.Default)
  @js.native
  class default () extends MDCLineRippleFoundation {
    def this(adapter: PartialMDCLineRippleAdapt) = this()
  }
  
  @JSImport("@material/line-ripple/foundation", "MDCLineRippleFoundation")
  @js.native
  class MDCLineRippleFoundation () extends MDCFoundation[MDCLineRippleAdapter] {
    def this(adapter: PartialMDCLineRippleAdapt) = this()
    
    def activate(): Unit = js.native
    
    def deactivate(): Unit = js.native
    
    def handleTransitionEnd(evt: TransitionEvent): Unit = js.native
    
    def setRippleCenter(xCoordinate: Double): Unit = js.native
  }
}
