package typingsSlinky.javascriptTimeAgo

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.few
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.ko
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.one
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.other
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.two
import typingsSlinky.javascriptTimeAgo.localeMod.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object koMod extends Shortcut {
  
  @JSImport("javascript-time-ago/locale/ko", JSImport.Namespace)
  @js.native
  val ^ : Locale = js.native
  
  @js.native
  trait Locale extends StObject {
    
    var locale: ko = js.native
    
    var long: Duration = js.native
    
    var narrow: Duration = js.native
    
    def quantify(n: Double): one | two | few | other = js.native
    
    var short: Duration = js.native
    
    var tiny: Duration = js.native
  }
  object Locale {
    
    @scala.inline
    def apply(
      locale: ko,
      long: Duration,
      narrow: Duration,
      quantify: Double => one | two | few | other,
      short: Duration,
      tiny: Duration
    ): Locale = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify), short = short.asInstanceOf[js.Any], tiny = tiny.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocale(value: ko): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLong(value: Duration): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNarrow(value: Duration): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantify(value: Double => one | two | few | other): Self = StObject.set(x, "quantify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShort(value: Duration): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTiny(value: Duration): Self = StObject.set(x, "tiny", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Locale
  
  /* This means you don't have to write `^`, but can instead just say `koMod.foo` */
  override def _to: Locale = ^
}
