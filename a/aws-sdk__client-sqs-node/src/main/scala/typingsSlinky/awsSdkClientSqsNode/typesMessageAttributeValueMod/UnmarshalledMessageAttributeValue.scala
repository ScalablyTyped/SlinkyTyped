package typingsSlinky.awsSdkClientSqsNode.typesMessageAttributeValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledMessageAttributeValue extends MessageAttributeValue {
  /**
    * <p>Not implemented. Reserved for future use.</p>
    */
  @JSName("BinaryListValues")
  var BinaryListValues_UnmarshalledMessageAttributeValue: js.UndefOr[js.Array[js.typedarray.Uint8Array]] = js.native
  /**
    * <p>Binary type attributes can store any binary data, such as compressed data, encrypted data, or images.</p>
    */
  @JSName("BinaryValue")
  var BinaryValue_UnmarshalledMessageAttributeValue: js.UndefOr[js.typedarray.Uint8Array] = js.native
  /**
    * <p>Not implemented. Reserved for future use.</p>
    */
  @JSName("StringListValues")
  var StringListValues_UnmarshalledMessageAttributeValue: js.UndefOr[js.Array[String]] = js.native
}

object UnmarshalledMessageAttributeValue {
  @scala.inline
  def apply(DataType: String): UnmarshalledMessageAttributeValue = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledMessageAttributeValue]
  }
  @scala.inline
  implicit class UnmarshalledMessageAttributeValueOps[Self <: UnmarshalledMessageAttributeValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinaryListValues(value: js.Array[js.typedarray.Uint8Array]): Self = {
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
    def withBinaryValue(value: js.typedarray.Uint8Array): Self = {
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
    def withStringListValues(value: js.Array[String]): Self = {
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
  }
  
}

