package typingsSlinky.pulumiKubernetes.outputMod.core.v1

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
  val accessModes: js.Array[String] = js.native
  /**
    * Represents the actual resources of the underlying volume.
    */
  val capacity: js.Object = js.native
  /**
    * Current Condition of persistent volume claim. If underlying persistent volume is being
    * resized then the Condition will be set to 'ResizeStarted'.
    */
  val conditions: js.Array[PersistentVolumeClaimCondition] = js.native
  /**
    * Phase represents the current phase of PersistentVolumeClaim.
    */
  val phase: String = js.native
}

object PersistentVolumeClaimStatus {
  @scala.inline
  def apply(
    accessModes: js.Array[String],
    capacity: js.Object,
    conditions: js.Array[PersistentVolumeClaimCondition],
    phase: String
  ): PersistentVolumeClaimStatus = {
    val __obj = js.Dynamic.literal(accessModes = accessModes.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeClaimStatus]
  }
  @scala.inline
  implicit class PersistentVolumeClaimStatusOps[Self <: PersistentVolumeClaimStatus] (val x: Self) extends AnyVal {
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
    def withCapacity(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConditions(value: js.Array[PersistentVolumeClaimCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phase")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

