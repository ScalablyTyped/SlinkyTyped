package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materialLinearProgress.adapterMod.MDCLinearProgressAdapter
import typingsSlinky.materialLinearProgress.anon.ARIAVALUENOW
import typingsSlinky.materialLinearProgress.anon.CLOSEDCLASS
import typingsSlinky.materialLinearProgress.anon.PartialMDCLinearProgressA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-components-web", "linearProgress")
@js.native
object linearProgress extends js.Object {
  
  @js.native
  class MDCLinearProgress ()
    extends typingsSlinky.materialLinearProgress.mod.MDCLinearProgress
  /* static members */
  @js.native
  object MDCLinearProgress extends js.Object {
    
    def attachTo(root: Element): typingsSlinky.materialLinearProgress.componentMod.MDCLinearProgress = js.native
  }
  
  @js.native
  class MDCLinearProgressFoundation ()
    extends typingsSlinky.materialLinearProgress.mod.MDCLinearProgressFoundation {
    def this(adapter: PartialMDCLinearProgressA) = this()
  }
  /* static members */
  @js.native
  object MDCLinearProgressFoundation extends js.Object {
    
    def cssClasses: CLOSEDCLASS = js.native
    
    def defaultAdapter: MDCLinearProgressAdapter = js.native
    
    def strings: ARIAVALUENOW = js.native
  }
  
  @js.native
  object cssClasses extends js.Object {
    
    var CLOSED_CLASS: String = js.native
    
    var INDETERMINATE_CLASS: String = js.native
    
    var REVERSED_CLASS: String = js.native
  }
  
  @js.native
  object strings extends js.Object {
    
    var ARIA_VALUENOW: String = js.native
    
    var BUFFER_BAR_SELECTOR: String = js.native
    
    var FLEX_BASIS: String = js.native
    
    var PRIMARY_BAR_SELECTOR: String = js.native
  }
}
