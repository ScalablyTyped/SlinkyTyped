package typingsSlinky.reactMdTabs.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMdTabs.tabsManagerMod.TabsManagerProps
import typingsSlinky.reactMdTabs.typesMod.TabConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabsManager {
  @JSImport("@react-md/tabs", "TabsManager")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def activeIndex(value: Double): this.type = set("activeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultActiveIndex(value: Double): this.type = set("defaultActiveIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def iconAfter(value: Boolean): this.type = set("iconAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def onActiveIndexChange(value: /* activeIndex */ Double => Unit): this.type = set("onActiveIndexChange", js.Any.fromFunction1(value))
    @scala.inline
    def stacked(value: Boolean): this.type = set("stacked", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabsManagerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(tabs: js.Array[TabConfig | ReactElement | String], tabsId: String): Builder = {
    val __props = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any], tabsId = tabsId.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabsManagerProps]))
  }
}

