package typingsSlinky.enhancedResolve.concordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("enhanced-resolve/lib/concord", "isTypeMatched")
@js.native
object isTypeMatched extends js.Object {
  
  def apply(baseType: String, testedType: String): Boolean = js.native
  def apply(baseType: String, testedType: Type): Boolean = js.native
  def apply(baseType: Type, testedType: String): Boolean = js.native
  def apply(baseType: Type, testedType: Type): Boolean = js.native
}
