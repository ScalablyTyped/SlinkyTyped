package typingsSlinky.faker.Faker

import typingsSlinky.faker.AnonAbbreviation
import typingsSlinky.faker.AnonAbstract
import typingsSlinky.faker.AnonAccount
import typingsSlinky.faker.AnonAlphaNumeric
import typingsSlinky.faker.AnonAvatar
import typingsSlinky.faker.AnonBetween
import typingsSlinky.faker.AnonBranch
import typingsSlinky.faker.AnonBs
import typingsSlinky.faker.AnonCity
import typingsSlinky.faker.AnonCollation
import typingsSlinky.faker.AnonColor
import typingsSlinky.faker.AnonCommonFileExt
import typingsSlinky.faker.AnonContextualCard
import typingsSlinky.faker.AnonFindName
import typingsSlinky.faker.AnonFuel
import typingsSlinky.faker.AnonLines
import typingsSlinky.faker.AnonPhoneFormats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FakerStatic extends js.Object {
  var address: AnonCity
  var commerce: AnonColor
  var company: AnonBs
  var database: AnonCollation
  var date: AnonBetween
  var finance: AnonAccount
  var git: AnonBranch
  var hacker: AnonAbbreviation
  var helpers: AnonContextualCard
  var image: AnonAbstract
  var internet: AnonAvatar
  var locale: String
  var lorem: AnonLines
  var name: AnonFindName
  var phone: AnonPhoneFormats
  var random: AnonAlphaNumeric
  var seedValue: js.UndefOr[Double] = js.undefined
  var system: AnonCommonFileExt
  var vehicle: AnonFuel
  def fake(str: String): String
  def seed(value: Double): Unit
  def setLocale(locale: String): Unit
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
    git: AnonBranch,
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
    system: AnonCommonFileExt,
    vehicle: AnonFuel,
    seedValue: Int | Double = null
  ): FakerStatic = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], commerce = commerce.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], database = database.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], fake = js.Any.fromFunction1(fake), finance = finance.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], hacker = hacker.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], internet = internet.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], lorem = lorem.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], random = random.asInstanceOf[js.Any], seed = js.Any.fromFunction1(seed), setLocale = js.Any.fromFunction1(setLocale), system = system.asInstanceOf[js.Any], vehicle = vehicle.asInstanceOf[js.Any])
    if (seedValue != null) __obj.updateDynamic("seedValue")(seedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[FakerStatic]
  }
}

