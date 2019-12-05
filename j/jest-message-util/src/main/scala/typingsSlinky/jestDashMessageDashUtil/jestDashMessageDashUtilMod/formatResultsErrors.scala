package typingsSlinky.jestDashMessageDashUtil.jestDashMessageDashUtilMod

import typingsSlinky.atJestTestDashResult.buildTypesMod.AssertionResult
import typingsSlinky.atJestTypes.buildConfigMod.ProjectConfig
import typingsSlinky.jestDashMessageDashUtil.jestDashMessageDashUtilStrings.rootDir
import typingsSlinky.jestDashMessageDashUtil.jestDashMessageDashUtilStrings.testMatch
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-message-util", "formatResultsErrors")
@js.native
object formatResultsErrors extends js.Object {
  def apply(
    testResults: js.Array[AssertionResult],
    config: Pick[ProjectConfig, rootDir | testMatch],
    options: StackTraceOptions
  ): String | Null = js.native
  def apply(
    testResults: js.Array[AssertionResult],
    config: Pick[ProjectConfig, rootDir | testMatch],
    options: StackTraceOptions,
    testPath: String
  ): String | Null = js.native
}

