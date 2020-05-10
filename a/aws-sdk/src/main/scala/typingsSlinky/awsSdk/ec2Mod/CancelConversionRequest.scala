package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelConversionRequest extends js.Object {
  /**
    * The ID of the conversion task.
    */
  var ConversionTaskId: typingsSlinky.awsSdk.ec2Mod.ConversionTaskId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The reason for canceling the conversion task.
    */
  var ReasonMessage: js.UndefOr[String] = js.native
}

object CancelConversionRequest {
  @scala.inline
  def apply(ConversionTaskId: ConversionTaskId): CancelConversionRequest = {
    val __obj = js.Dynamic.literal(ConversionTaskId = ConversionTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelConversionRequest]
  }
  @scala.inline
  implicit class CancelConversionRequestOps[Self <: CancelConversionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConversionTaskId(value: ConversionTaskId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConversionTaskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReasonMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReasonMessage")(js.undefined)
        ret
    }
  }
  
}

