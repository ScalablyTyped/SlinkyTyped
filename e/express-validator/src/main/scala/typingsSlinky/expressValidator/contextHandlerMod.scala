package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.baseMod.CustomValidator
import typingsSlinky.expressValidator.contextMod.Optional
import typingsSlinky.expressValidator.expressValidatorBooleans.`true`
import typingsSlinky.expressValidator.validationChainMod.ValidationChain
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextHandlerMod {
  
  @js.native
  trait ContextHandler[Chain] extends StObject {
    
    def bail(): Chain = js.native
    
    def `if`(condition: CustomValidator): Chain = js.native
    def `if`(condition: ValidationChain): Chain = js.native
    
    def optional(): Chain = js.native
    def optional(options: Partial[Optional]): Chain = js.native
    @JSName("optional")
    def optional_true(options: `true`): Chain = js.native
  }
}
