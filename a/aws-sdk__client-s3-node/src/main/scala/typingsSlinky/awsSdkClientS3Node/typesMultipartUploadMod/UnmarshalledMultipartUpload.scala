package typingsSlinky.awsSdkClientS3Node.typesMultipartUploadMod

import typingsSlinky.awsSdkClientS3Node.typesInitiatorMod.UnmarshalledInitiator
import typingsSlinky.awsSdkClientS3Node.typesOwnerMod.UnmarshalledOwner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledMultipartUpload extends MultipartUpload {
  /**
    * <p>Date and time at which the multipart upload was initiated.</p>
    */
  @JSName("Initiated")
  var Initiated_UnmarshalledMultipartUpload: js.UndefOr[js.Date] = js.native
  /**
    * <p>Identifies who initiated the multipart upload.</p>
    */
  @JSName("Initiator")
  var Initiator_UnmarshalledMultipartUpload: js.UndefOr[UnmarshalledInitiator] = js.native
  /**
    * _Owner shape
    */
  @JSName("Owner")
  var Owner_UnmarshalledMultipartUpload: js.UndefOr[UnmarshalledOwner] = js.native
}

object UnmarshalledMultipartUpload {
  @scala.inline
  def apply(): UnmarshalledMultipartUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledMultipartUpload]
  }
  @scala.inline
  implicit class UnmarshalledMultipartUploadOps[Self <: UnmarshalledMultipartUpload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitiated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Initiated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitiated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Initiated")(js.undefined)
        ret
    }
    @scala.inline
    def withInitiator(value: UnmarshalledInitiator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Initiator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitiator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Initiator")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: UnmarshalledOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(js.undefined)
        ret
    }
  }
  
}

