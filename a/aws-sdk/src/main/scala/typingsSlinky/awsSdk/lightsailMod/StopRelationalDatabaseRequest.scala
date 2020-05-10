package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopRelationalDatabaseRequest extends js.Object {
  /**
    * The name of your database to stop.
    */
  var relationalDatabaseName: ResourceName = js.native
  /**
    * The name of your new database snapshot to be created before stopping your database.
    */
  var relationalDatabaseSnapshotName: js.UndefOr[ResourceName] = js.native
}

object StopRelationalDatabaseRequest {
  @scala.inline
  def apply(relationalDatabaseName: ResourceName): StopRelationalDatabaseRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRelationalDatabaseRequest]
  }
  @scala.inline
  implicit class StopRelationalDatabaseRequestOps[Self <: StopRelationalDatabaseRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRelationalDatabaseName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationalDatabaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelationalDatabaseSnapshotName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationalDatabaseSnapshotName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationalDatabaseSnapshotName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationalDatabaseSnapshotName")(js.undefined)
        ret
    }
  }
  
}

