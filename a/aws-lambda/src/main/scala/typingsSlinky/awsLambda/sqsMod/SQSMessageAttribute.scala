package typingsSlinky.awsLambda.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SQSMessageAttribute extends js.Object {
   // Not implemented. Reserved for future use.
  var binaryListValues: js.Array[scala.Nothing] = js.native
  var binaryValue: js.UndefOr[String] = js.native
   // Not implemented. Reserved for future use.
  var dataType: SQSMessageAttributeDataType = js.native
  var stringListValues: js.Array[scala.Nothing] = js.native
  var stringValue: js.UndefOr[String] = js.native
}

object SQSMessageAttribute {
  @scala.inline
  def apply(
    binaryListValues: js.Array[scala.Nothing],
    dataType: SQSMessageAttributeDataType,
    stringListValues: js.Array[scala.Nothing]
  ): SQSMessageAttribute = {
    val __obj = js.Dynamic.literal(binaryListValues = binaryListValues.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], stringListValues = stringListValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQSMessageAttribute]
  }
  @scala.inline
  implicit class SQSMessageAttributeOps[Self <: SQSMessageAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinaryListValues(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryListValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataType(value: SQSMessageAttributeDataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringListValues(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringListValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBinaryValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaryValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryValue")(js.undefined)
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
  }
  
}

