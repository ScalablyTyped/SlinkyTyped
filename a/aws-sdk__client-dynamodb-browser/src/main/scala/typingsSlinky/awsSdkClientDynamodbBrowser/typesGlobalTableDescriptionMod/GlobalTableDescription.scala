package typingsSlinky.awsSdkClientDynamodbBrowser.typesGlobalTableDescriptionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ACTIVE
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.CREATING
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DELETING
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.UPDATING
import typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaDescriptionMod.ReplicaDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalTableDescription extends js.Object {
  /**
    * <p>The creation time of the global table.</p>
    */
  var CreationDateTime: js.UndefOr[js.Date | String | Double] = js.native
  /**
    * <p>The unique identifier of the global table.</p>
    */
  var GlobalTableArn: js.UndefOr[String] = js.native
  /**
    * <p>The global table name.</p>
    */
  var GlobalTableName: js.UndefOr[String] = js.native
  /**
    * <p>The current state of the global table:</p> <ul> <li> <p> <code>CREATING</code> - The global table is being created.</p> </li> <li> <p> <code>UPDATING</code> - The global table is being updated.</p> </li> <li> <p> <code>DELETING</code> - The global table is being deleted.</p> </li> <li> <p> <code>ACTIVE</code> - The global table is ready for use.</p> </li> </ul>
    */
  var GlobalTableStatus: js.UndefOr[CREATING | ACTIVE | DELETING | UPDATING | String] = js.native
  /**
    * <p>The regions where the global table has replicas.</p>
    */
  var ReplicationGroup: js.UndefOr[js.Array[ReplicaDescription] | js.Iterable[ReplicaDescription]] = js.native
}

object GlobalTableDescription {
  @scala.inline
  def apply(): GlobalTableDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalTableDescription]
  }
  @scala.inline
  implicit class GlobalTableDescriptionOps[Self <: GlobalTableDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDateTimeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationDateTime(value: js.Date | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalTableArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalTableArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableArn")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableName")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalTableStatus(value: CREATING | ACTIVE | DELETING | UPDATING | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalTableStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationGroupIterable(value: js.Iterable[ReplicaDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicationGroup(value: js.Array[ReplicaDescription] | js.Iterable[ReplicaDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroup")(js.undefined)
        ret
    }
  }
  
}

