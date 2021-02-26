package typingsSlinky.materialGridList

import org.scalajs.dom.raw.Element
import typingsSlinky.materialGridList.adapterMod.MDCGridListAdapter
import typingsSlinky.materialGridList.anon.PartialMDCGridListAdapter
import typingsSlinky.materialGridList.anon.TILESELECTOR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/grid-list", "MDCGridList")
  @js.native
  class MDCGridList protected ()
    extends typingsSlinky.materialGridList.componentMod.MDCGridList {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typingsSlinky.materialGridList.foundationMod.MDCGridListFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCGridList {
    
    @JSImport("@material/grid-list", "MDCGridList.attachTo")
    @js.native
    def attachTo(root: Element): typingsSlinky.materialGridList.componentMod.MDCGridList = js.native
  }
  
  @JSImport("@material/grid-list", "MDCGridListFoundation")
  @js.native
  class MDCGridListFoundation ()
    extends typingsSlinky.materialGridList.foundationMod.MDCGridListFoundation {
    def this(adapter: PartialMDCGridListAdapter) = this()
  }
  /* static members */
  object MDCGridListFoundation {
    
    @JSImport("@material/grid-list", "MDCGridListFoundation.defaultAdapter")
    @js.native
    val defaultAdapter: MDCGridListAdapter = js.native
    
    @JSImport("@material/grid-list", "MDCGridListFoundation.strings")
    @js.native
    val strings: TILESELECTOR = js.native
  }
  
  object strings {
    
    @JSImport("@material/grid-list", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/grid-list", "strings.TILES_SELECTOR")
    @js.native
    def TILES_SELECTOR: String = js.native
    @scala.inline
    def TILES_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TILES_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/grid-list", "strings.TILE_SELECTOR")
    @js.native
    def TILE_SELECTOR: String = js.native
    @scala.inline
    def TILE_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TILE_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
