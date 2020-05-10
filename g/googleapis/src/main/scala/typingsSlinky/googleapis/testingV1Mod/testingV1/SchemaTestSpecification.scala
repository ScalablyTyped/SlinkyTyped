package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of how to run the test.
  */
@js.native
trait SchemaTestSpecification extends js.Object {
  /**
    * An Android instrumentation test.
    */
  var androidInstrumentationTest: js.UndefOr[SchemaAndroidInstrumentationTest] = js.native
  /**
    * An Android robo test.
    */
  var androidRoboTest: js.UndefOr[SchemaAndroidRoboTest] = js.native
  /**
    * An Android Application with a Test Loop.
    */
  var androidTestLoop: js.UndefOr[SchemaAndroidTestLoop] = js.native
  /**
    * Disables performance metrics recording; may reduce test latency.
    */
  var disablePerformanceMetrics: js.UndefOr[Boolean] = js.native
  /**
    * Disables video recording; may reduce test latency.
    */
  var disableVideoRecording: js.UndefOr[Boolean] = js.native
  /**
    * Test setup requirements for iOS.
    */
  var iosTestSetup: js.UndefOr[SchemaIosTestSetup] = js.native
  /**
    * An iOS XCTest, via an .xctestrun file.
    */
  var iosXcTest: js.UndefOr[SchemaIosXcTest] = js.native
  /**
    * Test setup requirements for Android e.g. files to install, bootstrap
    * scripts.
    */
  var testSetup: js.UndefOr[SchemaTestSetup] = js.native
  /**
    * Max time a test execution is allowed to run before it is automatically
    * cancelled. The default value is 5 min.
    */
  var testTimeout: js.UndefOr[String] = js.native
}

object SchemaTestSpecification {
  @scala.inline
  def apply(): SchemaTestSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestSpecification]
  }
  @scala.inline
  implicit class SchemaTestSpecificationOps[Self <: SchemaTestSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidInstrumentationTest(value: SchemaAndroidInstrumentationTest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidInstrumentationTest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidInstrumentationTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidInstrumentationTest")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidRoboTest(value: SchemaAndroidRoboTest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidRoboTest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidRoboTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidRoboTest")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidTestLoop(value: SchemaAndroidTestLoop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidTestLoop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidTestLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidTestLoop")(js.undefined)
        ret
    }
    @scala.inline
    def withDisablePerformanceMetrics(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePerformanceMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablePerformanceMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePerformanceMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableVideoRecording(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableVideoRecording")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableVideoRecording: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableVideoRecording")(js.undefined)
        ret
    }
    @scala.inline
    def withIosTestSetup(value: SchemaIosTestSetup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosTestSetup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosTestSetup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosTestSetup")(js.undefined)
        ret
    }
    @scala.inline
    def withIosXcTest(value: SchemaIosXcTest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosXcTest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosXcTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosXcTest")(js.undefined)
        ret
    }
    @scala.inline
    def withTestSetup(value: SchemaTestSetup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSetup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestSetup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSetup")(js.undefined)
        ret
    }
    @scala.inline
    def withTestTimeout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testTimeout")(js.undefined)
        ret
    }
  }
  
}

