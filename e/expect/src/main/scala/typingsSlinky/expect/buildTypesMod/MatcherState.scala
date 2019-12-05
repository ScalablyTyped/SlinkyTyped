package typingsSlinky.expect.buildTypesMod

import typingsSlinky.atJestTypes.buildConfigMod.Path
import typingsSlinky.expect.Anon_IterableEquality
import typingsSlinky.expect.TypeofjestMatcherUtils
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatcherState extends js.Object {
  var assertionCalls: Double = js.native
  var currentTestName: js.UndefOr[String] = js.native
  var dontThrow: js.UndefOr[js.Function0[Unit]] = js.native
  var error: js.UndefOr[js.Error] = js.native
  var expand: js.UndefOr[Boolean] = js.native
  var expectedAssertionsNumber: js.UndefOr[Double] = js.native
  var isExpectingAssertions: js.UndefOr[Boolean] = js.native
  var isNot: Boolean = js.native
  var promise: String = js.native
  var suppressedErrors: js.Array[js.Error] = js.native
  var testPath: js.UndefOr[Path] = js.native
  var utils: TypeofjestMatcherUtils with Anon_IterableEquality = js.native
  def equals(a: js.Any, b: js.Any): Boolean = js.native
  def equals(a: js.Any, b: js.Any, customTesters: js.Array[Tester]): Boolean = js.native
  def equals(a: js.Any, b: js.Any, customTesters: js.Array[Tester], strictCheck: Boolean): Boolean = js.native
}

