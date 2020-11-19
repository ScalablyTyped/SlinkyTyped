package typingsSlinky.materialRipple

import org.scalajs.dom.raw.Event
import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialRipple.adapterMod.MDCRippleAdapter
import typingsSlinky.materialRipple.anon.BGFOCUSED
import typingsSlinky.materialRipple.anon.DEACTIVATIONTIMEOUTMS
import typingsSlinky.materialRipple.anon.PartialMDCRippleAdapter
import typingsSlinky.materialRipple.anon.VARFGSCALE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/ripple/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  
  @js.native
  class MDCRippleFoundation () extends MDCFoundation[MDCRippleAdapter] {
    def this(adapter: PartialMDCRippleAdapter) = this()
    
    /**
      * @param evt Optional event containing position information.
      */
    def activate(): Unit = js.native
    def activate(evt: Event): Unit = js.native
    
    def deactivate(): Unit = js.native
    
    def handleBlur(): Unit = js.native
    
    def handleFocus(): Unit = js.native
    
    def layout(): Unit = js.native
    
    def setUnbounded(unbounded: Boolean): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCRippleFoundation extends js.Object {
    
    def cssClasses: BGFOCUSED = js.native
    
    def defaultAdapter: MDCRippleAdapter = js.native
    
    def numbers: DEACTIVATIONTIMEOUTMS = js.native
    
    def strings: VARFGSCALE = js.native
  }
  
  @js.native
  class default () extends MDCRippleFoundation {
    def this(adapter: PartialMDCRippleAdapter) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def cssClasses: BGFOCUSED = js.native
    
    def defaultAdapter: MDCRippleAdapter = js.native
    
    def numbers: DEACTIVATIONTIMEOUTMS = js.native
    
    def strings: VARFGSCALE = js.native
  }
}
