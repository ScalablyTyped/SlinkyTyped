package typingsSlinky.jasmine

import typingsSlinky.jasmine.jasmine.ArrayLikeMatchers
import typingsSlinky.jasmine.jasmine.Matchers
import typingsSlinky.jasmine.jasmine.NothingMatcher
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("expect")
@js.native
object expect extends js.Object {
  /**
    * Create an expectation for a spec.
    */
  def apply(): NothingMatcher = js.native
  /**
    * Create an expectation for a spec.
    * @checkReturnValue see https://tsetse.info/check-return-value
    * @param spy
    */
  def apply(spy: js.Function): Matchers[_] = js.native
  /**
    * Create an expectation for a spec.
    * @checkReturnValue see https://tsetse.info/check-return-value
    * @param actual Actual computed value to test expectations against.
    */
  def apply[T](actual: T): Matchers[T] = js.native
  /**
    * Create an expectation for a spec.
    * @checkReturnValue see https://tsetse.info/check-return-value
    * @param actual
    */
  def apply[T](actual: ArrayLike[T]): ArrayLikeMatchers[T] = js.native
}

