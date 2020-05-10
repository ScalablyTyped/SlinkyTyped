package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PersistentVolumeClaimStatus is the current status of a persistent volume claim.
  */
@js.native
trait PersistentVolumeClaimStatus extends js.Object {
  /**
    * AccessModes contains the actual access modes the volume backing the PVC has. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
    */
  var accessModes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Represents the actual resources of the underlying volume.
    */
  var capacity: js.UndefOr[Input[js.Object]] = js.native
  /**
    * Current Condition of persistent volume claim. If underlying persistent volume is being
    * resized then the Condition will be set to 'ResizeStarted'.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[PersistentVolumeClaimCondition]]]] = js.native
  /**
    * Phase represents the current phase of PersistentVolumeClaim.
    */
  var phase: js.UndefOr[Input[String]] = js.native
}

object PersistentVolumeClaimStatus {
  @scala.inline
  def apply(): PersistentVolumeClaimStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistentVolumeClaimStatus]
  }
  @scala.inline
  implicit class PersistentVolumeClaimStatusOps[Self <: PersistentVolumeClaimStatus] (val x: Self) extends AnyVal {
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
    def withConditions(value: Input[js.Array[Input[PersistentVolumeClaimCondition]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(js.undefined)
        ret
    }
    @scala.inline
    def withPhase(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phase")(js.undefined)
        ret
    }
  }
  
}

