package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NielsenConfiguration extends js.Object {
  /**
    * Nielsen has discontinued the use of breakout code functionality. If you must include this property, set the value to zero.
    */
  var BreakoutCode: js.UndefOr[integerMin0Max0] = js.native
  /**
    * Use Distributor ID (DistributorID) to specify the distributor ID that is assigned to your organization by Neilsen.
    */
  var DistributorId: js.UndefOr[string] = js.native
}

object NielsenConfiguration {
  @scala.inline
  def apply(): NielsenConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NielsenConfiguration]
  }
  @scala.inline
  implicit class NielsenConfigurationOps[Self <: NielsenConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakoutCode(value: integerMin0Max0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BreakoutCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BreakoutCode")(js.undefined)
        ret
    }
    @scala.inline
    def withDistributorId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistributorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistributorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistributorId")(js.undefined)
        ret
    }
  }
  
}

