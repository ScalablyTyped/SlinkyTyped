package typingsSlinky.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoctorTreatmentStep extends PatientTreatmentStep {
  def treat(): js.Promise[Unit] = js.native
}

object DoctorTreatmentStep {
  @scala.inline
  def apply(message: String, treat: () => js.Promise[Unit]): DoctorTreatmentStep = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], treat = js.Any.fromFunction0(treat))
    __obj.asInstanceOf[DoctorTreatmentStep]
  }
  @scala.inline
  implicit class DoctorTreatmentStepOps[Self <: DoctorTreatmentStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTreat(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treat")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

