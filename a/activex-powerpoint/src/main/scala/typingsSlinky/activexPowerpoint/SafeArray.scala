package typingsSlinky.activexPowerpoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafeArray[T] extends js.Object {
  var _brand: SafeArray[T] = js.native
}

object SafeArray {
  @scala.inline
  def apply[T](_brand: SafeArray[T]): SafeArray[T] = {
    val __obj = js.Dynamic.literal(_brand = _brand.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeArray[T]]
  }
  @scala.inline
  implicit class SafeArrayOps[Self[t] <: SafeArray[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with_brand(value: SafeArray[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_brand")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

