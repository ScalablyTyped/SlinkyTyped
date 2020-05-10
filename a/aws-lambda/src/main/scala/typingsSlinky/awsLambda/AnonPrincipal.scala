package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.apiGatewayAuthorizerMod.PrincipalValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPrincipal extends js.Object {
  var Principal: PrincipalValue = js.native
}

object AnonPrincipal {
  @scala.inline
  def apply(Principal: PrincipalValue): AnonPrincipal = {
    val __obj = js.Dynamic.literal(Principal = Principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrincipal]
  }
  @scala.inline
  implicit class AnonPrincipalOps[Self <: AnonPrincipal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrincipal(value: PrincipalValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Principal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

