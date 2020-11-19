package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.esLintReporterConfigurationMod.EsLintReporterConfiguration
import typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginOptionsMod.ForkTsCheckerWebpackPluginOptions
import typingsSlinky.forkTsCheckerWebpackPlugin.formatterConfigurationMod.FormatterConfiguration
import typingsSlinky.forkTsCheckerWebpackPlugin.issueConfigurationMod.IssueConfiguration
import typingsSlinky.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typingsSlinky.forkTsCheckerWebpackPlugin.loggerConfigurationMod.LoggerConfiguration
import typingsSlinky.forkTsCheckerWebpackPlugin.typeScriptReporterConfigurationMod.TypeScriptReporterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/ForkTsCheckerWebpackPluginConfiguration", JSImport.Namespace)
@js.native
object forkTsCheckerWebpackPluginConfigurationMod extends js.Object {
  
  def createForkTsCheckerWebpackPluginConfiguration(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ): ForkTsCheckerWebpackPluginConfiguration = js.native
  def createForkTsCheckerWebpackPluginConfiguration(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
    options: ForkTsCheckerWebpackPluginOptions
  ): ForkTsCheckerWebpackPluginConfiguration = js.native
  
  @js.native
  trait ForkTsCheckerWebpackPluginConfiguration extends js.Object {
    
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
