package typingsSlinky.dialogflow.mod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Value. */
@js.native
trait IValue extends js.Object {
  /** Value boolValue */
  var boolValue: js.UndefOr[Boolean | Null] = js.native
  /** Value listValue */
  var listValue: js.UndefOr[IListValue | Null] = js.native
  /** Value nullValue */
  var nullValue: js.UndefOr[NullValue | Null] = js.native
  /** Value numberValue */
  var numberValue: js.UndefOr[Double | Null] = js.native
  /** Value stringValue */
  var stringValue: js.UndefOr[String | Null] = js.native
  /** Value structValue */
  var structValue: js.UndefOr[IStruct | Null] = js.native
}

object IValue {
  @scala.inline
  def apply(): IValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IValue]
  }
  @scala.inline
  implicit class IValueOps[Self <: IValue] (val x: Self) extends AnyVal {
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
    def withoutBoolValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolValue")(js.undefined)
        ret
    }
    @scala.inline
    def withBoolValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolValue")(null)
        ret
    }
    @scala.inline
    def withListValue(value: IListValue): Self = {
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
    def withListValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listValue")(null)
        ret
    }
    @scala.inline
    def withNullValue(value: NullValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullValue")(js.undefined)
        ret
    }
    @scala.inline
    def withNullValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullValue")(null)
        ret
    }
    @scala.inline
    def withNumberValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberValue")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberValue")(null)
        ret
    }
    @scala.inline
    def withStringValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStringValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(null)
        ret
    }
    @scala.inline
    def withStructValue(value: IStruct): Self = {
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
    @scala.inline
    def withStructValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structValue")(null)
        ret
    }
  }
  
}

