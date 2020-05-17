package typingsSlinky.gapiClientAdmin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoolValue extends js.Object {
  /** Boolean value of the parameter. */
  var boolValue: js.UndefOr[Boolean] = js.native
  /** Integral value of the parameter. */
  var intValue: js.UndefOr[String] = js.native
  /** Multi-int value of the parameter. */
  var multiIntValue: js.UndefOr[js.Array[String]] = js.native
  /** Multi-string value of the parameter. */
  var multiValue: js.UndefOr[js.Array[String]] = js.native
  /** The name of the parameter. */
  var name: js.UndefOr[String] = js.native
  /** String value of the parameter. */
  var value: js.UndefOr[String] = js.native
}

object BoolValue {
  @scala.inline
  def apply(): BoolValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoolValue]
  }
  @scala.inline
  implicit class BoolValueOps[Self <: BoolValue] (val x: Self) extends AnyVal {
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
    def withMultiIntValue(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiIntValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiIntValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiIntValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiValue(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValue")(js.undefined)
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
    def withValue(value: String): Self = {
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
  }
  
}

