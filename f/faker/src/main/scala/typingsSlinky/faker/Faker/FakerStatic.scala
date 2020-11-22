package typingsSlinky.faker.Faker

import typingsSlinky.faker.anon.Abbreviation
import typingsSlinky.faker.anon.Abstract
import typingsSlinky.faker.anon.Account
import typingsSlinky.faker.anon.Alpha
import typingsSlinky.faker.anon.Avatar
import typingsSlinky.faker.anon.Between
import typingsSlinky.faker.anon.Branch
import typingsSlinky.faker.anon.Bs
import typingsSlinky.faker.anon.CardinalDirection
import typingsSlinky.faker.anon.Collation
import typingsSlinky.faker.anon.Color
import typingsSlinky.faker.anon.CommonFileExt
import typingsSlinky.faker.anon.FindName
import typingsSlinky.faker.anon.Fuel
import typingsSlinky.faker.anon.Genre
import typingsSlinky.faker.anon.Lines
import typingsSlinky.faker.anon.PhoneFormats
import typingsSlinky.faker.anon.Recent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FakerStatic extends js.Object {
  
  var address: CardinalDirection = js.native
  
  var commerce: Color = js.native
  
  var company: Bs = js.native
  
  var database: Collation = js.native
  
  var date: Between = js.native
  
  def fake(str: String): String = js.native
  
  var finance: Account = js.native
  
  var git: Branch = js.native
  
  var hacker: Abbreviation = js.native
  
  var helpers: typingsSlinky.faker.anon.ContextualCard = js.native
  
  var image: Abstract = js.native
  
  var internet: Avatar = js.native
  
  var locale: String = js.native
  
  var lorem: Lines = js.native
  
  var music: Genre = js.native
  
  var name: FindName = js.native
  
  var phone: PhoneFormats = js.native
  
  var random: Alpha = js.native
  
  def seed(value: Double): Unit = js.native
  
  var seedValue: js.UndefOr[Double] = js.native
  
  def setLocale(locale: String): Unit = js.native
  
  var system: CommonFileExt = js.native
  
  var time: Recent = js.native
  
  var vehicle: Fuel = js.native
}
object FakerStatic {
  
  @scala.inline
  def apply(
    address: CardinalDirection,
    commerce: Color,
    company: Bs,
    database: Collation,
    date: Between,
    fake: String => String,
    finance: Account,
    git: Branch,
    hacker: Abbreviation,
    helpers: typingsSlinky.faker.anon.ContextualCard,
    image: Abstract,
    internet: Avatar,
    locale: String,
    lorem: Lines,
    music: Genre,
    name: FindName,
    phone: PhoneFormats,
    random: Alpha,
    seed: Double => Unit,
    setLocale: String => Unit,
    system: CommonFileExt,
    time: Recent,
    vehicle: Fuel
  ): FakerStatic = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], commerce = commerce.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], database = database.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], fake = js.Any.fromFunction1(fake), finance = finance.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], hacker = hacker.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], internet = internet.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], lorem = lorem.asInstanceOf[js.Any], music = music.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], random = random.asInstanceOf[js.Any], seed = js.Any.fromFunction1(seed), setLocale = js.Any.fromFunction1(setLocale), system = system.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], vehicle = vehicle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FakerStatic]
  }
  
  @scala.inline
  implicit class FakerStaticOps[Self <: FakerStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress(value: CardinalDirection): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommerce(value: Color): Self = this.set("commerce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompany(value: Bs): Self = this.set("company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabase(value: Collation): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: Between): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFake(value: String => String): Self = this.set("fake", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFinance(value: Account): Self = this.set("finance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGit(value: Branch): Self = this.set("git", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHacker(value: Abbreviation): Self = this.set("hacker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpers(value: typingsSlinky.faker.anon.ContextualCard): Self = this.set("helpers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: Abstract): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternet(value: Avatar): Self = this.set("internet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLorem(value: Lines): Self = this.set("lorem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMusic(value: Genre): Self = this.set("music", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: FindName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone(value: PhoneFormats): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRandom(value: Alpha): Self = this.set("random", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeed(value: Double => Unit): Self = this.set("seed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLocale(value: String => Unit): Self = this.set("setLocale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSystem(value: CommonFileExt): Self = this.set("system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Recent): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVehicle(value: Fuel): Self = this.set("vehicle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeedValue(value: Double): Self = this.set("seedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeedValue: Self = this.set("seedValue", js.undefined)
  }
}
