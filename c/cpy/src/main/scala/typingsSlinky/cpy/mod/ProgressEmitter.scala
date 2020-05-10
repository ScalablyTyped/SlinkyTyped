package typingsSlinky.cpy.mod

import typingsSlinky.cpy.cpyStrings.progress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressEmitter extends js.Object {
  @JSName("on")
  def on_progress(event: progress, handler: js.Function1[/* progress */ ProgressData, Unit]): js.Promise[js.Array[String]] = js.native
}

object ProgressEmitter {
  @scala.inline
  def apply(on: (progress, js.Function1[/* progress */ ProgressData, Unit]) => js.Promise[js.Array[String]]): ProgressEmitter = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[ProgressEmitter]
  }
  @scala.inline
  implicit class ProgressEmitterOps[Self <: ProgressEmitter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOn(value: (progress, js.Function1[/* progress */ ProgressData, Unit]) => js.Promise[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

