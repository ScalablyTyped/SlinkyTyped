package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAttachObject extends js.Object {
  /**
    * The child object reference that is to be attached to the object.
    */
  var ChildReference: ObjectReference = js.native
  /**
    * The name of the link.
    */
  var LinkName: typingsSlinky.awsSdk.clouddirectoryMod.LinkName = js.native
  /**
    * The parent object reference.
    */
  var ParentReference: ObjectReference = js.native
}

object BatchAttachObject {
  @scala.inline
  def apply(ChildReference: ObjectReference, LinkName: LinkName, ParentReference: ObjectReference): BatchAttachObject = {
    val __obj = js.Dynamic.literal(ChildReference = ChildReference.asInstanceOf[js.Any], LinkName = LinkName.asInstanceOf[js.Any], ParentReference = ParentReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAttachObject]
  }
  @scala.inline
  implicit class BatchAttachObjectOps[Self <: BatchAttachObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildReference(value: ObjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChildReference")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

