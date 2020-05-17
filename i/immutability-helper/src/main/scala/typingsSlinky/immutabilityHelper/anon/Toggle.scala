package typingsSlinky.immutabilityHelper.anon

import typingsSlinky.immutabilityHelper.mod.ObjectSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Toggle[T]
  extends ObjectSpec[T, js.Any] {
  @JSName("$toggle")
  var $toggle: js.Array[/* keyof T */ String] = js.native
}

object Toggle {
  @scala.inline
  def apply[T]($toggle: js.Array[/* keyof T */ String]): Toggle[T] = {
    val __obj = js.Dynamic.literal($toggle = $toggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toggle[T]]
  }
  @scala.inline
  implicit class ToggleOps[Self[t] <: Toggle[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with$toggle(value: js.Array[/* keyof T */ String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$toggle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

