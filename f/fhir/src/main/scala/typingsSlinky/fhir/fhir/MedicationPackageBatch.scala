package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies a single production run
  */
@js.native
trait MedicationPackageBatch extends BackboneElement {
  /**
    * Contains extended information for property 'expirationDate'.
    */
  var _expirationDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'lotNumber'.
    */
  var _lotNumber: js.UndefOr[Element] = js.native
  /**
    * When batch will expire
    */
  var expirationDate: js.UndefOr[dateTime] = js.native
  /**
    * Identifier assigned to batch
    */
  var lotNumber: js.UndefOr[String] = js.native
}

object MedicationPackageBatch {
  @scala.inline
  def apply(): MedicationPackageBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationPackageBatch]
  }
  @scala.inline
  implicit class MedicationPackageBatchOps[Self <: MedicationPackageBatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_expirationDate(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_expirationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_expirationDate")(js.undefined)
        ret
    }
    @scala.inline
    def with_lotNumber(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lotNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_lotNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lotNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationDate(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLotNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lotNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLotNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lotNumber")(js.undefined)
        ret
    }
  }
  
}

