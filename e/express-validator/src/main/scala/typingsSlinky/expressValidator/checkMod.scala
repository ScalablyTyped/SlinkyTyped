package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.baseMod.Location
import typingsSlinky.expressValidator.validationChainMod.ValidationChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-validator/src/middlewares/check", JSImport.Namespace)
@js.native
object checkMod extends js.Object {
  
  def check(): ValidationChain = js.native
  def check(fields: js.UndefOr[scala.Nothing], locations: js.UndefOr[scala.Nothing], message: js.Any): ValidationChain = js.native
  def check(fields: js.UndefOr[scala.Nothing], locations: js.Array[Location]): ValidationChain = js.native
  def check(fields: js.UndefOr[scala.Nothing], locations: js.Array[Location], message: js.Any): ValidationChain = js.native
  def check(fields: String): ValidationChain = js.native
  def check(fields: String, locations: js.UndefOr[scala.Nothing], message: js.Any): ValidationChain = js.native
  def check(fields: String, locations: js.Array[Location]): ValidationChain = js.native
  def check(fields: String, locations: js.Array[Location], message: js.Any): ValidationChain = js.native
  def check(fields: js.Array[String]): ValidationChain = js.native
  def check(fields: js.Array[String], locations: js.UndefOr[scala.Nothing], message: js.Any): ValidationChain = js.native
  def check(fields: js.Array[String], locations: js.Array[Location]): ValidationChain = js.native
  def check(fields: js.Array[String], locations: js.Array[Location], message: js.Any): ValidationChain = js.native
}
