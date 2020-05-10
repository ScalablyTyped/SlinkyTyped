package typingsSlinky.pulumiAws.replicationTaskMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationTaskState extends js.Object {
  /**
    * The Unix timestamp integer for the start of the Change Data Capture (CDC) operation.
    */
  val cdcStartTime: js.UndefOr[Input[String]] = js.native
  /**
    * The migration type. Can be one of `full-load | cdc | full-load-and-cdc`.
    */
  val migrationType: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  val replicationInstanceArn: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) for the replication task.
    */
  val replicationTaskArn: js.UndefOr[Input[String]] = js.native
  /**
    * The replication task identifier.
    */
  val replicationTaskId: js.UndefOr[Input[String]] = js.native
  /**
    * An escaped JSON string that contains the task settings. For a complete list of task settings, see [Task Settings for AWS Database Migration Service Tasks](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html).
    */
  val replicationTaskSettings: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the source endpoint.
    */
  val sourceEndpointArn: js.UndefOr[Input[String]] = js.native
  /**
    * An escaped JSON string that contains the table mappings. For information on table mapping see [Using Table Mapping with an AWS Database Migration Service Task to Select and Filter Data](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
    */
  val tableMappings: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the target endpoint.
    */
  val targetEndpointArn: js.UndefOr[Input[String]] = js.native
}

object ReplicationTaskState {
  @scala.inline
  def apply(): ReplicationTaskState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationTaskState]
  }
  @scala.inline
  implicit class ReplicationTaskStateOps[Self <: ReplicationTaskState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCdcStartTime(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdcStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCdcStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdcStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMigrationType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMigrationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrationType")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationInstanceArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationInstanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationInstanceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationInstanceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationTaskArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationTaskArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationTaskArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationTaskArn")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationTaskId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationTaskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationTaskId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationTaskId")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationTaskSettings(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationTaskSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationTaskSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationTaskSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceEndpointArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceEndpointArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceEndpointArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceEndpointArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTableMappings(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableMappings")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetEndpointArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetEndpointArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetEndpointArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetEndpointArn")(js.undefined)
        ret
    }
  }
  
}

