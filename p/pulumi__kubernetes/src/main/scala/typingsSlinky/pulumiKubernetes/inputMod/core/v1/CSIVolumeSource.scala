package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a source location of a volume to mount, managed by an external CSI driver
  */
@js.native
trait CSIVolumeSource extends js.Object {
  /**
    * Driver is the name of the CSI driver that handles this volume. Consult with your admin for
    * the correct name as registered in the cluster.
    */
  var driver: Input[String] = js.native
  /**
    * Filesystem type to mount. Ex. "ext4", "xfs", "ntfs". If not provided, the empty value is
    * passed to the associated CSI driver which will determine the default filesystem to apply.
    */
  var fsType: js.UndefOr[Input[String]] = js.native
  /**
    * NodePublishSecretRef is a reference to the secret object containing sensitive information
    * to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume
    * calls. This field is optional, and  may be empty if no secret is required. If the secret
    * object contains more than one secret, all secret references are passed.
    */
  var nodePublishSecretRef: js.UndefOr[Input[LocalObjectReference]] = js.native
  /**
    * Specifies a read-only configuration for the volume. Defaults to false (read/write).
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  /**
    * VolumeAttributes stores driver-specific properties that are passed to the CSI driver.
    * Consult your driver's documentation for supported values.
    */
  var volumeAttributes: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object CSIVolumeSource {
  @scala.inline
  def apply(driver: Input[String]): CSIVolumeSource = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSIVolumeSource]
  }
  @scala.inline
  implicit class CSIVolumeSourceOps[Self <: CSIVolumeSource] (val x: Self) extends AnyVal {
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
    def withNodePublishSecretRef(value: Input[LocalObjectReference]): Self = {
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

