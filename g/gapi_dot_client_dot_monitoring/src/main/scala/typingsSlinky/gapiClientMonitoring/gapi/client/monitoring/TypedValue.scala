package typingsSlinky.gapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedValue extends js.Object {
  /** A Boolean value: true or false. */
  var boolValue: js.UndefOr[Boolean] = js.native
  /** A distribution value. */
  var distributionValue: js.UndefOr[Distribution] = js.native
  /**
    * A 64-bit double-precision floating-point number. Its magnitude is approximately &plusmn;10<sup>&plusmn;300</sup> and it has 16 significant digits of
    * precision.
    */
  var doubleValue: js.UndefOr[Double] = js.native
  /** A 64-bit integer. Its range is approximately &plusmn;9.2x10<sup>18</sup>. */
  var int64Value: js.UndefOr[String] = js.native
  /** A variable-length string value. */
  var stringValue: js.UndefOr[String] = js.native
}

object TypedValue {
  @scala.inline
  def apply(): TypedValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypedValue]
  }
  @scala.inline
  implicit class TypedValueOps[Self <: TypedValue] (val x: Self) extends AnyVal {
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
    def withDistributionValue(value: Distribution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistributionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributionValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleValue")(js.undefined)
        ret
    }
    @scala.inline
    def withInt64Value(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int64Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInt64Value: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int64Value")(js.undefined)
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

