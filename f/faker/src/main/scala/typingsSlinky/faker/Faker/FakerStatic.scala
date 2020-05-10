package typingsSlinky.faker.Faker

import typingsSlinky.faker.AnonAbbreviation
import typingsSlinky.faker.AnonAbstract
import typingsSlinky.faker.AnonAccount
import typingsSlinky.faker.AnonAlphaNumeric
import typingsSlinky.faker.AnonAvatar
import typingsSlinky.faker.AnonBetween
import typingsSlinky.faker.AnonBs
import typingsSlinky.faker.AnonCity
import typingsSlinky.faker.AnonCollation
import typingsSlinky.faker.AnonColor
import typingsSlinky.faker.AnonCommonFileExt
import typingsSlinky.faker.AnonContextualCard
import typingsSlinky.faker.AnonFindName
import typingsSlinky.faker.AnonLines
import typingsSlinky.faker.AnonPhoneFormats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FakerStatic extends js.Object {
  var address: AnonCity = js.native
  var commerce: AnonColor = js.native
  var company: AnonBs = js.native
  var database: AnonCollation = js.native
  var date: AnonBetween = js.native
  var finance: AnonAccount = js.native
  var hacker: AnonAbbreviation = js.native
  var helpers: AnonContextualCard = js.native
  var image: AnonAbstract = js.native
  var internet: AnonAvatar = js.native
  var locale: String = js.native
  var lorem: AnonLines = js.native
  var name: AnonFindName = js.native
  var phone: AnonPhoneFormats = js.native
  var random: AnonAlphaNumeric = js.native
  var seedValue: js.UndefOr[Double] = js.native
  var system: AnonCommonFileExt = js.native
  def fake(str: String): String = js.native
  def seed(value: Double): Unit = js.native
  def setLocale(locale: String): Unit = js.native
}

object FakerStatic {
  @scala.inline
  def apply(
    address: AnonCity,
    commerce: AnonColor,
    company: AnonBs,
    database: AnonCollation,
    date: AnonBetween,
    fake: String => String,
    finance: AnonAccount,
    hacker: AnonAbbreviation,
    helpers: AnonContextualCard,
    image: AnonAbstract,
    internet: AnonAvatar,
    locale: String,
    lorem: AnonLines,
    name: AnonFindName,
    phone: AnonPhoneFormats,
    random: AnonAlphaNumeric,
    seed: Double => Unit,
    setLocale: String => Unit,
    system: AnonCommonFileExt
  ): FakerStatic = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], commerce = commerce.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], database = database.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], fake = js.Any.fromFunction1(fake), finance = finance.asInstanceOf[js.Any], hacker = hacker.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], internet = internet.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], lorem = lorem.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], random = random.asInstanceOf[js.Any], seed = js.Any.fromFunction1(seed), setLocale = js.Any.fromFunction1(setLocale), system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[FakerStatic]
  }
  @scala.inline
  implicit class FakerStaticOps[Self <: FakerStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: AnonCity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommerce(value: AnonColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commerce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompany(value: AnonBs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatabase(value: AnonCollation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: AnonBetween): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFake(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fake")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFinance(value: AnonAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHacker(value: AnonAbbreviation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hacker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpers(value: AnonContextualCard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: AnonAbstract): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternet(value: AnonAvatar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLorem(value: AnonLines): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lorem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: AnonFindName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhone(value: AnonPhoneFormats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRandom(value: AnonAlphaNumeric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeed(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLocale(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLocale")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSystem(value: AnonCommonFileExt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeedValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seedValue")(js.undefined)
        ret
    }
  }
  
}

