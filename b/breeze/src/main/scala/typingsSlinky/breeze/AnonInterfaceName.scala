package typingsSlinky.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInterfaceName extends js.Object {
  var interfaceName: String = js.native
  var isDefault: Boolean = js.native
}

object AnonInterfaceName {
  @scala.inline
  def apply(interfaceName: String, isDefault: Boolean): AnonInterfaceName = {
    val __obj = js.Dynamic.literal(interfaceName = interfaceName.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInterfaceName]
  }
  @scala.inline
  implicit class AnonInterfaceNameOps[Self <: AnonInterfaceName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterfaceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

