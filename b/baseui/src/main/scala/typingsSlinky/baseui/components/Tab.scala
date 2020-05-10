package typingsSlinky.baseui.components

import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.baseuiStrings.horizontal
import typingsSlinky.baseui.baseuiStrings.vertical
import typingsSlinky.baseui.tabsMod.SharedProps
import typingsSlinky.baseui.tabsMod.TabOverrides
import typingsSlinky.baseui.tabsMod.TabProps
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tab {
  @JSImport("baseui/tabs", "Tab")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.tabsMod.Tab] {
    @scala.inline
    def $orientation(value: horizontal | vertical): this.type = set("$orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: /* e */ Event_ => _): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyDown(value: /* e */ KeyboardEvent => _): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def onSelect(value: () => _): this.type = set("onSelect", js.Any.fromFunction0(value))
    @scala.inline
    def overrides(value: TabOverrides[SharedProps]): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: TagMod[Any]): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Tab.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

