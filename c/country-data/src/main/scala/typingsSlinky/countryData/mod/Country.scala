package typingsSlinky.countryData.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Country extends js.Object {
  val alpha2: String = js.native
  val alpha3: String = js.native
  val countryCallingCodes: js.Array[String] = js.native
  val currencies: js.Array[String] = js.native
  val emoji: String = js.native
  val ioc: String = js.native
  val languages: js.Array[String] = js.native
  val name: String = js.native
  val status: String = js.native
}

object Country {
  @scala.inline
  def apply(
    alpha2: String,
    alpha3: String,
    countryCallingCodes: js.Array[String],
    currencies: js.Array[String],
    emoji: String,
    ioc: String,
    languages: js.Array[String],
    name: String,
    status: String
  ): Country = {
    val __obj = js.Dynamic.literal(alpha2 = alpha2.asInstanceOf[js.Any], alpha3 = alpha3.asInstanceOf[js.Any], countryCallingCodes = countryCallingCodes.asInstanceOf[js.Any], currencies = currencies.asInstanceOf[js.Any], emoji = emoji.asInstanceOf[js.Any], ioc = ioc.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Country]
  }
  @scala.inline
  implicit class CountryOps[Self <: Country] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlpha3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountryCallingCodes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCallingCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrencies(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmoji(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emoji")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIoc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ioc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

