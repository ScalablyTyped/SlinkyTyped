package typingsSlinky.behavior3

import typingsSlinky.behavior3.b3.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChildMaxLoop extends js.Object {
  var child: js.UndefOr[BaseNode] = js.native
  var maxLoop: js.UndefOr[Double] = js.native
}

object AnonChildMaxLoop {
  @scala.inline
  def apply(): AnonChildMaxLoop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonChildMaxLoop]
  }
  @scala.inline
  implicit class AnonChildMaxLoopOps[Self <: AnonChildMaxLoop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChild(value: BaseNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLoop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLoop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLoop")(js.undefined)
        ret
    }
  }
  
}

