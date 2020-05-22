package typingsSlinky.electron.Electron

import typingsSlinky.electron.anon.TypeofNativeImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonInterface extends js.Object {
  var clipboard: Clipboard
  var crashReporter: CrashReporter
  var nativeImage: TypeofNativeImage
  var shell: Shell
}

object CommonInterface {
  @scala.inline
  def apply(clipboard: Clipboard, crashReporter: CrashReporter, nativeImage: TypeofNativeImage, shell: Shell): CommonInterface = {
    val __obj = js.Dynamic.literal(clipboard = clipboard.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], nativeImage = nativeImage.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonInterface]
  }
}

