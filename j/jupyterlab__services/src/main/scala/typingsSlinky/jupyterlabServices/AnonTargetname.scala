package typingsSlinky.jupyterlabServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTargetname extends js.Object {
  var target_name: String = js.native
}

object AnonTargetname {
  @scala.inline
  def apply(target_name: String): AnonTargetname = {
    val __obj = js.Dynamic.literal(target_name = target_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTargetname]
  }
  @scala.inline
  implicit class AnonTargetnameOps[Self <: AnonTargetname] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

