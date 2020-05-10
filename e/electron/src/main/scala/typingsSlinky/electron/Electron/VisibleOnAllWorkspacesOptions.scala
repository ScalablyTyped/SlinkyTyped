package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisibleOnAllWorkspacesOptions extends js.Object {
  /**
    * Sets whether the window should be visible above fullscreen windows
    */
  var visibleOnFullScreen: js.UndefOr[Boolean] = js.native
}

object VisibleOnAllWorkspacesOptions {
  @scala.inline
  def apply(): VisibleOnAllWorkspacesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisibleOnAllWorkspacesOptions]
  }
  @scala.inline
  implicit class VisibleOnAllWorkspacesOptionsOps[Self <: VisibleOnAllWorkspacesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVisibleOnFullScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleOnFullScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleOnFullScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleOnFullScreen")(js.undefined)
        ret
    }
  }
  
}

