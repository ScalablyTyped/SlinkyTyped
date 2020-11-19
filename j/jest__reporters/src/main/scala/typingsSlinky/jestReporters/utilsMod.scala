package typingsSlinky.jestReporters

import typingsSlinky.jestReporters.anon.Basename
import typingsSlinky.jestReporters.typesMod.SummaryOptions
import typingsSlinky.jestTestResult.typesMod.AggregatedResult
import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/reporters/build/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def formatTestPath(config: GlobalConfig, testPath: Path): String = js.native
  def formatTestPath(config: ProjectConfig, testPath: Path): String = js.native
  
  def getSummary(aggregatedResults: AggregatedResult): String = js.native
  def getSummary(aggregatedResults: AggregatedResult, options: SummaryOptions): String = js.native
  
  def printDisplayName(config: ProjectConfig): String = js.native
  
  def relativePath(config: GlobalConfig, testPath: Path): Basename = js.native
  def relativePath(config: ProjectConfig, testPath: Path): Basename = js.native
  
  def trimAndFormatPath(pad: Double, config: GlobalConfig, testPath: Path, columns: Double): String = js.native
  def trimAndFormatPath(pad: Double, config: ProjectConfig, testPath: Path, columns: Double): String = js.native
  
  def wrapAnsiString(string: String, terminalWidth: Double): String = js.native
}
