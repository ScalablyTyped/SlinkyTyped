package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes
  * support ownership management and SELinux relabeling.
  */
@js.native
trait ISCSIVolumeSource extends js.Object {
  /**
    * whether support iSCSI Discovery CHAP authentication
    */
  val chapAuthDiscovery: Boolean = js.native
  /**
    * whether support iSCSI Session CHAP authentication
    */
  val chapAuthSession: Boolean = js.native
  /**
    * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type
    * is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly
    * inferred to be "ext4" if unspecified. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#iscsi
    */
  val fsType: String = js.native
  /**
    * Custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface
    * simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the
    * connection.
    */
  val initiatorName: String = js.native
  /**
    * Target iSCSI Qualified Name.
    */
  val iqn: String = js.native
  /**
    * iSCSI Interface Name that uses an iSCSI transport. Defaults to 'default' (tcp).
    */
  val iscsiInterface: String = js.native
  /**
    * iSCSI Target Lun number.
    */
  val lun: Double = js.native
  /**
    * iSCSI Target Portal List. The portal is either an IP or ip_addr:port if the port is other
    * than default (typically TCP ports 860 and 3260).
    */
  val portals: js.Array[String] = js.native
  /**
    * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
    */
  val readOnly: Boolean = js.native
  /**
    * CHAP Secret for iSCSI target and initiator authentication
    */
  val secretRef: LocalObjectReference = js.native
  /**
    * iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than
    * default (typically TCP ports 860 and 3260).
    */
  val targetPortal: String = js.native
}

object ISCSIVolumeSource {
  @scala.inline
  def apply(
    chapAuthDiscovery: Boolean,
    chapAuthSession: Boolean,
    fsType: String,
    initiatorName: String,
    iqn: String,
    iscsiInterface: String,
    lun: Double,
    portals: js.Array[String],
    readOnly: Boolean,
    secretRef: LocalObjectReference,
    targetPortal: String
  ): ISCSIVolumeSource = {
    val __obj = js.Dynamic.literal(chapAuthDiscovery = chapAuthDiscovery.asInstanceOf[js.Any], chapAuthSession = chapAuthSession.asInstanceOf[js.Any], fsType = fsType.asInstanceOf[js.Any], initiatorName = initiatorName.asInstanceOf[js.Any], iqn = iqn.asInstanceOf[js.Any], iscsiInterface = iscsiInterface.asInstanceOf[js.Any], lun = lun.asInstanceOf[js.Any], portals = portals.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any], targetPortal = targetPortal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISCSIVolumeSource]
  }
  @scala.inline
  implicit class ISCSIVolumeSourceOps[Self <: ISCSIVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChapAuthDiscovery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chapAuthDiscovery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChapAuthSession(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chapAuthSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFsType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitiatorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initiatorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIqn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iqn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIscsiInterface(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iscsiInterface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLun(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortals(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portals")(value.asInstanceOf[js.Any])
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
    def withTargetPortal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPortal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

