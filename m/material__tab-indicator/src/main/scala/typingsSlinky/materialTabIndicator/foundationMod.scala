package typingsSlinky.materialTabIndicator

import org.scalajs.dom.raw.ClientRect
import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialTabIndicator.adapterMod.MDCTabIndicatorAdapter
import typingsSlinky.materialTabIndicator.anon.ACTIVE
import typingsSlinky.materialTabIndicator.anon.CONTENTSELECTOR
import typingsSlinky.materialTabIndicator.anon.PartialMDCTabIndicatorAda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/tab-indicator/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  
  @js.native
  abstract class MDCTabIndicatorFoundation () extends MDCFoundation[MDCTabIndicatorAdapter] {
    def this(adapter: PartialMDCTabIndicatorAda) = this()
    
    def activate(): Unit = js.native
    def activate(previousIndicatorClientRect: ClientRect): Unit = js.native
    
    def computeContentClientRect(): ClientRect = js.native
    
    def deactivate(): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCTabIndicatorFoundation extends js.Object {
    
    def cssClasses: ACTIVE = js.native
    
    def defaultAdapter: MDCTabIndicatorAdapter = js.native
    
    def strings: CONTENTSELECTOR = js.native
  }
  
  @js.native
  abstract class default () extends MDCTabIndicatorFoundation {
    def this(adapter: PartialMDCTabIndicatorAda) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def cssClasses: ACTIVE = js.native
    
    def defaultAdapter: MDCTabIndicatorAdapter = js.native
    
    def strings: CONTENTSELECTOR = js.native
  }
}
