package typingsSlinky.ecmarkup

import org.scalajs.dom.raw.Element
import typingsSlinky.ecmarkup.anon.Column
import typingsSlinky.ecmarkup.anon.Production
import typingsSlinky.grammarkdown.mod.Grammar
import typingsSlinky.grammarkdown.mod.OneOfList
import typingsSlinky.grammarkdown.mod.RightHandSide
import typingsSlinky.std.Map
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkup/lib/lint/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def getLocation(dom: js.Any, node: Element): js.Any = js.native
  def getProductions(grammar: Grammar): Map[String, Production] = js.native
  def grammarkdownLocationToTrueLocation(
    elementLoc: ReturnType[js.Function2[/* dom */ _, /* node */ Element, _]],
    gmdLine: Double,
    gmdCharacter: Double
  ): Column = js.native
  def rhsMatches(a: OneOfList, b: OneOfList): Boolean = js.native
  def rhsMatches(a: OneOfList, b: RightHandSide): Boolean = js.native
  def rhsMatches(a: RightHandSide, b: OneOfList): Boolean = js.native
  def rhsMatches(a: RightHandSide, b: RightHandSide): Boolean = js.native
}

