package typingsSlinky.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByoipCidr extends js.Object {
  /**
    * The address range, in CIDR notation.
    */
  var Cidr: js.UndefOr[GenericString] = js.native
  /**
    * The state of the address pool.
    */
  var State: js.UndefOr[ByoipCidrState] = js.native
}

object ByoipCidr {
  @scala.inline
  def apply(): ByoipCidr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByoipCidr]
  }
  @scala.inline
  implicit class ByoipCidrOps[Self <: ByoipCidr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCidr(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cidr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cidr")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: ByoipCidrState): Self = {
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
  }
  
}

