package typingsSlinky.inversify.interfacesMod.interfaces

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class LookupOps[Self <: Lookup[_], T] (val x: Self with Lookup[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: (ServiceIdentifier[_], T) => Unit): Self = this.set("add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGet(value: ServiceIdentifier[_] => js.Array[T]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMap(value: () => Map[ServiceIdentifier[_], js.Array[T]]): Self = this.set("getMap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasKey(value: ServiceIdentifier[_] => Boolean): Self = this.set("hasKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: ServiceIdentifier[_] => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveByCondition(value: js.Function1[/* item */ T, Boolean] => Unit): Self = this.set("removeByCondition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTraverse(value: js.Function2[/* key */ ServiceIdentifier[_], /* value */ js.Array[T], Unit] => Unit): Self = this.set("traverse", js.Any.fromFunction1(value))
  }
}
