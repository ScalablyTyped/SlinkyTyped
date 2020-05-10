package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedAttributeValue extends js.Object {
  /**
    * A binary data value.
    */
  var BinaryValue: js.UndefOr[BinaryAttributeValue] = js.native
  /**
    * A Boolean data value.
    */
  var BooleanValue: js.UndefOr[BooleanAttributeValue] = js.native
  /**
    * A date and time value.
    */
  var DatetimeValue: js.UndefOr[js.Date] = js.native
  /**
    * A number data value.
    */
  var NumberValue: js.UndefOr[NumberAttributeValue] = js.native
  /**
    * A string data value.
    */
  var StringValue: js.UndefOr[StringAttributeValue] = js.native
}

object TypedAttributeValue {
  @scala.inline
  def apply(): TypedAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypedAttributeValue]
  }
  @scala.inline
  implicit class TypedAttributeValueOps[Self <: TypedAttributeValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinaryValueUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BinaryValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBinaryValue(value: BinaryAttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BinaryValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaryValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BinaryValue")(js.undefined)
        ret
    }
    @scala.inline
    def withBooleanValue(value: BooleanAttributeValue): Self = {
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
    def withDatetimeValue(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatetimeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatetimeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatetimeValue")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberValue(value: NumberAttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStringValue(value: StringAttributeValue): Self = {
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

