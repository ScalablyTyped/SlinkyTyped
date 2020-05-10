package typingsSlinky.es6Shim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IterableShim[T] extends js.Object {
  /**
    * Shim for an ES6 iterable. Not intended for direct use by user code.
    */
  def `_es6-shim iterator_`(): Iterator[T] = js.native
}

object IterableShim {
  @scala.inline
  def apply[T](`_es6-shim iterator_`: () => Iterator[T]): IterableShim[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_es6-shim iterator_")(js.Any.fromFunction0(`_es6-shim iterator_`))
    __obj.asInstanceOf[IterableShim[T]]
  }
  @scala.inline
  implicit class IterableShimOps[Self[t] <: IterableShim[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def `with_es6-shim iterator_`(value: () => Iterator[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_es6-shim iterator_")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

