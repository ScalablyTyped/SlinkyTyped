package typingsSlinky.miniCreateReactContext.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumerProps[T] extends js.Object {
  var children: RenderFn[T] | js.Array[RenderFn[T]] = js.native
  var observedBits: js.UndefOr[Double] = js.native
}

object ConsumerProps {
  @scala.inline
  def apply[T](children: RenderFn[T] | js.Array[RenderFn[T]]): ConsumerProps[T] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerProps[T]]
  }
  @scala.inline
  implicit class ConsumerPropsOps[Self[t] <: ConsumerProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withChildrenFunction1(value: T => TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildren(value: RenderFn[T] | js.Array[RenderFn[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObservedBits(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observedBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObservedBits: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observedBits")(js.undefined)
        ret
    }
  }
  
}

