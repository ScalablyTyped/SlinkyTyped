package typingsSlinky.materialTabs

import org.scalajs.dom.raw.Element
import typingsSlinky.materialTabs.anon.ACTIVE
import typingsSlinky.materialTabs.anon.PartialMDCTabAdapter
import typingsSlinky.materialTabs.anon.SELECTEDEVENT
import typingsSlinky.materialTabs.tabAdapterMod.MDCTabAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/tabs/tab/index", JSImport.Namespace)
@js.native
object tabIndexMod extends js.Object {
  
  @js.native
  class MDCTab ()
    extends typingsSlinky.materialTabs.tabComponentMod.MDCTab
  /* static members */
  @js.native
  object MDCTab extends js.Object {
    
    def attachTo(root: Element): typingsSlinky.materialTabs.tabComponentMod.MDCTab = js.native
  }
  
  @js.native
  class MDCTabFoundation ()
    extends typingsSlinky.materialTabs.tabFoundationMod.MDCTabFoundation {
    def this(adapter: PartialMDCTabAdapter) = this()
  }
  /* static members */
  @js.native
  object MDCTabFoundation extends js.Object {
    
    val cssClasses: ACTIVE = js.native
    
    val defaultAdapter: MDCTabAdapter = js.native
    
    val strings: SELECTEDEVENT = js.native
  }
  
  @js.native
  object tabCssClasses extends js.Object {
    
    var ACTIVE: String = js.native
  }
  
  @js.native
  object tabStrings extends js.Object {
    
    var SELECTED_EVENT: String = js.native
  }
}
