package typingsSlinky.pulumiKubernetes.inputMod.storage.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var attachError: js.UndefOr[Input[VolumeError]] = js.native
  /**
    * Indicates the volume is successfully attached. This field must only be set by the entity
    * completing the attach operation, i.e. the external-attacher.
    */
  var attached: Input[Boolean] = js.native
  /**
    * Upon successful attach, this field is populated with any information returned by the attach
    * operation that must be passed into subsequent WaitForAttach or Mount calls. This field must
    * only be set by the entity completing the attach operation, i.e. the external-attacher.
    */
  var attachmentMetadata: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The last error encountered during detach operation, if any. This field must only be set by
    * the entity completing the detach operation, i.e. the external-attacher.
    */
  var detachError: js.UndefOr[Input[VolumeError]] = js.native
}

object VolumeAttachmentStatus {
  @scala.inline
  def apply(attached: Input[Boolean]): VolumeAttachmentStatus = {
    val __obj = js.Dynamic.literal(attached = attached.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeAttachmentStatus]
  }
  @scala.inline
  implicit class VolumeAttachmentStatusOps[Self <: VolumeAttachmentStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttached(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachError(value: Input[VolumeError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachError")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachmentMetadata(value: Input[StringDictionary[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachmentMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withDetachError(value: Input[VolumeError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detachError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetachError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detachError")(js.undefined)
        ret
    }
  }
  
}

