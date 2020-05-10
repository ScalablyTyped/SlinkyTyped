package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountLimit extends js.Object {
  /**
    * The maximum size of a function's deployment package and layers when they're extracted.
    */
  var CodeSizeUnzipped: js.UndefOr[Long] = js.native
  /**
    * The maximum size of a deployment package when it's uploaded directly to AWS Lambda. Use Amazon S3 for larger files.
    */
  var CodeSizeZipped: js.UndefOr[Long] = js.native
  /**
    * The maximum number of simultaneous function executions.
    */
  var ConcurrentExecutions: js.UndefOr[Integer] = js.native
  /**
    * The amount of storage space that you can use for all deployment packages and layer archives.
    */
  var TotalCodeSize: js.UndefOr[Long] = js.native
  /**
    * The maximum number of simultaneous function executions, minus the capacity that's reserved for individual functions with PutFunctionConcurrency.
    */
  var UnreservedConcurrentExecutions: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.UnreservedConcurrentExecutions] = js.native
}

object AccountLimit {
  @scala.inline
  def apply(): AccountLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountLimit]
  }
  @scala.inline
  implicit class AccountLimitOps[Self <: AccountLimit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeSizeUnzipped(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeSizeUnzipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeSizeUnzipped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeSizeUnzipped")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeSizeZipped(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeSizeZipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeSizeZipped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeSizeZipped")(js.undefined)
        ret
    }
    @scala.inline
    def withConcurrentExecutions(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConcurrentExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrentExecutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConcurrentExecutions")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalCodeSize(value: Long): Self = {
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
    @scala.inline
    def withUnreservedConcurrentExecutions(value: UnreservedConcurrentExecutions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnreservedConcurrentExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnreservedConcurrentExecutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnreservedConcurrentExecutions")(js.undefined)
        ret
    }
  }
  
}

