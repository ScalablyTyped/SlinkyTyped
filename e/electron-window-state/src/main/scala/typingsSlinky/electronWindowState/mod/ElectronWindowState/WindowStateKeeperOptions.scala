package typingsSlinky.electronWindowState.mod.ElectronWindowState

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowStateKeeperOptions extends js.Object {
  /*
  		 * The height that should be returned if no file exists yet. Defaults to 600.
  		 */
  var defaultHeight: js.UndefOr[Double] = js.native
  /*
  		 * The width that should be returned if no file exists yet. Defaults to 800.
  		 */
  var defaultWidth: js.UndefOr[Double] = js.native
  /*
  		 * The name of file. Defaults to window-state.json
  		 */
  var file: js.UndefOr[String] = js.native
  /*
  		 * Should we automatically restore the window to full screen,
  		 * if it was last closed full screen. Defaults to true
  		 */
  var fullScreen: js.UndefOr[Boolean] = js.native
  /*
  		 * Should we automatically maximize the window,
  		 * if it was last closed maximized. Defaults to true
  		 */
  var maximize: js.UndefOr[Boolean] = js.native
  /*
  		 * The path where the state file should be written to.
  		 * Defaults to app.getPath('userData')
  		 */
  var path: js.UndefOr[String] = js.native
}

object WindowStateKeeperOptions {
  @scala.inline
  def apply(): WindowStateKeeperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowStateKeeperOptions]
  }
  @scala.inline
  implicit class WindowStateKeeperOptionsOps[Self <: WindowStateKeeperOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
    @scala.inline
    def withFullScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximize")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

