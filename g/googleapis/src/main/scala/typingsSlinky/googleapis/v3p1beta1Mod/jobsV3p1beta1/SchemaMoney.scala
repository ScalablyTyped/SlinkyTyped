package typingsSlinky.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an amount of money with its currency type.
  */
@js.native
trait SchemaMoney extends js.Object {
  /**
    * The 3-letter currency code defined in ISO 4217.
    */
  var currencyCode: js.UndefOr[String] = js.native
  /**
    * Number of nano (10^-9) units of the amount. The value must be between
    * -999,999,999 and +999,999,999 inclusive. If `units` is positive, `nanos`
    * must be positive or zero. If `units` is zero, `nanos` can be positive,
    * zero, or negative. If `units` is negative, `nanos` must be negative or
    * zero. For example $-1.75 is represented as `units`=-1 and
    * `nanos`=-750,000,000.
    */
  var nanos: js.UndefOr[Double] = js.native
  /**
    * The whole units of the amount. For example if `currencyCode` is
    * `&quot;USD&quot;`, then 1 unit is one US dollar.
    */
  var units: js.UndefOr[String] = js.native
}

object SchemaMoney {
  @scala.inline
  def apply(): SchemaMoney = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMoney]
  }
  @scala.inline
  implicit class SchemaMoneyOps[Self <: SchemaMoney] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrencyCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withNanos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nanos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNanos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nanos")(js.undefined)
        ret
    }
    @scala.inline
    def withUnits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(js.undefined)
        ret
    }
  }
  
}

