package typingsSlinky.electronUtil.mod

import typingsSlinky.electron.Electron.Size
import typingsSlinky.electron.mod.BrowserWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CenterWindowOptions extends js.Object {
  /**
  	Animate the change.
  	@default false
  	*/
  val animated: js.UndefOr[Boolean] = js.native
  /**
  	Set a new window size.
  	Default: Size of `window`
  	@example
  	```
  	{width: 600, height: 400}
  	```
  	*/
  val size: js.UndefOr[Size] = js.native
  /**
  	The window to center.
  	Default: Current window
  	*/
  val window: js.UndefOr[BrowserWindow] = js.native
}

object CenterWindowOptions {
  @scala.inline
  def apply(): CenterWindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CenterWindowOptions]
  }
  @scala.inline
  implicit class CenterWindowOptionsOps[Self <: CenterWindowOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withWindow(value: BrowserWindow): Self = {
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

