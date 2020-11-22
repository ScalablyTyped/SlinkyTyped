package typingsSlinky.jestSnapshot.typesMod

import typingsSlinky.expect.anon.readonlyprintExpectedvalu
import typingsSlinky.expect.typesMod.Tester
import typingsSlinky.jestSnapshot.stateMod.default
import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined expect.expect.MatcherState & {  snapshotState :jest-snapshot.jest-snapshot/build/State.default} */
@js.native
trait Context extends js.Object {
  
  var assertionCalls: Double = js.native
  
  var currentTestName: js.UndefOr[String] = js.native
  
  var dontThrow: js.UndefOr[js.Function0[Unit]] = js.native
  
  def equals(a: js.Any, b: js.Any): Boolean = js.native
  def equals(a: js.Any, b: js.Any, customTesters: js.UndefOr[scala.Nothing], strictCheck: Boolean): Boolean = js.native
  def equals(a: js.Any, b: js.Any, customTesters: js.Array[Tester]): Boolean = js.native
  def equals(a: js.Any, b: js.Any, customTesters: js.Array[Tester], strictCheck: Boolean): Boolean = js.native
  
  var error: js.UndefOr[js.Error] = js.native
  
  var expand: js.UndefOr[Boolean] = js.native
  
  var expectedAssertionsNumber: js.UndefOr[Double | Null] = js.native
  
  var expectedAssertionsNumberError: js.UndefOr[js.Error] = js.native
  
  var isExpectingAssertions: js.UndefOr[Boolean] = js.native
  
  var isExpectingAssertionsError: js.UndefOr[js.Error] = js.native
  
  var isNot: Boolean = js.native
  
  var promise: String = js.native
  
  var snapshotState: default = js.native
  
  var suppressedErrors: js.Array[js.Error] = js.native
  
  var testPath: js.UndefOr[Path] = js.native
  
  var utils: readonlyprintExpectedvalu = js.native
}
