package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.apiGatewayAuthorizerMod.PrincipalValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNotPrincipal extends js.Object {
  var NotPrincipal: PrincipalValue = js.native
}

object AnonNotPrincipal {
  @scala.inline
  def apply(NotPrincipal: PrincipalValue): AnonNotPrincipal = {
    val __obj = js.Dynamic.literal(NotPrincipal = NotPrincipal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNotPrincipal]
  }
  @scala.inline
  implicit class AnonNotPrincipalOps[Self <: AnonNotPrincipal] (val x: Self) extends AnyVal {
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
  }
  
}

