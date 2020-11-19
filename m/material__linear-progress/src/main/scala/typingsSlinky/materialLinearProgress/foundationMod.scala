package typingsSlinky.materialLinearProgress

import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialLinearProgress.adapterMod.MDCLinearProgressAdapter
import typingsSlinky.materialLinearProgress.anon.ARIAVALUENOW
import typingsSlinky.materialLinearProgress.anon.CLOSEDCLASS
import typingsSlinky.materialLinearProgress.anon.PartialMDCLinearProgressA
import typingsSlinky.materialProgressIndicator.foundationMod.MDCProgressIndicatorFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/linear-progress/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  
  @js.native
  class MDCLinearProgressFoundation ()
    extends MDCFoundation[MDCLinearProgressAdapter]
       with MDCProgressIndicatorFoundation {
    def this(adapter: PartialMDCLinearProgressA) = this()
    
    def getDeterminate(): Boolean = js.native
    
    def getProgress(): Double = js.native
    
    def setBuffer(value: Double): Unit = js.native
    
    def setReverse(isReversed: Boolean): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCLinearProgressFoundation extends js.Object {
    
    def cssClasses: CLOSEDCLASS = js.native
    
    def defaultAdapter: MDCLinearProgressAdapter = js.native
    
    def strings: ARIAVALUENOW = js.native
  }
  
  @js.native
  class default () extends MDCLinearProgressFoundation {
    def this(adapter: PartialMDCLinearProgressA) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def cssClasses: CLOSEDCLASS = js.native
    
    def defaultAdapter: MDCLinearProgressAdapter = js.native
    
    def strings: ARIAVALUENOW = js.native
  }
}
