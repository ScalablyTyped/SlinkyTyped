package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAttachToIndex extends js.Object {
  /**
    * A reference to the index that you are attaching the object to.
    */
  var IndexReference: ObjectReference = js.native
  /**
    * A reference to the object that you are attaching to the index.
    */
  var TargetReference: ObjectReference = js.native
}

object BatchAttachToIndex {
  @scala.inline
  def apply(IndexReference: ObjectReference, TargetReference: ObjectReference): BatchAttachToIndex = {
    val __obj = js.Dynamic.literal(IndexReference = IndexReference.asInstanceOf[js.Any], TargetReference = TargetReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAttachToIndex]
  }
  @scala.inline
  implicit class BatchAttachToIndexOps[Self <: BatchAttachToIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexReference(value: ObjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetReference(value: ObjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetReference")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

