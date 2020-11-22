package typingsSlinky.dateFns

import typingsSlinky.dateFns.anon.Delimiter
import typingsSlinky.dateFns.anon.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/esm/formatDuration", JSImport.Namespace)
@js.native
object formatDurationMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(duration: Duration | typingsSlinky.dateFns.mod.Duration): String = js.native
    def apply(duration: Duration, options: Format): String = js.native
    def apply(duration: typingsSlinky.dateFns.mod.Duration, options: Delimiter): String = js.native
  }
}
