package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAttachToIndexResponse extends js.Object {
  /**
    * The ObjectIdentifier of the object that was attached to the index.
    */
  var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.native
}

object BatchAttachToIndexResponse {
  @scala.inline
  def apply(): BatchAttachToIndexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAttachToIndexResponse]
  }
  @scala.inline
  implicit class BatchAttachToIndexResponseOps[Self <: BatchAttachToIndexResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachedObjectIdentifier(value: ObjectIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachedObjectIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachedObjectIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachedObjectIdentifier")(js.undefined)
        ret
    }
  }
  
}

