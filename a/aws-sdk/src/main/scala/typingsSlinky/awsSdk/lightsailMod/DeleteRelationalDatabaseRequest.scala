package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRelationalDatabaseRequest extends js.Object {
  /**
    * The name of the database snapshot created if skip final snapshot is false, which is the default value for that parameter.  Specifying this parameter and also specifying the skip final snapshot parameter to true results in an error.  Constraints:   Must contain from 2 to 255 alphanumeric characters, or hyphens.   The first and last character must be a letter or number.  
    */
  var finalRelationalDatabaseSnapshotName: js.UndefOr[ResourceName] = js.native
  /**
    * The name of the database that you are deleting.
    */
  var relationalDatabaseName: ResourceName = js.native
  /**
    * Determines whether a final database snapshot is created before your database is deleted. If true is specified, no database snapshot is created. If false is specified, a database snapshot is created before your database is deleted. You must specify the final relational database snapshot name parameter if the skip final snapshot parameter is false. Default: false 
    */
  var skipFinalSnapshot: js.UndefOr[Boolean] = js.native
}

object DeleteRelationalDatabaseRequest {
  @scala.inline
  def apply(relationalDatabaseName: ResourceName): DeleteRelationalDatabaseRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRelationalDatabaseRequest]
  }
  @scala.inline
  implicit class DeleteRelationalDatabaseRequestOps[Self <: DeleteRelationalDatabaseRequest] (val x: Self) extends AnyVal {
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
    def withFinalRelationalDatabaseSnapshotName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalRelationalDatabaseSnapshotName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalRelationalDatabaseSnapshotName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalRelationalDatabaseSnapshotName")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipFinalSnapshot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFinalSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipFinalSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFinalSnapshot")(js.undefined)
        ret
    }
  }
  
}

