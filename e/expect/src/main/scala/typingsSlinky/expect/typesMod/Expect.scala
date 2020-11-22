package typingsSlinky.expect.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.expect.anon.PartialMatcherState
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expect extends /* id */ StringDictionary[AsymmetricMatcher] {
  
  def apply[T](actual: T): Matchers[T] = js.native
  
  def addSnapshotSerializer(arg0: js.Any): Unit = js.native
  
  def any(expectedObject: js.Any): AsymmetricMatcher = js.native
  
  def anything(): AsymmetricMatcher = js.native
  
  def arrayContaining(sample: js.Array[_]): AsymmetricMatcher = js.native
  
  def assertions(arg0: Double): Unit = js.native
  
  def extend(arg0: js.Any): Unit = js.native
  
  def extractExpectedAssertionsErrors(): ExpectedAssertionsErrors = js.native
  
  def getState(): MatcherState = js.native
  
  def hasAssertions(): Unit = js.native
  
  var not: StringDictionary[AsymmetricMatcher] = js.native
  
  def objectContaining(sample: Record[String, _]): AsymmetricMatcher = js.native
  
  def setState(state: PartialMatcherState): Unit = js.native
  
  def stringContaining(expected: String): AsymmetricMatcher = js.native
  
  def stringMatching(expected: String): AsymmetricMatcher = js.native
  def stringMatching(expected: js.RegExp): AsymmetricMatcher = js.native
}
