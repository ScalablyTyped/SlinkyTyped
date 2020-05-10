package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAttachObjectResponse extends js.Object {
  /**
    * The ObjectIdentifier of the object that has been attached.
    */
  var attachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.native
}

object BatchAttachObjectResponse {
  @scala.inline
  def apply(): BatchAttachObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAttachObjectResponse]
  }
  @scala.inline
  implicit class BatchAttachObjectResponseOps[Self <: BatchAttachObjectResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachedObjectIdentifier(value: ObjectIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachedObjectIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachedObjectIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachedObjectIdentifier")(js.undefined)
        ret
    }
  }
  
}

