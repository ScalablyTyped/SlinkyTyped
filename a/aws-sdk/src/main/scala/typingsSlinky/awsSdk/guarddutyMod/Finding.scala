package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Finding extends js.Object {
  /**
    * The ID of the account in which the finding was generated.
    */
  var AccountId: String = js.native
  /**
    * The ARN for the finding.
    */
  var Arn: String = js.native
  /**
    * The confidence score for the finding.
    */
  var Confidence: js.UndefOr[Double] = js.native
  /**
    * The time and date at which the finding was created.
    */
  var CreatedAt: String = js.native
  /**
    * The description of the finding.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the finding.
    */
  var Id: String = js.native
  /**
    * The partition associated with the finding.
    */
  var Partition: js.UndefOr[String] = js.native
  /**
    * The Region in which the finding was generated.
    */
  var Region: String = js.native
  var Resource: typingsSlinky.awsSdk.guarddutyMod.Resource = js.native
  /**
    * The version of the schema used for the finding.
    */
  var SchemaVersion: String = js.native
  var Service: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.Service] = js.native
  /**
    * The severity of the finding.
    */
  var Severity: Double = js.native
  /**
    * The title for the finding.
    */
  var Title: js.UndefOr[String] = js.native
  /**
    * The type of the finding.
    */
  var Type: FindingType = js.native
  /**
    * The time and date at which the finding was laste updated.
    */
  var UpdatedAt: String = js.native
}

object Finding {
  @scala.inline
  def apply(
    AccountId: String,
    Arn: String,
    CreatedAt: String,
    Id: String,
    Region: String,
    Resource: Resource,
    SchemaVersion: String,
    Severity: Double,
    Type: FindingType,
    UpdatedAt: String
  ): Finding = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Arn = Arn.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Region = Region.asInstanceOf[js.Any], Resource = Resource.asInstanceOf[js.Any], SchemaVersion = SchemaVersion.asInstanceOf[js.Any], Severity = Severity.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Finding]
  }
  @scala.inline
  implicit class FindingOps[Self <: Finding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: Resource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemaVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeverity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: FindingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Confidence")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withPartition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Partition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Partition")(js.undefined)
        ret
    }
    @scala.inline
    def withService(value: Service): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Service")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(js.undefined)
        ret
    }
  }
  
}

