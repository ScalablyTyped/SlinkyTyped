package typingsSlinky.rcTabs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTabs.interfaceMod.AnimatedConfig
import typingsSlinky.rcTabs.interfaceMod.TabPosition
import typingsSlinky.rcTabs.tabPanelListMod.TabPanelListProps
import typingsSlinky.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabPanelList {
  @JSImport("rc-tabs/es/TabPanelList", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def animated(value: AnimatedConfig): this.type = set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def destroyInactiveTabPane(value: Boolean): this.type = set("destroyInactiveTabPane", value.asInstanceOf[js.Any])
    @scala.inline
    def tabPosition(value: TabPosition): this.type = set("tabPosition", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabPanelListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(activeKey: Key, id: String, rtl: Boolean): Builder = {
    val __props = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabPanelListProps]))
  }
}

