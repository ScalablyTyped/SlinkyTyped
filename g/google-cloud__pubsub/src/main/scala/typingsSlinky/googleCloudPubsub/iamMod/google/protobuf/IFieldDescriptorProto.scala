package typingsSlinky.googleCloudPubsub.iamMod.google.protobuf

import typingsSlinky.googleCloudPubsub.iamMod.google.protobuf.FieldDescriptorProto.Label
import typingsSlinky.googleCloudPubsub.iamMod.google.protobuf.FieldDescriptorProto.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a FieldDescriptorProto. */
@js.native
trait IFieldDescriptorProto extends js.Object {
  /** FieldDescriptorProto defaultValue */
  var defaultValue: js.UndefOr[String | Null] = js.native
  /** FieldDescriptorProto extendee */
  var extendee: js.UndefOr[String | Null] = js.native
  /** FieldDescriptorProto jsonName */
  var jsonName: js.UndefOr[String | Null] = js.native
  /** FieldDescriptorProto label */
  var label: js.UndefOr[Label | Null] = js.native
  /** FieldDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.native
  /** FieldDescriptorProto number */
  var number: js.UndefOr[Double | Null] = js.native
  /** FieldDescriptorProto oneofIndex */
  var oneofIndex: js.UndefOr[Double | Null] = js.native
  /** FieldDescriptorProto options */
  var options: js.UndefOr[IFieldOptions | Null] = js.native
  /** FieldDescriptorProto type */
  var `type`: js.UndefOr[Type | Null] = js.native
  /** FieldDescriptorProto typeName */
  var typeName: js.UndefOr[String | Null] = js.native
}

object IFieldDescriptorProto {
  @scala.inline
  def apply(): IFieldDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldDescriptorProto]
  }
  @scala.inline
  implicit class IFieldDescriptorProtoOps[Self <: IFieldDescriptorProto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(null)
        ret
    }
    @scala.inline
    def withExtendee(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendee")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendeeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendee")(null)
        ret
    }
    @scala.inline
    def withJsonName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonName")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonName")(null)
        ret
    }
    @scala.inline
    def withLabel(value: Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(null)
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
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(null)
        ret
    }
    @scala.inline
    def withOneofIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneofIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneofIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneofIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withOneofIndexNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneofIndex")(null)
        ret
    }
    @scala.inline
    def withOptions(value: IFieldOptions): Self = {
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
    def withType(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(null)
        ret
    }
    @scala.inline
    def withTypeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeName")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeName")(null)
        ret
    }
  }
  
}

