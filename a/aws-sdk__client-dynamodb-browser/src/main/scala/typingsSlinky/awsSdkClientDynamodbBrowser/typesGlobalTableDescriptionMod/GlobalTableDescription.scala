package typingsSlinky.awsSdkClientDynamodbBrowser.typesGlobalTableDescriptionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ACTIVE
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.CREATING
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DELETING
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.UPDATING
import typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaDescriptionMod.ReplicaDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalTableDescription extends js.Object {
  /**
    * <p>The creation time of the global table.</p>
    */
  var CreationDateTime: js.UndefOr[js.Date | String | Double] = js.undefined
  /**
    * <p>The unique identifier of the global table.</p>
    */
  var GlobalTableArn: js.UndefOr[String] = js.undefined
  /**
    * <p>The global table name.</p>
    */
  var GlobalTableName: js.UndefOr[String] = js.undefined
  /**
    * <p>The current state of the global table:</p> <ul> <li> <p> <code>CREATING</code> - The global table is being created.</p> </li> <li> <p> <code>UPDATING</code> - The global table is being updated.</p> </li> <li> <p> <code>DELETING</code> - The global table is being deleted.</p> </li> <li> <p> <code>ACTIVE</code> - The global table is ready for use.</p> </li> </ul>
    */
  var GlobalTableStatus: js.UndefOr[CREATING | ACTIVE | DELETING | UPDATING | String] = js.undefined
  /**
    * <p>The regions where the global table has replicas.</p>
    */
  var ReplicationGroup: js.UndefOr[js.Array[ReplicaDescription] | js.Iterable[ReplicaDescription]] = js.undefined
}

object GlobalTableDescription {
  @scala.inline
  def apply(
    CreationDateTime: js.Date | String | Double = null,
    GlobalTableArn: String = null,
    GlobalTableName: String = null,
    GlobalTableStatus: CREATING | ACTIVE | DELETING | UPDATING | String = null,
    ReplicationGroup: js.Array[ReplicaDescription] | js.Iterable[ReplicaDescription] = null
  ): GlobalTableDescription = {
    val __obj = js.Dynamic.literal()
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime.asInstanceOf[js.Any])
    if (GlobalTableArn != null) __obj.updateDynamic("GlobalTableArn")(GlobalTableArn.asInstanceOf[js.Any])
    if (GlobalTableName != null) __obj.updateDynamic("GlobalTableName")(GlobalTableName.asInstanceOf[js.Any])
    if (GlobalTableStatus != null) __obj.updateDynamic("GlobalTableStatus")(GlobalTableStatus.asInstanceOf[js.Any])
    if (ReplicationGroup != null) __obj.updateDynamic("ReplicationGroup")(ReplicationGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTableDescription]
  }
}

