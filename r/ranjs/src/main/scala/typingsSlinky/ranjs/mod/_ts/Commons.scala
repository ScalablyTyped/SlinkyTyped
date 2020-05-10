package typingsSlinky.ranjs.mod._ts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Commons extends js.Object {
  def reset(): Unit = js.native
  def update(x: js.Array[Double]): Unit = js.native
}

object Commons {
  @scala.inline
  def apply(reset: () => Unit, update: js.Array[Double] => Unit): Commons = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Commons]
  }
  @scala.inline
  implicit class CommonsOps[Self <: Commons] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdate(value: js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

