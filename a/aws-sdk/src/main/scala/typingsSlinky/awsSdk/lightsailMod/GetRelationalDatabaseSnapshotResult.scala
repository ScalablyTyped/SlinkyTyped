package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseSnapshotResult extends js.Object {
  /**
    * An object describing the specified database snapshot.
    */
  var relationalDatabaseSnapshot: js.UndefOr[RelationalDatabaseSnapshot] = js.native
}

object GetRelationalDatabaseSnapshotResult {
  @scala.inline
  def apply(): GetRelationalDatabaseSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseSnapshotResult]
  }
  @scala.inline
  implicit class GetRelationalDatabaseSnapshotResultOps[Self <: GetRelationalDatabaseSnapshotResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRelationalDatabaseSnapshot(value: RelationalDatabaseSnapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationalDatabaseSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationalDatabaseSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationalDatabaseSnapshot")(js.undefined)
        ret
    }
  }
  
}

