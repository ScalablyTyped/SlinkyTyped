package typingsSlinky.rcTabs.components

import typingsSlinky.rcTabs.tabPaneMod.TabPaneProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabPane {
  
  @JSImport("rc-tabs", "TabPane")
  @js.native
  object component extends js.Object
  
  def withProps(
    p: /* hasPrefixClsForceRenderClassNameStyleIdActiveAnimatedDestroyInactiveTabPaneTabKeyChildren */ TabPaneProps
  ): SharedBuilder_TabPaneProps_1241005094 = new SharedBuilder_TabPaneProps_1241005094(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TabPane.type): SharedBuilder_TabPaneProps_1241005094 = new SharedBuilder_TabPaneProps_1241005094(js.Array(this.component, js.Dictionary.empty))()
}
