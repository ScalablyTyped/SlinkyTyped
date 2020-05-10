package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ACTIVE
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUBMITTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMandateStatus extends js.Object {
  var Active: ACTIVE = js.native
  var Created: CREATED = js.native
  var Failed: FAILED = js.native
  var Submitted: SUBMITTED = js.native
}

object IMandateStatus {
  @scala.inline
  def apply(Active: ACTIVE, Created: CREATED, Failed: FAILED, Submitted: SUBMITTED): IMandateStatus = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], Created = Created.asInstanceOf[js.Any], Failed = Failed.asInstanceOf[js.Any], Submitted = Submitted.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMandateStatus]
  }
  @scala.inline
  implicit class IMandateStatusOps[Self <: IMandateStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: ACTIVE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: CREATED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailed(value: FAILED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmitted(value: SUBMITTED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Submitted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

