package typingsSlinky.pulumiKubernetes.inputMod.storage.v1beta1

import typingsSlinky.pulumiKubernetes.inputMod.core.v1.PersistentVolumeSpec
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VolumeAttachmentSource represents a volume that should be attached. Right now only
  * PersistenVolumes can be attached via external attacher, in future we may allow also inline
  * volumes in pods. Exactly one member can be set.
  */
@js.native
trait VolumeAttachmentSource extends js.Object {
  /**
    * inlineVolumeSpec contains all the information necessary to attach a persistent volume
    * defined by a pod's inline VolumeSource. This field is populated only for the CSIMigration
    * feature. It contains translated fields from a pod's inline VolumeSource to a
    * PersistentVolumeSpec. This field is alpha-level and is only honored by servers that enabled
    * the CSIMigration feature.
    */
  var inlineVolumeSpec: js.UndefOr[Input[PersistentVolumeSpec]] = js.native
  /**
    * Name of the persistent volume to attach.
    */
  var persistentVolumeName: js.UndefOr[Input[String]] = js.native
}

object VolumeAttachmentSource {
  @scala.inline
  def apply(): VolumeAttachmentSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeAttachmentSource]
  }
  @scala.inline
  implicit class VolumeAttachmentSourceOps[Self <: VolumeAttachmentSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInlineVolumeSpec(value: Input[PersistentVolumeSpec]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineVolumeSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineVolumeSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineVolumeSpec")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistentVolumeName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentVolumeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistentVolumeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentVolumeName")(js.undefined)
        ret
    }
  }
  
}

