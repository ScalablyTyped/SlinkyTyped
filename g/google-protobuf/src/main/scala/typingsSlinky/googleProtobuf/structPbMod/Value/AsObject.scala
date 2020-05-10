package typingsSlinky.googleProtobuf.structPbMod.Value

import typingsSlinky.googleProtobuf.structPbMod.NullValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var boolValue: Boolean = js.native
  var listValue: js.UndefOr[typingsSlinky.googleProtobuf.structPbMod.ListValue.AsObject] = js.native
  var nullValue: NullValue = js.native
  var numberValue: Double = js.native
  var stringValue: String = js.native
  var structValue: js.UndefOr[typingsSlinky.googleProtobuf.structPbMod.Struct.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(boolValue: Boolean, nullValue: NullValue, numberValue: Double, stringValue: String): AsObject = {
    val __obj = js.Dynamic.literal(boolValue = boolValue.asInstanceOf[js.Any], nullValue = nullValue.asInstanceOf[js.Any], numberValue = numberValue.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoolValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNullValue(value: NullValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListValue(value: typingsSlinky.googleProtobuf.structPbMod.ListValue.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStructValue(value: typingsSlinky.googleProtobuf.structPbMod.Struct.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structValue")(js.undefined)
        ret
    }
  }
  
}

