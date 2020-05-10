package typingsSlinky.googleapis.v1configurationMod.gamesConfigurationV1configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a number format resource.
  */
@js.native
trait SchemaGamesNumberFormatConfiguration extends js.Object {
  /**
    * The curreny code string. Only used for CURRENCY format type.
    */
  var currencyCode: js.UndefOr[String] = js.native
  /**
    * The number of decimal places for number. Only used for NUMERIC format
    * type.
    */
  var numDecimalPlaces: js.UndefOr[Double] = js.native
  /**
    * The formatting for the number. Possible values are:   -
    * &quot;NUMERIC&quot; - Numbers are formatted to have no digits or a fixed
    * number of digits after the decimal point according to locale. An optional
    * custom unit can be added. - &quot;TIME_DURATION&quot; - Numbers are
    * formatted to hours, minutes and seconds. - &quot;CURRENCY&quot; - Numbers
    * are formatted to currency according to locale.
    */
  var numberFormatType: js.UndefOr[String] = js.native
  /**
    * An optional suffix for the NUMERIC format type. These strings follow the
    * same  plural rules as all Android string resources.
    */
  var suffix: js.UndefOr[SchemaGamesNumberAffixConfiguration] = js.native
}

object SchemaGamesNumberFormatConfiguration {
  @scala.inline
  def apply(): SchemaGamesNumberFormatConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGamesNumberFormatConfiguration]
  }
  @scala.inline
  implicit class SchemaGamesNumberFormatConfigurationOps[Self <: SchemaGamesNumberFormatConfiguration] (val x: Self) extends AnyVal {
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
    def withNumDecimalPlaces(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numDecimalPlaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumDecimalPlaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numDecimalPlaces")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberFormatType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormatType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberFormatType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormatType")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffix(value: SchemaGamesNumberAffixConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(js.undefined)
        ret
    }
  }
  
}

