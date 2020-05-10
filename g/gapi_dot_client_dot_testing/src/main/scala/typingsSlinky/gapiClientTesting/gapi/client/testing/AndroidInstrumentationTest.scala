package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidInstrumentationTest extends js.Object {
  /**
    * The APK for the application under test.
    * Required
    */
  var appApk: js.UndefOr[FileReference] = js.native
  /**
    * The java package for the application under test.
    * Optional, default is determined by examining the application's manifest.
    */
  var appPackageId: js.UndefOr[String] = js.native
  /**
    * The option of whether running each test within its own invocation of
    * instrumentation with Android Test Orchestrator or not.
    * &#42;&#42; Orchestrator is only compatible with AndroidJUnitRunner version 1.0 or
    * higher! &#42;&#42;
    * Orchestrator offers the following benefits:
    * - No shared state
    * - Crashes are isolated
    * - Logs are scoped per test
    *
    * See
    * <https://developer.android.com/training/testing/junit-runner.html#using-android-test-orchestrator>
    * for more information about Android Test Orchestrator.
    *
    * Optional, if empty, test will be run without orchestrator.
    */
  var orchestratorOption: js.UndefOr[String] = js.native
  /**
    * The APK containing the test code to be executed.
    * Required
    */
  var testApk: js.UndefOr[FileReference] = js.native
  /**
    * The java package for the test to be executed.
    * Optional, default is determined by examining the application's manifest.
    */
  var testPackageId: js.UndefOr[String] = js.native
  /**
    * The InstrumentationTestRunner class.
    * Optional, default is determined by examining the application's manifest.
    */
  var testRunnerClass: js.UndefOr[String] = js.native
  /**
    * Each target must be fully qualified with the package name or class name,
    * in one of these formats:
    * - "package package_name"
    * - "class package_name.class_name"
    * - "class package_name.class_name#method_name"
    *
    * Optional, if empty, all targets in the module will be run.
    */
  var testTargets: js.UndefOr[js.Array[String]] = js.native
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
    def withAppApk(value: FileReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appApk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppApk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appApk")(js.undefined)
        ret
    }
    @scala.inline
    def withAppPackageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appPackageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppPackageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appPackageId")(js.undefined)
        ret
    }
    @scala.inline
    def withOrchestratorOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orchestratorOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrchestratorOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orchestratorOption")(js.undefined)
        ret
    }
    @scala.inline
    def withTestApk(value: FileReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testApk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestApk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testApk")(js.undefined)
        ret
    }
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
  }
  
}

