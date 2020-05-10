package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPasswordDataResult extends js.Object {
  /**
    * The ID of the Windows instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The password of the instance. Returns an empty string if the password is not available.
    */
  var PasswordData: js.UndefOr[String] = js.native
  /**
    * The time the data was last updated.
    */
  var Timestamp: js.UndefOr[js.Date] = js.native
}

object GetPasswordDataResult {
  @scala.inline
  def apply(): GetPasswordDataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPasswordDataResult]
  }
  @scala.inline
  implicit class GetPasswordDataResultOps[Self <: GetPasswordDataResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PasswordData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PasswordData")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(js.undefined)
        ret
    }
  }
  
}

