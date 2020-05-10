package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Device changed in procedure
  */
@js.native
trait ProcedureFocalDevice extends BackboneElement {
  /**
    * Kind of change to device
    */
  var action: js.UndefOr[CodeableConcept] = js.native
  /**
    * Device that was changed
    */
  var manipulated: Reference = js.native
}

object ProcedureFocalDevice {
  @scala.inline
  def apply(manipulated: Reference): ProcedureFocalDevice = {
    val __obj = js.Dynamic.literal(manipulated = manipulated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcedureFocalDevice]
  }
  @scala.inline
  implicit class ProcedureFocalDeviceOps[Self <: ProcedureFocalDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManipulated(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manipulated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAction(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
  }
  
}

