package typingsSlinky.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageAttributeValue extends js.Object {
  /**
    * Not implemented. Reserved for future use.
    */
  var BinaryListValues: js.UndefOr[BinaryList] = js.native
  /**
    * Binary type attributes can store any binary data, such as compressed data, encrypted data, or images.
    */
  var BinaryValue: js.UndefOr[Binary] = js.native
  /**
    * Amazon SQS supports the following logical data types: String, Number, and Binary. For the Number data type, you must use StringValue. You can also append custom labels. For more information, see Amazon SQS Message Attributes in the Amazon Simple Queue Service Developer Guide.
    */
  var DataType: String = js.native
  /**
    * Not implemented. Reserved for future use.
    */
  var StringListValues: js.UndefOr[StringList] = js.native
  /**
    * Strings are Unicode with UTF-8 binary encoding. For a list of code values, see ASCII Printable Characters.
    */
  var StringValue: js.UndefOr[String] = js.native
}

object MessageAttributeValue {
  @scala.inline
  def apply(DataType: String): MessageAttributeValue = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageAttributeValue]
  }
  @scala.inline
  implicit class MessageAttributeValueOps[Self <: MessageAttributeValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBinaryListValues(value: BinaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BinaryListValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaryListValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BinaryListValues")(js.undefined)
        ret
    }
    @scala.inline
    def withBinaryValueUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BinaryValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBinaryValue(value: Binary): Self = {
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
    def withStringListValues(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringListValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringListValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringListValues")(js.undefined)
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

