package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.AnonContent
import typingsSlinky.baseui.tableMod.FilterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Filter {
  @JSImport("baseui/table", "Filter")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def onReset(value: () => _): this.type = set("onReset", js.Any.fromFunction0(value))
    @scala.inline
    def onSelectAll(value: () => _): this.type = set("onSelectAll", js.Any.fromFunction0(value))
    @scala.inline
    def overrides(value: AnonContent): this.type = set("overrides", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FilterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Filter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

