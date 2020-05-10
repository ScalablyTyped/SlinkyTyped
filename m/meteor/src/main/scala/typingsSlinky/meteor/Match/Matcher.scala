package typingsSlinky.meteor.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matcher[T] extends js.Object {
  var _meteorCheckMatcherBrand: Unit = js.native
}

object Matcher {
  @scala.inline
  def apply[T](_meteorCheckMatcherBrand: Unit): Matcher[T] = {
    val __obj = js.Dynamic.literal(_meteorCheckMatcherBrand = _meteorCheckMatcherBrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matcher[T]]
  }
  @scala.inline
  implicit class MatcherOps[Self[t] <: Matcher[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with_meteorCheckMatcherBrand(value: Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_meteorCheckMatcherBrand")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

