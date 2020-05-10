package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDhcpOptionsResult extends js.Object {
  /**
    * A set of DHCP options.
    */
  var DhcpOptions: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.DhcpOptions] = js.native
}

object CreateDhcpOptionsResult {
  @scala.inline
  def apply(): CreateDhcpOptionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDhcpOptionsResult]
  }
  @scala.inline
  implicit class CreateDhcpOptionsResultOps[Self <: CreateDhcpOptionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDhcpOptions(value: DhcpOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DhcpOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDhcpOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DhcpOptions")(js.undefined)
        ret
    }
  }
  
}

