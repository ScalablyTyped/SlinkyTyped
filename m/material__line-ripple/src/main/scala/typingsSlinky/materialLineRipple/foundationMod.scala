package typingsSlinky.materialLineRipple

import org.scalajs.dom.raw.TransitionEvent
import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialLineRipple.adapterMod.MDCLineRippleAdapter
import typingsSlinky.materialLineRipple.anon.LINERIPPLEACTIVE
import typingsSlinky.materialLineRipple.anon.PartialMDCLineRippleAdapt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/line-ripple/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class MDCLineRippleFoundation () extends MDCFoundation[MDCLineRippleAdapter] {
    def this(adapter: PartialMDCLineRippleAdapt) = this()
    def activate(): Unit = js.native
    def deactivate(): Unit = js.native
    def handleTransitionEnd(evt: TransitionEvent): Unit = js.native
    def setRippleCenter(xCoordinate: Double): Unit = js.native
  }
  
  @js.native
  class default () extends MDCLineRippleFoundation {
    def this(adapter: PartialMDCLineRippleAdapt) = this()
  }
  
  /* static members */
  @js.native
  object MDCLineRippleFoundation extends js.Object {
    def cssClasses: LINERIPPLEACTIVE = js.native
    /**
      * See {@link MDCLineRippleAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCLineRippleAdapter = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def cssClasses: LINERIPPLEACTIVE = js.native
    /**
      * See {@link MDCLineRippleAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCLineRippleAdapter = js.native
  }
  
}

