package typingsSlinky.logProcessErrors.mod

import typingsSlinky.logProcessErrors.anon.PartialRecordExceptionTyp
import typingsSlinky.logProcessErrors.logProcessErrorsStrings.`node-tap`
import typingsSlinky.logProcessErrors.logProcessErrorsStrings.ava
import typingsSlinky.logProcessErrors.logProcessErrorsStrings.jasmine
import typingsSlinky.logProcessErrors.logProcessErrorsStrings.mocha
import typingsSlinky.logProcessErrors.logProcessErrorsStrings.tape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * log-process-errors constructor options.
  */
@js.native
trait Options extends js.Object {
  /**
    * Whether or not to colorize messages.
    *
    * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#colors
    */
  var colors: js.UndefOr[Boolean] = js.native
  /**
    * Which process should trigger `process.exit(1)`
    *
    * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#exiton
    */
  var exitOn: js.UndefOr[js.Array[ExceptionType]] = js.native
  /**
    * Which log level to use for different exceptions.
    *
    * https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#log
    */
  var level: js.UndefOr[PartialRecordExceptionTyp] = js.native
  /**
    * Override logger
    *
    * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#log
    */
  var log: js.UndefOr[
    js.Function2[/* error */ js.Error, /* level */ LogLevel, js.Promise[Unit] | Unit]
  ] = js.native
  /**
    * When running tests, makes them fail if there are any process errors.
    *
    * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#testing
    */
  var testing: js.UndefOr[ava | mocha | jasmine | tape | `node-tap`] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: Boolean): Self = {
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
    def withExitOn(value: js.Array[ExceptionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitOn")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: PartialRecordExceptionTyp): Self = {
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
    def withLog(value: (/* error */ js.Error, /* level */ LogLevel) => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withTesting(value: ava | mocha | jasmine | tape | `node-tap`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTesting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testing")(js.undefined)
        ret
    }
  }
  
}

