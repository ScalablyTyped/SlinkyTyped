package typingsSlinky.dateFns

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.dateFns.anon.LocaleWeekStartsOn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fpLastDayOfWeekWithOptionsMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/fp/lastDayOfWeekWithOptions", JSImport.Default)
    @js.native
    val ^ : CurriedFn2[LocaleWeekStartsOn, js.Date | Double, js.Date] = js.native
    
    type _To = CurriedFn2[LocaleWeekStartsOn, js.Date | Double, js.Date]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn2[LocaleWeekStartsOn, js.Date | Double, js.Date] = ^
  }
}
