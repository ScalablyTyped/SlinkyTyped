package typingsSlinky.expect

import typingsSlinky.expect.anon.PartialMatcherState
import typingsSlinky.expect.typesMod.Expect
import typingsSlinky.expect.typesMod.MatcherState
import typingsSlinky.expect.typesMod.MatchersObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jestMatchersObjectMod {
  
  @JSImport("expect/build/jestMatchersObject", "INTERNAL_MATCHER_FLAG")
  @js.native
  val INTERNAL_MATCHER_FLAG: js.Symbol = js.native
  
  @JSImport("expect/build/jestMatchersObject", "getMatchers")
  @js.native
  def getMatchers(): MatchersObject = js.native
  
  @JSImport("expect/build/jestMatchersObject", "getState")
  @js.native
  def getState(): MatcherState = js.native
  
  @JSImport("expect/build/jestMatchersObject", "setMatchers")
  @js.native
  def setMatchers(matchers: MatchersObject, isInternal: Boolean, expect: Expect): Unit = js.native
  
  @JSImport("expect/build/jestMatchersObject", "setState")
  @js.native
  def setState(state: PartialMatcherState): Unit = js.native
}
