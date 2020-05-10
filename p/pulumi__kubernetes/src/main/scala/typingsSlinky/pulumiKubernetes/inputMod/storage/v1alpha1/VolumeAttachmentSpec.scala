package typingsSlinky.pulumiKubernetes.inputMod.storage.v1alpha1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
  */
@js.native
trait VolumeAttachmentSpec extends js.Object {
  /**
    * Attacher indicates the name of the volume driver that MUST handle this request. This is the
    * name returned by GetPluginName().
    */
  var attacher: Input[String] = js.native
  /**
    * The node that the volume should be attached to.
    */
  var nodeName: Input[String] = js.native
  /**
    * Source represents the volume that should be attached.
    */
  var source: Input[VolumeAttachmentSource] = js.native
}

object VolumeAttachmentSpec {
  @scala.inline
  def apply(attacher: Input[String], nodeName: Input[String], source: Input[VolumeAttachmentSource]): VolumeAttachmentSpec = {
    val __obj = js.Dynamic.literal(attacher = attacher.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeAttachmentSpec]
  }
  @scala.inline
  implicit class VolumeAttachmentSpecOps[Self <: VolumeAttachmentSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttacher(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attacher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: Input[VolumeAttachmentSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

