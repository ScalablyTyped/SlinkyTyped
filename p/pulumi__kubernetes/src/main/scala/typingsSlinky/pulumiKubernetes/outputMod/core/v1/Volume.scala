package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Volume represents a named volume in a pod that may be accessed by any container in the pod.
  */
@js.native
trait Volume extends js.Object {
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
  val azureFile: AzureFileVolumeSource = js.native
  /**
    * CephFS represents a Ceph FS mount on the host that shares a pod's lifetime
    */
  val cephfs: CephFSVolumeSource = js.native
  /**
    * Cinder represents a cinder volume attached and mounted on kubelets host machine. More info:
    * https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  val cinder: CinderVolumeSource = js.native
  /**
    * ConfigMap represents a configMap that should populate this volume
    */
  val configMap: ConfigMapVolumeSource = js.native
  /**
    * CSI (Container Storage Interface) represents storage that is handled by an external CSI
    * driver (Alpha feature).
    */
  val csi: CSIVolumeSource = js.native
  /**
    * DownwardAPI represents downward API about the pod that should populate this volume
    */
  val downwardAPI: DownwardAPIVolumeSource = js.native
  /**
    * EmptyDir represents a temporary directory that shares a pod's lifetime. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#emptydir
    */
  val emptyDir: EmptyDirVolumeSource = js.native
  /**
    * FC represents a Fibre Channel resource that is attached to a kubelet's host machine and
    * then exposed to the pod.
    */
  val fc: FCVolumeSource = js.native
  /**
    * FlexVolume represents a generic volume resource that is provisioned/attached using an exec
    * based plugin.
    */
  val flexVolume: FlexVolumeSource = js.native
  /**
    * Flocker represents a Flocker volume attached to a kubelet's host machine. This depends on
    * the Flocker control service being running
    */
  val flocker: FlockerVolumeSource = js.native
  /**
    * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host
    * machine and then exposed to the pod. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  val gcePersistentDisk: GCEPersistentDiskVolumeSource = js.native
  /**
    * GitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is
    * deprecated. To provision a container with a git repo, mount an EmptyDir into an
    * InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's
    * container.
    */
  val gitRepo: GitRepoVolumeSource = js.native
  /**
    * Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info:
    * https://examples.k8s.io/volumes/glusterfs/README.md
    */
  val glusterfs: GlusterfsVolumeSource = js.native
  /**
    * HostPath represents a pre-existing file or directory on the host machine that is directly
    * exposed to the container. This is generally used for system agents or other privileged
    * things that are allowed to see the host machine. Most containers will NOT need this. More
    * info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
    */
  val hostPath: HostPathVolumeSource = js.native
  /**
    * ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and
    * then exposed to the pod. More info: https://examples.k8s.io/volumes/iscsi/README.md
    */
  val iscsi: ISCSIVolumeSource = js.native
  /**
    * Volume's name. Must be a DNS_LABEL and unique within the pod. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  val name: String = js.native
  /**
    * NFS represents an NFS mount on the host that shares a pod's lifetime More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  val nfs: NFSVolumeSource = js.native
  /**
    * PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the
    * same namespace. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
    */
  val persistentVolumeClaim: PersistentVolumeClaimVolumeSource = js.native
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
    * Items for all in one resources secrets, configmaps, and downward API
    */
  val projected: ProjectedVolumeSource = js.native
  /**
    * Quobyte represents a Quobyte mount on the host that shares a pod's lifetime
    */
  val quobyte: QuobyteVolumeSource = js.native
  /**
    * RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More
    * info: https://examples.k8s.io/volumes/rbd/README.md
    */
  val rbd: RBDVolumeSource = js.native
  /**
    * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
    */
  val scaleIO: ScaleIOVolumeSource = js.native
  /**
    * Secret represents a secret that should populate this volume. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#secret
    */
  val secret: SecretVolumeSource = js.native
  /**
    * StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
    */
  val storageos: StorageOSVolumeSource = js.native
  /**
    * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
    */
  val vsphereVolume: VsphereVirtualDiskVolumeSource = js.native
}

