package typingsSlinky.alksNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LongTermKeyData extends js.Object {
  var accessKey: String = js.native
  var alksAccount: String = js.native
  var alksRole: String = js.native
  var iamUserArn: String = js.native
  var iamUserName: String = js.native
  var secretKey: String = js.native
}

object LongTermKeyData {
  @scala.inline
  def apply(
    accessKey: String,
    alksAccount: String,
    alksRole: String,
    iamUserArn: String,
    iamUserName: String,
    secretKey: String
  ): LongTermKeyData = {
    val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], alksAccount = alksAccount.asInstanceOf[js.Any], alksRole = alksRole.asInstanceOf[js.Any], iamUserArn = iamUserArn.asInstanceOf[js.Any], iamUserName = iamUserName.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongTermKeyData]
  }
  @scala.inline
  implicit class LongTermKeyDataOps[Self <: LongTermKeyData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlksAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alksAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlksRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alksRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIamUserArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamUserArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIamUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamUserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecretKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

