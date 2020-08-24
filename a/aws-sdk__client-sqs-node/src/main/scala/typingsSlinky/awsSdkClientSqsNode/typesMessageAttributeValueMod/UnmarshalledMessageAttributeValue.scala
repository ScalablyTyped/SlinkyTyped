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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBinaryListValuesVarargs(value: js.typedarray.Uint8Array*): Self = this.set("BinaryListValues", js.Array(value :_*))
    @scala.inline
    def setBinaryListValues(value: js.Array[js.typedarray.Uint8Array]): Self = this.set("BinaryListValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinaryListValues: Self = this.set("BinaryListValues", js.undefined)
    @scala.inline
    def setBinaryValue(value: js.typedarray.Uint8Array): Self = this.set("BinaryValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinaryValue: Self = this.set("BinaryValue", js.undefined)
    @scala.inline
    def setStringListValuesVarargs(value: String*): Self = this.set("StringListValues", js.Array(value :_*))
    @scala.inline
    def setStringListValues(value: js.Array[String]): Self = this.set("StringListValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringListValues: Self = this.set("StringListValues", js.undefined)
  }
  
}

