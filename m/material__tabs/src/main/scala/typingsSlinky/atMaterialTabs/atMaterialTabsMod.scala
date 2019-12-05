package typingsSlinky.atMaterialTabs

import org.scalajs.dom.raw.Element
import typingsSlinky.atMaterialTabs.tabAdapterMod.MDCTabAdapter
import typingsSlinky.atMaterialTabs.tabDashBarAdapterMod.MDCTabBarAdapter
import typingsSlinky.atMaterialTabs.tabDashBarDashScrollerAdapterMod.MDCTabBarScrollerAdapter
import typingsSlinky.atMaterialTabs.tabDashBarFoundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tabs", JSImport.Namespace)
@js.native
object atMaterialTabsMod extends js.Object {
  @js.native
  class MDCTab ()
    extends typingsSlinky.atMaterialTabs.tabMod.MDCTab
  
  @js.native
  class MDCTabBar ()
    extends typingsSlinky.atMaterialTabs.tabDashBarMod.MDCTabBar
  
  @js.native
  class MDCTabBarFoundation () extends default
  
  @js.native
  class MDCTabBarScroller ()
    extends typingsSlinky.atMaterialTabs.tabDashBarDashScrollerMod.MDCTabBarScroller
  
  @js.native
  class MDCTabBarScrollerFoundation ()
    extends typingsSlinky.atMaterialTabs.tabDashBarDashScrollerFoundationMod.default
  
  @js.native
  class MDCTabFoundation ()
    extends typingsSlinky.atMaterialTabs.tabFoundationMod.default
  
  /* static members */
  @js.native
  object MDCTab extends js.Object {
    def attachTo(root: Element): typingsSlinky.atMaterialTabs.tabMod.MDCTab = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabBar extends js.Object {
    def attachTo(root: Element): typingsSlinky.atMaterialTabs.tabDashBarMod.MDCTabBar = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabBarFoundation extends js.Object {
    val cssClasses: typingsSlinky.atMaterialTabs.tabDashBarConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabBarAdapter = js.native
    val strings: typingsSlinky.atMaterialTabs.tabDashBarConstantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabBarScroller extends js.Object {
    def attachTo(root: Element): typingsSlinky.atMaterialTabs.tabDashBarDashScrollerMod.MDCTabBarScroller = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabBarScrollerFoundation extends js.Object {
    val cssClasses: typingsSlinky.atMaterialTabs.tabDashBarDashScrollerConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabBarScrollerAdapter = js.native
    val strings: typingsSlinky.atMaterialTabs.tabDashBarDashScrollerConstantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabFoundation extends js.Object {
    val cssClasses: typingsSlinky.atMaterialTabs.tabConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabAdapter = js.native
    val strings: typingsSlinky.atMaterialTabs.tabConstantsMod.strings = js.native
  }
  
}

