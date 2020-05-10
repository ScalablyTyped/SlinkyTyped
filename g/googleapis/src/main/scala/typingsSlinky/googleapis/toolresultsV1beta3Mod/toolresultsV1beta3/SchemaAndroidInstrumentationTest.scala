package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A test of an Android application that can control an Android component
  * independently of its normal lifecycle.  See  for more information on types
  * of Android tests.
  */
@js.native
trait SchemaAndroidInstrumentationTest extends js.Object {
  /**
    * The java package for the test to be executed. Required
    */
  var testPackageId: js.UndefOr[String] = js.native
  /**
    * The InstrumentationTestRunner class. Required
    */
  var testRunnerClass: js.UndefOr[String] = js.native
  /**
    * Each target must be fully qualified with the package name or class name,
    * in one of these formats: - &quot;package package_name&quot; - &quot;class
    * package_name.class_name&quot; - &quot;class
    * package_name.class_name#method_name&quot;  If empty, all targets in the
    * module will be run.
    */
  var testTargets: js.UndefOr[js.Array[String]] = js.native
  /**
    * The flag indicates whether Android Test Orchestrator will be used to run
    * test or not.
    */
  var useOrchestrator: js.UndefOr[Boolean] = js.native
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

