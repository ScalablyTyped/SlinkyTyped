package typingsSlinky.jestDashJasmine2

import typingsSlinky.atJestEnvironment.atJestEnvironmentMod.JestEnvironment
import typingsSlinky.atJestTestDashResult.buildTypesMod.TestResult
import typingsSlinky.atJestTypes.buildConfigMod.GlobalConfig
import typingsSlinky.atJestTypes.buildConfigMod.ProjectConfig
import typingsSlinky.jestDashRuntime.jestDashRuntimeMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-jasmine2", JSImport.Namespace)
@js.native
object jestDashJasmine2Mod extends js.Object {
  def apply(
    globalConfig: GlobalConfig,
    config: ProjectConfig,
    environment: JestEnvironment,
    runtime: ^,
    testPath: String
  ): js.Promise[TestResult] = js.native
  type Jasmine = typingsSlinky.jestDashJasmine2.buildTypesMod.Jasmine
}

