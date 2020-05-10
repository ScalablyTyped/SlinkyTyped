package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestSpecification extends js.Object {
  /** An Android instrumentation test. */
  var androidInstrumentationTest: js.UndefOr[AndroidInstrumentationTest] = js.native
  /** An Android robo test. */
  var androidRoboTest: js.UndefOr[AndroidRoboTest] = js.native
  /** An Android Application with a Test Loop */
  var androidTestLoop: js.UndefOr[AndroidTestLoop] = js.native
  /**
    * Enables automatic Google account login.
    * If set, the service will automatically generate a Google test account and
    * add it to the device, before executing the test. Note that test accounts
    * might be reused.
    * Many applications show their full set of functionalities when an account is
    * present on the device. Logging into the device with these generated
    * accounts allows testing more functionalities.
    * Default is false.
    * Optional
    */
  var autoGoogleLogin: js.UndefOr[Boolean] = js.native
  /** Disables performance metrics recording; may reduce test latency. */
  var disablePerformanceMetrics: js.UndefOr[Boolean] = js.native
  /** Disables video recording; may reduce test latency. */
  var disableVideoRecording: js.UndefOr[Boolean] = js.native
  /**
    * Test setup requirements e.g. files to install, bootstrap scripts
    * Optional
    */
  var testSetup: js.UndefOr[TestSetup] = js.native
  /**
    * Max time a test execution is allowed to run before it is
    * automatically cancelled.
    * Optional, default is 5 min.
    */
  var testTimeout: js.UndefOr[String] = js.native
}

object TestSpecification {
  @scala.inline
  def apply(): TestSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestSpecification]
  }
  @scala.inline
  implicit class TestSpecificationOps[Self <: TestSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidInstrumentationTest(value: AndroidInstrumentationTest): Self = {
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
    def withAndroidRoboTest(value: AndroidRoboTest): Self = {
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
    def withAndroidTestLoop(value: AndroidTestLoop): Self = {
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
    def withAutoGoogleLogin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGoogleLogin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoGoogleLogin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGoogleLogin")(js.undefined)
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
    def withTestSetup(value: TestSetup): Self = {
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

