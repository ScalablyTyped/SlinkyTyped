package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateKmsKeyRequest extends js.Object {
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName = js.native
}

object DisassociateKmsKeyRequest {
  @scala.inline
  def apply(logGroupName: LogGroupName): DisassociateKmsKeyRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateKmsKeyRequest]
  }
  @scala.inline
  implicit class DisassociateKmsKeyRequestOps[Self <: DisassociateKmsKeyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogGroupName(value: LogGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logGroupName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

