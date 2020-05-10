package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
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
  val driver: String = js.native
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs". The default filesystem depends on FlexVolume script.
    */
  val fsType: String = js.native
  /**
    * Optional: Extra command options if any.
    */
  val options: StringDictionary[String] = js.native
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  val readOnly: Boolean = js.native
  /**
    * Optional: SecretRef is reference to the secret object containing sensitive information to
    * pass to the plugin scripts. This may be empty if no secret object is specified. If the
    * secret object contains more than one secret, all secrets are passed to the plugin scripts.
    */
  val secretRef: SecretReference = js.native
}

object FlexPersistentVolumeSource {
  @scala.inline
  def apply(
    driver: String,
    fsType: String,
    options: StringDictionary[String],
    readOnly: Boolean,
    secretRef: SecretReference
  ): FlexPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any], fsType = fsType.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexPersistentVolumeSource]
  }
  @scala.inline
  implicit class FlexPersistentVolumeSourceOps[Self <: FlexPersistentVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withOptions(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecretRef(value: SecretReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretRef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

