package typingsSlinky.antd.components

import typingsSlinky.antd.tabsMod.TabsProps
import typingsSlinky.antd.tabsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tabs {
  @JSImport("antd/lib/tabs", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TabsProps): SharedBuilder_TabsProps2061107023[default] = new SharedBuilder_TabsProps2061107023[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Tabs.type): SharedBuilder_TabsProps2061107023[default] = new SharedBuilder_TabsProps2061107023[default](js.Array(this.component, js.Dictionary.empty))()
}

