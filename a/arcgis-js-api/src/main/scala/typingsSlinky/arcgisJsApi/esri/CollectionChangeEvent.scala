package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionChangeEvent[T] extends js.Object {
  var added: js.Array[T] = js.native
  var moved: js.Array[T] = js.native
  var removed: js.Array[T] = js.native
}

object CollectionChangeEvent {
  @scala.inline
  def apply[T](added: js.Array[T], moved: js.Array[T], removed: js.Array[T]): CollectionChangeEvent[T] = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], moved = moved.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionChangeEvent[T]]
  }
  @scala.inline
  implicit class CollectionChangeEventOps[Self[t] <: CollectionChangeEvent[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAdded(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoved(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoved(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

