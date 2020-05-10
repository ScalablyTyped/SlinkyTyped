package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.antdStrings.multiple
import typingsSlinky.antd.antdStrings.tags
import typingsSlinky.antd.selectMod.SelectProps
import typingsSlinky.antd.selectMod.SelectValue
import typingsSlinky.antd.selectMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Select {
  @JSImport("antd/lib/select", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[ValueType <: SelectValue] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[js.Any]] {
    @scala.inline
    def mode(value: multiple | tags): this.type = set("mode", value.asInstanceOf[js.Any])
  }
  
  def withProps[ValueType <: SelectValue](p: SelectProps[ValueType]): Builder[ValueType] = new Builder[ValueType](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[ValueType <: SelectValue](companion: Select.type): Builder[ValueType] = new Builder[ValueType](js.Array(this.component, js.Dictionary.empty))()
}

