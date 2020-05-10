package typingsSlinky.mongodbMemoryServerCore.mongoMemoryReplSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoMemoryReplSetConfigSettingsT extends js.Object {
  var catchUpTimeoutMillis: js.UndefOr[Double] = js.native
  var chainingAllowed: js.UndefOr[Boolean] = js.native
  var electionTimeoutMillis: js.UndefOr[Double] = js.native
  var heartbeatIntervalMillis: js.UndefOr[Double] = js.native
  var heartbeatTimeoutSecs: js.UndefOr[Double] = js.native
}

object MongoMemoryReplSetConfigSettingsT {
  @scala.inline
  def apply(): MongoMemoryReplSetConfigSettingsT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoMemoryReplSetConfigSettingsT]
  }
  @scala.inline
  implicit class MongoMemoryReplSetConfigSettingsTOps[Self <: MongoMemoryReplSetConfigSettingsT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCatchUpTimeoutMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catchUpTimeoutMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatchUpTimeoutMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catchUpTimeoutMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withChainingAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chainingAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChainingAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chainingAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withElectionTimeoutMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electionTimeoutMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElectionTimeoutMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electionTimeoutMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withHeartbeatIntervalMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatIntervalMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeartbeatIntervalMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatIntervalMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withHeartbeatTimeoutSecs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatTimeoutSecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeartbeatTimeoutSecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatTimeoutSecs")(js.undefined)
        ret
    }
  }
  
}

