package typingsSlinky.reactApp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildProps extends js.Object {
  var path: String = js.native
  def action(params: js.Any): js.Any = js.native
}

object ChildProps {
  @scala.inline
  def apply(action: js.Any => js.Any, path: String): ChildProps = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildProps]
  }
  @scala.inline
  implicit class ChildPropsOps[Self <: ChildProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

