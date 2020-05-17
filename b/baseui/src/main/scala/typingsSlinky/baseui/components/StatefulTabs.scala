package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.ActiveKey
import typingsSlinky.baseui.anon.SharedPropsactiveboolean
import typingsSlinky.baseui.baseuiStrings.change_
import typingsSlinky.baseui.baseuiStrings.horizontal
import typingsSlinky.baseui.baseuiStrings.vertical
import typingsSlinky.baseui.tabsMod.State
import typingsSlinky.baseui.tabsMod.StatefulTabsProps
import typingsSlinky.baseui.tabsMod.TabsOverrides
import typingsSlinky.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulTabs {
  @JSImport("baseui/tabs", "StatefulTabs")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.tabsMod.StatefulTabs] {
    @scala.inline
    def activeKey(value: Key): this.type = set("activeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def initialState(value: State): this.type = set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* args */ ActiveKey => _): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def orientation(value: horizontal | vertical): this.type = set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def overrides(value: TabsOverrides[SharedPropsactiveboolean]): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def renderAll(value: Boolean): this.type = set("renderAll", value.asInstanceOf[js.Any])
    @scala.inline
    def stateReducer(value: (change_, /* nextState */ State, /* currentState */ State) => State): this.type = set("stateReducer", js.Any.fromFunction3(value))
  }
  
  def withProps(p: StatefulTabsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: StatefulTabs.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

