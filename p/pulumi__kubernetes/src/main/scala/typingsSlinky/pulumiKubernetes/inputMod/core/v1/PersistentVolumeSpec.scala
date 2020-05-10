package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PersistentVolumeSpec is the specification of a persistent volume.
  */
@js.native
trait PersistentVolumeSpec extends js.Object {
  /**
    * AccessModes contains all ways the volume can be mounted. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes
    */
  var accessModes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host
    * machine and then exposed to the pod. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
    */
  var awsElasticBlockStore: js.UndefOr[Input[AWSElasticBlockStoreVolumeSource]] = js.native
  /**
    * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
    */
  var azureDisk: js.UndefOr[Input[AzureDiskVolumeSource]] = js.native
  /**
    * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
    */
  var azureFile: js.UndefOr[Input[AzureFilePersistentVolumeSource]] = js.native
  /**
    * A description of the persistent volume's resources and capacity. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
    */
  var capacity: js.UndefOr[Input[js.Object]] = js.native
  /**
    * CephFS represents a Ceph FS mount on the host that shares a pod's lifetime
    */
  var cephfs: js.UndefOr[Input[CephFSPersistentVolumeSource]] = js.native
  /**
    * Cinder represents a cinder volume attached and mounted on kubelets host machine. More info:
    * https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  var cinder: js.UndefOr[Input[CinderPersistentVolumeSource]] = js.native
  /**
    * ClaimRef is part of a bi-directional binding between PersistentVolume and
    * PersistentVolumeClaim. Expected to be non-nil when bound. claim.VolumeName is the
    * authoritative bind between PV and PVC. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding
    */
  var claimRef: js.UndefOr[Input[ObjectReference]] = js.native
  /**
    * CSI represents storage that is handled by an external CSI driver (Beta feature).
    */
  var csi: js.UndefOr[Input[CSIPersistentVolumeSource]] = js.native
  /**
    * FC represents a Fibre Channel resource that is attached to a kubelet's host machine and
    * then exposed to the pod.
    */
  var fc: js.UndefOr[Input[FCVolumeSource]] = js.native
  /**
    * FlexVolume represents a generic volume resource that is provisioned/attached using an exec
    * based plugin.
    */
  var flexVolume: js.UndefOr[Input[FlexPersistentVolumeSource]] = js.native
  /**
    * Flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the
    * pod for its usage. This depends on the Flocker control service being running
    */
  var flocker: js.UndefOr[Input[FlockerVolumeSource]] = js.native
  /**
    * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host
    * machine and then exposed to the pod. Provisioned by an admin. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  var gcePersistentDisk: js.UndefOr[Input[GCEPersistentDiskVolumeSource]] = js.native
  /**
    * Glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod.
    * Provisioned by an admin. More info: https://examples.k8s.io/volumes/glusterfs/README.md
    */
  var glusterfs: js.UndefOr[Input[GlusterfsPersistentVolumeSource]] = js.native
  /**
    * HostPath represents a directory on the host. Provisioned by a developer or tester. This is
    * useful for single-node development and testing only! On-host storage is not supported in
    * any way and WILL NOT WORK in a multi-node cluster. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#hostpath
    */
  var hostPath: js.UndefOr[Input[HostPathVolumeSource]] = js.native
  /**
    * ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and
    * then exposed to the pod. Provisioned by an admin.
    */
  var iscsi: js.UndefOr[Input[ISCSIPersistentVolumeSource]] = js.native
  /**
    * Local represents directly-attached storage with node affinity
    */
  var local: js.UndefOr[Input[LocalVolumeSource]] = js.native
  /**
    * A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one
    * is invalid. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options
    */
  var mountOptions: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * NFS represents an NFS mount on the host. Provisioned by an admin. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  var nfs: js.UndefOr[Input[NFSVolumeSource]] = js.native
  /**
    * NodeAffinity defines constraints that limit what nodes this volume can be accessed from.
    * This field influences the scheduling of pods that use this volume.
    */
  var nodeAffinity: js.UndefOr[Input[VolumeNodeAffinity]] = js.native
  /**
    * What happens to a persistent volume when released from its claim. Valid options are Retain
    * (default for manually created PersistentVolumes), Delete (default for dynamically
    * provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the
    * volume plugin underlying this PersistentVolume. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming
    */
  var persistentVolumeReclaimPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on
    * kubelets host machine
    */
  var photonPersistentDisk: js.UndefOr[Input[PhotonPersistentDiskVolumeSource]] = js.native
  /**
    * PortworxVolume represents a portworx volume attached and mounted on kubelets host machine
    */
  var portworxVolume: js.UndefOr[Input[PortworxVolumeSource]] = js.native
  /**
    * Quobyte represents a Quobyte mount on the host that shares a pod's lifetime
    */
  var quobyte: js.UndefOr[Input[QuobyteVolumeSource]] = js.native
  /**
    * RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More
    * info: https://examples.k8s.io/volumes/rbd/README.md
    */
  var rbd: js.UndefOr[Input[RBDPersistentVolumeSource]] = js.native
  /**
    * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
    */
  var scaleIO: js.UndefOr[Input[ScaleIOPersistentVolumeSource]] = js.native
  /**
    * Name of StorageClass to which this persistent volume belongs. Empty value means that this
    * volume does not belong to any StorageClass.
    */
  var storageClassName: js.UndefOr[Input[String]] = js.native
  /**
    * StorageOS represents a StorageOS volume that is attached to the kubelet's host machine and
    * mounted into the pod More info: https://examples.k8s.io/volumes/storageos/README.md
    */
  var storageos: js.UndefOr[Input[StorageOSPersistentVolumeSource]] = js.native
  /**
    * volumeMode defines if a volume is intended to be used with a formatted filesystem or to
    * remain in raw block state. Value of Filesystem is implied when not included in spec. This
    * is a beta feature.
    */
  var volumeMode: js.UndefOr[Input[String]] = js.native
  /**
    * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
    */
  var vsphereVolume: js.UndefOr[Input[VsphereVirtualDiskVolumeSource]] = js.native
}

