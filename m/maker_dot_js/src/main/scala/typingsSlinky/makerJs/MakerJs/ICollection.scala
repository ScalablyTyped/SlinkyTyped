package typingsSlinky.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection for items that share a common key.
  */
@js.native
trait ICollection[K, T] extends js.Object {
  var items: js.Array[T] = js.native
  var key: K = js.native
}

object ICollection {
  @scala.inline
  def apply[K, T](items: js.Array[T], key: K): ICollection[K, T] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollection[K, T]]
  }
  @scala.inline
  implicit class ICollectionOps[Self[k, t] <: ICollection[k, t], K, T] (val x: Self[K, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, T]) with Other]
    @scala.inline
    def withItems(value: js.Array[T]): Self[K, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: K): Self[K, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

