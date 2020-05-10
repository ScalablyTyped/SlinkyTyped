package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsCheckAccountIsAssociatedWithAnyStubbedParams extends js.Object {
  var account_id: Double = js.native
}

object AppsCheckAccountIsAssociatedWithAnyStubbedParams {
  @scala.inline
  def apply(account_id: Double): AppsCheckAccountIsAssociatedWithAnyStubbedParams = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCheckAccountIsAssociatedWithAnyStubbedParams]
  }
  @scala.inline
  implicit class AppsCheckAccountIsAssociatedWithAnyStubbedParamsOps[Self <: AppsCheckAccountIsAssociatedWithAnyStubbedParams] (val x: Self) extends AnyVal {
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

