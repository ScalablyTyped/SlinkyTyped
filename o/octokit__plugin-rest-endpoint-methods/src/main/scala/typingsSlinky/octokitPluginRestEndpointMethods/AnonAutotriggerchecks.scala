package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutotriggerchecks extends js.Object {
  var auto_trigger_checks: AnonType = js.native
  @JSName("auto_trigger_checks[].app_id")
  var `auto_trigger_checks[]Dotapp_id`: AnonRequired = js.native
  @JSName("auto_trigger_checks[].setting")
  var `auto_trigger_checks[]Dotsetting`: AnonRequired = js.native
  var owner: AnonRequired = js.native
  var repo: AnonRequired = js.native
}

object AnonAutotriggerchecks {
  @scala.inline
  def apply(
    auto_trigger_checks: AnonType,
    `auto_trigger_checks[]Dotapp_id`: AnonRequired,
    `auto_trigger_checks[]Dotsetting`: AnonRequired,
    owner: AnonRequired,
    repo: AnonRequired
  ): AnonAutotriggerchecks = {
    val __obj = js.Dynamic.literal(auto_trigger_checks = auto_trigger_checks.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.updateDynamic("auto_trigger_checks[].app_id")(`auto_trigger_checks[]Dotapp_id`.asInstanceOf[js.Any])
    __obj.updateDynamic("auto_trigger_checks[].setting")(`auto_trigger_checks[]Dotsetting`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutotriggerchecks]
  }
  @scala.inline
  implicit class AnonAutotriggerchecksOps[Self <: AnonAutotriggerchecks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuto_trigger_checks(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_trigger_checks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withAuto_trigger_checks[]Dotapp_id`(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_trigger_checks[].app_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withAuto_trigger_checks[]Dotsetting`(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_trigger_checks[].setting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

