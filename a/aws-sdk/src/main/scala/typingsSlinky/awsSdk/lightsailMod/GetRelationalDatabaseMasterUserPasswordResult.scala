package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseMasterUserPasswordResult extends js.Object {
  /**
    * The timestamp when the specified version of the master user password was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The master user password for the password version specified.
    */
  var masterUserPassword: js.UndefOr[SensitiveString] = js.native
}

object GetRelationalDatabaseMasterUserPasswordResult {
  @scala.inline
  def apply(): GetRelationalDatabaseMasterUserPasswordResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseMasterUserPasswordResult]
  }
  @scala.inline
  implicit class GetRelationalDatabaseMasterUserPasswordResultOps[Self <: GetRelationalDatabaseMasterUserPasswordResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterUserPassword(value: SensitiveString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterUserPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterUserPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterUserPassword")(js.undefined)
        ret
    }
  }
  
}

