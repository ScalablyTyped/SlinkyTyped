package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of past encounter classes
  */
@js.native
trait EncounterClassHistory extends BackboneElement {
  /**
    * inpatient | outpatient | ambulatory | emergency +
    */
  var `class`: Coding = js.native
  /**
    * The time that the episode was in the specified class
    */
  var period: Period = js.native
}

object EncounterClassHistory {
  @scala.inline
  def apply(`class`: Coding, period: Period): EncounterClassHistory = {
    val __obj = js.Dynamic.literal(period = period.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncounterClassHistory]
  }
  @scala.inline
  implicit class EncounterClassHistoryOps[Self <: EncounterClassHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClass(value: Coding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

