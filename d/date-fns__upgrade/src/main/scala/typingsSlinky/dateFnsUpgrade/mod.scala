package typingsSlinky.dateFnsUpgrade

import typingsSlinky.dateFnsUpgrade.legacyParseMod.LegacyParseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object v2 {
    
    @JSImport("@date-fns/upgrade", "v2.convertTokens")
    @js.native
    def convertTokens(format: String): String = js.native
    
    @JSImport("@date-fns/upgrade", "v2.legacyParse")
    @js.native
    def legacyParse(argument: js.Any): js.Date = js.native
    @JSImport("@date-fns/upgrade", "v2.legacyParse")
    @js.native
    def legacyParse(argument: js.Any, options: LegacyParseOptions): js.Date = js.native
    
    @JSImport("@date-fns/upgrade", "v2.legacyParseMap")
    @js.native
    def legacyParseMap(array: js.Array[_]): js.Array[js.Date] = js.native
  }
}
