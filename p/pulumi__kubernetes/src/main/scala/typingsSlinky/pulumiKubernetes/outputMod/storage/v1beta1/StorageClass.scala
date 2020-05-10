package typingsSlinky.pulumiKubernetes.outputMod.storage.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiKubernetes.outputMod.core.v1.TopologySelectorTerm
import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.storageDotk8sDotioSlashv1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StorageClass describes the parameters for a class of storage for which PersistentVolumes can
  * be dynamically provisioned.
  *
  * StorageClasses are non-namespaced; the name of the storage class according to etcd is in
  * ObjectMeta.Name.
  */
@js.native
trait StorageClass extends js.Object {
  /**
    * AllowVolumeExpansion shows whether the storage class allow volume expand
    */
  val allowVolumeExpansion: Boolean = js.native
  /**
    * Restrict the node topologies where volumes can be dynamically provisioned. Each volume
    * plugin defines its own supported topology specifications. An empty TopologySelectorTerm
    * list means there is no topology restriction. This field is only honored by servers that
    * enable the VolumeScheduling feature.
    */
  val allowedTopologies: js.Array[TopologySelectorTerm] = js.native
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: storageDotk8sDotioSlashv1beta1 = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.StorageClass = js.native
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta = js.native
  /**
    * Dynamically provisioned PersistentVolumes of this storage class are created with these
    * mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one
    * is invalid.
    */
  val mountOptions: js.Array[String] = js.native
  /**
    * Parameters holds the parameters for the provisioner that should create volumes of this
    * storage class.
    */
  val parameters: StringDictionary[String] = js.native
  /**
    * Provisioner indicates the type of the provisioner.
    */
  val provisioner: String = js.native
  /**
    * Dynamically provisioned PersistentVolumes of this storage class are created with this
    * reclaimPolicy. Defaults to Delete.
    */
  val reclaimPolicy: String = js.native
  /**
    * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.
    * When unset, VolumeBindingImmediate is used. This field is only honored by servers that
    * enable the VolumeScheduling feature.
    */
  val volumeBindingMode: String = js.native
}

object StorageClass {
  @scala.inline
  def apply(
    allowVolumeExpansion: Boolean,
    allowedTopologies: js.Array[TopologySelectorTerm],
    apiVersion: storageDotk8sDotioSlashv1beta1,
    kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.StorageClass,
    metadata: ObjectMeta,
    mountOptions: js.Array[String],
    parameters: StringDictionary[String],
    provisioner: String,
    reclaimPolicy: String,
    volumeBindingMode: String
  ): StorageClass = {
    val __obj = js.Dynamic.literal(allowVolumeExpansion = allowVolumeExpansion.asInstanceOf[js.Any], allowedTopologies = allowedTopologies.asInstanceOf[js.Any], apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mountOptions = mountOptions.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], provisioner = provisioner.asInstanceOf[js.Any], reclaimPolicy = reclaimPolicy.asInstanceOf[js.Any], volumeBindingMode = volumeBindingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageClass]
  }
  @scala.inline
  implicit class StorageClassOps[Self <: StorageClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowVolumeExpansion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowVolumeExpansion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedTopologies(value: js.Array[TopologySelectorTerm]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedTopologies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiVersion(value: storageDotk8sDotioSlashv1beta1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.StorageClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: ObjectMeta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMountOptions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvisioner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisioner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReclaimPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reclaimPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumeBindingMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeBindingMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

