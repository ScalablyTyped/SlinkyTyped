package typingsSlinky.immutabilityHelper.anon

import typingsSlinky.immutabilityHelper.mod.ObjectSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Unset[T]
  extends ObjectSpec[T, js.Any] {
  @JSName("$unset")
  var $unset: js.Array[/* keyof T */ String] = js.native
}

object Unset {
  @scala.inline
  def apply[T]($unset: js.Array[/* keyof T */ String]): Unset[T] = {
    val __obj = js.Dynamic.literal($unset = $unset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unset[T]]
  }
  @scala.inline
  implicit class UnsetOps[Self[t] <: Unset[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with$unset(value: js.Array[/* keyof T */ String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$unset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

