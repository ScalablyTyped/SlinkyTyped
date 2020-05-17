package typingsSlinky.faker.Faker

import typingsSlinky.faker.anon.Abbreviation
import typingsSlinky.faker.anon.Abstract
import typingsSlinky.faker.anon.Account
import typingsSlinky.faker.anon.AlphaNumeric
import typingsSlinky.faker.anon.Avatar
import typingsSlinky.faker.anon.Between
import typingsSlinky.faker.anon.Bs
import typingsSlinky.faker.anon.City
import typingsSlinky.faker.anon.Collation
import typingsSlinky.faker.anon.Color
import typingsSlinky.faker.anon.CommonFileExt
import typingsSlinky.faker.anon.FindName
import typingsSlinky.faker.anon.Lines
import typingsSlinky.faker.anon.PhoneFormats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FakerStatic extends js.Object {
  var address: City = js.native
  var commerce: Color = js.native
  var company: Bs = js.native
  var database: Collation = js.native
  var date: Between = js.native
  var finance: Account = js.native
  var hacker: Abbreviation = js.native
  var helpers: typingsSlinky.faker.anon.ContextualCard = js.native
  var image: Abstract = js.native
  var internet: Avatar = js.native
  var locale: String = js.native
  var lorem: Lines = js.native
  var name: FindName = js.native
  var phone: PhoneFormats = js.native
  var random: AlphaNumeric = js.native
  var seedValue: js.UndefOr[Double] = js.native
  var system: CommonFileExt = js.native
  def fake(str: String): String = js.native
  def seed(value: Double): Unit = js.native
  def setLocale(locale: String): Unit = js.native
}

object FakerStatic {
  @scala.inline
  def apply(
    address: City,
    commerce: Color,
    company: Bs,
    database: Collation,
    date: Between,
    fake: String => String,
    finance: Account,
    hacker: Abbreviation,
    helpers: typingsSlinky.faker.anon.ContextualCard,
    image: Abstract,
    internet: Avatar,
    locale: String,
    lorem: Lines,
    name: FindName,
    phone: PhoneFormats,
    random: AlphaNumeric,
    seed: Double => Unit,
    setLocale: String => Unit,
    system: CommonFileExt
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
    def withAddress(value: City): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommerce(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commerce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompany(value: Bs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatabase(value: Collation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: Between): Self = {
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
    def withFinance(value: Account): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHacker(value: Abbreviation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hacker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpers(value: typingsSlinky.faker.anon.ContextualCard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: Abstract): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternet(value: Avatar): Self = {
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
    def withLorem(value: Lines): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lorem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: FindName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhone(value: PhoneFormats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRandom(value: AlphaNumeric): Self = {
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
    def withSystem(value: CommonFileExt): Self = {
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

