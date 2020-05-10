package typingsSlinky.reactCopyWrite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumerPropsBase[T] extends js.Object {
  var select: js.UndefOr[js.Array[SelectorFn[T]]] = js.native
}

object ConsumerPropsBase {
  @scala.inline
  def apply[T](): ConsumerPropsBase[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumerPropsBase[T]]
  }
  @scala.inline
  implicit class ConsumerPropsBaseOps[Self[t] <: ConsumerPropsBase[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSelect(value: js.Array[SelectorFn[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelect: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
  }
  
}

