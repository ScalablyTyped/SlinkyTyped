package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.`document-user-activation-required`
import typingsSlinky.electron.electronStrings.`no-user-gesture-required`
import typingsSlinky.electron.electronStrings.`user-gesture-required`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPreferences extends js.Object {
  /**
    * A list of strings that will be appended to process.argv in the renderer process
    * of this app. Useful for passing small bits of data down to renderer process
    * preload scripts.
    */
  var additionalArguments: js.UndefOr[js.Array[String]] = js.native
  /**
    * When specified, web pages with the same affinity will run in the same renderer
    * process. Note that due to reusing the renderer process, certain webPreferences
    * options will also be shared between the web pages even when you specified
    * different values for them, including but not limited to preload, sandbox and
    * nodeIntegration. So it is suggested to use exact same webPreferences for web
    * pages with the same affinity.
    */
  var affinity: js.UndefOr[String] = js.native
  /**
    * Allow an https page to run JavaScript, CSS or plugins from http URLs. Default is
    * false.
    */
  var allowRunningInsecureContent: js.UndefOr[Boolean] = js.native
  /**
    * Autoplay policy to apply to content in the window, can be
    * no-user-gesture-required, user-gesture-required,
    * document-user-activation-required. Defaults to no-user-gesture-required.
    */
  var autoplayPolicy: js.UndefOr[
    `no-user-gesture-required` | `user-gesture-required` | `document-user-activation-required`
  ] = js.native
  /**
    * Whether to throttle animations and timers when the page becomes background. This
    * also affects the . Defaults to true.
    */
  var backgroundThrottling: js.UndefOr[Boolean] = js.native
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
  var contextIsolation: js.UndefOr[Boolean] = js.native
  /**
    * Defaults to ISO-8859-1.
    */
  var defaultEncoding: js.UndefOr[String] = js.native
  /**
    * Sets the default font for the font-family.
    */
  var defaultFontFamily: js.UndefOr[DefaultFontFamily] = js.native
  /**
    * Defaults to 16.
    */
  var defaultFontSize: js.UndefOr[Double] = js.native
  /**
    * Defaults to 13.
    */
  var defaultMonospaceFontSize: js.UndefOr[Double] = js.native
  /**
    * Whether to enable DevTools. If it is set to false, can not use
    * BrowserWindow.webContents.openDevTools() to open DevTools. Default is true.
    */
  var devTools: js.UndefOr[Boolean] = js.native
  /**
    * A list of feature strings separated by ,, like CSSVariables,KeyboardEventKey to
    * disable. The full list of supported feature strings can be found in the file.
    */
  var disableBlinkFeatures: js.UndefOr[String] = js.native
  /**
    * Whether to prevent the window from resizing when entering HTML Fullscreen.
    * Default is false.
    */
  var disableHtmlFullscreenWindowResize: js.UndefOr[Boolean] = js.native
  /**
    * A list of feature strings separated by ,, like CSSVariables,KeyboardEventKey to
    * enable. The full list of supported feature strings can be found in the file.
    */
  var enableBlinkFeatures: js.UndefOr[String] = js.native
  /**
    * Whether to enable the module. Default is true.
    */
  var enableRemoteModule: js.UndefOr[Boolean] = js.native
  /**
    * Enables Chromium's experimental features. Default is false.
    */
  var experimentalFeatures: js.UndefOr[Boolean] = js.native
  /**
    * Enables image support. Default is true.
    */
  var images: js.UndefOr[Boolean] = js.native
  /**
    * Enables JavaScript support. Default is true.
    */
  var javascript: js.UndefOr[Boolean] = js.native
  /**
    * Defaults to 0.
    */
  var minimumFontSize: js.UndefOr[Double] = js.native
  /**
    * Whether to use native window.open(). Defaults to false. Child windows will
    * always have node integration disabled unless nodeIntegrationInSubFrames is true.
    * This option is currently experimental.
    */
  var nativeWindowOpen: js.UndefOr[Boolean] = js.native
  /**
    * Whether dragging and dropping a file or link onto the page causes a navigation.
    * Default is false.
    */
  var navigateOnDragDrop: js.UndefOr[Boolean] = js.native
  /**
    * Whether node integration is enabled. Default is false.
    */
  var nodeIntegration: js.UndefOr[Boolean] = js.native
  /**
    * Experimental option for enabling Node.js support in sub-frames such as iframes
    * and child windows. All your preloads will load for every iframe, you can use
    * process.isMainFrame to determine if you are in the main frame or not.
    */
  var nodeIntegrationInSubFrames: js.UndefOr[Boolean] = js.native
  /**
    * Whether node integration is enabled in web workers. Default is false. More about
    * this can be found in .
    */
  var nodeIntegrationInWorker: js.UndefOr[Boolean] = js.native
  /**
    * Whether to enable offscreen rendering for the browser window. Defaults to false.
    * See the for more details.
    */
  var offscreen: js.UndefOr[Boolean] = js.native
  /**
    * Sets the session used by the page according to the session's partition string.
    * If partition starts with persist:, the page will use a persistent session
    * available to all pages in the app with the same partition. If there is no
    * persist: prefix, the page will use an in-memory session. By assigning the same
    * partition, multiple pages can share the same session. Default is the default
    * session.
    */
  var partition: js.UndefOr[String] = js.native
  /**
    * Whether plugins should be enabled. Default is false.
    */
  var plugins: js.UndefOr[Boolean] = js.native
  /**
    * Specifies a script that will be loaded before other scripts run in the page.
    * This script will always have access to node APIs no matter whether node
    * integration is turned on or off. The value should be the absolute file path to
    * the script. When node integration is turned off, the preload script can
    * reintroduce Node global symbols back to the global scope. See example .
    */
  var preload: js.UndefOr[String] = js.native
  /**
    * Whether to enable browser style consecutive dialog protection. Default is false.
    */
  var safeDialogs: js.UndefOr[Boolean] = js.native
  /**
    * The message to display when consecutive dialog protection is triggered. If not
    * defined the default message would be used, note that currently the default
    * message is in English and not localized.
    */
  var safeDialogsMessage: js.UndefOr[String] = js.native
  /**
    * If set, this will sandbox the renderer associated with the window, making it
    * compatible with the Chromium OS-level sandbox and disabling the Node.js engine.
    * This is not the same as the nodeIntegration option and the APIs available to the
    * preload script are more limited. Read more about the option . This option is
    * currently experimental and may change or be removed in future Electron releases.
    */
  var sandbox: js.UndefOr[Boolean] = js.native
  /**
    * Enables scroll bounce (rubber banding) effect on macOS. Default is false.
    */
  var scrollBounce: js.UndefOr[Boolean] = js.native
  /**
    * Sets the session used by the page. Instead of passing the Session object
    * directly, you can also choose to use the partition option instead, which accepts
    * a partition string. When both session and partition are provided, session will
    * be preferred. Default is the default session.
    */
  var session: js.UndefOr[Session_] = js.native
  /**
    * Make TextArea elements resizable. Default is true.
    */
  var textAreasAreResizable: js.UndefOr[Boolean] = js.native
  /**
    * When false, it will disable the same-origin policy (usually using testing
    * websites by people), and set allowRunningInsecureContent to true if this options
    * has not been set by user. Default is true.
    */
  var webSecurity: js.UndefOr[Boolean] = js.native
  /**
    * Enables WebGL support. Default is true.
    */
  var webgl: js.UndefOr[Boolean] = js.native
  /**
    * Whether to enable the . Defaults to false. The preload script configured for the
    * will have node integration enabled when it is executed so you should ensure
    * remote/untrusted content is not able to create a tag with a possibly malicious
    * preload script. You can use the will-attach-webview event on to strip away the
    * preload script and to validate or alter the 's initial settings.
    */
  var webviewTag: js.UndefOr[Boolean] = js.native
  /**
    * The default zoom factor of the page, 3.0 represents 300%. Default is 1.0.
    */
  var zoomFactor: js.UndefOr[Double] = js.native
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
    def withAdditionalArguments(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalArguments")(js.undefined)
        ret
    }
    @scala.inline
    def withAffinity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAffinity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affinity")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowRunningInsecureContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRunningInsecureContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowRunningInsecureContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRunningInsecureContent")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplayPolicy(value: `no-user-gesture-required` | `user-gesture-required` | `document-user-activation-required`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplayPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundThrottling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundThrottling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundThrottling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundThrottling")(js.undefined)
        ret
    }
    @scala.inline
    def withContextIsolation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextIsolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextIsolation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextIsolation")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultFontFamily(value: DefaultFontFamily): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultMonospaceFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMonospaceFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultMonospaceFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMonospaceFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDevTools(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devTools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevTools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devTools")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableBlinkFeatures(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableBlinkFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableBlinkFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableBlinkFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableHtmlFullscreenWindowResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHtmlFullscreenWindowResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableHtmlFullscreenWindowResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHtmlFullscreenWindowResize")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableBlinkFeatures(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBlinkFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableBlinkFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBlinkFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRemoteModule(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRemoteModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRemoteModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRemoteModule")(js.undefined)
        ret
    }
    @scala.inline
    def withExperimentalFeatures(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimentalFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withImages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(js.undefined)
        ret
    }
    @scala.inline
    def withJavascript(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javascript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJavascript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javascript")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeWindowOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeWindowOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeWindowOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeWindowOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigateOnDragDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateOnDragDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigateOnDragDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateOnDragDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeIntegration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeIntegration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeIntegration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeIntegration")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeIntegrationInSubFrames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeIntegrationInSubFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeIntegrationInSubFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeIntegrationInSubFrames")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeIntegrationInWorker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeIntegrationInWorker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeIntegrationInWorker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeIntegrationInWorker")(js.undefined)
        ret
    }
    @scala.inline
    def withOffscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withPartition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partition")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withPreload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeDialogs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeDialogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafeDialogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeDialogs")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeDialogsMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeDialogsMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafeDialogsMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeDialogsMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withSandbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSandbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollBounce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollBounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBounce")(js.undefined)
        ret
    }
    @scala.inline
    def withSession(value: Session_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAreasAreResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAreasAreResizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAreasAreResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAreasAreResizable")(js.undefined)
        ret
    }
    @scala.inline
    def withWebSecurity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSecurity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebSecurity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSecurity")(js.undefined)
        ret
    }
    @scala.inline
    def withWebgl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webgl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebgl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webgl")(js.undefined)
        ret
    }
    @scala.inline
    def withWebviewTag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webviewTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebviewTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webviewTag")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomFactor")(js.undefined)
        ret
    }
  }
  
}

