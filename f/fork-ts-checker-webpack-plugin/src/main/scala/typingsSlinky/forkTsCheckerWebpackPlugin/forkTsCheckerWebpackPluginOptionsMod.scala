package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.esLintReporterOptionsMod.EsLintReporterOptions
import typingsSlinky.forkTsCheckerWebpackPlugin.formatterOptionsMod.FormatterOptions
import typingsSlinky.forkTsCheckerWebpackPlugin.issueOptionsMod.IssueOptions
import typingsSlinky.forkTsCheckerWebpackPlugin.loggerOptionsMod.LoggerOptions
import typingsSlinky.forkTsCheckerWebpackPlugin.typeScriptReporterOptionsMod.TypeScriptReporterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forkTsCheckerWebpackPluginOptionsMod {
  
  @js.native
  trait ForkTsCheckerWebpackPluginOptions extends StObject {
    
    var async: js.UndefOr[Boolean] = js.native
    
    var eslint: js.UndefOr[EsLintReporterOptions] = js.native
    
    var formatter: js.UndefOr[FormatterOptions] = js.native
    
    var issue: js.UndefOr[IssueOptions] = js.native
    
    var logger: js.UndefOr[LoggerOptions] = js.native
    
    var typescript: js.UndefOr[TypeScriptReporterOptions] = js.native
  }
  object ForkTsCheckerWebpackPluginOptions {
    
    @scala.inline
    def apply(): ForkTsCheckerWebpackPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForkTsCheckerWebpackPluginOptions]
    }
    
    @scala.inline
    implicit class ForkTsCheckerWebpackPluginOptionsMutableBuilder[Self <: ForkTsCheckerWebpackPluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setEslint(value: EsLintReporterOptions): Self = StObject.set(x, "eslint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEslintUndefined: Self = StObject.set(x, "eslint", js.undefined)
      
      @scala.inline
      def setFormatter(value: FormatterOptions): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setIssue(value: IssueOptions): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssueUndefined: Self = StObject.set(x, "issue", js.undefined)
      
      @scala.inline
      def setLogger(value: LoggerOptions): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setTypescript(value: TypeScriptReporterOptions): Self = StObject.set(x, "typescript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypescriptUndefined: Self = StObject.set(x, "typescript", js.undefined)
    }
  }
}
