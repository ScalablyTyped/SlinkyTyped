package typingsSlinky.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticPlots extends js.Object {
  def resize(root: Root): Unit = js.native
}

object StaticPlots {
  @scala.inline
  def apply(resize: Root => Unit): StaticPlots = {
    val __obj = js.Dynamic.literal(resize = js.Any.fromFunction1(resize))
    __obj.asInstanceOf[StaticPlots]
  }
  @scala.inline
  implicit class StaticPlotsOps[Self <: StaticPlots] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResize(value: Root => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

