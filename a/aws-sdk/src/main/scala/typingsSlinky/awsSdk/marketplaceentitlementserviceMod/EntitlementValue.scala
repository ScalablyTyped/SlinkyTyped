package typingsSlinky.awsSdk.marketplaceentitlementserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntitlementValue extends js.Object {
  /**
    * The BooleanValue field will be populated with a boolean value when the entitlement is a boolean type. Otherwise, the field will not be set.
    */
  var BooleanValue: js.UndefOr[Boolean] = js.native
  /**
    * The DoubleValue field will be populated with a double value when the entitlement is a double type. Otherwise, the field will not be set.
    */
  var DoubleValue: js.UndefOr[Double] = js.native
  /**
    * The IntegerValue field will be populated with an integer value when the entitlement is an integer type. Otherwise, the field will not be set.
    */
  var IntegerValue: js.UndefOr[Integer] = js.native
  /**
    * The StringValue field will be populated with a string value when the entitlement is a string type. Otherwise, the field will not be set.
    */
  var StringValue: js.UndefOr[String] = js.native
}

object EntitlementValue {
  @scala.inline
  def apply(): EntitlementValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntitlementValue]
  }
  @scala.inline
  implicit class EntitlementValueOps[Self <: EntitlementValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBooleanValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BooleanValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBooleanValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BooleanValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoubleValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoubleValue")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegerValue(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegerValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegerValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegerValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStringValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringValue")(js.undefined)
        ret
    }
  }
  
}

