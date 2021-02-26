package typingsSlinky.javascriptTimeAgo

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`zh-Hans-HK`
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.few
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.one
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.other
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.two
import typingsSlinky.javascriptTimeAgo.localeMod.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zhHansHKMod extends Shortcut {
  
  @JSImport("javascript-time-ago/locale/zh-Hans-HK", JSImport.Namespace)
  @js.native
  val ^ : Locale = js.native
  
  @js.native
  trait Locale extends StObject {
    
    var locale: `zh-Hans-HK` = js.native
    
    var long: Duration = js.native
    
    def quantify(n: Double): one | two | few | other = js.native
  }
  object Locale {
    
    @scala.inline
    def apply(locale: `zh-Hans-HK`, long: Duration, quantify: Double => one | two | few | other): Locale = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify))
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocale(value: `zh-Hans-HK`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLong(value: Duration): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantify(value: Double => one | two | few | other): Self = StObject.set(x, "quantify", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Locale
  
  /* This means you don't have to write `^`, but can instead just say `zhHansHKMod.foo` */
  override def _to: Locale = ^
}
