package typingsSlinky.reactFrameComponent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameContextProps extends js.Object {
  var document: js.UndefOr[js.Any] = js.native
  var window: js.UndefOr[js.Any] = js.native
}

object FrameContextProps {
  @scala.inline
  def apply(): FrameContextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameContextProps]
  }
  @scala.inline
  implicit class FrameContextPropsOps[Self <: FrameContextProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(js.undefined)
        ret
    }
    @scala.inline
    def withWindow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(js.undefined)
        ret
    }
  }
  
}

