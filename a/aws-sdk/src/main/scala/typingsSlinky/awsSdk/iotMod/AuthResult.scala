package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthResult extends js.Object {
  /**
    * The policies and statements that allowed the specified action.
    */
  var allowed: js.UndefOr[Allowed] = js.native
  /**
    * The final authorization decision of this scenario. Multiple statements are taken into account when determining the authorization decision. An explicit deny statement can override multiple allow statements.
    */
  var authDecision: js.UndefOr[AuthDecision] = js.native
  /**
    * Authorization information.
    */
  var authInfo: js.UndefOr[AuthInfo] = js.native
  /**
    * The policies and statements that denied the specified action.
    */
  var denied: js.UndefOr[Denied] = js.native
  /**
    * Contains any missing context values found while evaluating policy.
    */
  var missingContextValues: js.UndefOr[MissingContextValues] = js.native
}

object AuthResult {
  @scala.inline
  def apply(): AuthResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthResult]
  }
  @scala.inline
  implicit class AuthResultOps[Self <: AuthResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowed(value: Allowed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthDecision(value: AuthDecision): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authDecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthDecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authDecision")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthInfo(value: AuthInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withDenied(value: Denied): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("denied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDenied: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("denied")(js.undefined)
        ret
    }
    @scala.inline
    def withMissingContextValues(value: MissingContextValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingContextValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissingContextValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingContextValues")(js.undefined)
        ret
    }
  }
  
}

