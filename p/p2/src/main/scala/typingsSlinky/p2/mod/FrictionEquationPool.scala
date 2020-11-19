package typingsSlinky.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "FrictionEquationPool")
@js.native
class FrictionEquationPool () extends Pool {
  
  def create(): FrictionEquation = js.native
  
  def destroy(equation: FrictionEquation): FrictionEquationPool = js.native
}
