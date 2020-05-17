package typingsSlinky.immutabilityHelper.anon

import typingsSlinky.immutabilityHelper.mod.SetSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveArray[T] extends SetSpec[T] {
  @JSName("$remove")
  var $remove: js.Array[T] = js.native
}

object RemoveArray {
  @scala.inline
  def apply[T]($remove: js.Array[T]): RemoveArray[T] = {
    val __obj = js.Dynamic.literal($remove = $remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveArray[T]]
  }
  @scala.inline
  implicit class RemoveArrayOps[Self[t] <: RemoveArray[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with$remove(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$remove")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

