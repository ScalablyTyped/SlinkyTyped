package typingsSlinky.pulumiKubernetes.outputMod.core.v1

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
  val accessModes: js.Array[String] = js.native
  /**
    * AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host
    * machine and then exposed to the pod. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
    */
  val awsElasticBlockStore: AWSElasticBlockStoreVolumeSource = js.native
  /**
    * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
    */
  val azureDisk: AzureDiskVolumeSource = js.native
  /**
    * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
    */
  val azureFile: AzureFilePersistentVolumeSource = js.native
  /**
    * A description of the persistent volume's resources and capacity. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
    */
  val capacity: js.Object = js.native
  /**
    * CephFS represents a Ceph FS mount on the host that shares a pod's lifetime
    */
  val cephfs: CephFSPersistentVolumeSource = js.native
  /**
    * Cinder represents a cinder volume attached and mounted on kubelets host machine. More info:
    * https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  val cinder: CinderPersistentVolumeSource = js.native
  /**
    * ClaimRef is part of a bi-directional binding between PersistentVolume and
    * PersistentVolumeClaim. Expected to be non-nil when bound. claim.VolumeName is the
    * authoritative bind between PV and PVC. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding
    */
  val claimRef: ObjectReference = js.native
  /**
    * CSI represents storage that is handled by an external CSI driver (Beta feature).
    */
  val csi: CSIPersistentVolumeSource = js.native
  /**
    * FC represents a Fibre Channel resource that is attached to a kubelet's host machine and
    * then exposed to the pod.
    */
  val fc: FCVolumeSource = js.native
  /**
    * FlexVolume represents a generic volume resource that is provisioned/attached using an exec
    * based plugin.
    */
  val flexVolume: FlexPersistentVolumeSource = js.native
  /**
    * Flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the
    * pod for its usage. This depends on the Flocker control service being running
    */
  val flocker: FlockerVolumeSource = js.native
  /**
    * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host
    * machine and then exposed to the pod. Provisioned by an admin. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  val gcePersistentDisk: GCEPersistentDiskVolumeSource = js.native
  /**
    * Glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod.
    * Provisioned by an admin. More info: https://examples.k8s.io/volumes/glusterfs/README.md
    */
  val glusterfs: GlusterfsPersistentVolumeSource = js.native
  /**
    * HostPath represents a directory on the host. Provisioned by a developer or tester. This is
    * useful for single-node development and testing only! On-host storage is not supported in
    * any way and WILL NOT WORK in a multi-node cluster. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#hostpath
    */
  val hostPath: HostPathVolumeSource = js.native
  /**
    * ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and
    * then exposed to the pod. Provisioned by an admin.
    */
  val iscsi: ISCSIPersistentVolumeSource = js.native
  /**
    * Local represents directly-attached storage with node affinity
    */
  val local: LocalVolumeSource = js.native
  /**
    * A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one
    * is invalid. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options
    */
  val mountOptions: js.Array[String] = js.native
  /**
    * NFS represents an NFS mount on the host. Provisioned by an admin. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  val nfs: NFSVolumeSource = js.native
  /**
    * NodeAffinity defines constraints that limit what nodes this volume can be accessed from.
    * This field influences the scheduling of pods that use this volume.
    */
  val nodeAffinity: VolumeNodeAffinity = js.native
  /**
    * What happens to a persistent volume when released from its claim. Valid options are Retain
    * (default for manually created PersistentVolumes), Delete (default for dynamically
    * provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the
    * volume plugin underlying this PersistentVolume. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming
    */
  val persistentVolumeReclaimPolicy: String = js.native
  /**
    * PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on
    * kubelets host machine
    */
  val photonPersistentDisk: PhotonPersistentDiskVolumeSource = js.native
  /**
    * PortworxVolume represents a portworx volume attached and mounted on kubelets host machine
    */
  val portworxVolume: PortworxVolumeSource = js.native
  /**
    * Quobyte represents a Quobyte mount on the host that shares a pod's lifetime
    */
  val quobyte: QuobyteVolumeSource = js.native
  /**
    * RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More
    * info: https://examples.k8s.io/volumes/rbd/README.md
    */
  val rbd: RBDPersistentVolumeSource = js.native
  /**
    * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
    */
  val scaleIO: ScaleIOPersistentVolumeSource = js.native
  /**
    * Name of StorageClass to which this persistent volume belongs. Empty value means that this
    * volume does not belong to any StorageClass.
    */
  val storageClassName: String = js.native
  /**
    * StorageOS represents a StorageOS volume that is attached to the kubelet's host machine and
    * mounted into the pod More info: https://examples.k8s.io/volumes/storageos/README.md
    */
  val storageos: StorageOSPersistentVolumeSource = js.native
  /**
    * volumeMode defines if a volume is intended to be used with a formatted filesystem or to
    * remain in raw block state. Value of Filesystem is implied when not included in spec. This
    * is a beta feature.
    */
  val volumeMode: String = js.native
  /**
    * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
    */
  val vsphereVolume: VsphereVirtualDiskVolumeSource = js.native
}

