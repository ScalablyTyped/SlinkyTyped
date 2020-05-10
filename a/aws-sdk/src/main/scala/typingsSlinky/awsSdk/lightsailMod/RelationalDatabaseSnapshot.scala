package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationalDatabaseSnapshot extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the database snapshot.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The timestamp when the database snapshot was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The software of the database snapshot (for example, MySQL)
    */
  var engine: js.UndefOr[NonEmptyString] = js.native
  /**
    * The database engine version for the database snapshot (for example, 5.7.23).
    */
  var engineVersion: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Amazon Resource Name (ARN) of the database from which the database snapshot was created.
    */
  var fromRelationalDatabaseArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The blueprint ID of the database from which the database snapshot was created. A blueprint describes the major engine version of a database.
    */
  var fromRelationalDatabaseBlueprintId: js.UndefOr[String] = js.native
  /**
    * The bundle ID of the database from which the database snapshot was created.
    */
  var fromRelationalDatabaseBundleId: js.UndefOr[String] = js.native
  /**
    * The name of the source database from which the database snapshot was created.
    */
  var fromRelationalDatabaseName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Region name and Availability Zone where the database snapshot is located.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  /**
    * The name of the database snapshot.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The Lightsail resource type.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * The size of the disk in GB (for example, 32) for the database snapshot.
    */
  var sizeInGb: js.UndefOr[integer] = js.native
  /**
    * The state of the database snapshot.
    */
  var state: js.UndefOr[NonEmptyString] = js.native
  /**
    * The support code for the database snapshot. Include this code in your email to support when you have questions about a database snapshot in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object RelationalDatabaseSnapshot {
  @scala.inline
  def apply(): RelationalDatabaseSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabaseSnapshot]
  }
  @scala.inline
  implicit class RelationalDatabaseSnapshotOps[Self <: RelationalDatabaseSnapshot] (val x: Self) extends AnyVal {
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
    def withEngine(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineVersion(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withFromRelationalDatabaseArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromRelationalDatabaseArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromRelationalDatabaseArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromRelationalDatabaseArn")(js.undefined)
        ret
    }
    @scala.inline
    def withFromRelationalDatabaseBlueprintId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromRelationalDatabaseBlueprintId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromRelationalDatabaseBlueprintId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromRelationalDatabaseBlueprintId")(js.undefined)
        ret
    }
    @scala.inline
    def withFromRelationalDatabaseBundleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromRelationalDatabaseBundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromRelationalDatabaseBundleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromRelationalDatabaseBundleId")(js.undefined)
        ret
    }
    @scala.inline
    def withFromRelationalDatabaseName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromRelationalDatabaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromRelationalDatabaseName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromRelationalDatabaseName")(js.undefined)
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
    def withSizeInGb(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeInGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeInGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeInGb")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: NonEmptyString): Self = {
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
    @scala.inline
    def withSupportCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportCode")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
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
  }
  
}

