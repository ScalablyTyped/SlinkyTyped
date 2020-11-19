package typingsSlinky.rcTabs.components

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.rcTabs.tabPaneMod.TabPaneProps
import typingsSlinky.rcTabs.tabsMod.TabsProps
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcTabs {
  
  @JSImport("rc-tabs", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TabsProps with RefAttributes[HTMLDivElement]): SharedBuilder_TabsPropsRefAttributes723977252[HTMLDivElement] = new SharedBuilder_TabsPropsRefAttributes723977252[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RcTabs.type): SharedBuilder_TabsPropsRefAttributes723977252[HTMLDivElement] = new SharedBuilder_TabsPropsRefAttributes723977252[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  object TabPane {
    
    @JSImport("rc-tabs", "default.TabPane")
    @js.native
    object component extends js.Object
    
    def withProps(
      p: /* hasPrefixClsForceRenderClassNameStyleIdActiveAnimatedDestroyInactiveTabPaneTabKeyChildren */ TabPaneProps
    ): SharedBuilder_TabPaneProps_1241005094 = new SharedBuilder_TabPaneProps_1241005094(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: TabPane.type): SharedBuilder_TabPaneProps_1241005094 = new SharedBuilder_TabPaneProps_1241005094(js.Array(this.component, js.Dictionary.empty))()
  }
}
