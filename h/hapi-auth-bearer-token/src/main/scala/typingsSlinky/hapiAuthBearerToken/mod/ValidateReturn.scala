package typingsSlinky.hapiAuthBearerToken.mod

import typingsSlinky.hapiHapi.mod.AuthCredentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @hapi/hapi.@hapi/hapi.AuthenticationData & {  isValid  :boolean} */
@js.native
trait ValidateReturn extends js.Object {
  var artifacts: js.UndefOr[js.Object] = js.native
  var credentials: AuthCredentials = js.native
  var isValid: Boolean = js.native
}

object ValidateReturn {
  @scala.inline
  def apply(credentials: AuthCredentials, isValid: Boolean): ValidateReturn = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateReturn]
  }
  @scala.inline
  implicit class ValidateReturnOps[Self <: ValidateReturn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredentials(value: AuthCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifacts(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtifacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifacts")(js.undefined)
        ret
    }
  }
  
}

