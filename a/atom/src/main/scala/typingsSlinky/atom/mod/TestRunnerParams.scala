package typingsSlinky.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRunnerParams extends js.Object {
  /**
    *  A boolean indicating whether or not the tests are being run from the command
    *  line via atom --test.
    */
  var headless: Boolean = js.native
  /** An optional path to a log file to which test output should be logged. */
  var logFile: String = js.native
  /** An array of paths to tests to run. Could be paths to files or directories. */
  var testPaths: js.Array[String] = js.native
  /**
    *  A function that can be called to construct an instance of the atom global.
    *  No atom global will be explicitly assigned, but you can assign one in your
    *  runner if desired.
    */
  def buildAtomEnvironment(options: BuildEnvironmentOptions): AtomEnvironment = js.native
  /**
    *  A function that builds a default instance of the application delegate, suitable
    *  to be passed as the applicationDelegate parameter to buildAtomEnvironment.
    */
  def buildDefaultApplicationDelegate(): js.Object = js.native
}

object TestRunnerParams {
  @scala.inline
  def apply(
    buildAtomEnvironment: BuildEnvironmentOptions => AtomEnvironment,
    buildDefaultApplicationDelegate: () => js.Object,
    headless: Boolean,
    logFile: String,
    testPaths: js.Array[String]
  ): TestRunnerParams = {
    val __obj = js.Dynamic.literal(buildAtomEnvironment = js.Any.fromFunction1(buildAtomEnvironment), buildDefaultApplicationDelegate = js.Any.fromFunction0(buildDefaultApplicationDelegate), headless = headless.asInstanceOf[js.Any], logFile = logFile.asInstanceOf[js.Any], testPaths = testPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRunnerParams]
  }
  @scala.inline
  implicit class TestRunnerParamsOps[Self <: TestRunnerParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildAtomEnvironment(value: BuildEnvironmentOptions => AtomEnvironment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildAtomEnvironment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBuildDefaultApplicationDelegate(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildDefaultApplicationDelegate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeadless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPaths")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

