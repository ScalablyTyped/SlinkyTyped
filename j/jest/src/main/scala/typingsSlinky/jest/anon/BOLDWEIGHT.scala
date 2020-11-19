package typingsSlinky.jest.anon

import typingsSlinky.jest.mod.jest.EqualityTester
import typingsSlinky.jest.mod.jest.MatcherColorFn
import typingsSlinky.jest.mod.jest.MatcherHintOptions
import typingsSlinky.jest.mod.jest.PrintLabel
import typingsSlinky.jestDiff.typesMod.DiffOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BOLDWEIGHT extends js.Object {
  
  val BOLD_WEIGHT: MatcherColorFn = js.native
  
  val DIM_COLOR: MatcherColorFn = js.native
  
  val EXPECTED_COLOR: MatcherColorFn = js.native
  
  val INVERTED_COLOR: MatcherColorFn = js.native
  
  val RECEIVED_COLOR: MatcherColorFn = js.native
  
  val SUGGEST_TO_CONTAIN_EQUAL: String = js.native
  
  def diff(a: js.Any, b: js.Any): String | Null = js.native
  def diff(a: js.Any, b: js.Any, options: DiffOptions): String | Null = js.native
  
  def ensureActualIsNumber(actual: js.Any, matcherName: String): Unit = js.native
  def ensureActualIsNumber(actual: js.Any, matcherName: String, options: MatcherHintOptions): Unit = js.native
  
  def ensureExpectedIsNonNegativeInteger(expected: js.Any, matcherName: String): Unit = js.native
  def ensureExpectedIsNonNegativeInteger(expected: js.Any, matcherName: String, options: MatcherHintOptions): Unit = js.native
  
  def ensureExpectedIsNumber(actual: js.Any, matcherName: String): Unit = js.native
  def ensureExpectedIsNumber(actual: js.Any, matcherName: String, options: MatcherHintOptions): Unit = js.native
  
  def ensureNoExpected(actual: js.Any, matcherName: String): Unit = js.native
  def ensureNoExpected(actual: js.Any, matcherName: String, options: MatcherHintOptions): Unit = js.native
  
  def ensureNumbers(actual: js.Any, expected: js.Any, matcherName: String): Unit = js.native
  def ensureNumbers(actual: js.Any, expected: js.Any, matcherName: String, options: MatcherHintOptions): Unit = js.native
  
  def getLabelPrinter(strings: String*): PrintLabel = js.native
  
  def highlightTrailingWhitespace(text: String): String = js.native
  
  var iterableEquality: EqualityTester = js.native
  
  def matcherErrorMessage(hint: String, generic: String, specific: String): String = js.native
  
  def matcherHint(matcherName: String): String = js.native
  def matcherHint(
    matcherName: String,
    received: js.UndefOr[scala.Nothing],
    expected: js.UndefOr[scala.Nothing],
    options: MatcherHintOptions
  ): String = js.native
  def matcherHint(matcherName: String, received: js.UndefOr[scala.Nothing], expected: String): String = js.native
  def matcherHint(
    matcherName: String,
    received: js.UndefOr[scala.Nothing],
    expected: String,
    options: MatcherHintOptions
  ): String = js.native
  def matcherHint(matcherName: String, received: String): String = js.native
  def matcherHint(
    matcherName: String,
    received: String,
    expected: js.UndefOr[scala.Nothing],
    options: MatcherHintOptions
  ): String = js.native
  def matcherHint(matcherName: String, received: String, expected: String): String = js.native
  def matcherHint(matcherName: String, received: String, expected: String, options: MatcherHintOptions): String = js.native
  
  def pluralize(word: String, count: Double): String = js.native
  
  def printDiffOrStringify(expected: js.Any, received: js.Any, expectedLabel: String, receivedLabel: String, expand: Boolean): String = js.native
  
  def printExpected(value: js.Any): String = js.native
  
  def printReceived(`object`: js.Any): String = js.native
  
  def printWithType(name: String, value: js.Any, print: js.Function1[/* value */ js.Any, String]): String = js.native
  
  def stringify(`object`: js.Object): String = js.native
  def stringify(`object`: js.Object, maxDepth: Double): String = js.native
  
  var subsetEquality: EqualityTester = js.native
}
