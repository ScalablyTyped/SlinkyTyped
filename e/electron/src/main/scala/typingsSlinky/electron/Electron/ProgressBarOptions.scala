package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.error
import typingsSlinky.electron.electronStrings.indeterminate
import typingsSlinky.electron.electronStrings.none
import typingsSlinky.electron.electronStrings.normal
import typingsSlinky.electron.electronStrings.paused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressBarOptions extends js.Object {
  /**
    * Mode for the progress bar. Can be none, normal, indeterminate, error or paused.
    */
  var mode: none | normal | indeterminate | error | paused = js.native
}

object ProgressBarOptions {
  @scala.inline
  def apply(mode: none | normal | indeterminate | error | paused): ProgressBarOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarOptions]
  }
  @scala.inline
  implicit class ProgressBarOptionsOps[Self <: ProgressBarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: none | normal | indeterminate | error | paused): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

