package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderLineItemShippingDetailsMethod extends js.Object {
  /**
    * The carrier for the shipping. Optional. See shipments[].carrier for a
    * list of acceptable values.
    */
  var carrier: js.UndefOr[String] = js.native
  /**
    * Maximum transit time.
    */
  var maxDaysInTransit: js.UndefOr[Double] = js.native
  /**
    * The name of the shipping method.
    */
  var methodName: js.UndefOr[String] = js.native
  /**
    * Minimum transit time.
    */
  var minDaysInTransit: js.UndefOr[Double] = js.native
}

object SchemaOrderLineItemShippingDetailsMethod {
  @scala.inline
  def apply(): SchemaOrderLineItemShippingDetailsMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLineItemShippingDetailsMethod]
  }
  @scala.inline
  implicit class SchemaOrderLineItemShippingDetailsMethodOps[Self <: SchemaOrderLineItemShippingDetailsMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCarrier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarrier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrier")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDaysInTransit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDaysInTransit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDaysInTransit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDaysInTransit")(js.undefined)
        ret
    }
    @scala.inline
    def withMethodName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethodName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodName")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDaysInTransit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDaysInTransit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDaysInTransit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDaysInTransit")(js.undefined)
        ret
    }
  }
  
}

