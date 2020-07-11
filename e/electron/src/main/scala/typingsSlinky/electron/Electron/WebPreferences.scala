package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.`document-user-activation-required`
import typingsSlinky.electron.electronStrings.`no-user-gesture-required`
import typingsSlinky.electron.electronStrings.`user-gesture-required`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebPreferences extends js.Object {
  /**
    * A list of strings that will be appended to process.argv in the renderer process
    * of this app. Useful for passing small bits of data down to renderer process
    * preload scripts.
    */
  var additionalArguments: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * When specified, web pages with the same affinity will run in the same renderer
    * process. Note that due to reusing the renderer process, certain webPreferences
    * options will also be shared between the web pages even when you specified
    * different values for them, including but not limited to preload, sandbox and
    * nodeIntegration. So it is suggested to use exact same webPreferences for web
    * pages with the same affinity.
    */
  var affinity: js.UndefOr[String] = js.undefined
  /**
    * Allow an https page to run JavaScript, CSS or plugins from http URLs. Default is
    * false.
    */
  var allowRunningInsecureContent: js.UndefOr[Boolean] = js.undefined
  /**
    * Autoplay policy to apply to content in the window, can be
    * no-user-gesture-required, user-gesture-required,
    * document-user-activation-required. Defaults to no-user-gesture-required.
    */
  var autoplayPolicy: js.UndefOr[
    `no-user-gesture-required` | `user-gesture-required` | `document-user-activation-required`
  ] = js.undefined
  /**
    * Whether to throttle animations and timers when the page becomes background. This
    * also affects the . Defaults to true.
    */
  var backgroundThrottling: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to run Electron APIs and the specified preload script in a separate
    * JavaScript context. Defaults to false. The context that the preload script runs
    * in will still have full access to the document and window globals but it will
    * use its own set of JavaScript builtins (Array, Object, JSON, etc.) and will be
    * isolated from any changes made to the global environment by the loaded page. The
    * Electron API will only be available in the preload script and not the loaded
    * page. This option should be used when loading potentially untrusted remote
    * content to ensure the loaded content cannot tamper with the preload script and
    * any Electron APIs being used. This option uses the same technique used by . You
    * can access this context in the dev tools by selecting the 'Electron Isolated
    * Context' entry in the combo box at the top of the Console tab.
    */
  var contextIsolation: js.UndefOr[Boolean] = js.undefined
  /**
    * Defaults to ISO-8859-1.
    */
  var defaultEncoding: js.UndefOr[String] = js.undefined
  /**
    * Sets the default font for the font-family.
    */
  var defaultFontFamily: js.UndefOr[DefaultFontFamily] = js.undefined
  /**
    * Defaults to 16.
    */
  var defaultFontSize: js.UndefOr[Double] = js.undefined
  /**
    * Defaults to 13.
    */
  var defaultMonospaceFontSize: js.UndefOr[Double] = js.undefined
  /**
    * Whether to enable DevTools. If it is set to false, can not use
    * BrowserWindow.webContents.openDevTools() to open DevTools. Default is true.
    */
  var devTools: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of feature strings separated by ,, like CSSVariables,KeyboardEventKey to
    * disable. The full list of supported feature strings can be found in the file.
    */
  var disableBlinkFeatures: js.UndefOr[String] = js.undefined
  /**
    * Whether to prevent the window from resizing when entering HTML Fullscreen.
    * Default is false.
    */
  var disableHtmlFullscreenWindowResize: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of feature strings separated by ,, like CSSVariables,KeyboardEventKey to
    * enable. The full list of supported feature strings can be found in the file.
    */
  var enableBlinkFeatures: js.UndefOr[String] = js.undefined
  /**
    * Whether to enable the module. Default is true.
    */
  var enableRemoteModule: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables Chromium's experimental features. Default is false.
    */
  var experimentalFeatures: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables image support. Default is true.
    */
  var images: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables JavaScript support. Default is true.
    */
  var javascript: js.UndefOr[Boolean] = js.undefined
  /**
    * Defaults to 0.
    */
  var minimumFontSize: js.UndefOr[Double] = js.undefined
  /**
    * Whether to use native window.open(). Defaults to false. Child windows will
    * always have node integration disabled unless nodeIntegrationInSubFrames is true.
    * This option is currently experimental.
    */
  var nativeWindowOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether dragging and dropping a file or link onto the page causes a navigation.
    * Default is false.
    */
  var navigateOnDragDrop: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether node integration is enabled. Default is false.
    */
  var nodeIntegration: js.UndefOr[Boolean] = js.undefined
  /**
    * Experimental option for enabling Node.js support in sub-frames such as iframes
    * and child windows. All your preloads will load for every iframe, you can use
    * process.isMainFrame to determine if you are in the main frame or not.
    */
  var nodeIntegrationInSubFrames: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether node integration is enabled in web workers. Default is false. More about
    * this can be found in .
    */
  var nodeIntegrationInWorker: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to enable offscreen rendering for the browser window. Defaults to false.
    * See the for more details.
    */
  var offscreen: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the session used by the page according to the session's partition string.
    * If partition starts with persist:, the page will use a persistent session
    * available to all pages in the app with the same partition. If there is no
    * persist: prefix, the page will use an in-memory session. By assigning the same
    * partition, multiple pages can share the same session. Default is the default
    * session.
    */
  var partition: js.UndefOr[String] = js.undefined
  /**
    * Whether plugins should be enabled. Default is false.
    */
  var plugins: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies a script that will be loaded before other scripts run in the page.
    * This script will always have access to node APIs no matter whether node
    * integration is turned on or off. The value should be the absolute file path to
    * the script. When node integration is turned off, the preload script can
    * reintroduce Node global symbols back to the global scope. See example .
    */
  var preload: js.UndefOr[String] = js.undefined
  /**
    * Whether to enable browser style consecutive dialog protection. Default is false.
    */
  var safeDialogs: js.UndefOr[Boolean] = js.undefined
  /**
    * The message to display when consecutive dialog protection is triggered. If not
    * defined the default message would be used, note that currently the default
    * message is in English and not localized.
    */
  var safeDialogsMessage: js.UndefOr[String] = js.undefined
  /**
    * If set, this will sandbox the renderer associated with the window, making it
    * compatible with the Chromium OS-level sandbox and disabling the Node.js engine.
    * This is not the same as the nodeIntegration option and the APIs available to the
    * preload script are more limited. Read more about the option . This option is
    * currently experimental and may change or be removed in future Electron releases.
    */
  var sandbox: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables scroll bounce (rubber banding) effect on macOS. Default is false.
    */
  var scrollBounce: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the session used by the page. Instead of passing the Session object
    * directly, you can also choose to use the partition option instead, which accepts
    * a partition string. When both session and partition are provided, session will
    * be preferred. Default is the default session.
    */
  var session: js.UndefOr[Session_] = js.undefined
  /**
    * Make TextArea elements resizable. Default is true.
    */
  var textAreasAreResizable: js.UndefOr[Boolean] = js.undefined
  /**
    * When false, it will disable the same-origin policy (usually using testing
    * websites by people), and set allowRunningInsecureContent to true if this options
    * has not been set by user. Default is true.
    */
  var webSecurity: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables WebGL support. Default is true.
    */
  var webgl: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to enable the . Defaults to false. The preload script configured for the
    * will have node integration enabled when it is executed so you should ensure
    * remote/untrusted content is not able to create a tag with a possibly malicious
    * preload script. You can use the will-attach-webview event on to strip away the
    * preload script and to validate or alter the 's initial settings.
    */
  var webviewTag: js.UndefOr[Boolean] = js.undefined
  /**
    * The default zoom factor of the page, 3.0 represents 300%. Default is 1.0.
    */
  var zoomFactor: js.UndefOr[Double] = js.undefined
}

