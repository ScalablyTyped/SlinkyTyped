package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsCheckAccountIsAssociatedWithAnyParams extends js.Object {
  var account_id: Double = js.native
}

object AppsCheckAccountIsAssociatedWithAnyParams {
  @scala.inline
  def apply(account_id: Double): AppsCheckAccountIsAssociatedWithAnyParams = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCheckAccountIsAssociatedWithAnyParams]
  }
  @scala.inline
  implicit class AppsCheckAccountIsAssociatedWithAnyParamsOps[Self <: AppsCheckAccountIsAssociatedWithAnyParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