object Volume {
  @scala.inline
  def apply(
    awsElasticBlockStore: AWSElasticBlockStoreVolumeSource,
    azureDisk: AzureDiskVolumeSource,
    azureFile: AzureFileVolumeSource,
    cephfs: CephFSVolumeSource,
    cinder: CinderVolumeSource,
    configMap: ConfigMapVolumeSource,
    csi: CSIVolumeSource,
    downwardAPI: DownwardAPIVolumeSource,
    emptyDir: EmptyDirVolumeSource,
    fc: FCVolumeSource,
    flexVolume: FlexVolumeSource,
    flocker: FlockerVolumeSource,
    gcePersistentDisk: GCEPersistentDiskVolumeSource,
    gitRepo: GitRepoVolumeSource,
    glusterfs: GlusterfsVolumeSource,
    hostPath: HostPathVolumeSource,
    iscsi: ISCSIVolumeSource,
    name: String,
    nfs: NFSVolumeSource,
    persistentVolumeClaim: PersistentVolumeClaimVolumeSource,
    photonPersistentDisk: PhotonPersistentDiskVolumeSource,
    portworxVolume: PortworxVolumeSource,
    projected: ProjectedVolumeSource,
    quobyte: QuobyteVolumeSource,
    rbd: RBDVolumeSource,
    scaleIO: ScaleIOVolumeSource,
    secret: SecretVolumeSource,
    storageos: StorageOSVolumeSource,
    vsphereVolume: VsphereVirtualDiskVolumeSource
  ): Volume = {
    val __obj = js.Dynamic.literal(awsElasticBlockStore = awsElasticBlockStore.asInstanceOf[js.Any], azureDisk = azureDisk.asInstanceOf[js.Any], azureFile = azureFile.asInstanceOf[js.Any], cephfs = cephfs.asInstanceOf[js.Any], cinder = cinder.asInstanceOf[js.Any], configMap = configMap.asInstanceOf[js.Any], csi = csi.asInstanceOf[js.Any], downwardAPI = downwardAPI.asInstanceOf[js.Any], emptyDir = emptyDir.asInstanceOf[js.Any], fc = fc.asInstanceOf[js.Any], flexVolume = flexVolume.asInstanceOf[js.Any], flocker = flocker.asInstanceOf[js.Any], gcePersistentDisk = gcePersistentDisk.asInstanceOf[js.Any], gitRepo = gitRepo.asInstanceOf[js.Any], glusterfs = glusterfs.asInstanceOf[js.Any], hostPath = hostPath.asInstanceOf[js.Any], iscsi = iscsi.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nfs = nfs.asInstanceOf[js.Any], persistentVolumeClaim = persistentVolumeClaim.asInstanceOf[js.Any], photonPersistentDisk = photonPersistentDisk.asInstanceOf[js.Any], portworxVolume = portworxVolume.asInstanceOf[js.Any], projected = projected.asInstanceOf[js.Any], quobyte = quobyte.asInstanceOf[js.Any], rbd = rbd.asInstanceOf[js.Any], scaleIO = scaleIO.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], storageos = storageos.asInstanceOf[js.Any], vsphereVolume = vsphereVolume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volume]
  }
  @scala.inline
  implicit class VolumeOps[Self <: Volume] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withAzureFile(value: AzureFileVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCephfs(value: CephFSVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cephfs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCinder(value: CinderVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cinder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigMap(value: ConfigMapVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCsi(value: CSIVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownwardAPI(value: DownwardAPIVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downwardAPI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmptyDir(value: EmptyDirVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFc(value: FCVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlexVolume(value: FlexVolumeSource): Self = {
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
    def withGitRepo(value: GitRepoVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlusterfs(value: GlusterfsVolumeSource): Self = {
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
    def withIscsi(value: ISCSIVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iscsi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNfs(value: NFSVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nfs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersistentVolumeClaim(value: PersistentVolumeClaimVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentVolumeClaim")(value.asInstanceOf[js.Any])
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
    def withProjected(value: ProjectedVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuobyte(value: QuobyteVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quobyte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRbd(value: RBDVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rbd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleIO(value: ScaleIOVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleIO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecret(value: SecretVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorageos(value: StorageOSVolumeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageos")(value.asInstanceOf[js.Any])
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

