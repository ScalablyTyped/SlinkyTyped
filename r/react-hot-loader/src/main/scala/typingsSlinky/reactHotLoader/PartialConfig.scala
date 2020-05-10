package typingsSlinky.reactHotLoader

import slinky.core.ReactComponentClass
import typingsSlinky.reactHotLoader.mod.HotError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-hot-loader.react-hot-loader.Config> */
@js.native
trait PartialConfig extends js.Object {
  var ErrorOverlay: js.UndefOr[ReactComponentClass[AnonErrors]] = js.native
  var allowSFC: js.UndefOr[Boolean] = js.native
  var disableHotRenderer: js.UndefOr[Boolean] = js.native
  var disableHotRendererWhenInjected: js.UndefOr[Boolean] = js.native
  var errorReporter: js.UndefOr[ReactComponentClass[HotError]] = js.native
  var ignoreComponents: js.UndefOr[Boolean] = js.native
  var ignoreSFC: js.UndefOr[Boolean] = js.native
  var logLevel: js.UndefOr[String] = js.native
  var onComponentCreate: js.UndefOr[js.Function2[/* type */ js.Any, /* displayName */ String, _]] = js.native
  var onComponentRegister: js.UndefOr[
    js.Function3[/* type */ js.Any, /* uniqueLocalName */ String, /* fileName */ String, _]
  ] = js.native
  var pureRender: js.UndefOr[Boolean] = js.native
  var pureSFC: js.UndefOr[Boolean] = js.native
  var reloadHooks: js.UndefOr[Boolean] = js.native
  var showReactDomPatchNotification: js.UndefOr[Boolean] = js.native
  var trackTailUpdates: js.UndefOr[Boolean] = js.native
}

object PartialConfig {
  @scala.inline
  def apply(): PartialConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfig]
  }
  @scala.inline
  implicit class PartialConfigOps[Self <: PartialConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorOverlayFunctionComponent(value: ReactComponentClass[AnonErrors]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorOverlayComponentClass(value: ReactComponentClass[AnonErrors]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorOverlay(value: ReactComponentClass[AnonErrors]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSFC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSFC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSFC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSFC")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableHotRenderer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHotRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableHotRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHotRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableHotRendererWhenInjected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHotRendererWhenInjected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableHotRendererWhenInjected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHotRendererWhenInjected")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorReporterFunctionComponent(value: ReactComponentClass[HotError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorReporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorReporterComponentClass(value: ReactComponentClass[HotError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorReporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorReporter(value: ReactComponentClass[HotError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorReporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorReporter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorReporter")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreComponents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreComponents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreComponents")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreSFC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSFC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreSFC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSFC")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnComponentCreate(value: (/* type */ js.Any, /* displayName */ String) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComponentCreate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnComponentCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComponentCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnComponentRegister(value: (/* type */ js.Any, /* uniqueLocalName */ String, /* fileName */ String) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComponentRegister")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnComponentRegister: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComponentRegister")(js.undefined)
        ret
    }
    @scala.inline
    def withPureRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pureRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPureRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pureRender")(js.undefined)
        ret
    }
    @scala.inline
    def withPureSFC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pureSFC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPureSFC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pureSFC")(js.undefined)
        ret
    }
    @scala.inline
    def withReloadHooks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadHooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReloadHooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadHooks")(js.undefined)
        ret
    }
    @scala.inline
    def withShowReactDomPatchNotification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showReactDomPatchNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowReactDomPatchNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showReactDomPatchNotification")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackTailUpdates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackTailUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackTailUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackTailUpdates")(js.undefined)
        ret
    }
  }
  
}

