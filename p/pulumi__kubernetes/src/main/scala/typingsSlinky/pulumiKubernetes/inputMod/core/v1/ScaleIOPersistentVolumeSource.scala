package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ScaleIOPersistentVolumeSource represents a persistent ScaleIO volume
  */
@js.native
trait ScaleIOPersistentVolumeSource extends js.Object {
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs". Default is "xfs"
    */
  var fsType: js.UndefOr[Input[String]] = js.native
  /**
    * The host address of the ScaleIO API Gateway.
    */
  var gateway: Input[String] = js.native
  /**
    * The name of the ScaleIO Protection Domain for the configured storage.
    */
  var protectionDomain: js.UndefOr[Input[String]] = js.native
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  /**
    * SecretRef references to the secret for ScaleIO user and other sensitive information. If
    * this is not provided, Login operation will fail.
    */
  var secretRef: Input[SecretReference] = js.native
  /**
    * Flag to enable/disable SSL communication with Gateway, default false
    */
  var sslEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned.
    * Default is ThinProvisioned.
    */
  var storageMode: js.UndefOr[Input[String]] = js.native
  /**
    * The ScaleIO Storage Pool associated with the protection domain.
    */
  var storagePool: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the storage system as configured in ScaleIO.
    */
  var system: Input[String] = js.native
  /**
    * The name of a volume already created in the ScaleIO system that is associated with this
    * volume source.
    */
  var volumeName: js.UndefOr[Input[String]] = js.native
}

object ScaleIOPersistentVolumeSource {
  @scala.inline
  def apply(gateway: Input[String], secretRef: Input[SecretReference], system: Input[String]): ScaleIOPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(gateway = gateway.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleIOPersistentVolumeSource]
  }
  @scala.inline
  implicit class ScaleIOPersistentVolumeSourceOps[Self <: ScaleIOPersistentVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGateway(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecretRef(value: Input[SecretReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystem(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(value.asInstanceOf[js.Any])
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
    def withProtectionDomain(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectionDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtectionDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectionDomain")(js.undefined)
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
    def withSslEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageMode(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageMode")(js.undefined)
        ret
    }
    @scala.inline
    def withStoragePool(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storagePool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoragePool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storagePool")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeName")(js.undefined)
        ret
    }
  }
  
}

