package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.reporterReporterMod.Reporter
import typingsSlinky.forkTsCheckerWebpackPlugin.typeScriptReporterConfigurationMod.TypeScriptReporterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/reporter/TypeScriptReporter", JSImport.Namespace)
@js.native
object typeScriptReporterMod extends js.Object {
  def createTypeScriptReporter(configuration: TypeScriptReporterConfiguration): Reporter = js.native
}

