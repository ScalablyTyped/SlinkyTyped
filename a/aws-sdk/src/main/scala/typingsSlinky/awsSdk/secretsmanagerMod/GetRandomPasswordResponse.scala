package typingsSlinky.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRandomPasswordResponse extends js.Object {
  /**
    * A string with the generated password.
    */
  var RandomPassword: js.UndefOr[RandomPasswordType] = js.native
}

object GetRandomPasswordResponse {
  @scala.inline
  def apply(): GetRandomPasswordResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRandomPasswordResponse]
  }
  @scala.inline
  implicit class GetRandomPasswordResponseOps[Self <: GetRandomPasswordResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRandomPassword(value: RandomPasswordType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RandomPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRandomPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RandomPassword")(js.undefined)
        ret
    }
  }
  
}

