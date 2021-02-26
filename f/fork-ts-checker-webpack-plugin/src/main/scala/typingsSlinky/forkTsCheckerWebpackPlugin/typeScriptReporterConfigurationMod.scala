package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.anon.Vue
import typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`write-references`
import typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`write-tsbuildinfo`
import typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.readonly
import typingsSlinky.forkTsCheckerWebpackPlugin.typeScriptConfigurationOverwriteMod.TypeScriptConfigurationOverwrite
import typingsSlinky.forkTsCheckerWebpackPlugin.typeScriptDiagnosticsOptionsMod.TypeScriptDiagnosticsOptions
import typingsSlinky.forkTsCheckerWebpackPlugin.typeScriptReporterOptionsMod.TypeScriptReporterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeScriptReporterConfigurationMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/TypeScriptReporterConfiguration", "createTypeScriptReporterConfiguration")
  @js.native
  def createTypeScriptReporterConfiguration(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ): TypeScriptReporterConfiguration = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/TypeScriptReporterConfiguration", "createTypeScriptReporterConfiguration")
  @js.native
  def createTypeScriptReporterConfiguration(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
    options: TypeScriptReporterOptions
  ): TypeScriptReporterConfiguration = js.native
  
  @js.native
  trait TypeScriptReporterConfiguration extends StObject {
    
    var build: Boolean = js.native
    
    var configFile: String = js.native
    
    var configOverwrite: TypeScriptConfigurationOverwrite = js.native
    
    var context: String = js.native
    
    var diagnosticOptions: TypeScriptDiagnosticsOptions = js.native
    
    var enabled: Boolean = js.native
    
    var extensions: Vue = js.native
    
    var memoryLimit: Double = js.native
    
    var mode: readonly | `write-tsbuildinfo` | `write-references` = js.native
    
    var profile: Boolean = js.native
    
    var typescriptPath: String = js.native
  }
  object TypeScriptReporterConfiguration {
    
    @scala.inline
    def apply(
      build: Boolean,
      configFile: String,
      configOverwrite: TypeScriptConfigurationOverwrite,
      context: String,
      diagnosticOptions: TypeScriptDiagnosticsOptions,
      enabled: Boolean,
      extensions: Vue,
      memoryLimit: Double,
      mode: readonly | `write-tsbuildinfo` | `write-references`,
      profile: Boolean,
      typescriptPath: String
    ): TypeScriptReporterConfiguration = {
      val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], configOverwrite = configOverwrite.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], diagnosticOptions = diagnosticOptions.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], memoryLimit = memoryLimit.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], typescriptPath = typescriptPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeScriptReporterConfiguration]
    }
    
    @scala.inline
    implicit class TypeScriptReporterConfigurationMutableBuilder[Self <: TypeScriptReporterConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuild(value: Boolean): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigOverwrite(value: TypeScriptConfigurationOverwrite): Self = StObject.set(x, "configOverwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagnosticOptions(value: TypeScriptDiagnosticsOptions): Self = StObject.set(x, "diagnosticOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensions(value: Vue): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoryLimit(value: Double): Self = StObject.set(x, "memoryLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: readonly | `write-tsbuildinfo` | `write-references`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile(value: Boolean): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypescriptPath(value: String): Self = StObject.set(x, "typescriptPath", value.asInstanceOf[js.Any])
    }
  }
}
