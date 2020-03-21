package typingsSlinky.expect.typesMod

import typingsSlinky.expect.AnonIterableEquality
import typingsSlinky.jestTypes.configMod.Path
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
  var utils: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof jestMatcherUtils */ js.Any) with AnonIterableEquality = js.native
  def equals(a: js.Any, b: js.Any): Boolean = js.native
  def equals(a: js.Any, b: js.Any, customTesters: js.Array[Tester]): Boolean = js.native
  def equals(a: js.Any, b: js.Any, customTesters: js.Array[Tester], strictCheck: Boolean): Boolean = js.native
}

