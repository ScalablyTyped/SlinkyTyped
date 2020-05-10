package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Ungroups objects, such as groups.
  */
@js.native
trait SchemaUngroupObjectsRequest extends js.Object {
  /**
    * The object IDs of the objects to ungroup.  Only groups that are not
    * inside other groups can be ungrouped. All the groups should be on the
    * same page. The group itself is deleted. The visual sizes and positions of
    * all the children are preserved.
    */
  var objectIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaUngroupObjectsRequest {
  @scala.inline
  def apply(): SchemaUngroupObjectsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUngroupObjectsRequest]
  }
  @scala.inline
  implicit class SchemaUngroupObjectsRequestOps[Self <: SchemaUngroupObjectsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectIds")(js.undefined)
        ret
    }
  }
  
}

