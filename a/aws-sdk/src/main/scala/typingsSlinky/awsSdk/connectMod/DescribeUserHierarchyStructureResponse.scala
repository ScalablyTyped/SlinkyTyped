package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserHierarchyStructureResponse extends js.Object {
  /**
    * Information about the hierarchy structure.
    */
  var HierarchyStructure: js.UndefOr[typingsSlinky.awsSdk.connectMod.HierarchyStructure] = js.native
}

object DescribeUserHierarchyStructureResponse {
  @scala.inline
  def apply(): DescribeUserHierarchyStructureResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserHierarchyStructureResponse]
  }
  @scala.inline
  implicit class DescribeUserHierarchyStructureResponseOps[Self <: DescribeUserHierarchyStructureResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHierarchyStructure(value: HierarchyStructure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HierarchyStructure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHierarchyStructure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HierarchyStructure")(js.undefined)
        ret
    }
  }
  
}

