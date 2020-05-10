package typingsSlinky.linqsharp.mod.LinqSharp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGrouping[TKey, T] extends js.Object {
  var Elements: js.Array[T] = js.native
  var Key: TKey = js.native
}

object IGrouping {
  @scala.inline
  def apply[TKey, T](Elements: js.Array[T], Key: TKey): IGrouping[TKey, T] = {
    val __obj = js.Dynamic.literal(Elements = Elements.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGrouping[TKey, T]]
  }
  @scala.inline
  implicit class IGroupingOps[Self[tkey, t] <: IGrouping[tkey, t], TKey, T] (val x: Self[TKey, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TKey, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TKey, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TKey, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TKey, T]) with Other]
    @scala.inline
    def withElements(value: js.Array[T]): Self[TKey, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: TKey): Self[TKey, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

