package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenExternalSyncOptions extends js.Object {
  /**
    * true to bring the opened application to the foreground. The default is true.
    */
  var activate: js.UndefOr[Boolean] = js.native
  /**
    * The working directory.
    */
  var workingDirectory: js.UndefOr[String] = js.native
}

object OpenExternalSyncOptions {
  @scala.inline
  def apply(): OpenExternalSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenExternalSyncOptions]
  }
  @scala.inline
  implicit class OpenExternalSyncOptionsOps[Self <: OpenExternalSyncOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkingDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkingDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingDirectory")(js.undefined)
        ret
    }
  }
  
}

