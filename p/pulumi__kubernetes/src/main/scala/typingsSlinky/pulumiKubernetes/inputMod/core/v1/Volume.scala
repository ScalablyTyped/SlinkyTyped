package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var awsElasticBlockStore: js.UndefOr[Input[AWSElasticBlockStoreVolumeSource]] = js.native
  /**
    * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
    */
  var azureDisk: js.UndefOr[Input[AzureDiskVolumeSource]] = js.native
  /**
    * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
    */
  var azureFile: js.UndefOr[Input[AzureFileVolumeSource]] = js.native
  /**
    * CephFS represents a Ceph FS mount on the host that shares a pod's lifetime
    */
  var cephfs: js.UndefOr[Input[CephFSVolumeSource]] = js.native
  /**
    * Cinder represents a cinder volume attached and mounted on kubelets host machine. More info:
    * https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  var cinder: js.UndefOr[Input[CinderVolumeSource]] = js.native
  /**
    * ConfigMap represents a configMap that should populate this volume
    */
  var configMap: js.UndefOr[Input[ConfigMapVolumeSource]] = js.native
  /**
    * CSI (Container Storage Interface) represents storage that is handled by an external CSI
    * driver (Alpha feature).
    */
  var csi: js.UndefOr[Input[CSIVolumeSource]] = js.native
  /**
    * DownwardAPI represents downward API about the pod that should populate this volume
    */
  var downwardAPI: js.UndefOr[Input[DownwardAPIVolumeSource]] = js.native
  /**
    * EmptyDir represents a temporary directory that shares a pod's lifetime. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#emptydir
    */
  var emptyDir: js.UndefOr[Input[EmptyDirVolumeSource]] = js.native
  /**
    * FC represents a Fibre Channel resource that is attached to a kubelet's host machine and
    * then exposed to the pod.
    */
  var fc: js.UndefOr[Input[FCVolumeSource]] = js.native
  /**
    * FlexVolume represents a generic volume resource that is provisioned/attached using an exec
    * based plugin.
    */
  var flexVolume: js.UndefOr[Input[FlexVolumeSource]] = js.native
  /**
    * Flocker represents a Flocker volume attached to a kubelet's host machine. This depends on
    * the Flocker control service being running
    */
  var flocker: js.UndefOr[Input[FlockerVolumeSource]] = js.native
  /**
    * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host
    * machine and then exposed to the pod. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  var gcePersistentDisk: js.UndefOr[Input[GCEPersistentDiskVolumeSource]] = js.native
  /**
    * GitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is
    * deprecated. To provision a container with a git repo, mount an EmptyDir into an
    * InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's
    * container.
    */
  var gitRepo: js.UndefOr[Input[GitRepoVolumeSource]] = js.native
  /**
    * Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info:
    * https://examples.k8s.io/volumes/glusterfs/README.md
    */
  var glusterfs: js.UndefOr[Input[GlusterfsVolumeSource]] = js.native
  /**
    * HostPath represents a pre-existing file or directory on the host machine that is directly
    * exposed to the container. This is generally used for system agents or other privileged
    * things that are allowed to see the host machine. Most containers will NOT need this. More
    * info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
    */
  var hostPath: js.UndefOr[Input[HostPathVolumeSource]] = js.native
  /**
    * ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and
    * then exposed to the pod. More info: https://examples.k8s.io/volumes/iscsi/README.md
    */
  var iscsi: js.UndefOr[Input[ISCSIVolumeSource]] = js.native
  /**
    * Volume's name. Must be a DNS_LABEL and unique within the pod. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: Input[String] = js.native
  /**
    * NFS represents an NFS mount on the host that shares a pod's lifetime More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  var nfs: js.UndefOr[Input[NFSVolumeSource]] = js.native
  /**
    * PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the
    * same namespace. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
    */
  var persistentVolumeClaim: js.UndefOr[Input[PersistentVolumeClaimVolumeSource]] = js.native
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
    * Items for all in one resources secrets, configmaps, and downward API
    */
  var projected: js.UndefOr[Input[ProjectedVolumeSource]] = js.native
  /**
    * Quobyte represents a Quobyte mount on the host that shares a pod's lifetime
    */
  var quobyte: js.UndefOr[Input[QuobyteVolumeSource]] = js.native
  /**
    * RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More
    * info: https://examples.k8s.io/volumes/rbd/README.md
    */
  var rbd: js.UndefOr[Input[RBDVolumeSource]] = js.native
  /**
    * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
    */
  var scaleIO: js.UndefOr[Input[ScaleIOVolumeSource]] = js.native
  /**
    * Secret represents a secret that should populate this volume. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#secret
    */
  var secret: js.UndefOr[Input[SecretVolumeSource]] = js.native
  /**
    * StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
    */
  var storageos: js.UndefOr[Input[StorageOSVolumeSource]] = js.native
  /**
    * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
    */
  var vsphereVolume: js.UndefOr[Input[VsphereVirtualDiskVolumeSource]] = js.native
}

object Volume {
  @scala.inline
  def apply(name: Input[String]): Volume = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volume]
  }
  @scala.inline
  implicit class VolumeOps[Self <: Volume] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
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
    def withAzureFile(value: Input[AzureFileVolumeSource]): Self = {
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
    def withCephfs(value: Input[CephFSVolumeSource]): Self = {
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
    def withCinder(value: Input[CinderVolumeSource]): Self = {
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
    def withConfigMap(value: Input[ConfigMapVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configMap")(js.undefined)
        ret
    }
    @scala.inline
    def withCsi(value: Input[CSIVolumeSource]): Self = {
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
    def withDownwardAPI(value: Input[DownwardAPIVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downwardAPI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownwardAPI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downwardAPI")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyDir(value: Input[EmptyDirVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyDir")(js.undefined)
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
    def withFlexVolume(value: Input[FlexVolumeSource]): Self = {
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
    def withGitRepo(value: Input[GitRepoVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGitRepo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitRepo")(js.undefined)
        ret
    }
    @scala.inline
    def withGlusterfs(value: Input[GlusterfsVolumeSource]): Self = {
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
    def withIscsi(value: Input[ISCSIVolumeSource]): Self = {
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
    def withPersistentVolumeClaim(value: Input[PersistentVolumeClaimVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentVolumeClaim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistentVolumeClaim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentVolumeClaim")(js.undefined)
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
    def withProjected(value: Input[ProjectedVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projected")(js.undefined)
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
    def withRbd(value: Input[RBDVolumeSource]): Self = {
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
    def withScaleIO(value: Input[ScaleIOVolumeSource]): Self = {
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
    def withSecret(value: Input[SecretVolumeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageos(value: Input[StorageOSVolumeSource]): Self = {
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

