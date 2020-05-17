package typingsSlinky.immutabilityHelper.anon

import typingsSlinky.immutabilityHelper.mod.ArraySpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Unshift[T]
  extends ArraySpec[T, js.Any] {
  @JSName("$unshift")
  var $unshift: js.Array[T] = js.native
}

object Unshift {
  @scala.inline
  def apply[T]($unshift: js.Array[T]): Unshift[T] = {
    val __obj = js.Dynamic.literal($unshift = $unshift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unshift[T]]
  }
  @scala.inline
  implicit class UnshiftOps[Self[t] <: Unshift[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with$unshift(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$unshift")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

