package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.a
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.b
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.g
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.hex
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.r
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonComponent extends js.Object {
  var component: a | hex | b | g | r = js.native
  var value: String = js.native
}

object AnonComponent {
  @scala.inline
  def apply(component: a | hex | b | g | r, value: String): AnonComponent = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponent]
  }
  @scala.inline
  implicit class AnonComponentOps[Self <: AnonComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: a | hex | b | g | r): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

