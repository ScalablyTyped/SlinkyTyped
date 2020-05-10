package typingsSlinky.airbnbPropTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactRefLike[T] extends js.Object {
  val current: T | Null = js.native
}

object ReactRefLike {
  @scala.inline
  def apply[T](): ReactRefLike[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactRefLike[T]]
  }
  @scala.inline
  implicit class ReactRefLikeOps[Self[t] <: ReactRefLike[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCurrent(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(null)
        ret
    }
  }
  
}

