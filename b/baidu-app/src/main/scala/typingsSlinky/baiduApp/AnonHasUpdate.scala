package typingsSlinky.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHasUpdate extends js.Object {
  var hasUpdate: Boolean = js.native
}

object AnonHasUpdate {
  @scala.inline
  def apply(hasUpdate: Boolean): AnonHasUpdate = {
    val __obj = js.Dynamic.literal(hasUpdate = hasUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHasUpdate]
  }
  @scala.inline
  implicit class AnonHasUpdateOps[Self <: AnonHasUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasUpdate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

