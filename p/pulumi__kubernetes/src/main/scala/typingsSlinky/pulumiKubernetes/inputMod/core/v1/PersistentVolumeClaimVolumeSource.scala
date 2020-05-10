package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PersistentVolumeClaimVolumeSource references the user's PVC in the same namespace. This
  * volume finds the bound PV and mounts that volume for the pod. A
  * PersistentVolumeClaimVolumeSource is, essentially, a wrapper around another type of volume
  * that is owned by someone else (the system).
  */
@js.native
trait PersistentVolumeClaimVolumeSource extends js.Object {
  /**
    * ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using
    * this volume. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
    */
  var claimName: Input[String] = js.native
  /**
    * Will force the ReadOnly setting in VolumeMounts. Default false.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
}

object PersistentVolumeClaimVolumeSource {
  @scala.inline
  def apply(claimName: Input[String]): PersistentVolumeClaimVolumeSource = {
    val __obj = js.Dynamic.literal(claimName = claimName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeClaimVolumeSource]
  }
  @scala.inline
  implicit class PersistentVolumeClaimVolumeSourceOps[Self <: PersistentVolumeClaimVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClaimName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimName")(value.asInstanceOf[js.Any])
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
  }
  
}

