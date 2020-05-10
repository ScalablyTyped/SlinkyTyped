package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportSnapshotRecord extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the export snapshot record.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The date when the export snapshot record was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * A list of objects describing the destination of the export snapshot record.
    */
  var destinationInfo: js.UndefOr[DestinationInfo] = js.native
  /**
    * The AWS Region and Availability Zone where the export snapshot record is located.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  /**
    * The export snapshot record name.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The Lightsail resource type (e.g., ExportSnapshotRecord).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * A list of objects describing the source of the export snapshot record.
    */
  var sourceInfo: js.UndefOr[ExportSnapshotRecordSourceInfo] = js.native
  /**
    * The state of the export snapshot record.
    */
  var state: js.UndefOr[RecordState] = js.native
}

object ExportSnapshotRecord {
  @scala.inline
  def apply(): ExportSnapshotRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportSnapshotRecord]
  }
  @scala.inline
  implicit class ExportSnapshotRecordOps[Self <: ExportSnapshotRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationInfo(value: DestinationInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: ResourceLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceInfo(value: ExportSnapshotRecordSourceInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: RecordState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

