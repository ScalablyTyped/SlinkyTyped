package typingsSlinky.antdMobileRn.components

import typingsSlinky.antdMobileRn.tabBarPropsTypeMod.TabBarProps
import typingsSlinky.antdMobileRn.tabbarIosMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabbarDotios {
  @JSImport("antd-mobile-rn/lib/tab-bar/tabbar.ios", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TabBarProps): SharedBuilder_TabBarProps_1168634556[default] = new SharedBuilder_TabBarProps_1168634556[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TabbarDotios.type): SharedBuilder_TabBarProps_1168634556[default] = new SharedBuilder_TabBarProps_1168634556[default](js.Array(this.component, js.Dictionary.empty))()
}

