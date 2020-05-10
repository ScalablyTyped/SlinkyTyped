package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashSwfPanel extends js.Object {
  var name: js.Any = js.native
  var path: js.Any = js.native
  def call(): js.Any = js.native
  def setFocus(): js.Any = js.native
}

object FlashSwfPanel {
  @scala.inline
  def apply(call: () => js.Any, name: js.Any, path: js.Any, setFocus: () => js.Any): FlashSwfPanel = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction0(call), name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], setFocus = js.Any.fromFunction0(setFocus))
    __obj.asInstanceOf[FlashSwfPanel]
  }
  @scala.inline
  implicit class FlashSwfPanelOps[Self <: FlashSwfPanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCall(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetFocus(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFocus")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

