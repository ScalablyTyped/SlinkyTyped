package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Versions extends js.Object {
  /**
    * A String representing Chrome's version string.
    */
  var chrome: js.UndefOr[String] = js.undefined
  /**
    * A String representing Electron's version string.
    */
  var electron: js.UndefOr[String] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChrome(value: String): Self = this.set("chrome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChrome: Self = this.set("chrome", js.undefined)
    @scala.inline
    def setElectron(value: String): Self = this.set("electron", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElectron: Self = this.set("electron", js.undefined)
  }
  
}

