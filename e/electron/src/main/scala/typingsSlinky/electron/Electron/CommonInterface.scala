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
  @scala.inline
  implicit class CommonInterfaceOps[Self <: CommonInterface] (val x: Self) extends AnyVal {
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
    def setClipboard(value: Clipboard): Self = this.set("clipboard", value.asInstanceOf[js.Any])
    @scala.inline
    def setCrashReporter(value: CrashReporter): Self = this.set("crashReporter", value.asInstanceOf[js.Any])
    @scala.inline
    def setNativeImage(value: TypeofNativeImage): Self = this.set("nativeImage", value.asInstanceOf[js.Any])
    @scala.inline
    def setShell(value: Shell): Self = this.set("shell", value.asInstanceOf[js.Any])
  }
  
}

