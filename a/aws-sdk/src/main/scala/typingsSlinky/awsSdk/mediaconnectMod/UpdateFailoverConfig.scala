package typingsSlinky.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFailoverConfig extends js.Object {
  /**
    * Recovery window time to look for dash-7 packets
    */
  var RecoveryWindow: js.UndefOr[integer] = js.native
  var State: js.UndefOr[typingsSlinky.awsSdk.mediaconnectMod.State] = js.native
}

object UpdateFailoverConfig {
  @scala.inline
  def apply(): UpdateFailoverConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFailoverConfig]
  }
  @scala.inline
  implicit class UpdateFailoverConfigOps[Self <: UpdateFailoverConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecoveryWindow(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecoveryWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecoveryWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecoveryWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: State): Self = {
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

