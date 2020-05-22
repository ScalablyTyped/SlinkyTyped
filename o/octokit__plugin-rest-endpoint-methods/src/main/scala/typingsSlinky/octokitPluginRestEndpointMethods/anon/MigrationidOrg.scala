package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationidOrg extends js.Object {
  var migration_id: Required
  @JSName("org")
  var org_ : Required
}

object MigrationidOrg {
  @scala.inline
  def apply(migration_id: Required, org_ : Required): MigrationidOrg = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationidOrg]
  }
}

