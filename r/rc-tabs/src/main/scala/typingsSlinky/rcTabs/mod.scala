package typingsSlinky.rcTabs

import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import typingsSlinky.rcTabs.tabPaneMod.TabPaneProps
import typingsSlinky.rcTabs.tabsMod.ForwardTabsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-tabs", JSImport.Default)
  @js.native
  val default: ForwardTabsType = js.native
  
  @JSImport("rc-tabs", "TabPane")
  @js.native
  def TabPane(
    hasPrefixClsForceRenderClassNameStyleIdActiveAnimatedDestroyInactiveTabPaneTabKeyChildren: TabPaneProps
  ): ReactElement = js.native
  
  type _To = ForwardTabsType
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ForwardTabsType = default
}
