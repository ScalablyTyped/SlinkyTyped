package typingsSlinky.antdMobileRn.components

import typingsSlinky.antdMobileRn.tabBarPropsTypeMod.TabBarProps
import typingsSlinky.antdMobileRn.tabbarIosMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabbarDotios {
  
  @JSImport("antd-mobile-rn/lib/tab-bar/tabbar.ios", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TabbarDotios.type): SharedBuilder_TabBarProps_1168634556[default] = new SharedBuilder_TabBarProps_1168634556[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabBarProps): SharedBuilder_TabBarProps_1168634556[default] = new SharedBuilder_TabBarProps_1168634556[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
