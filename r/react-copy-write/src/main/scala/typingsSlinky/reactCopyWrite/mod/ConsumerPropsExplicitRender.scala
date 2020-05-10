package typingsSlinky.reactCopyWrite.mod

import slinky.core.facade.ReactElement
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumerPropsExplicitRender[T]
  extends ConsumerPropsBase[T]
     with ConsumerProps[T] {
  var render: js.UndefOr[RenderFn[T]] = js.native
}

object ConsumerPropsExplicitRender {
  @scala.inline
  def apply[T](): ConsumerPropsExplicitRender[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumerPropsExplicitRender[T]]
  }
  @scala.inline
  implicit class ConsumerPropsExplicitRenderOps[Self[t] <: ConsumerPropsExplicitRender[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withRender(value: /* repeated */ ReturnType[SelectorFn[T]] => ReactElement | js.Array[ReactElement] | Null): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRender: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
  }
  
}

