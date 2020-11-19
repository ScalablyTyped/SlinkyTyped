package typingsSlinky.jasminewd2.jasmine

import typingsSlinky.jasmine.jasmine.ArrayLike
import typingsSlinky.jasmine.jasmine.Expected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayLikeMatchers[T] extends Matchers[ArrayLike[T]] {
  
  var not: ArrayLikeMatchers[T] = js.native
  
  def toBe(expected: Expected[ArrayLike[T]]): js.Promise[Unit] = js.native
  def toBe(expected: Expected[ArrayLike[T]], expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  
  def toContain(expected: T): js.Promise[Unit] = js.native
  def toContain(expected: T, expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  
  def toEqual(expected: Expected[ArrayLike[T]]): js.Promise[Unit] = js.native
  def toEqual(expected: Expected[ArrayLike[T]], expectationFailOutput: js.Any): js.Promise[Unit] = js.native
}
