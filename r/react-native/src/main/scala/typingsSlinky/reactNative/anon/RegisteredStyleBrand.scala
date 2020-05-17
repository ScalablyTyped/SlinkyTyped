package typingsSlinky.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisteredStyleBrand[T] extends js.Object {
  var __registeredStyleBrand: T = js.native
}

object RegisteredStyleBrand {
  @scala.inline
  def apply[T](__registeredStyleBrand: T): RegisteredStyleBrand[T] = {
    val __obj = js.Dynamic.literal(__registeredStyleBrand = __registeredStyleBrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredStyleBrand[T]]
  }
  @scala.inline
  implicit class RegisteredStyleBrandOps[Self[t] <: RegisteredStyleBrand[t], T] (val x: Self[T]) extends AnyVal {
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

