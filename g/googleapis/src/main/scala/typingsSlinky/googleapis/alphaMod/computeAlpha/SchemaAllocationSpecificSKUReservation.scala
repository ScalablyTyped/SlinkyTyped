package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This reservation type allows to pre allocate specific instance
  * configuration.
  */
@js.native
trait SchemaAllocationSpecificSKUReservation extends js.Object {
  /**
    * Specifies number of resources that are allocated.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * [OutputOnly] Indicates how many resource are in use.
    */
  var inUseCount: js.UndefOr[String] = js.native
  /**
    * The instance properties for this specific sku reservation.
    */
  var instanceProperties: js.UndefOr[SchemaAllocationSpecificSKUAllocationReservedInstanceProperties] = js.native
}

object SchemaAllocationSpecificSKUReservation {
  @scala.inline
  def apply(): SchemaAllocationSpecificSKUReservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllocationSpecificSKUReservation]
  }
  @scala.inline
  implicit class SchemaAllocationSpecificSKUReservationOps[Self <: SchemaAllocationSpecificSKUReservation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withInUseCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inUseCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInUseCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inUseCount")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceProperties(value: SchemaAllocationSpecificSKUAllocationReservedInstanceProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceProperties")(js.undefined)
        ret
    }
  }
  
}

