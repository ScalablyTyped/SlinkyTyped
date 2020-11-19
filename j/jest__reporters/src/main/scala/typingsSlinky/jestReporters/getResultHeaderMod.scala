package typingsSlinky.jestReporters

import typingsSlinky.jestTestResult.typesMod.TestResult
import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/reporters/build/get_result_header", JSImport.Namespace)
@js.native
object getResultHeaderMod extends js.Object {
  
  def default(result: TestResult, globalConfig: GlobalConfig): String = js.native
  def default(result: TestResult, globalConfig: GlobalConfig, projectConfig: ProjectConfig): String = js.native
}
