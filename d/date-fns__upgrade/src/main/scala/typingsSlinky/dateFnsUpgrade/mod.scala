package typingsSlinky.dateFnsUpgrade

import typingsSlinky.dateFnsUpgrade.legacyParseMod.LegacyParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@date-fns/upgrade", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object v2 extends js.Object {
    
    def convertTokens(format: String): String = js.native
    
    def legacyParse(argument: js.Any): js.Date = js.native
    def legacyParse(argument: js.Any, options: LegacyParseOptions): js.Date = js.native
    
    def legacyParseMap(array: js.Array[_]): js.Array[js.Date] = js.native
  }
}
