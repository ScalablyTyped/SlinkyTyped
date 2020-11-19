package typingsSlinky.jest.mod.jest

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jest.anon.BOLDWEIGHT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatcherUtils
  extends /* other */ StringDictionary[js.Any] {
  
  val assertionCalls: Double = js.native
  
  val currentTestName: String = js.native
  
  def dontThrow(): Unit = js.native
  
  /**
    *  This is a deep-equality function that will return true if two objects have the same values (recursively).
    */
  def equals(a: js.Any, b: js.Any): Boolean = js.native
  def equals(a: js.Any, b: js.Any, customTesters: js.UndefOr[scala.Nothing], strictCheck: Boolean): Boolean = js.native
  def equals(a: js.Any, b: js.Any, customTesters: js.Array[EqualityTester]): Boolean = js.native
  def equals(a: js.Any, b: js.Any, customTesters: js.Array[EqualityTester], strictCheck: Boolean): Boolean = js.native
  
  val expand: Boolean = js.native
  
  val expectedAssertionsNumber: Double | Null = js.native
  
  val isExpectingAssertions: Boolean = js.native
  
  val isNot: Boolean = js.native
  
  val promise: String = js.native
  
  val suppressedErrors: js.Array[_] = js.native
  
  val testPath: String = js.native
  
  var utils: BOLDWEIGHT = js.native
}
