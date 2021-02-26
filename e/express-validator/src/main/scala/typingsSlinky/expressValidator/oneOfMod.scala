package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.anon.Req
import typingsSlinky.expressValidator.baseMod.Middleware
import typingsSlinky.expressValidator.validationChainMod.ValidationChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oneOfMod {
  
  @JSImport("express-validator/src/middlewares/one-of", "oneOf")
  @js.native
  def oneOf(chains: js.Array[js.Array[ValidationChain] | ValidationChain]): Middleware = js.native
  @JSImport("express-validator/src/middlewares/one-of", "oneOf")
  @js.native
  def oneOf(chains: js.Array[ValidationChain | js.Array[ValidationChain]], message: js.Any): Middleware = js.native
  @JSImport("express-validator/src/middlewares/one-of", "oneOf")
  @js.native
  def oneOf(chains: js.Array[ValidationChain | js.Array[ValidationChain]], message: OneOfCustomMessageBuilder): Middleware = js.native
  
  type OneOfCustomMessageBuilder = js.Function1[/* options */ Req, js.Any]
}
