package typingsSlinky.aliOss.anon

import typingsSlinky.aliOss.mod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowEmpty extends js.Object {
  var allowEmpty: Boolean = js.native
  var referers: js.Array[String] = js.native
  var res: NormalSuccessResponse = js.native
}

object AllowEmpty {
  @scala.inline
  def apply(allowEmpty: Boolean, referers: js.Array[String], res: NormalSuccessResponse): AllowEmpty = {
    val __obj = js.Dynamic.literal(allowEmpty = allowEmpty.asInstanceOf[js.Any], referers = referers.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowEmpty]
  }
  @scala.inline
  implicit class AllowEmptyOps[Self <: AllowEmpty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referers")(value.asInstanceOf[js.Any])
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

