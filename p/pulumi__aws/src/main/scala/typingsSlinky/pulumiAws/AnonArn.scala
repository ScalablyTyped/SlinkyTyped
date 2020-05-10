package typingsSlinky.pulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArn extends js.Object {
  var arn: String = js.native
  var name: String = js.native
  var ownerIdentity: AnonPrincipalIdString = js.native
}

object AnonArn {
  @scala.inline
  def apply(arn: String, name: String, ownerIdentity: AnonPrincipalIdString): AnonArn = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerIdentity = ownerIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArn]
  }
  @scala.inline
  implicit class AnonArnOps[Self <: AnonArn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerIdentity(value: AnonPrincipalIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerIdentity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

