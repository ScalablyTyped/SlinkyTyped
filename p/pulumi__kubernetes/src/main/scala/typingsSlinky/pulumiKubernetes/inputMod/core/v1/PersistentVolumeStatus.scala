package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PersistentVolumeStatus is the current status of a persistent volume.
  */
@js.native
trait PersistentVolumeStatus extends js.Object {
  /**
    * A human-readable message indicating details about why the volume is in this state.
    */
  var message: js.UndefOr[Input[String]] = js.native
  /**
    * Phase indicates if a volume is available, bound to a claim, or released by a claim. More
    * info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase
    */
  var phase: js.UndefOr[Input[String]] = js.native
  /**
    * Reason is a brief CamelCase string that describes any failure and is meant for machine
    * parsing and tidy display in the CLI.
    */
  var reason: js.UndefOr[Input[String]] = js.native
}

object PersistentVolumeStatus {
  @scala.inline
  def apply(): PersistentVolumeStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistentVolumeStatus]
  }
  @scala.inline
  implicit class PersistentVolumeStatusOps[Self <: PersistentVolumeStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
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
    @scala.inline
    def withReason(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
  }
  
}

