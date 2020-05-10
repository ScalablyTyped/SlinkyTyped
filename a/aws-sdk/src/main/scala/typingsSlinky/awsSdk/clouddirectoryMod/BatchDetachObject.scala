package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDetachObject extends js.Object {
  /**
    * The batch reference name. See Transaction Support for more information.
    */
  var BatchReferenceName: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.BatchReferenceName] = js.native
  /**
    * The name of the link.
    */
  var LinkName: typingsSlinky.awsSdk.clouddirectoryMod.LinkName = js.native
  /**
    * Parent reference from which the object with the specified link name is detached.
    */
  var ParentReference: ObjectReference = js.native
}

object BatchDetachObject {
  @scala.inline
  def apply(LinkName: LinkName, ParentReference: ObjectReference): BatchDetachObject = {
    val __obj = js.Dynamic.literal(LinkName = LinkName.asInstanceOf[js.Any], ParentReference = ParentReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetachObject]
  }
  @scala.inline
  implicit class BatchDetachObjectOps[Self <: BatchDetachObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinkName(value: LinkName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentReference(value: ObjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchReferenceName(value: BatchReferenceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BatchReferenceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchReferenceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BatchReferenceName")(js.undefined)
        ret
    }
  }
  
}

