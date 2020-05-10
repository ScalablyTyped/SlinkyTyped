package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of adding a group.
  */
@js.native
trait SchemaAddDimensionGroupResponse extends js.Object {
  /**
    * All groups of a dimension after adding a group to that dimension.
    */
  var dimensionGroups: js.UndefOr[js.Array[SchemaDimensionGroup]] = js.native
}

object SchemaAddDimensionGroupResponse {
  @scala.inline
  def apply(): SchemaAddDimensionGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddDimensionGroupResponse]
  }
  @scala.inline
  implicit class SchemaAddDimensionGroupResponseOps[Self <: SchemaAddDimensionGroupResponse] (val x: Self) extends AnyVal {
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

