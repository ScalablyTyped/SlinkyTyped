package typingsSlinky.remoteReduxDevtools.mod

import typingsSlinky.redux.mod.ActionCreator
import typingsSlinky.redux.mod.ActionCreatorsMapObject
import typingsSlinky.remoteReduxDevtools.remoteReduxDevtoolsNumbers.`0`
import typingsSlinky.remoteReduxDevtools.remoteReduxDevtoolsNumbers.`1`
import typingsSlinky.remoteReduxDevtools.remoteReduxDevtoolsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteReduxDevToolsOptions extends js.Object {
  /** Action creators functions to be available in the dispatcher. */
  var actionCreators: js.UndefOr[js.Array[ActionCreator[_]] | ActionCreatorsMapObject[_]] = js.native
  /**
    * Function which takes `action` object as argument, and should return
    * `action` object back.
    */
  var actionSanitizer: js.UndefOr[js.Function1[/* action */ js.Any, _]] = js.native
  /**
    * Actions types to be hidden in the monitors (while passed to the
    * reducers). If `actionsWhitelist` specified, `actionsBlacklist` is ignored.
    */
  var actionsBlacklist: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Actions types to be shown in the monitors (while passed to the reducers).
    * If `actionsWhitelist` specified, `actionsBlacklist` is ignored.
    */
  var actionsWhitelist: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Used to specify host for `remotedev-server`. If `port` is specified,
    * default value is `localhost`.
    */
  var hostname: js.UndefOr[String] = js.native
  /**
    * Identifies the instance when sending the history triggered by `sendOn`.
    * You can use, for example, user id here, to know who sent the data.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Maximum allowed actions to be stored in the history tree. The oldest
    * actions are removed once `maxAge` is reached. It's critical for
    * performance.
    */
  var maxAge: js.UndefOr[Double] = js.native
  /** The instance name to be showed on the monitor page. */
  var name: js.UndefOr[String] = js.native
  /** Used to specify host's port for `remotedev-server`. */
  var port: js.UndefOr[Double] = js.native
  /**
    * Specifies whether to allow remote monitoring. By default is
    * `process.env.NODE_ENV === 'development'`.
    */
  var realtime: js.UndefOr[Boolean] = js.native
  /** Specifies whether to use `https` protocol for `remotedev-server`. */
  var secure: js.UndefOr[Boolean] = js.native
  /**
    * Action or list of actions which should trigger sending the history to
    * the monitor (without starting it).
    */
  var sendOn: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * `0` - disabled (default)
    * `1` - send all uncaught exception messages
    * `2` - send only reducers error messages.
    */
  var sendOnError: js.UndefOr[`0` | `1` | `2`] = js.native
  /**
    * URL of the monitor to send the history when sendOn is triggered. By
    * default is `${secure ? 'https' : 'http'}://${hostname}:${port}`.
    */
  var sendTo: js.UndefOr[String] = js.native
  /**
    * If specified as `true`, whenever there's an exception in reducers, the
    * monitors will show the error message, and next actions will not be
    * dispatched.
    */
  var shouldCatchErrors: js.UndefOr[Boolean] = js.native
  /**
    * If set to `false`, will not recompute the states on hot reloading (or on
    * replacing the reducers). Available only for Redux enhancer.
    */
  var shouldHotReload: js.UndefOr[Boolean] = js.native
  /**
    * If specified as `false`, it will not record the changes till clicking on
    * *Start recording* button. Available only for Redux enhancer, for others
    * use `autoPause`.
    */
  var shouldRecordChanges: js.UndefOr[Boolean] = js.native
  /**
    * If specified as `true`, it will not allow any non-monitor actions to be
    * dispatched till clicking on *Unlock changes* button. Available only for
    * Redux enhancer.
    */
  var shouldStartLocked: js.UndefOr[Boolean] = js.native
  /**
    * Action or list of actions which should start remote monitoring (when
    * `realtime` is `false`).
    */
  var startOn: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Function which takes `state` object as argument, and should return
    * `state` object back.
    */
  var stateSanitizer: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.native
  /** Action or list of actions which should stop remote monitoring. */
  var stopOn: js.UndefOr[String | js.Array[String]] = js.native
}

object RemoteReduxDevToolsOptions {
  @scala.inline
  def apply(): RemoteReduxDevToolsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteReduxDevToolsOptions]
  }
  @scala.inline
  implicit class RemoteReduxDevToolsOptionsOps[Self <: RemoteReduxDevToolsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionCreators(value: js.Array[ActionCreator[_]] | ActionCreatorsMapObject[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionCreators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionCreators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionCreators")(js.undefined)
        ret
    }
    @scala.inline
    def withActionSanitizer(value: /* action */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionSanitizer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionSanitizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionSanitizer")(js.undefined)
        ret
    }
    @scala.inline
    def withActionsBlacklist(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionsBlacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionsBlacklist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionsBlacklist")(js.undefined)
        ret
    }
    @scala.inline
    def withActionsWhitelist(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionsWhitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionsWhitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionsWhitelist")(js.undefined)
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withRealtime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealtime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realtime")(js.undefined)
        ret
    }
    @scala.inline
    def withSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(js.undefined)
        ret
    }
    @scala.inline
    def withSendOn(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendOn")(js.undefined)
        ret
    }
    @scala.inline
    def withSendOnError(value: `0` | `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendOnError")(js.undefined)
        ret
    }
    @scala.inline
    def withSendTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendTo")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldCatchErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCatchErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldCatchErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCatchErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldHotReload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldHotReload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldHotReload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldHotReload")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldRecordChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRecordChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldRecordChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRecordChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldStartLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldStartLocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldStartLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldStartLocked")(js.undefined)
        ret
    }
    @scala.inline
    def withStartOn(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOn")(js.undefined)
        ret
    }
    @scala.inline
    def withStateSanitizer(value: /* state */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateSanitizer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStateSanitizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateSanitizer")(js.undefined)
        ret
    }
    @scala.inline
    def withStopOn(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOn")(js.undefined)
        ret
    }
  }
  
}

