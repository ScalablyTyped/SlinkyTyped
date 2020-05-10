package typingsSlinky.reduxLogger.mod

import typingsSlinky.reduxLogger.reduxLoggerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReduxLoggerOptions extends js.Object {
  var actionTransformer: js.UndefOr[js.Function1[/* action */ js.Any, _]] = js.native
  var collapsed: js.UndefOr[Boolean | LoggerPredicate] = js.native
  var colors: js.UndefOr[ColorsObject | `false`] = js.native
  var diff: js.UndefOr[Boolean] = js.native
  var diffPredicate: js.UndefOr[LoggerPredicate] = js.native
  var duration: js.UndefOr[Boolean] = js.native
  var errorTransformer: js.UndefOr[js.Function1[/* error */ js.Any, _]] = js.native
  var level: js.UndefOr[String | ActionToString | LevelObject] = js.native
  var logErrors: js.UndefOr[Boolean] = js.native
  var logger: js.UndefOr[js.Any] = js.native
  var predicate: js.UndefOr[LoggerPredicate] = js.native
  var stateTransformer: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.native
  var timestamp: js.UndefOr[Boolean] = js.native
  var titleFormatter: js.UndefOr[
    js.Function3[/* formattedAction */ js.Any, /* formattedTime */ String, /* took */ Double, String]
  ] = js.native
}

object ReduxLoggerOptions {
  @scala.inline
  def apply(): ReduxLoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReduxLoggerOptions]
  }
  @scala.inline
  implicit class ReduxLoggerOptionsOps[Self <: ReduxLoggerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionTransformer(value: /* action */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionTransformer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionTransformer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionTransformer")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsedFunction3(
      value: (/* getState */ js.Function0[js.Any], /* action */ js.Any, /* logEntry */ js.UndefOr[LogEntryObject]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCollapsed(value: Boolean | LoggerPredicate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: ColorsObject | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withDiff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diff")(js.undefined)
        ret
    }
    @scala.inline
    def withDiffPredicate(
      value: (/* getState */ js.Function0[js.Any], /* action */ js.Any, /* logEntry */ js.UndefOr[LogEntryObject]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffPredicate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDiffPredicate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffPredicate")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorTransformer(value: /* error */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorTransformer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutErrorTransformer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorTransformer")(js.undefined)
        ret
    }
    @scala.inline
    def withLevelFunction1(value: /* action */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLevel(value: String | ActionToString | LevelObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withLogErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withPredicate(
      value: (/* getState */ js.Function0[js.Any], /* action */ js.Any, /* logEntry */ js.UndefOr[LogEntryObject]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predicate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPredicate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predicate")(js.undefined)
        ret
    }
    @scala.inline
    def withStateTransformer(value: /* state */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateTransformer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStateTransformer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateTransformer")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFormatter(value: (/* formattedAction */ js.Any, /* formattedTime */ String, /* took */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFormatter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutTitleFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFormatter")(js.undefined)
        ret
    }
  }
  
}

