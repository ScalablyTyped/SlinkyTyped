package typingsSlinky.antd.components

import typingsSlinky.antd.tabBarMod.default
import typingsSlinky.antd.tabsMod.TabsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabBar {
  @JSImport("antd/lib/tabs/TabBar", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TabsProps): SharedBuilder_TabsProps2061107023[default] = new SharedBuilder_TabsProps2061107023[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TabBar.type): SharedBuilder_TabsProps2061107023[default] = new SharedBuilder_TabsProps2061107023[default](js.Array(this.component, js.Dictionary.empty))()
}

