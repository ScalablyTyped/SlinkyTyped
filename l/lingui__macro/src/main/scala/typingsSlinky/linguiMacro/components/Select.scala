package typingsSlinky.linguiMacro.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.linguiMacro.mod.Select_
import typingsSlinky.linguiMacro.reactSelectMod.SelectPropsWithoutI18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Select {
  @JSImport("@lingui/macro", "Select")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Select_] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def description(value: String): this.type = set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def other(value: TagMod[Any]): this.type = set("other", value.asInstanceOf[js.Any])
    @scala.inline
    def renderReactElement(value: ReactElement): this.type = set("render", value.asInstanceOf[js.Any])
    @scala.inline
    def render(value: TagMod[Any]): this.type = set("render", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SelectPropsWithoutI18n): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(value: String): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SelectPropsWithoutI18n]))
  }
}

