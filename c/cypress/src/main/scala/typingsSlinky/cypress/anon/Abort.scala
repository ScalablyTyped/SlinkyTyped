package typingsSlinky.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Abort extends js.Object {
  var abort: js.Array[_] = js.native
  var error: js.Array[_] = js.native
  var load: js.Array[_] = js.native
  var progress: js.Array[_] = js.native
}

object Abort {
  @scala.inline
  def apply(abort: js.Array[_], error: js.Array[_], load: js.Array[_], progress: js.Array[_]): Abort = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Abort]
  }
  @scala.inline
  implicit class AbortOps[Self <: Abort] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoad(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

