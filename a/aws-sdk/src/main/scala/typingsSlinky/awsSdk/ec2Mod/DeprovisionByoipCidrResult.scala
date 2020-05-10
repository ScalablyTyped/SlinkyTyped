package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeprovisionByoipCidrResult extends js.Object {
  /**
    * Information about the address range.
    */
  var ByoipCidr: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ByoipCidr] = js.native
}

object DeprovisionByoipCidrResult {
  @scala.inline
  def apply(): DeprovisionByoipCidrResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeprovisionByoipCidrResult]
  }
  @scala.inline
  implicit class DeprovisionByoipCidrResultOps[Self <: DeprovisionByoipCidrResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByoipCidr(value: ByoipCidr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByoipCidr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByoipCidr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByoipCidr")(js.undefined)
        ret
    }
  }
  
}

