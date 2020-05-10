package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementGroupInfo extends js.Object {
  /**
    * A list of supported placement groups types.
    */
  var SupportedStrategies: js.UndefOr[PlacementGroupStrategyList] = js.native
}

object PlacementGroupInfo {
  @scala.inline
  def apply(): PlacementGroupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementGroupInfo]
  }
  @scala.inline
  implicit class PlacementGroupInfoOps[Self <: PlacementGroupInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSupportedStrategies(value: PlacementGroupStrategyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedStrategies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedStrategies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedStrategies")(js.undefined)
        ret
    }
  }
  
}

