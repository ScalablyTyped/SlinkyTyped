package typingsSlinky.materialGridList

import org.scalajs.dom.raw.Element
import typingsSlinky.materialGridList.adapterMod.MDCGridListAdapter
import typingsSlinky.materialGridList.anon.PartialMDCGridListAdapter
import typingsSlinky.materialGridList.anon.TILESELECTOR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/grid-list", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class MDCGridList ()
    extends typingsSlinky.materialGridList.componentMod.MDCGridList
  /* static members */
  @js.native
  object MDCGridList extends js.Object {
    
    def attachTo(root: Element): typingsSlinky.materialGridList.componentMod.MDCGridList = js.native
  }
  
  @js.native
  class MDCGridListFoundation ()
    extends typingsSlinky.materialGridList.foundationMod.MDCGridListFoundation {
    def this(adapter: PartialMDCGridListAdapter) = this()
  }
  /* static members */
  @js.native
  object MDCGridListFoundation extends js.Object {
    
    val defaultAdapter: MDCGridListAdapter = js.native
    
    val strings: TILESELECTOR = js.native
  }
  
  @js.native
  object strings extends js.Object {
    
    var TILES_SELECTOR: String = js.native
    
    var TILE_SELECTOR: String = js.native
  }
}
