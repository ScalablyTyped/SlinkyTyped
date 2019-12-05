package typingsSlinky.googleDashProtobuf.googleProtobufStructUnderscorePbMod.Value

import typingsSlinky.googleDashProtobuf.googleProtobufStructUnderscorePbMod.NullValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var boolValue: Boolean
  var listValue: js.UndefOr[
    typingsSlinky.googleDashProtobuf.googleProtobufStructUnderscorePbMod.ListValue.AsObject
  ] = js.undefined
  var nullValue: NullValue
  var numberValue: Double
  var stringValue: String
  var structValue: js.UndefOr[
    typingsSlinky.googleDashProtobuf.googleProtobufStructUnderscorePbMod.Struct.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    boolValue: Boolean,
    nullValue: NullValue,
    numberValue: Double,
    stringValue: String,
    listValue: typingsSlinky.googleDashProtobuf.googleProtobufStructUnderscorePbMod.ListValue.AsObject = null,
    structValue: typingsSlinky.googleDashProtobuf.googleProtobufStructUnderscorePbMod.Struct.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(boolValue = boolValue.asInstanceOf[js.Any], nullValue = nullValue.asInstanceOf[js.Any], numberValue = numberValue.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any])
    if (listValue != null) __obj.updateDynamic("listValue")(listValue.asInstanceOf[js.Any])
    if (structValue != null) __obj.updateDynamic("structValue")(structValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

