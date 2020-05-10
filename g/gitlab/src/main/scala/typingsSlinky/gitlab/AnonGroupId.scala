package typingsSlinky.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGroupId extends js.Object {
  var groupId: js.UndefOr[String | Double] = js.native
}

object AnonGroupId {
  @scala.inline
  def apply(): AnonGroupId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonGroupId]
  }
  @scala.inline
  implicit class AnonGroupIdOps[Self <: AnonGroupId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupId(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(js.undefined)
        ret
    }
  }
  
}

