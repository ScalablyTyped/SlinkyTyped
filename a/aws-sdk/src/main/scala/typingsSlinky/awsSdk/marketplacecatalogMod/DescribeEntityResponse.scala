package typingsSlinky.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEntityResponse extends js.Object {
  /**
    * This stringified JSON object includes the details of the entity.
    */
  var Details: js.UndefOr[Json] = js.native
  /**
    * The ARN associated to the unique identifier for the change set referenced in this request.
    */
  var EntityArn: js.UndefOr[ARN] = js.native
  /**
    * The identifier of the entity, in the format of EntityId@RevisionId.
    */
  var EntityIdentifier: js.UndefOr[Identifier] = js.native
  /**
    * The named type of the entity, in the format of EntityType@Version.
    */
  var EntityType: js.UndefOr[typingsSlinky.awsSdk.marketplacecatalogMod.EntityType] = js.native
  /**
    * The last modified date of the entity, in ISO 8601 format (2018-02-27T13:45:22Z).
    */
  var LastModifiedDate: js.UndefOr[StringValue] = js.native
}

object DescribeEntityResponse {
  @scala.inline
  def apply(): DescribeEntityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEntityResponse]
  }
  @scala.inline
  implicit class DescribeEntityResponseOps[Self <: DescribeEntityResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: Json): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityArn")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityIdentifier(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityType(value: EntityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityType")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: StringValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(js.undefined)
        ret
    }
  }
  
}

