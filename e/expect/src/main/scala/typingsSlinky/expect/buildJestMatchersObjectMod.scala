package typingsSlinky.expect

import typingsSlinky.expect.buildTypesMod.Expect
import typingsSlinky.expect.buildTypesMod.MatchersObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expect/build/jestMatchersObject", JSImport.Namespace)
@js.native
object buildJestMatchersObjectMod extends js.Object {
  val INTERNAL_MATCHER_FLAG: js.Symbol = js.native
  def getMatchers(): js.Any = js.native
  def getState(): js.Any = js.native
  def setMatchers(matchers: MatchersObject, isInternal: Boolean, expect: Expect): Unit = js.native
  def setState(state: js.Object): Unit = js.native
}

