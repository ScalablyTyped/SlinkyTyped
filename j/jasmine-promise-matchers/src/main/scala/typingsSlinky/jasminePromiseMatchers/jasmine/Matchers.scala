package typingsSlinky.jasminePromiseMatchers.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matchers[T] extends js.Object {
  /**
  		 * Verifies that a value is a $q Promise.
  		 */
  def toBePromise(): Boolean = js.native
  /**
  		 * Verifies that a Promise is (or has been) rejected.
  		 */
  def toBeRejected(): Boolean = js.native
  /**
  		 * Verifies that a Promise is (or has been) rejected with the specified parameter.
  		 */
  def toBeRejectedWith(value: js.Any): Boolean = js.native
  /**
  		 * Verifies that a Promise is (or has been) resolved.
  		 */
  def toBeResolved(): Boolean = js.native
  /**
  		 * Verifies that a Promise is (or has been) resolved with the specified parameter.
  		 */
  def toBeResolvedWith(value: js.Any): Boolean = js.native
}

object Matchers {
  @scala.inline
  def apply[T](
    toBePromise: () => Boolean,
    toBeRejected: () => Boolean,
    toBeRejectedWith: js.Any => Boolean,
    toBeResolved: () => Boolean,
    toBeResolvedWith: js.Any => Boolean
  ): Matchers[T] = {
    val __obj = js.Dynamic.literal(toBePromise = js.Any.fromFunction0(toBePromise), toBeRejected = js.Any.fromFunction0(toBeRejected), toBeRejectedWith = js.Any.fromFunction1(toBeRejectedWith), toBeResolved = js.Any.fromFunction0(toBeResolved), toBeResolvedWith = js.Any.fromFunction1(toBeResolvedWith))
    __obj.asInstanceOf[Matchers[T]]
  }
  @scala.inline
  implicit class MatchersOps[Self[t] <: Matchers[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withToBePromise(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBePromise")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToBeRejected(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBeRejected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToBeRejectedWith(value: js.Any => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBeRejectedWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToBeResolved(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBeResolved")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToBeResolvedWith(value: js.Any => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBeResolvedWith")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

