package typingsSlinky.microsoftSdkSoap.mod.global.Sdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEntityView extends js.Object {
  var attributes: AttributeCollection = js.native
  var entityState: EntityState = js.native
  var id: java.lang.String = js.native
  var logicalName: java.lang.String = js.native
  var relatedEntities: RelatedEntityCollection = js.native
}

object IEntityView {
  @scala.inline
  def apply(
    attributes: AttributeCollection,
    entityState: EntityState,
    id: java.lang.String,
    logicalName: java.lang.String,
    relatedEntities: RelatedEntityCollection
  ): IEntityView = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], entityState = entityState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], logicalName = logicalName.asInstanceOf[js.Any], relatedEntities = relatedEntities.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityView]
  }
  @scala.inline
  implicit class IEntityViewOps[Self <: IEntityView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: AttributeCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityState(value: EntityState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogicalName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logicalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelatedEntities(value: RelatedEntityCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedEntities")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

