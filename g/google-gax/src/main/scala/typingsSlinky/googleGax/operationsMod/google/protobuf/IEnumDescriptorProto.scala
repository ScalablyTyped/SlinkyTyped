package typingsSlinky.googleGax.operationsMod.google.protobuf

import typingsSlinky.googleGax.operationsMod.google.protobuf.EnumDescriptorProto.IEnumReservedRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an EnumDescriptorProto. */
@js.native
trait IEnumDescriptorProto extends js.Object {
  /** EnumDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.native
  /** EnumDescriptorProto options */
  var options: js.UndefOr[IEnumOptions | Null] = js.native
  /** EnumDescriptorProto reservedName */
  var reservedName: js.UndefOr[js.Array[String] | Null] = js.native
  /** EnumDescriptorProto reservedRange */
  var reservedRange: js.UndefOr[js.Array[IEnumReservedRange] | Null] = js.native
  /** EnumDescriptorProto value */
  var value: js.UndefOr[js.Array[IEnumValueDescriptorProto] | Null] = js.native
}

object IEnumDescriptorProto {
  @scala.inline
  def apply(): IEnumDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEnumDescriptorProto]
  }
  @scala.inline
  implicit class IEnumDescriptorProtoOps[Self <: IEnumDescriptorProto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withOptions(value: IEnumOptions): Self = {
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
    def withReservedRange(value: js.Array[IEnumReservedRange]): Self = {
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
    @scala.inline
    def withValue(value: js.Array[IEnumValueDescriptorProto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

