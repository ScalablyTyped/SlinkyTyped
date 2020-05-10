package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the state of the specified group.
  */
@js.native
trait SchemaUpdateDimensionGroupRequest extends js.Object {
  /**
    * The group whose state should be updated. The range and depth of the group
    * should specify a valid group on the sheet, and all other fields updated.
    */
  var dimensionGroup: js.UndefOr[SchemaDimensionGroup] = js.native
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `dimensionGroup` is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
}

object SchemaUpdateDimensionGroupRequest {
  @scala.inline
  def apply(): SchemaUpdateDimensionGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateDimensionGroupRequest]
  }
  @scala.inline
  implicit class SchemaUpdateDimensionGroupRequestOps[Self <: SchemaUpdateDimensionGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensionGroup(value: SchemaDimensionGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
  }
  
}

