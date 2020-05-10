package typingsSlinky.easyRbac

import typingsSlinky.easyRbac.mod.RoleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCan extends js.Object {
  var can: js.Array[String | RoleObject] = js.native
  var inherits: js.UndefOr[js.Array[String]] = js.native
}

object AnonCan {
  @scala.inline
  def apply(can: js.Array[String | RoleObject]): AnonCan = {
    val __obj = js.Dynamic.literal(can = can.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCan]
  }
  @scala.inline
  implicit class AnonCanOps[Self <: AnonCan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCan(value: js.Array[String | RoleObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInherits(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInherits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherits")(js.undefined)
        ret
    }
  }
  
}

