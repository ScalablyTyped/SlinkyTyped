package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatastoreActivity extends js.Object {
  /**
    * The name of the data store where processed messages are stored.
    */
  var datastoreName: DatastoreName = js.native
  /**
    * The name of the 'datastore' activity.
    */
  var name: ActivityName = js.native
}

object DatastoreActivity {
  @scala.inline
  def apply(datastoreName: DatastoreName, name: ActivityName): DatastoreActivity = {
    val __obj = js.Dynamic.literal(datastoreName = datastoreName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatastoreActivity]
  }
  @scala.inline
  implicit class DatastoreActivityOps[Self <: DatastoreActivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatastoreName(value: DatastoreName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datastoreName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: ActivityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

