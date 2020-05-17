package typingsSlinky.androiduix.java_.lang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Runnable extends js.Object {
  def run(): js.Any = js.native
}

object Runnable {
  @scala.inline
  def apply(run: () => js.Any): Runnable = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[Runnable]
  }
  @scala.inline
  implicit class RunnableOps[Self <: Runnable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRun(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

