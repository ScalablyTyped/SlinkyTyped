package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationsDownloadArchiveForOrgParams extends js.Object {
  var migration_id: Double = js.native
  var org: String = js.native
}

object MigrationsDownloadArchiveForOrgParams {
  @scala.inline
  def apply(migration_id: Double, org: String): MigrationsDownloadArchiveForOrgParams = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsDownloadArchiveForOrgParams]
  }
  @scala.inline
  implicit class MigrationsDownloadArchiveForOrgParamsOps[Self <: MigrationsDownloadArchiveForOrgParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMigration_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migration_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

