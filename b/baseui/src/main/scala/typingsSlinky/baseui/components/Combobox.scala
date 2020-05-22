package typingsSlinky.baseui.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.mini
import typingsSlinky.baseui.comboboxMod.PropsT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Combobox {
  @JSImport("baseui/combobox", "Combobox")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def mapOptionToNode(value: /* hasIsSelectedOption */ js.Any => TagMod[Any]): this.type = set("mapOptionToNode", js.Any.fromFunction1(value))
    @scala.inline
    def onChange(value: /* string */ js.Any => _): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def overrides(value: typingsSlinky.baseui.anon.Input): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: compact | default_ | large_ | mini): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsT[js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(mapOptionToString: js.Any => String, options: js.Any, value: String): Builder = {
    val __props = js.Dynamic.literal(mapOptionToString = js.Any.fromFunction1(mapOptionToString), options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropsT[js.Any]]))
  }
}

