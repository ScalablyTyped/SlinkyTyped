package typingsSlinky.atJestCore

import typingsSlinky.atJestCore.atJestCoreStrings.globalSetup
import typingsSlinky.atJestCore.atJestCoreStrings.globalTeardown
import typingsSlinky.atJestTypes.buildConfigMod.GlobalConfig
import typingsSlinky.jestDashRunner.buildTypesMod.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllTests extends js.Object {
  var allTests: js.Array[Test]
  var globalConfig: GlobalConfig
  var moduleName: globalSetup | globalTeardown
}

object Anon_AllTests {
  @scala.inline
  def apply(allTests: js.Array[Test], globalConfig: GlobalConfig, moduleName: globalSetup | globalTeardown): Anon_AllTests = {
    val __obj = js.Dynamic.literal(allTests = allTests.asInstanceOf[js.Any], globalConfig = globalConfig.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AllTests]
  }
}

