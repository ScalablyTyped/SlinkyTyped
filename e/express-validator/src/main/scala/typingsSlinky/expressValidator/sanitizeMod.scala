package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.baseMod.Location
import typingsSlinky.expressValidator.sanitizationChainMod.SanitizationChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-validator/src/middlewares/sanitize", JSImport.Namespace)
@js.native
object sanitizeMod extends js.Object {
  
  def sanitize(): SanitizationChain = js.native
  def sanitize(fields: js.UndefOr[scala.Nothing], locations: js.Array[Location]): SanitizationChain = js.native
  def sanitize(fields: String): SanitizationChain = js.native
  def sanitize(fields: String, locations: js.Array[Location]): SanitizationChain = js.native
  def sanitize(fields: js.Array[String]): SanitizationChain = js.native
  def sanitize(fields: js.Array[String], locations: js.Array[Location]): SanitizationChain = js.native
}
