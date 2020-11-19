package typingsSlinky.antdMobileRn.components

import typingsSlinky.antdMobileRn.tabBarPropsTypeMod.TabBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabBar {
  
  @JSImport("antd-mobile-rn", "TabBar")
  @js.native
  object component extends js.Object
  
  def withProps(p: TabBarProps): SharedBuilder_TabBarProps_1168634556[typingsSlinky.antdMobileRn.mod.TabBar] = new SharedBuilder_TabBarProps_1168634556[typingsSlinky.antdMobileRn.mod.TabBar](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TabBar.type): SharedBuilder_TabBarProps_1168634556[typingsSlinky.antdMobileRn.mod.TabBar] = new SharedBuilder_TabBarProps_1168634556[typingsSlinky.antdMobileRn.mod.TabBar](js.Array(this.component, js.Dictionary.empty))()
}
