package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.large
import typingsSlinky.electron.electronStrings.normal
import typingsSlinky.electron.electronStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileIconOptions extends js.Object {
  var size: small | normal | large
}

object FileIconOptions {
  @scala.inline
  def apply(size: small | normal | large): FileIconOptions = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileIconOptions]
  }
}

