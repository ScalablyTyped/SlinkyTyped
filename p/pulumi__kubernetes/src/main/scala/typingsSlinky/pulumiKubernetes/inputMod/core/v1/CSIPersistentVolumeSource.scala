package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents storage that is managed by an external CSI volume driver (Beta feature)
  */
@js.native
trait CSIPersistentVolumeSource extends js.Object {
  /**
    * ControllerExpandSecretRef is a reference to the secret object containing sensitive
    * information to pass to the CSI driver to complete the CSI ControllerExpandVolume call. This
    * is an alpha field and requires enabling ExpandCSIVolumes feature gate. This field is
    * optional, and may be empty if no secret is required. If the secret object contains more
    * than one secret, all secrets are passed.
    */
  var controllerExpandSecretRef: js.UndefOr[Input[SecretReference]] = js.native
  /**
    * ControllerPublishSecretRef is a reference to the secret object containing sensitive
    * information to pass to the CSI driver to complete the CSI ControllerPublishVolume and
    * ControllerUnpublishVolume calls. This field is optional, and may be empty if no secret is
    * required. If the secret object contains more than one secret, all secrets are passed.
    */
  var controllerPublishSecretRef: js.UndefOr[Input[SecretReference]] = js.native
  /**
    * Driver is the name of the driver to use for this volume. Required.
    */
  var driver: Input[String] = js.native
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs".
    */
  var fsType: js.UndefOr[Input[String]] = js.native
  /**
    * NodePublishSecretRef is a reference to the secret object containing sensitive information
    * to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume
    * calls. This field is optional, and may be empty if no secret is required. If the secret
    * object contains more than one secret, all secrets are passed.
    */
  var nodePublishSecretRef: js.UndefOr[Input[SecretReference]] = js.native
  /**
    * NodeStageSecretRef is a reference to the secret object containing sensitive information to
    * pass to the CSI driver to complete the CSI NodeStageVolume and NodeStageVolume and
    * NodeUnstageVolume calls. This field is optional, and may be empty if no secret is required.
    * If the secret object contains more than one secret, all secrets are passed.
    */
  var nodeStageSecretRef: js.UndefOr[Input[SecretReference]] = js.native
  /**
    * Optional: The value to pass to ControllerPublishVolumeRequest. Defaults to false
    * (read/write).
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Attributes of the volume to publish.
    */
  var volumeAttributes: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * VolumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume
    * to refer to the volume on all subsequent calls. Required.
    */
  var volumeHandle: Input[String] = js.native
}

object CSIPersistentVolumeSource {
  @scala.inline
  def apply(driver: Input[String], volumeHandle: Input[String]): CSIPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any], volumeHandle = volumeHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSIPersistentVolumeSource]
  }
  @scala.inline
  implicit class CSIPersistentVolumeSourceOps[Self <: CSIPersistentVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriver(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumeHandle(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControllerExpandSecretRef(value: Input[SecretReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllerExpandSecretRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControllerExpandSecretRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllerExpandSecretRef")(js.undefined)
        ret
    }
    @scala.inline
    def withControllerPublishSecretRef(value: Input[SecretReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllerPublishSecretRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControllerPublishSecretRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllerPublishSecretRef")(js.undefined)
        ret
    }
    @scala.inline
    def withFsType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFsType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsType")(js.undefined)
        ret
    }
    @scala.inline
    def withNodePublishSecretRef(value: Input[SecretReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePublishSecretRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodePublishSecretRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePublishSecretRef")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeStageSecretRef(value: Input[SecretReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeStageSecretRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeStageSecretRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeStageSecretRef")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeAttributes(value: Input[StringDictionary[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeAttributes")(js.undefined)
        ret
    }
  }
  
}

