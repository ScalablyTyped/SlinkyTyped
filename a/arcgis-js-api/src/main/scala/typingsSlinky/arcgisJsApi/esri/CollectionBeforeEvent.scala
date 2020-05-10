package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionBeforeEvent[T] extends js.Object {
  var item: T = js.native
  def preventDefault(): Unit = js.native
}

object CollectionBeforeEvent {
  @scala.inline
  def apply[T](item: T, preventDefault: () => Unit): CollectionBeforeEvent[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault))
    __obj.asInstanceOf[CollectionBeforeEvent[T]]
  }
  @scala.inline
  implicit class CollectionBeforeEventOps[Self[t] <: CollectionBeforeEvent[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withItem(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDefault(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

