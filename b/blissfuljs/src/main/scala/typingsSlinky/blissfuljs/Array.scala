package typingsSlinky.blissfuljs

import typingsSlinky.blissfuljs.BlissNS.BlissBindedArray
import typingsSlinky.blissfuljs.BlissNS.BlissCollectionArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Array[T] extends js.Object {
  @JSName("_")
  var _underscore: BlissBindedArray[T] with BlissCollectionArray[T] = js.native
}

object Array {
  @scala.inline
  def apply[T](_underscore: BlissBindedArray[T] with BlissCollectionArray[T]): Array[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array[T]]
  }
  @scala.inline
  implicit class ArrayOps[Self[t] <: Array[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with_underscore(value: BlissBindedArray[T] with BlissCollectionArray[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

