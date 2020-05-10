package typingsSlinky.googleProtobuf.descriptorPbMod.EnumDescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var name: js.UndefOr[String] = js.native
  var options: js.UndefOr[typingsSlinky.googleProtobuf.descriptorPbMod.EnumOptions.AsObject] = js.native
  var reservedNameList: js.Array[String] = js.native
  var reservedRangeList: js.Array[
    typingsSlinky.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject
  ] = js.native
  var valueList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.EnumValueDescriptorProto.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    reservedNameList: js.Array[String],
    reservedRangeList: js.Array[
      typingsSlinky.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject
    ],
    valueList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.EnumValueDescriptorProto.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(reservedNameList = reservedNameList.asInstanceOf[js.Any], reservedRangeList = reservedRangeList.asInstanceOf[js.Any], valueList = valueList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReservedNameList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedNameList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReservedRangeList(
      value: js.Array[
          typingsSlinky.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedRangeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueList(value: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.EnumValueDescriptorProto.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueList")(value.asInstanceOf[js.Any])
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
    def withOptions(value: typingsSlinky.googleProtobuf.descriptorPbMod.EnumOptions.AsObject): Self = {
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

