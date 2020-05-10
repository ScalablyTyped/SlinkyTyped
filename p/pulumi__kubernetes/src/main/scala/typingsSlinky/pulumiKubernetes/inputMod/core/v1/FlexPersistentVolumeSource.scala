package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FlexPersistentVolumeSource represents a generic persistent volume resource that is
  * provisioned/attached using an exec based plugin.
  */
@js.native
trait FlexPersistentVolumeSource extends js.Object {
  /**
    * Driver is the name of the driver to use for this volume.
    */
  var driver: Input[String] = js.native
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs". The default filesystem depends on FlexVolume script.
    */
  var fsType: js.UndefOr[Input[String]] = js.native
  /**
    * Optional: Extra command options if any.
    */
  var options: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Optional: SecretRef is reference to the secret object containing sensitive information to
    * pass to the plugin scripts. This may be empty if no secret object is specified. If the
    * secret object contains more than one secret, all secrets are passed to the plugin scripts.
    */
  var secretRef: js.UndefOr[Input[SecretReference]] = js.native
}

object FlexPersistentVolumeSource {
  @scala.inline
  def apply(driver: Input[String]): FlexPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexPersistentVolumeSource]
  }
  @scala.inline
  implicit class FlexPersistentVolumeSourceOps[Self <: FlexPersistentVolumeSource] (val x: Self) extends AnyVal {
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
    def withOptions(value: Input[StringDictionary[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
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
    def withSecretRef(value: Input[SecretReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretRef")(js.undefined)
        ret
    }
  }
  
}

