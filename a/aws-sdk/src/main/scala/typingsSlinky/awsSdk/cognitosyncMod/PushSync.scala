package typingsSlinky.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushSync extends js.Object {
  /**
    * List of SNS platform application ARNs that could be used by clients.
    */
  var ApplicationArns: js.UndefOr[ApplicationArnList] = js.native
  /**
    * A role configured to allow Cognito to call SNS on behalf of the developer.
    */
  var RoleArn: js.UndefOr[AssumeRoleArn] = js.native
}

object PushSync {
  @scala.inline
  def apply(): PushSync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushSync]
  }
  @scala.inline
  implicit class PushSyncOps[Self <: PushSync] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationArns(value: ApplicationArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationArns")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: AssumeRoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(js.undefined)
        ret
    }
  }
  
}

