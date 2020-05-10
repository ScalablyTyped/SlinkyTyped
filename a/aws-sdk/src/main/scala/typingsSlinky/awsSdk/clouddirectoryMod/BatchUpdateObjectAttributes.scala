package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateObjectAttributes extends js.Object {
  /**
    * Attributes update structure.
    */
  var AttributeUpdates: ObjectAttributeUpdateList = js.native
  /**
    * Reference that identifies the object.
    */
  var ObjectReference: typingsSlinky.awsSdk.clouddirectoryMod.ObjectReference = js.native
}

object BatchUpdateObjectAttributes {
  @scala.inline
  def apply(AttributeUpdates: ObjectAttributeUpdateList, ObjectReference: ObjectReference): BatchUpdateObjectAttributes = {
    val __obj = js.Dynamic.literal(AttributeUpdates = AttributeUpdates.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateObjectAttributes]
  }
  @scala.inline
  implicit class BatchUpdateObjectAttributesOps[Self <: BatchUpdateObjectAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeUpdates(value: ObjectAttributeUpdateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectReference(value: ObjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectReference")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

