package typingsSlinky.antd.components

import typingsSlinky.antd.tabsMod.TabPaneProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabPane {
  @JSImport("antd/lib/tabs", "default.TabPane")
  @js.native
  object component extends js.Object
  
  def withProps(p: TabPaneProps): SharedBuilder_TabPaneProps_266265111 = new SharedBuilder_TabPaneProps_266265111(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TabPane.type): SharedBuilder_TabPaneProps_266265111 = new SharedBuilder_TabPaneProps_266265111(js.Array(this.component, js.Dictionary.empty))()
}

