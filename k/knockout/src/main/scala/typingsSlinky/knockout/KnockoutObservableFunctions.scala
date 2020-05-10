package typingsSlinky.knockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservableFunctions[T] extends js.Object {
  /**
    * Used by knockout to decide if value of observable has changed and should notify subscribers. Returns true if instances are primitives, and false if are objects.
    * If your observable holds an object, this can be overwritten to return equality based on your needs.
    * @param a previous value.
    * @param b next value.
    */
  def equalityComparer(a: T, b: T): Boolean = js.native
}

object KnockoutObservableFunctions {
  @scala.inline
  def apply[T](equalityComparer: (T, T) => Boolean): KnockoutObservableFunctions[T] = {
    val __obj = js.Dynamic.literal(equalityComparer = js.Any.fromFunction2(equalityComparer))
    __obj.asInstanceOf[KnockoutObservableFunctions[T]]
  }
  @scala.inline
  implicit class KnockoutObservableFunctionsOps[Self[t] <: KnockoutObservableFunctions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withEqualityComparer(value: (T, T) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalityComparer")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

