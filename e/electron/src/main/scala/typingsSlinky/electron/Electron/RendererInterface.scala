package typingsSlinky.electron.Electron

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.electron.anon.TypeofNativeImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RendererInterface extends CommonInterface {
  var BrowserWindowProxy: Instantiable0[typingsSlinky.electron.Electron.BrowserWindowProxy]
  var contextBridge: ContextBridge
  var desktopCapturer: DesktopCapturer
  var ipcRenderer: IpcRenderer
  var remote: Remote
  var webFrame: WebFrame
  var webviewTag: WebviewTag
}

object RendererInterface {
  @scala.inline
  def apply(
    BrowserWindowProxy: Instantiable0[BrowserWindowProxy],
    clipboard: Clipboard,
    contextBridge: ContextBridge,
    crashReporter: CrashReporter,
    desktopCapturer: DesktopCapturer,
    ipcRenderer: IpcRenderer,
    nativeImage: TypeofNativeImage,
    remote: Remote,
    shell: Shell,
    webFrame: WebFrame,
    webviewTag: WebviewTag
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBrowserWindowProxy(value: Instantiable0[BrowserWindowProxy]): Self = this.set("BrowserWindowProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextBridge(value: ContextBridge): Self = this.set("contextBridge", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesktopCapturer(value: DesktopCapturer): Self = this.set("desktopCapturer", value.asInstanceOf[js.Any])
    @scala.inline
    def setIpcRenderer(value: IpcRenderer): Self = this.set("ipcRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemote(value: Remote): Self = this.set("remote", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebFrame(value: WebFrame): Self = this.set("webFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebviewTag(value: WebviewTag): Self = this.set("webviewTag", value.asInstanceOf[js.Any])
  }
  
}

