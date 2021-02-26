package typingsSlinky.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayLikeMatchers[T] extends Matchers[ArrayLike[T]] {
  
  /**
    * Invert the matcher following this expect.
    */
  @JSName("not")
  var not_ArrayLikeMatchers: ArrayLikeMatchers[T] = js.native
  
  def toBe(expected: ArrayContaining[T]): Boolean = js.native
  def toBe(expected: ArrayContaining[T], expectationFailOutput: js.Any): Boolean = js.native
  
  def toContain(expected: Expected[T]): Boolean = js.native
  def toContain(expected: Expected[T], expectationFailOutput: js.Any): Boolean = js.native
  
  def toEqual(expected: ArrayContaining[T]): Boolean = js.native
  def toEqual(expected: ArrayContaining[T], expectationFailOutput: js.Any): Boolean = js.native
}
