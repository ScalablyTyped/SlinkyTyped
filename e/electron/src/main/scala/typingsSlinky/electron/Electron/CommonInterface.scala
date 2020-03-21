package typingsSlinky.electron.Electron

import typingsSlinky.electron.TypeofNativeImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonInterface extends js.Object {
  var clipboard: Clipboard_
  var crashReporter: CrashReporter_
  var nativeImage: TypeofNativeImage
  var shell: Shell_
}

object CommonInterface {
  @scala.inline
  def apply(
    clipboard: Clipboard_,
    crashReporter: CrashReporter_,
    nativeImage: TypeofNativeImage,
    shell: Shell_
  ): CommonInterface = {
    val __obj = js.Dynamic.literal(clipboard = clipboard.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], nativeImage = nativeImage.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CommonInterface]
  }
}

