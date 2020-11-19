package typingsSlinky.collections.sortedSetMod.internal

import typingsSlinky.collections.anon.Done
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Iterator[T] extends js.Object {
  
  def next(): Done[T] = js.native
}
object Iterator {
  
  @scala.inline
  def apply[T](next: () => Done[T]): Iterator[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[Iterator[T]]
  }
  
  @scala.inline
  implicit class IteratorOps[Self <: Iterator[_], T] (val x: Self with Iterator[T]) extends AnyVal {
    
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
    def setNext(value: () => Done[T]): Self = this.set("next", js.Any.fromFunction0(value))
  }
}
