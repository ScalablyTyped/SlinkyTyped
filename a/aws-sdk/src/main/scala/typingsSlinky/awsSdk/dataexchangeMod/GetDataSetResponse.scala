package typingsSlinky.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataSetResponse extends js.Object {
  /**
    * The ARN for the data set.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.dataexchangeMod.Arn] = js.native
  /**
    * The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
    */
  var AssetType: js.UndefOr[typingsSlinky.awsSdk.dataexchangeMod.AssetType] = js.native
  /**
    * The date and time that the data set was created, in ISO 8601 format.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.native
  /**
    * The description for the data set.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.dataexchangeMod.Description] = js.native
  /**
    * The unique identifier for the data set.
    */
  var Id: js.UndefOr[typingsSlinky.awsSdk.dataexchangeMod.Id] = js.native
  /**
    * The name of the data set.
    */
  var Name: js.UndefOr[typingsSlinky.awsSdk.dataexchangeMod.Name] = js.native
  /**
    * A property that defines the data set as OWNED by the account (for providers) or ENTITLED to the account (for subscribers).
    */
  var Origin: js.UndefOr[typingsSlinky.awsSdk.dataexchangeMod.Origin] = js.native
  /**
    * If the origin of this data set is ENTITLED, includes the details for the product on AWS Marketplace.
    */
  var OriginDetails: js.UndefOr[typingsSlinky.awsSdk.dataexchangeMod.OriginDetails] = js.native
  /**
    * The data set ID of the owned data set corresponding to the entitled data set being viewed. This parameter is returned when a data set owner is viewing the entitled copy of its owned data set.
    */
  var SourceId: js.UndefOr[Id] = js.native
  /**
    * The tags for the data set.
    */
  var Tags: js.UndefOr[MapOfString] = js.native
  /**
    * The date and time that the data set was last updated, in ISO 8601 format.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.native
}

object GetDataSetResponse {
  @scala.inline
  def apply(): GetDataSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataSetResponse]
  }
  @scala.inline
  implicit class GetDataSetResponseOps[Self <: GetDataSetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withAssetType(value: AssetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssetType")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
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
    def withId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: Origin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Origin")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginDetails(value: OriginDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: MapOfString): Self = {
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
    @scala.inline
    def withUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedAt")(js.undefined)
        ret
    }
  }
  
}

