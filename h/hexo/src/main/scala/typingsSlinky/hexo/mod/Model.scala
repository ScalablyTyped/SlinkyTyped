package typingsSlinky.hexo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model[T] extends js.Object {
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def count(): Double = js.native
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def filter(fn: js.Function2[/* v */ T, /* i */ Double, Boolean]): Model[T] = js.native
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def forEach(fn: js.Function2[/* v */ T, /* i */ Double, Unit]): Unit = js.native
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def map[U](fn: js.Function2[/* v */ T, /* i */ Double, U]): js.Array[U] = js.native
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def toArray(): js.Array[T] = js.native
}

object Model {
  @scala.inline
  def apply[T](
    count: () => Double,
    filter: js.Function2[/* v */ T, /* i */ Double, Boolean] => Model[T],
    forEach: js.Function2[/* v */ T, /* i */ Double, Unit] => Unit,
    map: js.Function2[/* v */ T, /* i */ Double, js.Any] => js.Array[js.Any],
    toArray: () => js.Array[T]
  ): Model[T] = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count), filter = js.Any.fromFunction1(filter), forEach = js.Any.fromFunction1(forEach), map = js.Any.fromFunction1(map), toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[Model[T]]
  }
  @scala.inline
  implicit class ModelOps[Self[t] <: Model[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCount(value: () => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFilter(value: js.Function2[/* v */ T, /* i */ Double, Boolean] => Model[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withForEach(value: js.Function2[/* v */ T, /* i */ Double, Unit] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMap(value: js.Function2[/* v */ T, /* i */ Double, js.Any] => js.Array[js.Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToArray(value: () => js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

