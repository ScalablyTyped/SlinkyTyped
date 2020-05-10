package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
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
  val controllerExpandSecretRef: SecretReference = js.native
  /**
    * ControllerPublishSecretRef is a reference to the secret object containing sensitive
    * information to pass to the CSI driver to complete the CSI ControllerPublishVolume and
    * ControllerUnpublishVolume calls. This field is optional, and may be empty if no secret is
    * required. If the secret object contains more than one secret, all secrets are passed.
    */
  val controllerPublishSecretRef: SecretReference = js.native
  /**
    * Driver is the name of the driver to use for this volume. Required.
    */
  val driver: String = js.native
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs".
    */
  val fsType: String = js.native
  /**
    * NodePublishSecretRef is a reference to the secret object containing sensitive information
    * to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume
    * calls. This field is optional, and may be empty if no secret is required. If the secret
    * object contains more than one secret, all secrets are passed.
    */
  val nodePublishSecretRef: SecretReference = js.native
  /**
    * NodeStageSecretRef is a reference to the secret object containing sensitive information to
    * pass to the CSI driver to complete the CSI NodeStageVolume and NodeStageVolume and
    * NodeUnstageVolume calls. This field is optional, and may be empty if no secret is required.
    * If the secret object contains more than one secret, all secrets are passed.
    */
  val nodeStageSecretRef: SecretReference = js.native
  /**
    * Optional: The value to pass to ControllerPublishVolumeRequest. Defaults to false
    * (read/write).
    */
  val readOnly: Boolean = js.native
  /**
    * Attributes of the volume to publish.
    */
  val volumeAttributes: StringDictionary[String] = js.native
  /**
    * VolumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume
    * to refer to the volume on all subsequent calls. Required.
    */
  val volumeHandle: String = js.native
}

object CSIPersistentVolumeSource {
  @scala.inline
  def apply(
    controllerExpandSecretRef: SecretReference,
    controllerPublishSecretRef: SecretReference,
    driver: String,
    fsType: String,
    nodePublishSecretRef: SecretReference,
    nodeStageSecretRef: SecretReference,
    readOnly: Boolean,
    volumeAttributes: StringDictionary[String],
    volumeHandle: String
  ): CSIPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(controllerExpandSecretRef = controllerExpandSecretRef.asInstanceOf[js.Any], controllerPublishSecretRef = controllerPublishSecretRef.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any], fsType = fsType.asInstanceOf[js.Any], nodePublishSecretRef = nodePublishSecretRef.asInstanceOf[js.Any], nodeStageSecretRef = nodeStageSecretRef.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], volumeAttributes = volumeAttributes.asInstanceOf[js.Any], volumeHandle = volumeHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSIPersistentVolumeSource]
  }
  @scala.inline
  implicit class CSIPersistentVolumeSourceOps[Self <: CSIPersistentVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControllerExpandSecretRef(value: SecretReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllerExpandSecretRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControllerPublishSecretRef(value: SecretReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllerPublishSecretRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDriver(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFsType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodePublishSecretRef(value: SecretReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePublishSecretRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeStageSecretRef(value: SecretReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeStageSecretRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumeAttributes(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumeHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeHandle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

