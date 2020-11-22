package typingsSlinky.materialGridList

import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialGridList.adapterMod.MDCGridListAdapter
import typingsSlinky.materialGridList.anon.PartialMDCGridListAdapter
import typingsSlinky.materialGridList.anon.TILESELECTOR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/grid-list/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  
  @js.native
  class MDCGridListFoundation () extends MDCFoundation[MDCGridListAdapter] {
    def this(adapter: PartialMDCGridListAdapter) = this()
    
    def alignCenter(): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCGridListFoundation extends js.Object {
    
    val defaultAdapter: MDCGridListAdapter = js.native
    
    val strings: TILESELECTOR = js.native
  }
  
  @js.native
  class default () extends MDCGridListFoundation {
    def this(adapter: PartialMDCGridListAdapter) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    val defaultAdapter: MDCGridListAdapter = js.native
    
    val strings: TILESELECTOR = js.native
  }
}
