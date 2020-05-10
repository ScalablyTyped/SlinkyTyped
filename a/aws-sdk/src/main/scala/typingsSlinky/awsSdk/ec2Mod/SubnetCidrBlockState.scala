package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubnetCidrBlockState extends js.Object {
  /**
    * The state of a CIDR block.
    */
  var State: js.UndefOr[SubnetCidrBlockStateCode] = js.native
  /**
    * A message about the status of the CIDR block, if applicable.
    */
  var StatusMessage: js.UndefOr[String] = js.native
}

object SubnetCidrBlockState {
  @scala.inline
  def apply(): SubnetCidrBlockState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetCidrBlockState]
  }
  @scala.inline
  implicit class SubnetCidrBlockStateOps[Self <: SubnetCidrBlockState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: SubnetCidrBlockStateCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
        ret
    }
  }
  
}

