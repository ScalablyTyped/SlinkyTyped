package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserViewConstructorOptions extends js.Object {
  /**
    * See .
    */
  var webPreferences: js.UndefOr[WebPreferences] = js.native
}

object BrowserViewConstructorOptions {
  @scala.inline
  def apply(): BrowserViewConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserViewConstructorOptions]
  }
  @scala.inline
  implicit class BrowserViewConstructorOptionsOps[Self <: BrowserViewConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWebPreferences(value: WebPreferences): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPreferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebPreferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPreferences")(js.undefined)
        ret
    }
  }
  
}

