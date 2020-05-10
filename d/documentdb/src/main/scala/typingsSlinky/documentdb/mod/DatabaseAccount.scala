package typingsSlinky.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseAccount extends js.Object {
  var ConsistencyPolicy: typingsSlinky.documentdb.mod.ConsistencyPolicy = js.native
  var CurrentMediaStorageUsageInMB: Double = js.native
  var DatabasesLink: String = js.native
  var MaxMediaStorageUsageInMB: Double = js.native
  var MediaLink: String = js.native
  var ReadableLocations: js.Array[String] = js.native
  var WritableLocations: js.Array[String] = js.native
}

object DatabaseAccount {
  @scala.inline
  def apply(
    ConsistencyPolicy: ConsistencyPolicy,
    CurrentMediaStorageUsageInMB: Double,
    DatabasesLink: String,
    MaxMediaStorageUsageInMB: Double,
    MediaLink: String,
    ReadableLocations: js.Array[String],
    WritableLocations: js.Array[String]
  ): DatabaseAccount = {
    val __obj = js.Dynamic.literal(ConsistencyPolicy = ConsistencyPolicy.asInstanceOf[js.Any], CurrentMediaStorageUsageInMB = CurrentMediaStorageUsageInMB.asInstanceOf[js.Any], DatabasesLink = DatabasesLink.asInstanceOf[js.Any], MaxMediaStorageUsageInMB = MaxMediaStorageUsageInMB.asInstanceOf[js.Any], MediaLink = MediaLink.asInstanceOf[js.Any], ReadableLocations = ReadableLocations.asInstanceOf[js.Any], WritableLocations = WritableLocations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseAccount]
  }
  @scala.inline
  implicit class DatabaseAccountOps[Self <: DatabaseAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsistencyPolicy(value: ConsistencyPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsistencyPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentMediaStorageUsageInMB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentMediaStorageUsageInMB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatabasesLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabasesLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxMediaStorageUsageInMB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxMediaStorageUsageInMB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadableLocations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadableLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWritableLocations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WritableLocations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

