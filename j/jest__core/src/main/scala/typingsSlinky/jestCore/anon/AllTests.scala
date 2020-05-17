package typingsSlinky.jestCore.anon

import typingsSlinky.jestCore.jestCoreStrings.globalSetup
import typingsSlinky.jestCore.jestCoreStrings.globalTeardown
import typingsSlinky.jestRunner.typesMod.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllTests extends js.Object {
  var allTests: js.Array[Test] = js.native
  var globalConfig: typingsSlinky.jestTypes.configMod.GlobalConfig = js.native
  var moduleName: globalSetup | globalTeardown = js.native
}

object AllTests {
  @scala.inline
  def apply(
    allTests: js.Array[Test],
    globalConfig: typingsSlinky.jestTypes.configMod.GlobalConfig,
    moduleName: globalSetup | globalTeardown
  ): AllTests = {
    val __obj = js.Dynamic.literal(allTests = allTests.asInstanceOf[js.Any], globalConfig = globalConfig.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllTests]
  }
  @scala.inline
  implicit class AllTestsOps[Self <: AllTests] (val x: Self) extends AnyVal {
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
    def withGlobalConfig(value: typingsSlinky.jestTypes.configMod.GlobalConfig): Self = {
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

