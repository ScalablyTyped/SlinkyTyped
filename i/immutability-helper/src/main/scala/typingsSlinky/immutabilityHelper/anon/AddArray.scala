package typingsSlinky.immutabilityHelper.anon

import typingsSlinky.immutabilityHelper.mod.SetSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddArray[T] extends SetSpec[T] {
  @JSName("$add")
  var $add: js.Array[T] = js.native
}

object AddArray {
  @scala.inline
  def apply[T]($add: js.Array[T]): AddArray[T] = {
    val __obj = js.Dynamic.literal($add = $add.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddArray[T]]
  }
  @scala.inline
  implicit class AddArrayOps[Self[t] <: AddArray[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with$add(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$add")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

