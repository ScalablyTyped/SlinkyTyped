package typingsSlinky.awsLambda.apiGatewayAuthorizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaybeStatementPrincipal extends js.Object {
  var NotPrincipal: js.UndefOr[PrincipalValue] = js.native
  var Principal: js.UndefOr[PrincipalValue] = js.native
}

object MaybeStatementPrincipal {
  @scala.inline
  def apply(): MaybeStatementPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaybeStatementPrincipal]
  }
  @scala.inline
  implicit class MaybeStatementPrincipalOps[Self <: MaybeStatementPrincipal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotPrincipal(value: PrincipalValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotPrincipal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotPrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotPrincipal")(js.undefined)
        ret
    }
    @scala.inline
    def withPrincipal(value: PrincipalValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Principal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Principal")(js.undefined)
        ret
    }
  }
  
}

