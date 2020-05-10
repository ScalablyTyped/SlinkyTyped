package typingsSlinky.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRegisteredStyleBrand[T] extends js.Object {
  var __registeredStyleBrand: T = js.native
}

object AnonRegisteredStyleBrand {
  @scala.inline
  def apply[T](__registeredStyleBrand: T): AnonRegisteredStyleBrand[T] = {
    val __obj = js.Dynamic.literal(__registeredStyleBrand = __registeredStyleBrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRegisteredStyleBrand[T]]
  }
  @scala.inline
  implicit class AnonRegisteredStyleBrandOps[Self[t] <: AnonRegisteredStyleBrand[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with__registeredStyleBrand(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__registeredStyleBrand")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

