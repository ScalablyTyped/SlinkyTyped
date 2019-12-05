package typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.DescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var enumTypeList: js.Array[
    typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProto.AsObject
  ]
  var extensionList: js.Array[
    typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProto.AsObject
  ]
  var extensionRangeList: js.Array[
    typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.DescriptorProto.ExtensionRange.AsObject
  ]
  var fieldList: js.Array[
    typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProto.AsObject
  ]
  var name: js.UndefOr[String] = js.undefined
  var nestedTypeList: js.Array[AsObject]
  var oneofDeclList: js.Array[
    typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.OneofDescriptorProto.AsObject
  ]
  var options: js.UndefOr[
    typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.MessageOptions.AsObject
  ] = js.undefined
  var reservedNameList: js.Array[String]
  var reservedRangeList: js.Array[
    typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.DescriptorProto.ReservedRange.AsObject
  ]
}

object AsObject {
  @scala.inline
  def apply(
    enumTypeList: js.Array[
      typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProto.AsObject
    ],
    extensionList: js.Array[
      typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProto.AsObject
    ],
    extensionRangeList: js.Array[
      typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.DescriptorProto.ExtensionRange.AsObject
    ],
    fieldList: js.Array[
      typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProto.AsObject
    ],
    nestedTypeList: js.Array[AsObject],
    oneofDeclList: js.Array[
      typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.OneofDescriptorProto.AsObject
    ],
    reservedNameList: js.Array[String],
    reservedRangeList: js.Array[
      typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.DescriptorProto.ReservedRange.AsObject
    ],
    name: String = null,
    options: typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.MessageOptions.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(enumTypeList = enumTypeList.asInstanceOf[js.Any], extensionList = extensionList.asInstanceOf[js.Any], extensionRangeList = extensionRangeList.asInstanceOf[js.Any], fieldList = fieldList.asInstanceOf[js.Any], nestedTypeList = nestedTypeList.asInstanceOf[js.Any], oneofDeclList = oneofDeclList.asInstanceOf[js.Any], reservedNameList = reservedNameList.asInstanceOf[js.Any], reservedRangeList = reservedRangeList.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

