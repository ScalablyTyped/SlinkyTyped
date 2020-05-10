package typingsSlinky.cassanknex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamParams extends js.Object {
  def end(): js.Any = js.native
  def error(err: js.Error): js.Any = js.native
  def readable(): js.Any = js.native
}

object StreamParams {
  @scala.inline
  def apply(end: () => js.Any, error: js.Error => js.Any, readable: () => js.Any): StreamParams = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), error = js.Any.fromFunction1(error), readable = js.Any.fromFunction0(readable))
    __obj.asInstanceOf[StreamParams]
  }
  @scala.inline
  implicit class StreamParamsOps[Self <: StreamParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withError(value: js.Error => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReadable(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readable")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

