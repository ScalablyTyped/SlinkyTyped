package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A test of an Android application that can control an Android component
  * independently of its normal lifecycle. Android instrumentation tests run an
  * application APK and test APK inside the same process on a virtual or
  * physical AndroidDevice.  They also specify a test runner class, such as
  * com.google.GoogleTestRunner, which can vary on the specific instrumentation
  * framework chosen.  See
  * &lt;http://developer.android.com/tools/testing/testing_android.html&gt; for
  * more information on types of Android tests.
  */
@js.native
trait SchemaAndroidInstrumentationTest extends js.Object {
  /**
    * The APK for the application under test.
    */
  var appApk: js.UndefOr[SchemaFileReference] = js.native
  /**
    * A multi-apk app bundle for the application under test.
    */
  var appBundle: js.UndefOr[SchemaAppBundle] = js.native
  /**
    * The java package for the application under test. The default value is
    * determined by examining the application&#39;s manifest.
    */
  var appPackageId: js.UndefOr[String] = js.native
  /**
    * The option of whether running each test within its own invocation of
    * instrumentation with Android Test Orchestrator or not. ** Orchestrator is
    * only compatible with AndroidJUnitRunner version 1.0 or higher! **
    * Orchestrator offers the following benefits:  - No shared state  - Crashes
    * are isolated  - Logs are scoped per test  See
    * &lt;https://developer.android.com/training/testing/junit-runner.html#using-android-test-orchestrator&gt;
    * for more information about Android Test Orchestrator.  If not set, the
    * test will be run without the orchestrator.
    */
  var orchestratorOption: js.UndefOr[String] = js.native
  /**
    * Required. The APK containing the test code to be executed.
    */
  var testApk: js.UndefOr[SchemaFileReference] = js.native
  /**
    * The java package for the test to be executed. The default value is
    * determined by examining the application&#39;s manifest.
    */
  var testPackageId: js.UndefOr[String] = js.native
  /**
    * The InstrumentationTestRunner class. The default value is determined by
    * examining the application&#39;s manifest.
    */
  var testRunnerClass: js.UndefOr[String] = js.native
  /**
    * Each target must be fully qualified with the package name or class name,
    * in one of these formats:  - &quot;package package_name&quot;  -
    * &quot;class package_name.class_name&quot;  - &quot;class
    * package_name.class_name#method_name&quot;  If empty, all targets in the
    * module will be run.
    */
  var testTargets: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAndroidInstrumentationTest {
  @scala.inline
  def apply(): SchemaAndroidInstrumentationTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidInstrumentationTest]
  }
  @scala.inline
  implicit class SchemaAndroidInstrumentationTestOps[Self <: SchemaAndroidInstrumentationTest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppApk(value: SchemaFileReference): Self = {
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
    def withAppBundle(value: SchemaAppBundle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBundle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppBundle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBundle")(js.undefined)
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
    def withTestApk(value: SchemaFileReference): Self = {
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

