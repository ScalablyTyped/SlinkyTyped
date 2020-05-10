package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A test of an iOS application that uses the XCTest framework. Xcode supports
  * the option to &quot;build for testing&quot;, which generates an .xctestrun
  * file that contains a test specification (arguments, test methods, etc).
  * This test type accepts a zip file containing the .xctestrun file and the
  * corresponding contents of the Build/Products directory that contains all
  * the binaries needed to run the tests.
  */
@js.native
trait SchemaIosXcTest extends js.Object {
  /**
    * Output only. The bundle id for the application under test.
    */
  var appBundleId: js.UndefOr[String] = js.native
  /**
    * Required. The .zip containing the .xctestrun file and the contents of the
    * DerivedData/Build/Products directory. The .xctestrun file in this zip is
    * ignored if the xctestrun field is specified.
    */
  var testsZip: js.UndefOr[SchemaFileReference] = js.native
  /**
    * The Xcode version that should be used for the test. Use the
    * TestEnvironmentDiscoveryService to get supported options. Defaults to the
    * latest Xcode version Firebase Test Lab supports.
    */
  var xcodeVersion: js.UndefOr[String] = js.native
  /**
    * An .xctestrun file that will override the .xctestrun file in the tests
    * zip. Because the .xctestrun file contains environment variables along
    * with test methods to run and/or ignore, this can be useful for sharding
    * tests. Default is taken from the tests zip.
    */
  var xctestrun: js.UndefOr[SchemaFileReference] = js.native
}

object SchemaIosXcTest {
  @scala.inline
  def apply(): SchemaIosXcTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosXcTest]
  }
  @scala.inline
  implicit class SchemaIosXcTestOps[Self <: SchemaIosXcTest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppBundleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppBundleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBundleId")(js.undefined)
        ret
    }
    @scala.inline
    def withTestsZip(value: SchemaFileReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testsZip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestsZip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testsZip")(js.undefined)
        ret
    }
    @scala.inline
    def withXcodeVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xcodeVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXcodeVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xcodeVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withXctestrun(value: SchemaFileReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xctestrun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXctestrun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xctestrun")(js.undefined)
        ret
    }
  }
  
}

