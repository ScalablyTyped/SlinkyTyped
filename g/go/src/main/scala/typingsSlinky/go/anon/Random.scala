package typingsSlinky.go.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Random extends js.Object {
  def random(): Double = js.native
}

object Random {
  @scala.inline
  def apply(random: () => Double): Random = {
    val __obj = js.Dynamic.literal(random = js.Any.fromFunction0(random))
    __obj.asInstanceOf[Random]
  }
  @scala.inline
  implicit class RandomOps[Self <: Random] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRandom(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

