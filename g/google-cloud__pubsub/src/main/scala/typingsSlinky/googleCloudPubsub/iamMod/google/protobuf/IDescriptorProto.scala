package typingsSlinky.googleCloudPubsub.iamMod.google.protobuf

import typingsSlinky.googleCloudPubsub.iamMod.google.protobuf.DescriptorProto.IExtensionRange
import typingsSlinky.googleCloudPubsub.iamMod.google.protobuf.DescriptorProto.IReservedRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DescriptorProto. */
@js.native
trait IDescriptorProto extends js.Object {
  /** DescriptorProto enumType */
  var enumType: js.UndefOr[js.Array[IEnumDescriptorProto] | Null] = js.native
  /** DescriptorProto extension */
  var extension: js.UndefOr[js.Array[IFieldDescriptorProto] | Null] = js.native
  /** DescriptorProto extensionRange */
  var extensionRange: js.UndefOr[js.Array[IExtensionRange] | Null] = js.native
  /** DescriptorProto field */
  var field: js.UndefOr[js.Array[IFieldDescriptorProto] | Null] = js.native
  /** DescriptorProto name */
  var name: js.UndefOr[String | Null] = js.native
  /** DescriptorProto nestedType */
  var nestedType: js.UndefOr[js.Array[IDescriptorProto] | Null] = js.native
  /** DescriptorProto oneofDecl */
  var oneofDecl: js.UndefOr[js.Array[IOneofDescriptorProto] | Null] = js.native
  /** DescriptorProto options */
  var options: js.UndefOr[IMessageOptions | Null] = js.native
  /** DescriptorProto reservedName */
  var reservedName: js.UndefOr[js.Array[String] | Null] = js.native
  /** DescriptorProto reservedRange */
  var reservedRange: js.UndefOr[js.Array[IReservedRange] | Null] = js.native
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
    def withEnumTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumType")(null)
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
    def withExtensionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(null)
        ret
    }
    @scala.inline
    def withExtensionRange(value: js.Array[IExtensionRange]): Self = {
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
    def withExtensionRangeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionRange")(null)
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
    def withFieldNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(null)
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
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
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
    def withNestedTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedType")(null)
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
    def withOneofDeclNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneofDecl")(null)
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
    def withOptionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(null)
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
    def withReservedNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedName")(null)
        ret
    }
    @scala.inline
    def withReservedRange(value: js.Array[IReservedRange]): Self = {
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
    @scala.inline
    def withReservedRangeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedRange")(null)
        ret
    }
  }
  
}

