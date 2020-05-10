package typingsSlinky.electron.Electron

import typingsSlinky.electron.TypeofNativeImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonInterface extends js.Object {
  var clipboard: Clipboard_ = js.native
  var crashReporter: CrashReporter_ = js.native
  var nativeImage: TypeofNativeImage = js.native
  var shell: Shell_ = js.native
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
  @scala.inline
  implicit class CommonInterfaceOps[Self <: CommonInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClipboard(value: Clipboard_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrashReporter(value: CrashReporter_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crashReporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNativeImage(value: TypeofNativeImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShell(value: Shell_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shell")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

