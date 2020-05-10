package typingsSlinky.reactTypist.mod.Typist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelayProps extends js.Object {
  var ms: Double = js.native
}

object DelayProps {
  @scala.inline
  def apply(ms: Double): DelayProps = {
    val __obj = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelayProps]
  }
  @scala.inline
  implicit class DelayPropsOps[Self <: DelayProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ms")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

