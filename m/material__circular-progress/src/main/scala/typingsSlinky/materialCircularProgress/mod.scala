package typingsSlinky.materialCircularProgress

import org.scalajs.dom.raw.Element
import typingsSlinky.materialCircularProgress.adapterMod.MDCCircularProgressAdapter
import typingsSlinky.materialCircularProgress.anon.ARIAVALUENOW
import typingsSlinky.materialCircularProgress.anon.CLOSEDCLASS
import typingsSlinky.materialCircularProgress.anon.PartialMDCCircularProgres
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/circular-progress", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class MDCCircularProgress ()
    extends typingsSlinky.materialCircularProgress.componentMod.MDCCircularProgress
  /* static members */
  @js.native
  object MDCCircularProgress extends js.Object {
    
    def attachTo(root: Element): typingsSlinky.materialCircularProgress.componentMod.MDCCircularProgress = js.native
  }
  
  @js.native
  class MDCCircularProgressFoundation ()
    extends typingsSlinky.materialCircularProgress.foundationMod.MDCCircularProgressFoundation {
    def this(adapter: PartialMDCCircularProgres) = this()
  }
  /* static members */
  @js.native
  object MDCCircularProgressFoundation extends js.Object {
    
    def cssClasses: CLOSEDCLASS = js.native
    
    def defaultAdapter: MDCCircularProgressAdapter = js.native
    
    def strings: ARIAVALUENOW = js.native
  }
  
  @js.native
  object cssClasses extends js.Object {
    
    var CLOSED_CLASS: String = js.native
    
    var INDETERMINATE_CLASS: String = js.native
  }
  
  @js.native
  object strings extends js.Object {
    
    var ARIA_VALUENOW: String = js.native
    
    var DETERMINATE_CIRCLE_SELECTOR: String = js.native
    
    var RADIUS: String = js.native
    
    var STROKE_DASHOFFSET: String = js.native
  }
}
