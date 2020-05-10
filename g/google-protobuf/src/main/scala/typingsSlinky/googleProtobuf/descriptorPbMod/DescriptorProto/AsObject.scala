package typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var enumTypeList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.EnumDescriptorProto.AsObject] = js.native
  var extensionList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject] = js.native
  var extensionRangeList: js.Array[
    typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange.AsObject
  ] = js.native
  var fieldList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject] = js.native
  var name: js.UndefOr[String] = js.native
  var nestedTypeList: js.Array[AsObject] = js.native
  var oneofDeclList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.OneofDescriptorProto.AsObject] = js.native
  var options: js.UndefOr[typingsSlinky.googleProtobuf.descriptorPbMod.MessageOptions.AsObject] = js.native
  var reservedNameList: js.Array[String] = js.native
  var reservedRangeList: js.Array[
    typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange.AsObject
  ] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    enumTypeList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.EnumDescriptorProto.AsObject],
    extensionList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject],
    extensionRangeList: js.Array[
      typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange.AsObject
    ],
    fieldList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject],
    nestedTypeList: js.Array[AsObject],
    oneofDeclList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.OneofDescriptorProto.AsObject],
    reservedNameList: js.Array[String],
    reservedRangeList: js.Array[
      typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange.AsObject
    ]
  ): AsObject = {
    val __obj = js.Dynamic.literal(enumTypeList = enumTypeList.asInstanceOf[js.Any], extensionList = extensionList.asInstanceOf[js.Any], extensionRangeList = extensionRangeList.asInstanceOf[js.Any], fieldList = fieldList.asInstanceOf[js.Any], nestedTypeList = nestedTypeList.asInstanceOf[js.Any], oneofDeclList = oneofDeclList.asInstanceOf[js.Any], reservedNameList = reservedNameList.asInstanceOf[js.Any], reservedRangeList = reservedRangeList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumTypeList(value: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.EnumDescriptorProto.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumTypeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionList(value: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionRangeList(
      value: js.Array[
          typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange.AsObject
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionRangeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldList(value: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNestedTypeList(value: js.Array[AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedTypeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOneofDeclList(value: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.OneofDescriptorProto.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneofDeclList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReservedNameList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedNameList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReservedRangeList(
      value: js.Array[
          typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange.AsObject
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedRangeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: typingsSlinky.googleProtobuf.descriptorPbMod.MessageOptions.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

