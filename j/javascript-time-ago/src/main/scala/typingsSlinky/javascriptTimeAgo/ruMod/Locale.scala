package typingsSlinky.javascriptTimeAgo.ruMod

import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.few
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.one
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.other
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.ru
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.two
import typingsSlinky.javascriptTimeAgo.localeMod.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locale extends js.Object {
  
  var locale: ru = js.native
  
  var long: Duration = js.native
  
  var `long-convenient`: Duration = js.native
  
  var `long-time`: Duration = js.native
  
  var narrow: Duration = js.native
  
  def quantify(n: Double): one | two | few | other = js.native
  
  var short: Duration = js.native
  
  var `short-convenient`: Duration = js.native
  
  var `short-time`: Duration = js.native
  
  var tiny: Duration = js.native
}
object Locale {
  
  @scala.inline
  def apply(
    locale: ru,
    long: Duration,
    `long-convenient`: Duration,
    `long-time`: Duration,
    narrow: Duration,
    quantify: Double => one | two | few | other,
    short: Duration,
    `short-convenient`: Duration,
    `short-time`: Duration,
    tiny: Duration
  ): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify), short = short.asInstanceOf[js.Any], tiny = tiny.asInstanceOf[js.Any])
    __obj.updateDynamic("long-convenient")(`long-convenient`.asInstanceOf[js.Any])
    __obj.updateDynamic("long-time")(`long-time`.asInstanceOf[js.Any])
    __obj.updateDynamic("short-convenient")(`short-convenient`.asInstanceOf[js.Any])
    __obj.updateDynamic("short-time")(`short-time`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  
  @scala.inline
  implicit class LocaleOps[Self <: Locale] (val x: Self) extends AnyVal {
    
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
    def setLocale(value: ru): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLong(value: Duration): Self = this.set("long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLong-convenient`(value: Duration): Self = this.set("long-convenient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLong-time`(value: Duration): Self = this.set("long-time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNarrow(value: Duration): Self = this.set("narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantify(value: Double => one | two | few | other): Self = this.set("quantify", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShort(value: Duration): Self = this.set("short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShort-convenient`(value: Duration): Self = this.set("short-convenient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShort-time`(value: Duration): Self = this.set("short-time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiny(value: Duration): Self = this.set("tiny", value.asInstanceOf[js.Any])
  }
}
