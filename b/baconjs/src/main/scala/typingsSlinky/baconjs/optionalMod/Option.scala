package typingsSlinky.baconjs.optionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Option[V] extends js.Object {
  var isDefined: Boolean = js.native
  def filter(f: js.Function1[/* value */ V, Boolean]): Option[V] = js.native
  def forEach(f: js.Function1[/* value */ V, _]): Unit = js.native
  def get(): V = js.native
  def getOrElse(arg: V): V = js.native
  def inspect(): String = js.native
  def map[V2](f: js.Function1[/* value */ V, V2]): Option[V2] = js.native
  def toArray(): js.Array[V] = js.native
}

object Option {
  @scala.inline
  def apply[V](
    filter: js.Function1[/* value */ V, Boolean] => Option[V],
    forEach: js.Function1[/* value */ V, _] => Unit,
    get: () => V,
    getOrElse: V => V,
    inspect: () => String,
    isDefined: Boolean,
    map: js.Function1[/* value */ V, js.Any] => Option[js.Any],
    toArray: () => js.Array[V]
  ): Option[V] = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction0(get), getOrElse = js.Any.fromFunction1(getOrElse), inspect = js.Any.fromFunction0(inspect), isDefined = isDefined.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[Option[V]]
  }
  @scala.inline
  implicit class OptionOps[Self[v] <: Option[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withFilter(value: js.Function1[/* value */ V, Boolean] => Option[V]): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withForEach(value: js.Function1[/* value */ V, _] => Unit): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: () => V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOrElse(value: V => V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOrElse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInspect(value: () => String): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsDefined(value: Boolean): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(value: js.Function1[/* value */ V, js.Any] => Option[js.Any]): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToArray(value: () => js.Array[V]): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

