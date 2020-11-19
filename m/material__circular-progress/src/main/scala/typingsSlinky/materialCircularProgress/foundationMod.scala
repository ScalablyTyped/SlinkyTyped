package typingsSlinky.materialCircularProgress

import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialCircularProgress.adapterMod.MDCCircularProgressAdapter
import typingsSlinky.materialCircularProgress.anon.ARIAVALUENOW
import typingsSlinky.materialCircularProgress.anon.CLOSEDCLASS
import typingsSlinky.materialCircularProgress.anon.PartialMDCCircularProgres
import typingsSlinky.materialProgressIndicator.foundationMod.MDCProgressIndicatorFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/circular-progress/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  
  @js.native
  class MDCCircularProgressFoundation ()
    extends MDCFoundation[MDCCircularProgressAdapter]
       with MDCProgressIndicatorFoundation {
    def this(adapter: PartialMDCCircularProgres) = this()
    
    def getProgress(): Double = js.native
    
    /**
      * @return Returns whether the progress indicator is hidden.
      */
    def isClosed(): Boolean = js.native
    
    def isDeterminate(): Boolean = js.native
  }
  /* static members */
  @js.native
  object MDCCircularProgressFoundation extends js.Object {
    
    def cssClasses: CLOSEDCLASS = js.native
    
    def defaultAdapter: MDCCircularProgressAdapter = js.native
    
    def strings: ARIAVALUENOW = js.native
  }
  
  @js.native
  class default () extends MDCCircularProgressFoundation {
    def this(adapter: PartialMDCCircularProgres) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def cssClasses: CLOSEDCLASS = js.native
    
    def defaultAdapter: MDCCircularProgressAdapter = js.native
    
    def strings: ARIAVALUENOW = js.native
  }
}
