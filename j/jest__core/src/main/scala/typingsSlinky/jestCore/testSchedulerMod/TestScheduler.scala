package typingsSlinky.jestCore.testSchedulerMod

import typingsSlinky.jestReporters.typesMod.Reporter
import typingsSlinky.jestRunner.mod.Test
import typingsSlinky.jestTestResult.typesMod.AggregatedResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestScheduler extends js.Object {
  var _addCustomReporters: js.Any = js.native
  var _bailIfNeeded: js.Any = js.native
  var _context: js.Any = js.native
  var _dispatcher: js.Any = js.native
  /**
    * Get properties of a reporter in an object
    * to make dealing with them less painful.
    */
  var _getReporterProps: js.Any = js.native
  var _globalConfig: js.Any = js.native
  var _options: js.Any = js.native
  var _partitionTests: js.Any = js.native
  var _setupDefaultReporters: js.Any = js.native
  var _setupReporters: js.Any = js.native
  var _shouldAddDefaultReporters: js.Any = js.native
  def addReporter(reporter: Reporter): Unit = js.native
  def removeReporter(ReporterClass: js.Function): Unit = js.native
  def scheduleTests(tests: js.Array[Test], watcher: typingsSlinky.jestCore.testWatcherMod.default): js.Promise[AggregatedResult] = js.native
}

object TestScheduler {
  @scala.inline
  def apply(
    _addCustomReporters: js.Any,
    _bailIfNeeded: js.Any,
    _context: js.Any,
    _dispatcher: js.Any,
    _getReporterProps: js.Any,
    _globalConfig: js.Any,
    _options: js.Any,
    _partitionTests: js.Any,
    _setupDefaultReporters: js.Any,
    _setupReporters: js.Any,
    _shouldAddDefaultReporters: js.Any,
    addReporter: Reporter => Unit,
    removeReporter: js.Function => Unit,
    scheduleTests: (js.Array[Test], typingsSlinky.jestCore.testWatcherMod.default) => js.Promise[AggregatedResult]
  ): TestScheduler = {
    val __obj = js.Dynamic.literal(_addCustomReporters = _addCustomReporters.asInstanceOf[js.Any], _bailIfNeeded = _bailIfNeeded.asInstanceOf[js.Any], _context = _context.asInstanceOf[js.Any], _dispatcher = _dispatcher.asInstanceOf[js.Any], _getReporterProps = _getReporterProps.asInstanceOf[js.Any], _globalConfig = _globalConfig.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _partitionTests = _partitionTests.asInstanceOf[js.Any], _setupDefaultReporters = _setupDefaultReporters.asInstanceOf[js.Any], _setupReporters = _setupReporters.asInstanceOf[js.Any], _shouldAddDefaultReporters = _shouldAddDefaultReporters.asInstanceOf[js.Any], addReporter = js.Any.fromFunction1(addReporter), removeReporter = js.Any.fromFunction1(removeReporter), scheduleTests = js.Any.fromFunction2(scheduleTests))
    __obj.asInstanceOf[TestScheduler]
  }
  @scala.inline
  implicit class TestSchedulerOps[Self <: TestScheduler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_addCustomReporters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_addCustomReporters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_bailIfNeeded(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_bailIfNeeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_context(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_dispatcher(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dispatcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_getReporterProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_getReporterProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_globalConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_globalConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_options(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_partitionTests(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_partitionTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_setupDefaultReporters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_setupDefaultReporters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_setupReporters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_setupReporters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_shouldAddDefaultReporters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_shouldAddDefaultReporters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddReporter(value: Reporter => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addReporter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveReporter(value: js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeReporter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScheduleTests(
      value: (js.Array[Test], typingsSlinky.jestCore.testWatcherMod.default) => js.Promise[AggregatedResult]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleTests")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

