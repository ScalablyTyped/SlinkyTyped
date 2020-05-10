package typingsSlinky.pulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPrincipalIdString extends js.Object {
  var principalId: String = js.native
}

object AnonPrincipalIdString {
  @scala.inline
  def apply(principalId: String): AnonPrincipalIdString = {
    val __obj = js.Dynamic.literal(principalId = principalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrincipalIdString]
  }
  @scala.inline
  implicit class AnonPrincipalIdStringOps[Self <: AnonPrincipalIdString] (val x: Self) extends AnyVal {
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

