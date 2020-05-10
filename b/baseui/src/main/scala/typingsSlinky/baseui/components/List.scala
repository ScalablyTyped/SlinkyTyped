package typingsSlinky.baseui.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.AnonOldIndex
import typingsSlinky.baseui.dndListMod.ListOverrides
import typingsSlinky.baseui.dndListMod.ListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object List {
  @JSImport("baseui/dnd-list", "List")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.dndListMod.List] {
    @scala.inline
    def items(value: js.Array[TagMod[Any]]): this.type = set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* args */ AnonOldIndex => _): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def overrides(value: ListOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def removable(value: Boolean): this.type = set("removable", value.asInstanceOf[js.Any])
    @scala.inline
    def removableByMove(value: Boolean): this.type = set("removableByMove", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: List.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

