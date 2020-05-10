package typingsSlinky.pulumiKubernetes.outputMod.storage.v1

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
  val attacher: String = js.native
  /**
    * The node that the volume should be attached to.
    */
  val nodeName: String = js.native
  /**
    * Source represents the volume that should be attached.
    */
  val source: VolumeAttachmentSource = js.native
}

object VolumeAttachmentSpec {
  @scala.inline
  def apply(attacher: String, nodeName: String, source: VolumeAttachmentSource): VolumeAttachmentSpec = {
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
    def withAttacher(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attacher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: VolumeAttachmentSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

