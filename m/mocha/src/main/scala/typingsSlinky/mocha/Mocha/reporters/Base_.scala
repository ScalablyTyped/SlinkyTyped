package typingsSlinky.mocha.Mocha.reporters

import typingsSlinky.mocha.Mocha.Runner
import typingsSlinky.mocha.Mocha.Stats
import typingsSlinky.mocha.Mocha.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `Base` reporter.
  *
  * All other reporters generally inherit from this reporter, providing stats such as test duration,
  * number of tests passed / failed, etc.
  *
  * @see https://mochajs.org/api/Mocha.reporters.Base.html
  */
@js.native
trait Base_ extends js.Object {
  var done: js.UndefOr[
    js.Function2[
      /* failures */ Double, 
      /* fn */ js.UndefOr[js.Function1[/* failures */ Double, Unit]], 
      Unit
    ]
  ] = js.native
  /**
    * Test failures
    */
  var failures: js.Array[Test] = js.native
  /**
    * The configured runner
    */
  var runner: Runner = js.native
  /**
    * Test run statistics
    */
  var stats: Stats = js.native
  /**
    * Output common epilogue used by many of the bundled reporters.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
    */
  def epilogue(): Unit = js.native
}

object Base_ {
  @scala.inline
  def apply(epilogue: () => Unit, failures: js.Array[Test], runner: Runner, stats: Stats): Base_ = {
    val __obj = js.Dynamic.literal(epilogue = js.Any.fromFunction0(epilogue), failures = failures.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base_]
  }
  @scala.inline
  implicit class Base_Ops[Self <: Base_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEpilogue(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epilogue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFailures(value: js.Array[Test]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunner(value: Runner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStats(value: Stats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDone(
      value: (/* failures */ Double, /* fn */ js.UndefOr[js.Function1[/* failures */ Double, Unit]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.undefined)
        ret
    }
  }
  
}

