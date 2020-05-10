package typingsSlinky.protobufjs.descriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDescriptorProto extends js.Object {
  var enumType: js.UndefOr[js.Array[IEnumDescriptorProto]] = js.native
  var extension: js.UndefOr[js.Array[IFieldDescriptorProto]] = js.native
  var extensionRange: js.UndefOr[js.Array[IDescriptorProtoExtensionRange]] = js.native
  var field: js.UndefOr[js.Array[IFieldDescriptorProto]] = js.native
  var name: js.UndefOr[String] = js.native
  var nestedType: js.UndefOr[js.Array[IDescriptorProto]] = js.native
  var oneofDecl: js.UndefOr[js.Array[IOneofDescriptorProto]] = js.native
  var options: js.UndefOr[IMessageOptions] = js.native
  var reservedName: js.UndefOr[js.Array[String]] = js.native
  var reservedRange: js.UndefOr[js.Array[IDescriptorProtoReservedRange]] = js.native
}

object IDescriptorProto {
  @scala.inline
  def apply(): IDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDescriptorProto]
  }
  @scala.inline
  implicit class IDescriptorProtoOps[Self <: IDescriptorProto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumType(value: js.Array[IEnumDescriptorProto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnumType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumType")(js.undefined)
        ret
    }
    @scala.inline
    def withExtension(value: js.Array[IFieldDescriptorProto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensionRange(value: js.Array[IDescriptorProtoExtensionRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensionRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionRange")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: js.Array[IFieldDescriptorProto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
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
    def withNestedType(value: js.Array[IDescriptorProto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestedType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedType")(js.undefined)
        ret
    }
    @scala.inline
    def withOneofDecl(value: js.Array[IOneofDescriptorProto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneofDecl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneofDecl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneofDecl")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: IMessageOptions): Self = {
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
    @scala.inline
    def withReservedName(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedName")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedRange(value: js.Array[IDescriptorProtoReservedRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedRange")(js.undefined)
        ret
    }
  }
  
}

