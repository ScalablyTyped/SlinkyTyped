package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortRange extends js.Object {
  /**
    * The smallest port number in a specified range of port numbers.
    */
  var MaxRange: js.UndefOr[Port] = js.native
  /**
    * The smallest port number in a specified range of port numbers.
    */
  var MinRange: Port = js.native
}

object PortRange {
  @scala.inline
  def apply(MinRange: Port): PortRange = {
    val __obj = js.Dynamic.literal(MinRange = MinRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortRange]
  }
  @scala.inline
  implicit class PortRangeOps[Self <: PortRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinRange(value: Port): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxRange(value: Port): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRange")(js.undefined)
        ret
    }
  }
  
}

