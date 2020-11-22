package typingsSlinky.extenso.mod.Extenso

import typingsSlinky.extenso.extensoStrings.currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.extenso.mod.Extenso.NumberModeOptions
  - typingsSlinky.extenso.mod.Extenso.CurrencyModeOptions
*/
trait Options extends js.Object
object Options {
  
  @scala.inline
  def NumberModeOptions(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  def CurrencyModeOptions(mode: currency): Options = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}
