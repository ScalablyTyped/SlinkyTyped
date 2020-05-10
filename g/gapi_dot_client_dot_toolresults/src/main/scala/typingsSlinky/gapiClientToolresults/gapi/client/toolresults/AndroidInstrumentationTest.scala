package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidInstrumentationTest extends js.Object {
  /** The java package for the test to be executed. Required */
  var testPackageId: js.UndefOr[String] = js.native
  /** The InstrumentationTestRunner class. Required */
  var testRunnerClass: js.UndefOr[String] = js.native
  /**
    * Each target must be fully qualified with the package name or class name, in one of these formats: - "package package_name" - "class
    * package_name.class_name" - "class package_name.class_name#method_name"
    *
    * If empty, all targets in the module will be run.
    */
  var testTargets: js.UndefOr[js.Array[String]] = js.native
  /**
    * The flag indicates whether Android Test Orchestrator will be used to run test or not. Test orchestrator is used if either: - orchestrator_option field
    * is USE_ORCHESTRATOR, and test runner is compatible with orchestrator. Or - orchestrator_option field is unspecified or ORCHESTRATOR_OPTION_UNSPECIFIED,
    * and test runner is compatible with orchestrator.
    */
  var useOrchestrator: js.UndefOr[Boolean] = js.native
}

object AndroidInstrumentationTest {
  @scala.inline
  def apply(): AndroidInstrumentationTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidInstrumentationTest]
  }
  @scala.inline
  implicit class AndroidInstrumentationTestOps[Self <: AndroidInstrumentationTest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTestPackageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPackageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestPackageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPackageId")(js.undefined)
        ret
    }
    @scala.inline
    def withTestRunnerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testRunnerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestRunnerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testRunnerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withTestTargets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testTargets")(js.undefined)
        ret
    }
    @scala.inline
    def withUseOrchestrator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useOrchestrator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseOrchestrator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useOrchestrator")(js.undefined)
        ret
    }
  }
  
}

