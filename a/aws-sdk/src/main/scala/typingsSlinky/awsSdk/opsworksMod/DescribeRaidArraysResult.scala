package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRaidArraysResult extends js.Object {
  /**
    * A RaidArrays object that describes the specified RAID arrays.
    */
  var RaidArrays: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.RaidArrays] = js.native
}

object DescribeRaidArraysResult {
  @scala.inline
  def apply(): DescribeRaidArraysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRaidArraysResult]
  }
  @scala.inline
  implicit class DescribeRaidArraysResultOps[Self <: DescribeRaidArraysResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRaidArrays(value: RaidArrays): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RaidArrays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaidArrays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RaidArrays")(js.undefined)
        ret
    }
  }
  
}

