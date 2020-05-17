package typingsSlinky.c3.anon

import typingsSlinky.c3.mod.ArrayOrString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Done extends js.Object {
  /** Called after data is loaded, but not after rendering. This is because rendering will finish after some transition and there is some time lag between loading and rendering. */
  var done: js.UndefOr[js.Function0[Unit]] = js.native
  var ids: js.UndefOr[ArrayOrString] = js.native
}

object Done {
  @scala.inline
  def apply(): Done = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Done]
  }
  @scala.inline
  implicit class DoneOps[Self <: Done] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDone(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.undefined)
        ret
    }
    @scala.inline
    def withIds(value: ArrayOrString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(js.undefined)
        ret
    }
  }
  
}

