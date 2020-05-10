package typingsSlinky.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntitySummary extends js.Object {
  /**
    * The ARN associated with the unique identifier for the entity.
    */
  var EntityArn: js.UndefOr[ARN] = js.native
  /**
    * The unique identifier for the entity.
    */
  var EntityId: js.UndefOr[ResourceId] = js.native
  /**
    * The type of the entity.
    */
  var EntityType: js.UndefOr[typingsSlinky.awsSdk.marketplacecatalogMod.EntityType] = js.native
  /**
    * The last time the entity was published, using ISO 8601 format (2018-02-27T13:45:22Z).
    */
  var LastModifiedDate: js.UndefOr[StringValue] = js.native
  /**
    * The name for the entity. This value is not unique. It is defined by the provider.
    */
  var Name: js.UndefOr[StringValue] = js.native
  /**
    * The visibility status of the entity to subscribers. This value can be Public (everyone can view the entity), Limited (the entity is visible to limited accounts only), or Restricted (the entity was published and then unpublished and only existing subscribers can view it). 
    */
  var Visibility: js.UndefOr[StringValue] = js.native
}

object EntitySummary {
  @scala.inline
  def apply(): EntitySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntitySummary]
  }
  @scala.inline
  implicit class EntitySummaryOps[Self <: EntitySummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withEntityId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityId")(js.undefined)
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
    @scala.inline
    def withName(value: StringValue): Self = {
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
    def withVisibility(value: StringValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visibility")(js.undefined)
        ret
    }
  }
  
}

