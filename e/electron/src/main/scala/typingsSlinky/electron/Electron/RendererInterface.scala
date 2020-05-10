package typingsSlinky.electron.Electron

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.electron.TypeofNativeImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RendererInterface extends CommonInterface {
  var BrowserWindowProxy: Instantiable0[typingsSlinky.electron.Electron.BrowserWindowProxy] = js.native
  var contextBridge: ContextBridge_ = js.native
  var desktopCapturer: DesktopCapturer_ = js.native
  var ipcRenderer: IpcRenderer_ = js.native
  var remote: Remote_ = js.native
  var webFrame: WebFrame_ = js.native
  var webviewTag: WebviewTag_ = js.native
}

object RendererInterface {
  @scala.inline
  def apply(
    BrowserWindowProxy: Instantiable0[BrowserWindowProxy],
    clipboard: Clipboard_,
    contextBridge: ContextBridge_,
    crashReporter: CrashReporter_,
    desktopCapturer: DesktopCapturer_,
    ipcRenderer: IpcRenderer_,
    nativeImage: TypeofNativeImage,
    remote: Remote_,
    shell: Shell_,
    webFrame: WebFrame_,
    webviewTag: WebviewTag_
  ): RendererInterface = {
    val __obj = js.Dynamic.literal(BrowserWindowProxy = BrowserWindowProxy.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], contextBridge = contextBridge.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], desktopCapturer = desktopCapturer.asInstanceOf[js.Any], ipcRenderer = ipcRenderer.asInstanceOf[js.Any], nativeImage = nativeImage.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], webFrame = webFrame.asInstanceOf[js.Any], webviewTag = webviewTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererInterface]
  }
  @scala.inline
  implicit class RendererInterfaceOps[Self <: RendererInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowserWindowProxy(value: Instantiable0[BrowserWindowProxy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrowserWindowProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextBridge(value: ContextBridge_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextBridge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesktopCapturer(value: DesktopCapturer_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopCapturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpcRenderer(value: IpcRenderer_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipcRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemote(value: Remote_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebFrame(value: WebFrame_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebviewTag(value: WebviewTag_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webviewTag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

