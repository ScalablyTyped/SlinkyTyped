package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of deleting a group.
  */
@js.native
trait SchemaDeleteDimensionGroupResponse extends js.Object {
  /**
    * All groups of a dimension after deleting a group from that dimension.
    */
  var dimensionGroups: js.UndefOr[js.Array[SchemaDimensionGroup]] = js.native
}

object SchemaDeleteDimensionGroupResponse {
  @scala.inline
  def apply(): SchemaDeleteDimensionGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteDimensionGroupResponse]
  }
  @scala.inline
  implicit class SchemaDeleteDimensionGroupResponseOps[Self <: SchemaDeleteDimensionGroupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensionGroups(value: js.Array[SchemaDimensionGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionGroups")(js.undefined)
        ret
    }
  }
  
}

