package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidTest extends js.Object {
  /** Infomation about the application under test. */
  var androidAppInfo: js.UndefOr[AndroidAppInfo] = js.native
  /** An Android instrumentation test. */
  var androidInstrumentationTest: js.UndefOr[AndroidInstrumentationTest] = js.native
  /** An Android robo test. */
  var androidRoboTest: js.UndefOr[AndroidRoboTest] = js.native
  /** Max time a test is allowed to run before it is automatically cancelled. */
  var testTimeout: js.UndefOr[Duration] = js.native
}

object AndroidTest {
  @scala.inline
  def apply(): AndroidTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidTest]
  }
  @scala.inline
  implicit class AndroidTestOps[Self <: AndroidTest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidAppInfo(value: AndroidAppInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidAppInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidAppInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidAppInfo")(js.undefined)
        ret
    }
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
    def withTestTimeout(value: Duration): Self = {
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