object PersistentVolumeSpec {
  @scala.inline
  def apply(): PersistentVolumeSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistentVolumeSpec]
  }
  @scala.inline
  implicit class PersistentVolumeSpecOps[Self <: PersistentVolumeSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessModes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessModes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessModes")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsElasticBlockStore(value: Input[AWSElasticBlockStoreVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsElasticBlockStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsElasticBlockStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsElasticBlockStore")(js.undefined)
        ret
    }
    @scala.inline
    def withAzureDisk(value: Input[AzureDiskVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureDisk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAzureDisk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureDisk")(js.undefined)
        ret
    }
    @scala.inline
    def withAzureFile(value: Input[AzureFilePersistentVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAzureFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureFile")(js.undefined)
        ret
    }
    @scala.inline
    def withCapacity(value: Input[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(js.undefined)
        ret
    }
    @scala.inline
    def withCephfs(value: Input[CephFSPersistentVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cephfs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCephfs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cephfs")(js.undefined)
        ret
    }
    @scala.inline
    def withCinder(value: Input[CinderPersistentVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cinder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCinder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cinder")(js.undefined)
        ret
    }
    @scala.inline
    def withClaimRef(value: Input[ObjectReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaimRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimRef")(js.undefined)
        ret
    }
    @scala.inline
    def withCsi(value: Input[CSIPersistentVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csi")(js.undefined)
        ret
    }
    @scala.inline
    def withFc(value: Input[FCVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fc")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexVolume(value: Input[FlexPersistentVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexVolume")(js.undefined)
        ret
    }
    @scala.inline
    def withFlocker(value: Input[FlockerVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flocker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlocker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flocker")(js.undefined)
        ret
    }
    @scala.inline
    def withGcePersistentDisk(value: Input[GCEPersistentDiskVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcePersistentDisk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcePersistentDisk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcePersistentDisk")(js.undefined)
        ret
    }
    @scala.inline
    def withGlusterfs(value: Input[GlusterfsPersistentVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glusterfs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlusterfs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glusterfs")(js.undefined)
        ret
    }
    @scala.inline
    def withHostPath(value: Input[HostPathVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPath")(js.undefined)
        ret
    }
    @scala.inline
    def withIscsi(value: Input[ISCSIPersistentVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iscsi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIscsi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iscsi")(js.undefined)
        ret
    }
    @scala.inline
    def withLocal(value: Input[LocalVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(js.undefined)
        ret
    }
    @scala.inline
    def withMountOptions(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMountOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withNfs(value: Input[NFSVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nfs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNfs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nfs")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeAffinity(value: Input[VolumeNodeAffinity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeAffinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeAffinity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeAffinity")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistentVolumeReclaimPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentVolumeReclaimPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistentVolumeReclaimPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentVolumeReclaimPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withPhotonPersistentDisk(value: Input[PhotonPersistentDiskVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photonPersistentDisk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhotonPersistentDisk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photonPersistentDisk")(js.undefined)
        ret
    }
    @scala.inline
    def withPortworxVolume(value: Input[PortworxVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portworxVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortworxVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portworxVolume")(js.undefined)
        ret
    }
    @scala.inline
    def withQuobyte(value: Input[QuobyteVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quobyte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuobyte: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quobyte")(js.undefined)
        ret
    }
    @scala.inline
    def withRbd(value: Input[RBDPersistentVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rbd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRbd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rbd")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleIO(value: Input[ScaleIOPersistentVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleIO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleIO: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleIO")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageClassName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageos(value: Input[StorageOSPersistentVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageos")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeMode(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeMode")(js.undefined)
        ret
    }
    @scala.inline
    def withVsphereVolume(value: Input[VsphereVirtualDiskVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vsphereVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVsphereVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vsphereVolume")(js.undefined)
        ret
    }
  }
  
}

