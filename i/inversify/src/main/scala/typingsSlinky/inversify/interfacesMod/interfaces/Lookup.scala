package typingsSlinky.inversify.interfacesMod.interfaces

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lookup[T] extends Clonable[Lookup[T]] {
  def add(serviceIdentifier: ServiceIdentifier[_], value: T): Unit = js.native
  def get(serviceIdentifier: ServiceIdentifier[_]): js.Array[T] = js.native
  def getMap(): Map[ServiceIdentifier[_], js.Array[T]] = js.native
  def hasKey(serviceIdentifier: ServiceIdentifier[_]): Boolean = js.native
  def remove(serviceIdentifier: ServiceIdentifier[_]): Unit = js.native
  def removeByCondition(condition: js.Function1[/* item */ T, Boolean]): Unit = js.native
  def traverse(func: js.Function2[/* key */ ServiceIdentifier[_], /* value */ js.Array[T], Unit]): Unit = js.native
}

object Lookup {
  @scala.inline
  def apply[T](
    add: (ServiceIdentifier[_], T) => Unit,
    get: ServiceIdentifier[_] => js.Array[T],
    getMap: () => Map[ServiceIdentifier[_], js.Array[T]],
    hasKey: ServiceIdentifier[_] => Boolean,
    remove: ServiceIdentifier[_] => Unit,
    removeByCondition: js.Function1[/* item */ T, Boolean] => Unit,
    traverse: js.Function2[/* key */ ServiceIdentifier[_], /* value */ js.Array[T], Unit] => Unit
  ): Lookup[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), get = js.Any.fromFunction1(get), getMap = js.Any.fromFunction0(getMap), hasKey = js.Any.fromFunction1(hasKey), remove = js.Any.fromFunction1(remove), removeByCondition = js.Any.fromFunction1(removeByCondition), traverse = js.Any.fromFunction1(traverse))
    __obj.asInstanceOf[Lookup[T]]
  }
  @scala.inline
  implicit class LookupOps[Self[t] <: Lookup[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAdd(value: (ServiceIdentifier[_], T) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGet(value: ServiceIdentifier[_] => js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMap(value: () => Map[ServiceIdentifier[_], js.Array[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasKey(value: ServiceIdentifier[_] => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: ServiceIdentifier[_] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveByCondition(value: js.Function1[/* item */ T, Boolean] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeByCondition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTraverse(value: js.Function2[/* key */ ServiceIdentifier[_], /* value */ js.Array[T], Unit] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traverse")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

