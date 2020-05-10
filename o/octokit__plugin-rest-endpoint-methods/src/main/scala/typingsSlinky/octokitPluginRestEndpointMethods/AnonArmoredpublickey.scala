package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArmoredpublickey extends js.Object {
  var armored_public_key: AnonType = js.native
}

object AnonArmoredpublickey {
  @scala.inline
  def apply(armored_public_key: AnonType): AnonArmoredpublickey = {
    val __obj = js.Dynamic.literal(armored_public_key = armored_public_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArmoredpublickey]
  }
  @scala.inline
  implicit class AnonArmoredpublickeyOps[Self <: AnonArmoredpublickey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArmored_public_key(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("armored_public_key")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

