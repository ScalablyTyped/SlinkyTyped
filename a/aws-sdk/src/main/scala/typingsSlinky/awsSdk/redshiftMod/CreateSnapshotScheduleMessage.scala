package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSnapshotScheduleMessage extends js.Object {
  /**
    * 
    */
  var DryRun: js.UndefOr[BooleanOptional] = js.native
  /**
    * 
    */
  var NextInvocations: js.UndefOr[IntegerOptional] = js.native
  /**
    * The definition of the snapshot schedule. The definition is made up of schedule expressions, for example "cron(30 12 *)" or "rate(12 hours)". 
    */
  var ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList] = js.native
  /**
    * The description of the snapshot schedule.
    */
  var ScheduleDescription: js.UndefOr[String] = js.native
  /**
    * A unique identifier for a snapshot schedule. Only alphanumeric characters are allowed for the identifier.
    */
  var ScheduleIdentifier: js.UndefOr[String] = js.native
  /**
    * An optional set of tags you can use to search for the schedule.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateSnapshotScheduleMessage {
  @scala.inline
  def apply(): CreateSnapshotScheduleMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSnapshotScheduleMessage]
  }
  @scala.inline
  implicit class CreateSnapshotScheduleMessageOps[Self <: CreateSnapshotScheduleMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDryRun(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withNextInvocations(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextInvocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextInvocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextInvocations")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleDefinitions(value: ScheduleDefinitionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleDefinitions")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

