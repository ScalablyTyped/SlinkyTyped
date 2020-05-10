package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationsGetArchiveForAuthenticatedUserParams extends js.Object {
  var migration_id: Double = js.native
}

object MigrationsGetArchiveForAuthenticatedUserParams {
  @scala.inline
  def apply(migration_id: Double): MigrationsGetArchiveForAuthenticatedUserParams = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsGetArchiveForAuthenticatedUserParams]
  }
  @scala.inline
  implicit class MigrationsGetArchiveForAuthenticatedUserParamsOps[Self <: MigrationsGetArchiveForAuthenticatedUserParams] (val x: Self) extends AnyVal {
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
  }
  
}

