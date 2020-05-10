package typingsSlinky.protobufjs.mod.common

import typingsSlinky.protobufjs.protobufjsNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.Value message. */
@js.native
trait IValue extends js.Object {
  var boolValue: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[String] = js.native
  var listValue: js.UndefOr[IListValue] = js.native
  var nullValue: js.UndefOr[`0`] = js.native
  var numberValue: js.UndefOr[Double] = js.native
  var stringValue: js.UndefOr[String] = js.native
  var structValue: js.UndefOr[IStruct] = js.native
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
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
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
    def withNullValue(value: `0`): Self = {
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
  }
  
}

