package typingsSlinky.materialRipple

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.EventTarget
import typingsSlinky.materialBase.typesMod.EventType
import typingsSlinky.materialBase.typesMod.SpecificEventListener
import typingsSlinky.materialRipple.materialRippleStrings.resize
import typingsSlinky.materialRipple.typesMod.MDCRipplePoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/ripple/adapter", JSImport.Namespace)
@js.native
object adapterMod extends js.Object {
  
  @js.native
  trait MDCRippleAdapter extends js.Object {
    
    def addClass(className: String): Unit = js.native
    
    def browserSupportsCssVars(): Boolean = js.native
    
    def computeBoundingRect(): ClientRect = js.native
    
    def containsEventTarget(): Boolean = js.native
    def containsEventTarget(target: EventTarget): Boolean = js.native
    
    def deregisterDocumentInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
    
    def deregisterInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
    
    @JSName("deregisterResizeHandler")
    def deregisterResizeHandler_resize(handler: SpecificEventListener[resize]): Unit = js.native
    
    def getWindowPageOffset(): MDCRipplePoint = js.native
    
    def isSurfaceActive(): Boolean = js.native
    
    def isSurfaceDisabled(): Boolean = js.native
    
    def isUnbounded(): Boolean = js.native
    
    def registerDocumentInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
    
    def registerInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
    
    @JSName("registerResizeHandler")
    def registerResizeHandler_resize(handler: SpecificEventListener[resize]): Unit = js.native
    
    def removeClass(className: String): Unit = js.native
    
    def updateCssVariable(varName: String): Unit = js.native
    def updateCssVariable(varName: String, value: String): Unit = js.native
  }
}
