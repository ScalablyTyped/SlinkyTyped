package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPrincipalId extends js.Object {
  var principalId: String = js.native
}

object AnonPrincipalId {
  @scala.inline
  def apply(principalId: String): AnonPrincipalId = {
    val __obj = js.Dynamic.literal(principalId = principalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrincipalId]
  }
  @scala.inline
  implicit class AnonPrincipalIdOps[Self <: AnonPrincipalId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrincipalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principalId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

