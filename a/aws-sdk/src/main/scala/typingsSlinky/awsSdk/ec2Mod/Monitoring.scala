package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Monitoring extends js.Object {
  /**
    * Indicates whether detailed monitoring is enabled. Otherwise, basic monitoring is enabled.
    */
  var State: js.UndefOr[MonitoringState] = js.native
}

object Monitoring {
  @scala.inline
  def apply(): Monitoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Monitoring]
  }
  @scala.inline
  implicit class MonitoringOps[Self <: Monitoring] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: MonitoringState): Self = {
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

