package typingsSlinky.materialGridList

import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialGridList.adapterMod.MDCGridListAdapter
import typingsSlinky.materialGridList.anon.PartialMDCGridListAdapter
import typingsSlinky.materialGridList.anon.TILESELECTOR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/grid-list/foundation", JSImport.Default)
  @js.native
  class default () extends MDCGridListFoundation {
    def this(adapter: PartialMDCGridListAdapter) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@material/grid-list/foundation", "default.defaultAdapter")
    @js.native
    val defaultAdapter: MDCGridListAdapter = js.native
    
    @JSImport("@material/grid-list/foundation", "default.strings")
    @js.native
    val strings: TILESELECTOR = js.native
  }
  
  @JSImport("@material/grid-list/foundation", "MDCGridListFoundation")
  @js.native
  class MDCGridListFoundation () extends MDCFoundation[MDCGridListAdapter] {
    def this(adapter: PartialMDCGridListAdapter) = this()
    
    def alignCenter(): Unit = js.native
  }
  /* static members */
  object MDCGridListFoundation {
    
    @JSImport("@material/grid-list/foundation", "MDCGridListFoundation.defaultAdapter")
    @js.native
    val defaultAdapter: MDCGridListAdapter = js.native
    
    @JSImport("@material/grid-list/foundation", "MDCGridListFoundation.strings")
    @js.native
    val strings: TILESELECTOR = js.native
  }
}
