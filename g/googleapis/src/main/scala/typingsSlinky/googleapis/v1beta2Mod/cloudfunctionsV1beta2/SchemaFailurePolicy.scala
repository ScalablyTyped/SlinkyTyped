package typingsSlinky.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the policy in case of function&#39;s execution failure. If empty,
  * then defaults to ignoring failures (i.e. not retrying them).
  */
@js.native
trait SchemaFailurePolicy extends js.Object {
  /**
    * If specified, then the function will be retried in case of a failure.
    */
  var retry: js.UndefOr[SchemaRetry] = js.native
}

object SchemaFailurePolicy {
  @scala.inline
  def apply(): SchemaFailurePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFailurePolicy]
  }
  @scala.inline
  implicit class SchemaFailurePolicyOps[Self <: SchemaFailurePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRetry(value: SchemaRetry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(js.undefined)
        ret
    }
  }
  
}

