package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Android mobile test specification.
  */
@js.native
trait SchemaAndroidTest extends js.Object {
  /**
    * Information about the application under test.
    */
  var androidAppInfo: js.UndefOr[SchemaAndroidAppInfo] = js.native
  /**
    * An Android instrumentation test.
    */
  var androidInstrumentationTest: js.UndefOr[SchemaAndroidInstrumentationTest] = js.native
  /**
    * An Android robo test.
    */
  var androidRoboTest: js.UndefOr[SchemaAndroidRoboTest] = js.native
  /**
    * Max time a test is allowed to run before it is automatically cancelled.
    */
  var testTimeout: js.UndefOr[SchemaDuration] = js.native
}

object SchemaAndroidTest {
  @scala.inline
  def apply(): SchemaAndroidTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidTest]
  }
  @scala.inline
  implicit class SchemaAndroidTestOps[Self <: SchemaAndroidTest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidAppInfo(value: SchemaAndroidAppInfo): Self = {
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
    def withTestTimeout(value: SchemaDuration): Self = {
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