object PersistentVolumeSpec {
  @scala.inline
  def apply(
    accessModes: js.Array[String],
    awsElasticBlockStore: AWSElasticBlockStoreVolumeSource,
    azureDisk: AzureDiskVolumeSource,
    azureFile: AzureFilePersistentVolumeSource,
    capacity: js.Object,
    cephfs: CephFSPersistentVolumeSource,
    cinder: CinderPersistentVolumeSource,
    claimRef: ObjectReference,
    csi: CSIPersistentVolumeSource,
    fc: FCVolumeSource,
    flexVolume: FlexPersistentVolumeSource,
    flocker: FlockerVolumeSource,
    gcePersistentDisk: GCEPersistentDiskVolumeSource,
    glusterfs: GlusterfsPersistentVolumeSource,
    hostPath: HostPathVolumeSource,
    iscsi: ISCSIPersistentVolumeSource,
    local: LocalVolumeSource,
    mountOptions: js.Array[String],
    nfs: NFSVolumeSource,
    nodeAffinity: VolumeNodeAffinity,
    persistentVolumeReclaimPolicy: String,
    photonPersistentDisk: PhotonPersistentDiskVolumeSource,
    portworxVolume: PortworxVolumeSource,
    quobyte: QuobyteVolumeSource,
    rbd: RBDPersistentVolumeSource,
    scaleIO: ScaleIOPersistentVolumeSource,
    storageClassName: String,
    storageos: StorageOSPersistentVolumeSource,
    volumeMode: String,
    vsphereVolume: VsphereVirtualDiskVolumeSource
  ): PersistentVolumeSpec = {
    val __obj = js.Dynamic.literal(accessModes = accessModes.asInstanceOf[js.Any], awsElasticBlockStore = awsElasticBlockStore.asInstanceOf[js.Any], azureDisk = azureDisk.asInstanceOf[js.Any], azureFile = azureFile.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], cephfs = cephfs.asInstanceOf[js.Any], cinder = cinder.asInstanceOf[js.Any], claimRef = claimRef.asInstanceOf[js.Any], csi = csi.asInstanceOf[js.Any], fc = fc.asInstanceOf[js.Any], flexVolume = flexVolume.asInstanceOf[js.Any], flocker = flocker.asInstanceOf[js.Any], gcePersistentDisk = gcePersistentDisk.asInstanceOf[js.Any], glusterfs = glusterfs.asInstanceOf[js.Any], hostPath = hostPath.asInstanceOf[js.Any], iscsi = iscsi.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], mountOptions = mountOptions.asInstanceOf[js.Any], nfs = nfs.asInstanceOf[js.Any], nodeAffinity = nodeAffinity.asInstanceOf[js.Any], persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy.asInstanceOf[js.Any], photonPersistentDisk = photonPersistentDisk.asInstanceOf[js.Any], portworxVolume = portworxVolume.asInstanceOf[js.Any], quobyte = quobyte.asInstanceOf[js.Any], rbd = rbd.asInstanceOf[js.Any], scaleIO = scaleIO.asInstanceOf[js.Any], storageClassName = storageClassName.asInstanceOf[js.Any], storageos = storageos.asInstanceOf[js.Any], volumeMode = volumeMode.asInstanceOf[js.Any], vsphereVolume = vsphereVolume.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeSpec]
  }
  @scala.inline
  implicit class PersistentVolumeSpecOps[Self <: PersistentVolumeSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessModes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAwsElasticBlockStore(value: AWSElasticBlockStoreVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsElasticBlockStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAzureDisk(value: AzureDiskVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureDisk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAzureFile(value: AzureFilePersistentVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapacity(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCephfs(value: CephFSPersistentVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cephfs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCinder(value: CinderPersistentVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cinder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClaimRef(value: ObjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCsi(value: CSIPersistentVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFc(value: FCVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlexVolume(value: FlexPersistentVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlocker(value: FlockerVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flocker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGcePersistentDisk(value: GCEPersistentDiskVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcePersistentDisk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlusterfs(value: GlusterfsPersistentVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glusterfs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostPath(value: HostPathVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIscsi(value: ISCSIPersistentVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iscsi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocal(value: LocalVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMountOptions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNfs(value: NFSVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nfs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeAffinity(value: VolumeNodeAffinity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeAffinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersistentVolumeReclaimPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentVolumeReclaimPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhotonPersistentDisk(value: PhotonPersistentDiskVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photonPersistentDisk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortworxVolume(value: PortworxVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portworxVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuobyte(value: QuobyteVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quobyte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRbd(value: RBDPersistentVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rbd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleIO(value: ScaleIOPersistentVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleIO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorageClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorageos(value: StorageOSPersistentVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumeMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVsphereVolume(value: VsphereVirtualDiskVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vsphereVolume")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

