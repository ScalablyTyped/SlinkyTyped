package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.AnonActiveKey
import typingsSlinky.baseui.SharedPropsactiveboolean
import typingsSlinky.baseui.baseuiStrings.horizontal
import typingsSlinky.baseui.baseuiStrings.vertical
import typingsSlinky.baseui.tabsMod.TabsOverrides
import typingsSlinky.baseui.tabsMod.TabsProps
import typingsSlinky.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tabs {
  @JSImport("baseui/tabs", "Tabs")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def activeKey(value: Key): this.type = set("activeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* args */ AnonActiveKey => _): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def orientation(value: horizontal | vertical): this.type = set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def overrides(value: TabsOverrides[SharedPropsactiveboolean]): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def renderAll(value: Boolean): this.type = set("renderAll", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Tabs.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

