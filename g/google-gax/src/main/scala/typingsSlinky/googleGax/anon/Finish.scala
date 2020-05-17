package typingsSlinky.googleGax.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Finish extends js.Object {
  def finish(): js.Array[js.Object] = js.native
}

object Finish {
  @scala.inline
  def apply(finish: () => js.Array[js.Object]): Finish = {
    val __obj = js.Dynamic.literal(finish = js.Any.fromFunction0(finish))
    __obj.asInstanceOf[Finish]
  }
  @scala.inline
  implicit class FinishOps[Self <: Finish] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinish(value: () => js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finish")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

