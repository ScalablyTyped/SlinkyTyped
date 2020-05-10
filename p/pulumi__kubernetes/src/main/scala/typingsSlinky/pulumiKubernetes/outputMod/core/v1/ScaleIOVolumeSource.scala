package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ScaleIOVolumeSource represents a persistent ScaleIO volume
  */
@js.native
trait ScaleIOVolumeSource extends js.Object {
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs". Default is "xfs".
    */
  val fsType: String = js.native
  /**
    * The host address of the ScaleIO API Gateway.
    */
  val gateway: String = js.native
  /**
    * The name of the ScaleIO Protection Domain for the configured storage.
    */
  val protectionDomain: String = js.native
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  val readOnly: Boolean = js.native
  /**
    * SecretRef references to the secret for ScaleIO user and other sensitive information. If
    * this is not provided, Login operation will fail.
    */
  val secretRef: LocalObjectReference = js.native
  /**
    * Flag to enable/disable SSL communication with Gateway, default false
    */
  val sslEnabled: Boolean = js.native
  /**
    * Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned.
    * Default is ThinProvisioned.
    */
  val storageMode: String = js.native
  /**
    * The ScaleIO Storage Pool associated with the protection domain.
    */
  val storagePool: String = js.native
  /**
    * The name of the storage system as configured in ScaleIO.
    */
  val system: String = js.native
  /**
    * The name of a volume already created in the ScaleIO system that is associated with this
    * volume source.
    */
  val volumeName: String = js.native
}

object ScaleIOVolumeSource {
  @scala.inline
  def apply(
    fsType: String,
    gateway: String,
    protectionDomain: String,
    readOnly: Boolean,
    secretRef: LocalObjectReference,
    sslEnabled: Boolean,
    storageMode: String,
    storagePool: String,
    system: String,
    volumeName: String
  ): ScaleIOVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], gateway = gateway.asInstanceOf[js.Any], protectionDomain = protectionDomain.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any], sslEnabled = sslEnabled.asInstanceOf[js.Any], storageMode = storageMode.asInstanceOf[js.Any], storagePool = storagePool.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], volumeName = volumeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleIOVolumeSource]
  }
  @scala.inline
  implicit class ScaleIOVolumeSourceOps[Self <: ScaleIOVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFsType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGateway(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtectionDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectionDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecretRef(value: LocalObjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSslEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorageMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoragePool(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storagePool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

