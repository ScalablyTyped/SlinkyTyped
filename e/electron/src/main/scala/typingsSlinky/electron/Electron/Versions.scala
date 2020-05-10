package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Versions extends js.Object {
  /**
    * A String representing Chrome's version string.
    */
  var chrome: js.UndefOr[String] = js.native
  /**
    * A String representing Electron's version string.
    */
  var electron: js.UndefOr[String] = js.native
}

object Versions {
  @scala.inline
  def apply(): Versions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Versions]
  }
  @scala.inline
  implicit class VersionsOps[Self <: Versions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChrome(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChrome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome")(js.undefined)
        ret
    }
    @scala.inline
    def withElectron(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electron")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElectron: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electron")(js.undefined)
        ret
    }
  }
  
}

