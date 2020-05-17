package typingsSlinky.reactHotLoader.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactHotLoader.anon.Errors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  /**
    * Global error overlay
    */
  var ErrorOverlay: ReactComponentClass[Errors] = js.native
  /**
    * Allows SFC to be used, enables "intermediate" components used by Relay, should be disabled for Preact
    */
  var allowSFC: Boolean = js.native
  /**
    * Disable "hot-replacement-render"
    */
  var disableHotRenderer: Boolean = js.native
  /**
    * Disable "hot-replacement-render" when injection into react-dom are made
    */
  var disableHotRendererWhenInjected: Boolean = js.native
  /**
    * default value for AppContainer errorOverlay
    */
  var errorReporter: ReactComponentClass[HotError] = js.native
  /**
    * flag to completely disable RHL for Components
    */
  var ignoreComponents: Boolean = js.native
  /**
    * flag to completely disable RHL for SFC
    */
  var ignoreSFC: Boolean = js.native
  /**
    * Specify loglLevel, default to 'error', set it to false to disable logs.
    * Available levels: ['debug', 'log', 'warn', 'error']
    */
  var logLevel: String = js.native
  /**
    * keep render method unpatched, moving sideEffect to componentDidUpdate
    */
  var pureRender: Boolean = js.native
  /**
    *  Allows using SFC without changes. leading to some components not updated
    */
  var pureSFC: Boolean = js.native
  /**
    * enables or disables hooks treatment
    */
  var reloadHooks: Boolean = js.native
  /**
    * Show "hot-loader/react-dom" warning
    */
  var showReactDomPatchNotification: Boolean = js.native
  /**
    * Controls tail(deferred) update checking
    */
  var trackTailUpdates: Boolean = js.native
  /**
    *
    * @param type {any} type being rendered. The first argument of React.createElement
    * @param displayName {string} type display name (if exists)
    */
  def onComponentCreate(`type`: js.Any, displayName: String): js.Any = js.native
  /**
    *
    * @param {any} type being registered. This could be ANY top level variable among project.
    * @param {string} uniqueLocalName - variable name
    * @param {string} fileName - origin file
    * @return {any}
    */
  def onComponentRegister(`type`: js.Any, uniqueLocalName: String, fileName: String): js.Any = js.native
}

object Config {
  @scala.inline
  def apply(
    ErrorOverlay: ReactComponentClass[Errors],
    allowSFC: Boolean,
    disableHotRenderer: Boolean,
    disableHotRendererWhenInjected: Boolean,
    errorReporter: ReactComponentClass[HotError],
    ignoreComponents: Boolean,
    ignoreSFC: Boolean,
    logLevel: String,
    onComponentCreate: (js.Any, String) => js.Any,
    onComponentRegister: (js.Any, String, String) => js.Any,
    pureRender: Boolean,
    pureSFC: Boolean,
    reloadHooks: Boolean,
    showReactDomPatchNotification: Boolean,
    trackTailUpdates: Boolean
  ): Config = {
    val __obj = js.Dynamic.literal(ErrorOverlay = ErrorOverlay.asInstanceOf[js.Any], allowSFC = allowSFC.asInstanceOf[js.Any], disableHotRenderer = disableHotRenderer.asInstanceOf[js.Any], disableHotRendererWhenInjected = disableHotRendererWhenInjected.asInstanceOf[js.Any], errorReporter = errorReporter.asInstanceOf[js.Any], ignoreComponents = ignoreComponents.asInstanceOf[js.Any], ignoreSFC = ignoreSFC.asInstanceOf[js.Any], logLevel = logLevel.asInstanceOf[js.Any], onComponentCreate = js.Any.fromFunction2(onComponentCreate), onComponentRegister = js.Any.fromFunction3(onComponentRegister), pureRender = pureRender.asInstanceOf[js.Any], pureSFC = pureSFC.asInstanceOf[js.Any], reloadHooks = reloadHooks.asInstanceOf[js.Any], showReactDomPatchNotification = showReactDomPatchNotification.asInstanceOf[js.Any], trackTailUpdates = trackTailUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorOverlay(value: ReactComponentClass[Errors]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowSFC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSFC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableHotRenderer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHotRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableHotRendererWhenInjected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHotRendererWhenInjected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorReporter(value: ReactComponentClass[HotError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorReporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreComponents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreComponents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreSFC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSFC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnComponentCreate(value: (js.Any, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComponentCreate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnComponentRegister(value: (js.Any, String, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComponentRegister")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPureRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pureRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPureSFC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pureSFC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReloadHooks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadHooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowReactDomPatchNotification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showReactDomPatchNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackTailUpdates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackTailUpdates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

