package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Autotriggerchecks extends js.Object {
  var auto_trigger_checks: Type
  @JSName("auto_trigger_checks[].app_id")
  var `auto_trigger_checks[]Dotapp_id`: Required
  @JSName("auto_trigger_checks[].setting")
  var `auto_trigger_checks[]Dotsetting`: Required
  var owner: Required
  var repo: Required
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
}

