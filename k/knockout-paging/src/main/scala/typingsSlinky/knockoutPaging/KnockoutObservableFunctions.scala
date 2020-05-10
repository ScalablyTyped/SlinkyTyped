package typingsSlinky.knockoutPaging

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservableFunctions[T] extends // Ko specific
/* key */ StringDictionary[KnockoutBindingHandler] {
  def equalityComparer(a: js.Any, b: js.Any): Boolean = js.native
}

object KnockoutObservableFunctions {
  @scala.inline
  def apply[T](equalityComparer: (js.Any, js.Any) => Boolean): KnockoutObservableFunctions[T] = {
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
    def withEqualityComparer(value: (js.Any, js.Any) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalityComparer")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

