package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsDownloadArchiveForOrgParams extends js.Object {
  var migration_id: Double
  @JSName("org")
  var org_ : String
}

object MigrationsDownloadArchiveForOrgParams {
  @scala.inline
  def apply(migration_id: Double, org_ : String): MigrationsDownloadArchiveForOrgParams = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsDownloadArchiveForOrgParams]
  }
}

