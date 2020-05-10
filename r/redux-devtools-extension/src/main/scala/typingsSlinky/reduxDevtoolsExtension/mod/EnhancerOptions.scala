package typingsSlinky.reduxDevtoolsExtension.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.ActionCreator
import typingsSlinky.reduxDevtoolsExtension.AnonDate
import typingsSlinky.reduxDevtoolsExtension.AnonDispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnhancerOptions extends js.Object {
  /**
    * action creators functions to be available in the Dispatcher.
    */
  var actionCreators: js.UndefOr[js.Array[ActionCreator[_]] | StringDictionary[ActionCreator[_]]] = js.native
  /**
    * function which takes `action` object and id number as arguments, and should return `action` object back.
    */
  var actionSanitizer: js.UndefOr[js.Function2[/* action */ Action[_], /* id */ Double, Action[_]]] = js.native
  /**
    * *string or array of strings as regex* - actions types to be hidden / shown in the monitors (while passed to the reducers).
    * If `actionsWhitelist` specified, `actionsBlacklist` is ignored.
    */
  var actionsBlacklist: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * *string or array of strings as regex* - actions types to be hidden / shown in the monitors (while passed to the reducers).
    * If `actionsWhitelist` specified, `actionsBlacklist` is ignored.
    */
  var actionsWhitelist: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * auto pauses when the extension’s window is not opened, and so has zero impact on your app when not in use.
    * Not available for Redux enhancer (as it already does it but storing the data to be sent).
    *
    * @default false
    */
  var autoPause: js.UndefOr[Boolean] = js.native
  /**
    * If you want to restrict the extension, specify the features you allow.
    * If not specified, all of the features are enabled. When set as an object, only those included as `true` will be allowed.
    * Note that except `true`/`false`, `import` and `export` can be set as `custom` (which is by default for Redux enhancer), meaning that the importing/exporting occurs on the client side.
    * Otherwise, you'll get/set the data right from the monitor part.
    */
  var features: js.UndefOr[AnonDispatch] = js.native
  /**
    * if more than one action is dispatched in the indicated interval, all new actions will be collected and sent at once.
    * It is the joint between performance and speed. When set to `0`, all actions will be sent instantly.
    * Set it to a higher value when experiencing perf issues (also `maxAge` to a lower value).
    *
    * @default 500 ms.
    */
  var latency: js.UndefOr[Double] = js.native
  /**
    * (> 1) - maximum allowed actions to be stored in the history tree. The oldest actions are removed once maxAge is reached. It's critical for performance.
    *
    * @default 50
    */
  var maxAge: js.UndefOr[Double] = js.native
  /**
    * the instance name to be showed on the monitor page. Default value is `document.title`.
    * If not specified and there's no document title, it will consist of `tabId` and `instanceId`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * if specified, whenever clicking on `Pause recording` button and there are actions in the history log, will add this action type.
    * If not specified, will commit when paused. Available only for Redux enhancer.
    *
    * @default "@@PAUSED""
    */
  var pauseActionType: js.UndefOr[String] = js.native
  /**
    * called for every action before sending, takes `state` and `action` object, and returns `true` in case it allows sending the current data to the monitor.
    * Use it as a more advanced version of `actionsBlacklist`/`actionsWhitelist` parameters.
    */
  var predicate: js.UndefOr[js.Function2[/* state */ js.Any, /* action */ Action[_], Boolean]] = js.native
  /**
    * - `undefined` - will use regular `JSON.stringify` to send data (it's the fast mode).
    * - `false` - will handle also circular references.
    * - `true` - will handle also date, regex, undefined, error objects, symbols, maps, sets and functions.
    * - object, which contains `date`, `regex`, `undefined`, `error`, `symbol`, `map`, `set` and `function` keys.
    *   For each of them you can indicate if to include (by setting as `true`).
    *   For `function` key you can also specify a custom function which handles serialization.
    *   See [`jsan`](https://github.com/kolodny/jsan) for more details.
    */
  var serialize: js.UndefOr[Boolean | AnonDate] = js.native
  /**
    * if specified as `true`, whenever there's an exception in reducers, the monitors will show the error message, and next actions will not be dispatched.
    *
    * @default false
    */
  var shouldCatchErrors: js.UndefOr[Boolean] = js.native
  /**
    * if set to `false`, will not recompute the states on hot reloading (or on replacing the reducers). Available only for Redux enhancer.
    *
    * @default true
    */
  var shouldHotReload: js.UndefOr[Boolean] = js.native
  /**
    * if specified as `false`, it will not record the changes till clicking on `Start recording` button.
    * Available only for Redux enhancer, for others use `autoPause`.
    *
    * @default true
    */
  var shouldRecordChanges: js.UndefOr[Boolean] = js.native
  /**
    * if specified as `true`, it will not allow any non-monitor actions to be dispatched till clicking on `Unlock changes` button.
    * Available only for Redux enhancer.
    *
    * @default false
    */
  var shouldStartLocked: js.UndefOr[Boolean] = js.native
  /**
    * function which takes `state` object and index as arguments, and should return `state` object back.
    */
  var stateSanitizer: js.UndefOr[js.Function2[/* state */ js.Any, /* index */ Double, _]] = js.native
  /**
    * Set to true or a stacktrace-returning function to record call stack traces for dispatched actions.
    * Defaults to false.
    */
  var trace: js.UndefOr[Boolean | (js.Function1[/* action */ Action[_], String])] = js.native
  /**
    * The maximum number of stack trace entries to record per action. Defaults to 10.
    */
  var traceLimit: js.UndefOr[Double] = js.native
}

object EnhancerOptions {
  @scala.inline
  def apply(): EnhancerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnhancerOptions]
  }
  @scala.inline
  implicit class EnhancerOptionsOps[Self <: EnhancerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionCreators(value: js.Array[ActionCreator[_]] | StringDictionary[ActionCreator[_]]): Self = {
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
    def withActionSanitizer(value: (/* action */ Action[_], /* id */ Double) => Action[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionSanitizer")(js.Any.fromFunction2(value))
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
    def withAutoPause(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPause")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatures(value: AnonDispatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
        ret
    }
    @scala.inline
    def withLatency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(js.undefined)
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
    def withPauseActionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseActionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseActionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseActionType")(js.undefined)
        ret
    }
    @scala.inline
    def withPredicate(value: (/* state */ js.Any, /* action */ Action[_]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predicate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPredicate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predicate")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialize(value: Boolean | AnonDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.undefined)
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
    def withStateSanitizer(value: (/* state */ js.Any, /* index */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateSanitizer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStateSanitizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateSanitizer")(js.undefined)
        ret
    }
    @scala.inline
    def withTraceFunction1(value: /* action */ Action[_] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrace(value: Boolean | (js.Function1[/* action */ Action[_], String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(js.undefined)
        ret
    }
    @scala.inline
    def withTraceLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraceLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceLimit")(js.undefined)
        ret
    }
  }
  
}

