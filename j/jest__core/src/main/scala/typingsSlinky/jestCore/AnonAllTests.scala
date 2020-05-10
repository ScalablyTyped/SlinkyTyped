package typingsSlinky.jestCore

import typingsSlinky.jestCore.jestCoreStrings.globalSetup
import typingsSlinky.jestCore.jestCoreStrings.globalTeardown
import typingsSlinky.jestRunner.typesMod.Test
import typingsSlinky.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllTests extends js.Object {
  var allTests: js.Array[Test] = js.native
  var globalConfig: GlobalConfig = js.native
  var moduleName: globalSetup | globalTeardown = js.native
}

object AnonAllTests {
  @scala.inline
  def apply(allTests: js.Array[Test], globalConfig: GlobalConfig, moduleName: globalSetup | globalTeardown): AnonAllTests = {
    val __obj = js.Dynamic.literal(allTests = allTests.asInstanceOf[js.Any], globalConfig = globalConfig.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllTests]
  }
  @scala.inline
  implicit class AnonAllTestsOps[Self <: AnonAllTests] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllTests(value: js.Array[Test]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalConfig(value: GlobalConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleName(value: globalSetup | globalTeardown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

