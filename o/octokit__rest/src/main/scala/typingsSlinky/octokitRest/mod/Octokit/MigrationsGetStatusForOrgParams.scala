package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsGetStatusForOrgParams extends js.Object {
  var migration_id: Double
  @JSName("org")
  var org_ : String
}

object MigrationsGetStatusForOrgParams {
  @scala.inline
  def apply(migration_id: Double, org_ : String): MigrationsGetStatusForOrgParams = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsGetStatusForOrgParams]
  }
}

