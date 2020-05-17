package typingsSlinky.aliOss.anon

import typingsSlinky.aliOss.mod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Acl extends js.Object {
  var acl: String = js.native
  var res: NormalSuccessResponse = js.native
}

object Acl {
  @scala.inline
  def apply(acl: String, res: NormalSuccessResponse): Acl = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acl]
  }
  @scala.inline
  implicit class AclOps[Self <: Acl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRes(value: NormalSuccessResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

