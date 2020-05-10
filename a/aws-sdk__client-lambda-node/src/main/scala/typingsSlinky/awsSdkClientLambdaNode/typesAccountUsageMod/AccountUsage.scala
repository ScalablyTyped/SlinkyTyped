package typingsSlinky.awsSdkClientLambdaNode.typesAccountUsageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountUsage extends js.Object {
  /**
    * <p>The number of your account's existing functions per region.</p>
    */
  var FunctionCount: js.UndefOr[Double] = js.native
  /**
    * <p>Total size, in bytes, of the account's deployment packages per region.</p>
    */
  var TotalCodeSize: js.UndefOr[Double] = js.native
}

object AccountUsage {
  @scala.inline
  def apply(): AccountUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountUsage]
  }
  @scala.inline
  implicit class AccountUsageOps[Self <: AccountUsage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunctionCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalCodeSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalCodeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalCodeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalCodeSize")(js.undefined)
        ret
    }
  }
  
}

