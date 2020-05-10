package typingsSlinky.reactCopyWrite.mod

import slinky.core.facade.ReactElement
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumerPropsImplicitRender[T]
  extends ConsumerPropsBase[T]
     with ConsumerProps[T] {
  var children: js.UndefOr[RenderFn[T]] = js.native
}

object ConsumerPropsImplicitRender {
  @scala.inline
  def apply[T](): ConsumerPropsImplicitRender[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumerPropsImplicitRender[T]]
  }
  @scala.inline
  implicit class ConsumerPropsImplicitRenderOps[Self[t] <: ConsumerPropsImplicitRender[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withChildren(value: /* repeated */ ReturnType[SelectorFn[T]] => ReactElement | js.Array[ReactElement] | Null): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChildren: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
  }
  
}

