package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.phoneInputMod.FlagProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Flag {
  @JSImport("baseui/phone-input", "Flag")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FlagProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(iso: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any): Builder = {
    val __props = js.Dynamic.literal(iso = iso.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FlagProps]))
  }
}

