package typingsSlinky.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value extends js.Object {
  /**
    * An array of column values.
    */
  var arrayValues: js.UndefOr[ArrayValueList] = js.native
  /**
    * A value for a column of big integer data type.
    */
  var bigIntValue: js.UndefOr[BoxedLong] = js.native
  /**
    * A value for a column of BIT data type.
    */
  var bitValue: js.UndefOr[BoxedBoolean] = js.native
  /**
    * A value for a column of BLOB data type.
    */
  var blobValue: js.UndefOr[_Blob] = js.native
  /**
    * A value for a column of double data type.
    */
  var doubleValue: js.UndefOr[BoxedDouble] = js.native
  /**
    * A value for a column of integer data type.
    */
  var intValue: js.UndefOr[BoxedInteger] = js.native
  /**
    * A NULL value.
    */
  var isNull: js.UndefOr[BoxedBoolean] = js.native
  /**
    * A value for a column of real data type.
    */
  var realValue: js.UndefOr[BoxedFloat] = js.native
  /**
    * A value for a column of string data type.
    */
  var stringValue: js.UndefOr[String] = js.native
  /**
    * A value for a column of STRUCT data type.
    */
  var structValue: js.UndefOr[StructValue] = js.native
}

object Value {
  @scala.inline
  def apply(): Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  implicit class ValueOps[Self <: Value] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayValues(value: ArrayValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayValues")(js.undefined)
        ret
    }
    @scala.inline
    def withBigIntValue(value: BoxedLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigIntValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBigIntValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigIntValue")(js.undefined)
        ret
    }
    @scala.inline
    def withBitValue(value: BoxedBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitValue")(js.undefined)
        ret
    }
    @scala.inline
    def withBlobValueUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlobValue(value: _Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlobValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleValue(value: BoxedDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleValue")(js.undefined)
        ret
    }
    @scala.inline
    def withIntValue(value: BoxedInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intValue")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNull(value: BoxedBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNull")(js.undefined)
        ret
    }
    @scala.inline
    def withRealValue(value: BoxedFloat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStringValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStructValue(value: StructValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structValue")(js.undefined)
        ret
    }
  }
  
}

