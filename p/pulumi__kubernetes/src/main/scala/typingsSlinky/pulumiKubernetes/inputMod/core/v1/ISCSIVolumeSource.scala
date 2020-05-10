package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var chapAuthDiscovery: js.UndefOr[Input[Boolean]] = js.native
  /**
    * whether support iSCSI Session CHAP authentication
    */
  var chapAuthSession: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type
    * is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly
    * inferred to be "ext4" if unspecified. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#iscsi
    */
  var fsType: js.UndefOr[Input[String]] = js.native
  /**
    * Custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface
    * simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the
    * connection.
    */
  var initiatorName: js.UndefOr[Input[String]] = js.native
  /**
    * Target iSCSI Qualified Name.
    */
  var iqn: Input[String] = js.native
  /**
    * iSCSI Interface Name that uses an iSCSI transport. Defaults to 'default' (tcp).
    */
  var iscsiInterface: js.UndefOr[Input[String]] = js.native
  /**
    * iSCSI Target Lun number.
    */
  var lun: Input[Double] = js.native
  /**
    * iSCSI Target Portal List. The portal is either an IP or ip_addr:port if the port is other
    * than default (typically TCP ports 860 and 3260).
    */
  var portals: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  /**
    * CHAP Secret for iSCSI target and initiator authentication
    */
  var secretRef: js.UndefOr[Input[LocalObjectReference]] = js.native
  /**
    * iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than
    * default (typically TCP ports 860 and 3260).
    */
  var targetPortal: Input[String] = js.native
}

object ISCSIVolumeSource {
  @scala.inline
  def apply(iqn: Input[String], lun: Input[Double], targetPortal: Input[String]): ISCSIVolumeSource = {
    val __obj = js.Dynamic.literal(iqn = iqn.asInstanceOf[js.Any], lun = lun.asInstanceOf[js.Any], targetPortal = targetPortal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISCSIVolumeSource]
  }
  @scala.inline
  implicit class ISCSIVolumeSourceOps[Self <: ISCSIVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIqn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iqn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLun(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetPortal(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPortal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChapAuthDiscovery(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chapAuthDiscovery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChapAuthDiscovery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chapAuthDiscovery")(js.undefined)
        ret
    }
    @scala.inline
    def withChapAuthSession(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chapAuthSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChapAuthSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chapAuthSession")(js.undefined)
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
    def withInitiatorName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initiatorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitiatorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initiatorName")(js.undefined)
        ret
    }
    @scala.inline
    def withIscsiInterface(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iscsiInterface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIscsiInterface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iscsiInterface")(js.undefined)
        ret
    }
    @scala.inline
    def withPortals(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portals")(js.undefined)
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
    def withSecretRef(value: Input[LocalObjectReference]): Self = {
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

