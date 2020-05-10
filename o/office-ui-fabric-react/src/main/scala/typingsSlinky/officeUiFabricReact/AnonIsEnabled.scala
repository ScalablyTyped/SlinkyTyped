package typingsSlinky.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsEnabled extends js.Object {
  var isEnabled: Boolean = js.native
  var rootTagName: String = js.native
}

object AnonIsEnabled {
  @scala.inline
  def apply(isEnabled: Boolean, rootTagName: String): AnonIsEnabled = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], rootTagName = rootTagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsEnabled]
  }
  @scala.inline
  implicit class AnonIsEnabledOps[Self <: AnonIsEnabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootTagName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootTagName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

