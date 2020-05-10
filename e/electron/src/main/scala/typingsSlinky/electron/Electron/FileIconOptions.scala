package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.large
import typingsSlinky.electron.electronStrings.normal
import typingsSlinky.electron.electronStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileIconOptions extends js.Object {
  var size: small | normal | large = js.native
}

object FileIconOptions {
  @scala.inline
  def apply(size: small | normal | large): FileIconOptions = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileIconOptions]
  }
  @scala.inline
  implicit class FileIconOptionsOps[Self <: FileIconOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSize(value: small | normal | large): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

