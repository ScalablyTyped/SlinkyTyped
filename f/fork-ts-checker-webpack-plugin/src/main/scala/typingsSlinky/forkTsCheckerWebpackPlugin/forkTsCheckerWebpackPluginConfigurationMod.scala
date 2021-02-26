package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.esLintReporterConfigurationMod.EsLintReporterConfiguration
import typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginOptionsMod.ForkTsCheckerWebpackPluginOptions
import typingsSlinky.forkTsCheckerWebpackPlugin.formatterConfigurationMod.FormatterConfiguration
import typingsSlinky.forkTsCheckerWebpackPlugin.issueConfigurationMod.IssueConfiguration
import typingsSlinky.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typingsSlinky.forkTsCheckerWebpackPlugin.loggerConfigurationMod.LoggerConfiguration
import typingsSlinky.forkTsCheckerWebpackPlugin.typeScriptReporterConfigurationMod.TypeScriptReporterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forkTsCheckerWebpackPluginConfigurationMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/ForkTsCheckerWebpackPluginConfiguration", "createForkTsCheckerWebpackPluginConfiguration")
  @js.native
  def createForkTsCheckerWebpackPluginConfiguration(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ): ForkTsCheckerWebpackPluginConfiguration = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/ForkTsCheckerWebpackPluginConfiguration", "createForkTsCheckerWebpackPluginConfiguration")
  @js.native
  def createForkTsCheckerWebpackPluginConfiguration(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
    options: ForkTsCheckerWebpackPluginOptions
  ): ForkTsCheckerWebpackPluginConfiguration = js.native
  
  @js.native
  trait ForkTsCheckerWebpackPluginConfiguration extends StObject {
    
    var async: Boolean = js.native
    
    var eslint: EsLintReporterConfiguration = js.native
    
    def formatter(issue: Issue): String = js.native
    @JSName("formatter")
    var formatter_Original: FormatterConfiguration = js.native
    
    var issue: IssueConfiguration = js.native
    
    var logger: LoggerConfiguration = js.native
    
    var typescript: TypeScriptReporterConfiguration = js.native
  }
}
