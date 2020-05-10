package typingsSlinky.electronDebug.mod

import typingsSlinky.electronDebug.electronDebugStrings.bottom
import typingsSlinky.electronDebug.electronDebugStrings.detach
import typingsSlinky.electronDebug.electronDebugStrings.previous
import typingsSlinky.electronDebug.electronDebugStrings.right
import typingsSlinky.electronDebug.electronDebugStrings.undocked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		The dock state to open DevTools in.
  		@default 'previous'
  		*/
  val devToolsMode: js.UndefOr[undocked | right | bottom | previous | detach] = js.native
  /**
  		Default: [Only in development](https://github.com/sindresorhus/electron-is-dev)
  		*/
  val isEnabled: js.UndefOr[Boolean] = js.native
  /**
  		Show DevTools on each created `BrowserWindow`.
  		@default true
  		*/
  val showDevTools: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevToolsMode(value: undocked | right | bottom | previous | detach): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devToolsMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevToolsMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devToolsMode")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDevTools(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDevTools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDevTools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDevTools")(js.undefined)
        ret
    }
  }
  
}

