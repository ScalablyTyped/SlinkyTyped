package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Autotriggerchecks extends js.Object {
  var auto_trigger_checks: Type = js.native
  @JSName("auto_trigger_checks[].app_id")
  var `auto_trigger_checks[]Dotapp_id`: Required = js.native
  @JSName("auto_trigger_checks[].setting")
  var `auto_trigger_checks[]Dotsetting`: Required = js.native
  var owner: Required = js.native
  var repo: Required = js.native
}

object Autotriggerchecks {
  @scala.inline
  def apply(
    auto_trigger_checks: Type,
    `auto_trigger_checks[]Dotapp_id`: Required,
    `auto_trigger_checks[]Dotsetting`: Required,
    owner: Required,
    repo: Required
  ): Autotriggerchecks = {
    val __obj = js.Dynamic.literal(auto_trigger_checks = auto_trigger_checks.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.updateDynamic("auto_trigger_checks[].app_id")(`auto_trigger_checks[]Dotapp_id`.asInstanceOf[js.Any])
    __obj.updateDynamic("auto_trigger_checks[].setting")(`auto_trigger_checks[]Dotsetting`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autotriggerchecks]
  }
  @scala.inline
  implicit class AutotriggerchecksOps[Self <: Autotriggerchecks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuto_trigger_checks(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_trigger_checks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withAuto_trigger_checks[]Dotapp_id`(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_trigger_checks[].app_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withAuto_trigger_checks[]Dotsetting`(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_trigger_checks[].setting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

