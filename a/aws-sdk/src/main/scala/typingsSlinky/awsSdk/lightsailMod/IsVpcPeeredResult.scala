package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsVpcPeeredResult extends js.Object {
  /**
    * Returns true if the Lightsail VPC is peered; otherwise, false.
    */
  var isPeered: js.UndefOr[Boolean] = js.native
}

object IsVpcPeeredResult {
  @scala.inline
  def apply(): IsVpcPeeredResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsVpcPeeredResult]
  }
  @scala.inline
  implicit class IsVpcPeeredResultOps[Self <: IsVpcPeeredResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsPeered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPeered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPeered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPeered")(js.undefined)
        ret
    }
  }
  
}

