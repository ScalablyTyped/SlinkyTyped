package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a
  * Source for provider-specific attributes
  */
@js.native
trait PersistentVolumeClaimSpec extends js.Object {
  /**
    * AccessModes contains the desired access modes the volume should have. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
    */
  var accessModes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * This field requires the VolumeSnapshotDataSource alpha feature gate to be enabled and
    * currently VolumeSnapshot is the only supported data source. If the provisioner can support
    * VolumeSnapshot data source, it will create a new volume and data will be restored to the
    * volume at the same time. If the provisioner does not support VolumeSnapshot data source,
    * volume will not be created and the failure will be reported as an event. In the future, we
    * plan to support more data source types and the behavior of the provisioner may change.
    */
  var dataSource: js.UndefOr[Input[TypedLocalObjectReference]] = js.native
  /**
    * Resources represents the minimum resources the volume should have. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
    */
  var resources: js.UndefOr[Input[ResourceRequirements]] = js.native
  /**
    * A label query over volumes to consider for binding.
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.native
  /**
    * Name of the StorageClass required by the claim. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
    */
  var storageClassName: js.UndefOr[Input[String]] = js.native
  /**
    * volumeMode defines what type of volume is required by the claim. Value of Filesystem is
    * implied when not included in claim spec. This is a beta feature.
    */
  var volumeMode: js.UndefOr[Input[String]] = js.native
  /**
    * VolumeName is the binding reference to the PersistentVolume backing this claim.
    */
  var volumeName: js.UndefOr[Input[String]] = js.native
}

object PersistentVolumeClaimSpec {
  @scala.inline
  def apply(): PersistentVolumeClaimSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistentVolumeClaimSpec]
  }
  @scala.inline
  implicit class PersistentVolumeClaimSpecOps[Self <: PersistentVolumeClaimSpec] (val x: Self) extends AnyVal {
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
    def withDataSource(value: Input[TypedLocalObjectReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: Input[ResourceRequirements]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: Input[LabelSelector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
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

