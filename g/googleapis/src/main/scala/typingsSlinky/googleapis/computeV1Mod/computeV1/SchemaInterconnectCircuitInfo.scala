package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a single physical circuit between the Customer and Google.
  * CircuitInfo objects are created by Google, so all fields are output only.
  * Next id: 4
  */
@js.native
trait SchemaInterconnectCircuitInfo extends js.Object {
  /**
    * Customer-side demarc ID for this circuit.
    */
  var customerDemarcId: js.UndefOr[String] = js.native
  /**
    * Google-assigned unique ID for this circuit. Assigned at circuit turn-up.
    */
  var googleCircuitId: js.UndefOr[String] = js.native
  /**
    * Google-side demarc ID for this circuit. Assigned at circuit turn-up and
    * provided by Google to the customer in the LOA.
    */
  var googleDemarcId: js.UndefOr[String] = js.native
}

object SchemaInterconnectCircuitInfo {
  @scala.inline
  def apply(): SchemaInterconnectCircuitInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectCircuitInfo]
  }
  @scala.inline
  implicit class SchemaInterconnectCircuitInfoOps[Self <: SchemaInterconnectCircuitInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomerDemarcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerDemarcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerDemarcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerDemarcId")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleCircuitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleCircuitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleCircuitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleCircuitId")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleDemarcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleDemarcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleDemarcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleDemarcId")(js.undefined)
        ret
    }
  }
  
}

