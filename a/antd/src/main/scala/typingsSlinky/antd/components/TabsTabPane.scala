package typingsSlinky.antd.components

import typingsSlinky.antd.tabsMod.TabPaneProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabsTabPane {
  @JSImport("antd", "Tabs.TabPane")
  @js.native
  object component extends js.Object
  
  def withProps(p: TabPaneProps): SharedBuilder_TabPaneProps_266265111 = new SharedBuilder_TabPaneProps_266265111(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TabsTabPane.type): SharedBuilder_TabPaneProps_266265111 = new SharedBuilder_TabPaneProps_266265111(js.Array(this.component, js.Dictionary.empty))()
}