object WebPreferences {
  @scala.inline
  def apply(): WebPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebPreferences]
  }
  @scala.inline
  implicit class WebPreferencesOps[Self <: WebPreferences] (val x: Self) extends AnyVal {
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
    def setAdditionalArgumentsVarargs(value: String*): Self = this.set("additionalArguments", js.Array(value :_*))
    @scala.inline
    def setAdditionalArguments(value: js.Array[String]): Self = this.set("additionalArguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalArguments: Self = this.set("additionalArguments", js.undefined)
    @scala.inline
    def setAffinity(value: String): Self = this.set("affinity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAffinity: Self = this.set("affinity", js.undefined)
    @scala.inline
    def setAllowRunningInsecureContent(value: Boolean): Self = this.set("allowRunningInsecureContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowRunningInsecureContent: Self = this.set("allowRunningInsecureContent", js.undefined)
    @scala.inline
    def setAutoplayPolicy(value: `no-user-gesture-required` | `user-gesture-required` | `document-user-activation-required`): Self = this.set("autoplayPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplayPolicy: Self = this.set("autoplayPolicy", js.undefined)
    @scala.inline
    def setBackgroundThrottling(value: Boolean): Self = this.set("backgroundThrottling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundThrottling: Self = this.set("backgroundThrottling", js.undefined)
    @scala.inline
    def setContextIsolation(value: Boolean): Self = this.set("contextIsolation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextIsolation: Self = this.set("contextIsolation", js.undefined)
    @scala.inline
    def setDefaultEncoding(value: String): Self = this.set("defaultEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultEncoding: Self = this.set("defaultEncoding", js.undefined)
    @scala.inline
    def setDefaultFontFamily(value: DefaultFontFamily): Self = this.set("defaultFontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFontFamily: Self = this.set("defaultFontFamily", js.undefined)
    @scala.inline
    def setDefaultFontSize(value: Double): Self = this.set("defaultFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFontSize: Self = this.set("defaultFontSize", js.undefined)
    @scala.inline
    def setDefaultMonospaceFontSize(value: Double): Self = this.set("defaultMonospaceFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultMonospaceFontSize: Self = this.set("defaultMonospaceFontSize", js.undefined)
    @scala.inline
    def setDevTools(value: Boolean): Self = this.set("devTools", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevTools: Self = this.set("devTools", js.undefined)
    @scala.inline
    def setDisableBlinkFeatures(value: String): Self = this.set("disableBlinkFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableBlinkFeatures: Self = this.set("disableBlinkFeatures", js.undefined)
    @scala.inline
    def setDisableHtmlFullscreenWindowResize(value: Boolean): Self = this.set("disableHtmlFullscreenWindowResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableHtmlFullscreenWindowResize: Self = this.set("disableHtmlFullscreenWindowResize", js.undefined)
    @scala.inline
    def setEnableBlinkFeatures(value: String): Self = this.set("enableBlinkFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableBlinkFeatures: Self = this.set("enableBlinkFeatures", js.undefined)
    @scala.inline
    def setEnableRemoteModule(value: Boolean): Self = this.set("enableRemoteModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRemoteModule: Self = this.set("enableRemoteModule", js.undefined)
    @scala.inline
    def setExperimentalFeatures(value: Boolean): Self = this.set("experimentalFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimentalFeatures: Self = this.set("experimentalFeatures", js.undefined)
    @scala.inline
    def setImages(value: Boolean): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    @scala.inline
    def setJavascript(value: Boolean): Self = this.set("javascript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJavascript: Self = this.set("javascript", js.undefined)
    @scala.inline
    def setMinimumFontSize(value: Double): Self = this.set("minimumFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumFontSize: Self = this.set("minimumFontSize", js.undefined)
    @scala.inline
    def setNativeWindowOpen(value: Boolean): Self = this.set("nativeWindowOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNativeWindowOpen: Self = this.set("nativeWindowOpen", js.undefined)
    @scala.inline
    def setNavigateOnDragDrop(value: Boolean): Self = this.set("navigateOnDragDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigateOnDragDrop: Self = this.set("navigateOnDragDrop", js.undefined)
    @scala.inline
    def setNodeIntegration(value: Boolean): Self = this.set("nodeIntegration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeIntegration: Self = this.set("nodeIntegration", js.undefined)
    @scala.inline
    def setNodeIntegrationInSubFrames(value: Boolean): Self = this.set("nodeIntegrationInSubFrames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeIntegrationInSubFrames: Self = this.set("nodeIntegrationInSubFrames", js.undefined)
    @scala.inline
    def setNodeIntegrationInWorker(value: Boolean): Self = this.set("nodeIntegrationInWorker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeIntegrationInWorker: Self = this.set("nodeIntegrationInWorker", js.undefined)
    @scala.inline
    def setOffscreen(value: Boolean): Self = this.set("offscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffscreen: Self = this.set("offscreen", js.undefined)
    @scala.inline
    def setPartition(value: String): Self = this.set("partition", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartition: Self = this.set("partition", js.undefined)
    @scala.inline
    def setPlugins(value: Boolean): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setPreload(value: String): Self = this.set("preload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    @scala.inline
    def setSafeDialogs(value: Boolean): Self = this.set("safeDialogs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafeDialogs: Self = this.set("safeDialogs", js.undefined)
    @scala.inline
    def setSafeDialogsMessage(value: String): Self = this.set("safeDialogsMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafeDialogsMessage: Self = this.set("safeDialogsMessage", js.undefined)
    @scala.inline
    def setSandbox(value: Boolean): Self = this.set("sandbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSandbox: Self = this.set("sandbox", js.undefined)
    @scala.inline
    def setScrollBounce(value: Boolean): Self = this.set("scrollBounce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollBounce: Self = this.set("scrollBounce", js.undefined)
    @scala.inline
    def setSession(value: Session_): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    @scala.inline
    def setTextAreasAreResizable(value: Boolean): Self = this.set("textAreasAreResizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAreasAreResizable: Self = this.set("textAreasAreResizable", js.undefined)
    @scala.inline
    def setWebSecurity(value: Boolean): Self = this.set("webSecurity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebSecurity: Self = this.set("webSecurity", js.undefined)
    @scala.inline
    def setWebgl(value: Boolean): Self = this.set("webgl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebgl: Self = this.set("webgl", js.undefined)
    @scala.inline
    def setWebviewTag(value: Boolean): Self = this.set("webviewTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebviewTag: Self = this.set("webviewTag", js.undefined)
    @scala.inline
    def setZoomFactor(value: Double): Self = this.set("zoomFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomFactor: Self = this.set("zoomFactor", js.undefined)
  }
  
}

