package typingsSlinky.pulumiKubernetes.outputMod.storage.v1alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VolumeAttachmentStatus is the status of a VolumeAttachment request.
  */
@js.native
trait VolumeAttachmentStatus extends js.Object {
  /**
    * The last error encountered during attach operation, if any. This field must only be set by
    * the entity completing the attach operation, i.e. the external-attacher.
    */
  val attachError: VolumeError = js.native
  /**
    * Indicates the volume is successfully attached. This field must only be set by the entity
    * completing the attach operation, i.e. the external-attacher.
    */
  val attached: Boolean = js.native
  /**
    * Upon successful attach, this field is populated with any information returned by the attach
    * operation that must be passed into subsequent WaitForAttach or Mount calls. This field must
    * only be set by the entity completing the attach operation, i.e. the external-attacher.
    */
  val attachmentMetadata: StringDictionary[String] = js.native
  /**
    * The last error encountered during detach operation, if any. This field must only be set by
    * the entity completing the detach operation, i.e. the external-attacher.
    */
  val detachError: VolumeError = js.native
}

object VolumeAttachmentStatus {
  @scala.inline
  def apply(
    attachError: VolumeError,
    attached: Boolean,
    attachmentMetadata: StringDictionary[String],
    detachError: VolumeError
  ): VolumeAttachmentStatus = {
    val __obj = js.Dynamic.literal(attachError = attachError.asInstanceOf[js.Any], attached = attached.asInstanceOf[js.Any], attachmentMetadata = attachmentMetadata.asInstanceOf[js.Any], detachError = detachError.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeAttachmentStatus]
  }
  @scala.inline
  implicit class VolumeAttachmentStatusOps[Self <: VolumeAttachmentStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachError(value: VolumeError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttached(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachmentMetadata(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetachError(value: VolumeError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detachError")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

