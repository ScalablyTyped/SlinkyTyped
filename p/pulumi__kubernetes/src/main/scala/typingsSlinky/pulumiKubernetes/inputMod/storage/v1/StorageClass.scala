package typingsSlinky.pulumiKubernetes.inputMod.storage.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiKubernetes.inputMod.core.v1.TopologySelectorTerm
import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.storageDotk8sDotioSlashv1
import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var allowVolumeExpansion: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Restrict the node topologies where volumes can be dynamically provisioned. Each volume
    * plugin defines its own supported topology specifications. An empty TopologySelectorTerm
    * list means there is no topology restriction. This field is only honored by servers that
    * enable the VolumeScheduling feature.
    */
  var allowedTopologies: js.UndefOr[Input[js.Array[Input[TopologySelectorTerm]]]] = js.native
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[storageDotk8sDotioSlashv1]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.StorageClass]] = js.native
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.native
  /**
    * Dynamically provisioned PersistentVolumes of this storage class are created with these
    * mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one
    * is invalid.
    */
  var mountOptions: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Parameters holds the parameters for the provisioner that should create volumes of this
    * storage class.
    */
  var parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Provisioner indicates the type of the provisioner.
    */
  var provisioner: Input[String] = js.native
  /**
    * Dynamically provisioned PersistentVolumes of this storage class are created with this
    * reclaimPolicy. Defaults to Delete.
    */
  var reclaimPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.
    * When unset, VolumeBindingImmediate is used. This field is only honored by servers that
    * enable the VolumeScheduling feature.
    */
  var volumeBindingMode: js.UndefOr[Input[String]] = js.native
}

object StorageClass {
  @scala.inline
  def apply(provisioner: Input[String]): StorageClass = {
    val __obj = js.Dynamic.literal(provisioner = provisioner.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageClass]
  }
  @scala.inline
  implicit class StorageClassOps[Self <: StorageClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvisioner(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisioner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowVolumeExpansion(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowVolumeExpansion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowVolumeExpansion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowVolumeExpansion")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedTopologies(value: Input[js.Array[Input[TopologySelectorTerm]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedTopologies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedTopologies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedTopologies")(js.undefined)
        ret
    }
    @scala.inline
    def withApiVersion(value: Input[storageDotk8sDotioSlashv1]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.StorageClass]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: Input[ObjectMeta]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
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
    def withParameters(value: Input[StringDictionary[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withReclaimPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reclaimPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReclaimPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reclaimPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeBindingMode(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeBindingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeBindingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeBindingMode")(js.undefined)
        ret
    }
  }
  
}

