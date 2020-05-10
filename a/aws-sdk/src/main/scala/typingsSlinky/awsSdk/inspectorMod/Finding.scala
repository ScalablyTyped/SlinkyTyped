package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Finding extends js.Object {
  /**
    * The ARN that specifies the finding.
    */
  var arn: Arn = js.native
  /**
    * A collection of attributes of the host from which the finding is generated.
    */
  var assetAttributes: js.UndefOr[AssetAttributes] = js.native
  /**
    * The type of the host from which the finding is generated.
    */
  var assetType: js.UndefOr[AssetType] = js.native
  /**
    * The system-defined attributes for the finding.
    */
  var attributes: AttributeList = js.native
  /**
    * This data element is currently not used.
    */
  var confidence: js.UndefOr[IocConfidence] = js.native
  /**
    * The time when the finding was generated.
    */
  var createdAt: js.Date = js.native
  /**
    * The description of the finding.
    */
  var description: js.UndefOr[Text] = js.native
  /**
    * The ID of the finding.
    */
  var id: js.UndefOr[FindingId] = js.native
  /**
    * This data element is currently not used.
    */
  var indicatorOfCompromise: js.UndefOr[Bool] = js.native
  /**
    * The numeric value of the finding severity.
    */
  var numericSeverity: js.UndefOr[NumericSeverity] = js.native
  /**
    * The recommendation for the finding.
    */
  var recommendation: js.UndefOr[Text] = js.native
  /**
    * The schema version of this data type.
    */
  var schemaVersion: js.UndefOr[NumericVersion] = js.native
  /**
    * The data element is set to "Inspector".
    */
  var service: js.UndefOr[ServiceName] = js.native
  /**
    * This data type is used in the Finding data type.
    */
  var serviceAttributes: js.UndefOr[InspectorServiceAttributes] = js.native
  /**
    * The finding severity. Values can be set to High, Medium, Low, and Informational.
    */
  var severity: js.UndefOr[Severity] = js.native
  /**
    * The name of the finding.
    */
  var title: js.UndefOr[Text] = js.native
  /**
    * The time when AddAttributesToFindings is called.
    */
  var updatedAt: js.Date = js.native
  /**
    * The user-defined attributes that are assigned to the finding.
    */
  var userAttributes: UserAttributeList = js.native
}

object Finding {
  @scala.inline
  def apply(
    arn: Arn,
    attributes: AttributeList,
    createdAt: js.Date,
    updatedAt: js.Date,
    userAttributes: UserAttributeList
  ): Finding = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Finding]
  }
  @scala.inline
  implicit class FindingOps[Self <: Finding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: AttributeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserAttributes(value: UserAttributeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssetAttributes(value: AssetAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withAssetType(value: AssetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetType")(js.undefined)
        ret
    }
    @scala.inline
    def withConfidence(value: IocConfidence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: FindingId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicatorOfCompromise(value: Bool): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorOfCompromise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicatorOfCompromise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorOfCompromise")(js.undefined)
        ret
    }
    @scala.inline
    def withNumericSeverity(value: NumericSeverity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericSeverity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumericSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericSeverity")(js.undefined)
        ret
    }
    @scala.inline
    def withRecommendation(value: Text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommendation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendation")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaVersion(value: NumericVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withService(value: ServiceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAttributes(value: InspectorServiceAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverity(value: Severity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: Text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

