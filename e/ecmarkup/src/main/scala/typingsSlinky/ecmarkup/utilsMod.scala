package typingsSlinky.ecmarkup

import typingsSlinky.ecmarkup.anon.Production
import typingsSlinky.grammarkdown.mod.Grammar
import typingsSlinky.grammarkdown.mod.OneOfList
import typingsSlinky.grammarkdown.mod.RightHandSide
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("ecmarkup/lib/lint/utils", "getProductions")
  @js.native
  def getProductions(grammar: Grammar): Map[String, Production] = js.native
  
  @JSImport("ecmarkup/lib/lint/utils", "rhsMatches")
  @js.native
  def rhsMatches(a: OneOfList, b: OneOfList): Boolean = js.native
  @JSImport("ecmarkup/lib/lint/utils", "rhsMatches")
  @js.native
  def rhsMatches(a: OneOfList, b: RightHandSide): Boolean = js.native
  @JSImport("ecmarkup/lib/lint/utils", "rhsMatches")
  @js.native
  def rhsMatches(a: RightHandSide, b: OneOfList): Boolean = js.native
  @JSImport("ecmarkup/lib/lint/utils", "rhsMatches")
  @js.native
  def rhsMatches(a: RightHandSide, b: RightHandSide): Boolean = js.native
}
