package typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[
    typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumOptions.AsObject
  ] = js.undefined
  var reservedNameList: js.Array[String]
  var reservedRangeList: js.Array[
    typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProto.EnumReservedRange.AsObject
  ]
  var valueList: js.Array[
    typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumValueDescriptorProto.AsObject
  ]
}

object AsObject {
  @scala.inline
  def apply(
    reservedNameList: js.Array[String],
    reservedRangeList: js.Array[
      typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProto.EnumReservedRange.AsObject
    ],
    valueList: js.Array[
      typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumValueDescriptorProto.AsObject
    ],
    name: String = null,
    options: typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumOptions.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(reservedNameList = reservedNameList.asInstanceOf[js.Any], reservedRangeList = reservedRangeList.asInstanceOf[js.Any], valueList = valueList.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

