package typingsSlinky.gapiClientAdmin

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDatetimeValue extends js.Object {
  /** Boolean value of the parameter. */
  var boolValue: js.UndefOr[Boolean] = js.native
  /** RFC 3339 formatted value of the parameter. */
  var datetimeValue: js.UndefOr[String] = js.native
  /** Integral value of the parameter. */
  var intValue: js.UndefOr[String] = js.native
  /** Nested message value of the parameter. */
  var msgValue: js.UndefOr[js.Array[Record[String, _]]] = js.native
  /** The name of the parameter. */
  var name: js.UndefOr[String] = js.native
  /** String value of the parameter. */
  var stringValue: js.UndefOr[String] = js.native
}

object AnonDatetimeValue {
  @scala.inline
  def apply(): AnonDatetimeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDatetimeValue]
  }
  @scala.inline
  implicit class AnonDatetimeValueOps[Self <: AnonDatetimeValue] (val x: Self) extends AnyVal {
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
    def withDatetimeValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetimeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatetimeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetimeValue")(js.undefined)
        ret
    }
    @scala.inline
    def withIntValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMsgValue(value: js.Array[Record[String, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsgValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgValue")(js.undefined)
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
  }
  
}

