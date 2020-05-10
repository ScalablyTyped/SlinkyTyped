package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMigrationid extends js.Object {
  var migration_id: AnonRequired = js.native
}

object AnonMigrationid {
  @scala.inline
  def apply(migration_id: AnonRequired): AnonMigrationid = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMigrationid]
  }
  @scala.inline
  implicit class AnonMigrationidOps[Self <: AnonMigrationid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMigration_id(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migration_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

