package typingsSlinky.jsreportCore

import typingsSlinky.jsreportCore.jsreportCoreStrings.`dedicated-process`
import typingsSlinky.jsreportCore.jsreportCoreStrings.`http-server`
import typingsSlinky.jsreportCore.jsreportCoreStrings.`in-process`
import typingsSlinky.jsreportCore.mod.Engine
import typingsSlinky.jsreportCore.mod.Helpers
import typingsSlinky.jsreportCore.mod.Options
import typingsSlinky.jsreportCore.mod.Recipe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AllowedModules extends StObject {
    
    var allowedModules: js.Array[String] = js.native
  }
  object AllowedModules {
    
    @scala.inline
    def apply(allowedModules: js.Array[String]): AllowedModules = {
      val __obj = js.Dynamic.literal(allowedModules = allowedModules.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllowedModules]
    }
    
    @scala.inline
    implicit class AllowedModulesMutableBuilder[Self <: AllowedModules] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedModules(value: js.Array[String]): Self = StObject.set(x, "allowedModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedModulesVarargs(value: String*): Self = StObject.set(x, "allowedModules", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Partial<jsreport-core.jsreport-core.Configuration> */
  @js.native
  trait PartialConfiguration extends StObject {
    
    var autoTempCleanup: js.UndefOr[Boolean] = js.native
    
    var dataDirectory: js.UndefOr[String] = js.native
    
    var extensionsLocationCache: js.UndefOr[Boolean] = js.native
    
    var loadConfig: js.UndefOr[Boolean] = js.native
    
    var logger: js.UndefOr[Silent] = js.native
    
    var rootDirectory: js.UndefOr[String] = js.native
    
    var scripts: js.UndefOr[AllowedModules] = js.native
    
    var tasks: js.UndefOr[PartialallowedModulesArra] = js.native
    
    var tempDirectory: js.UndefOr[String] = js.native
  }
  object PartialConfiguration {
    
    @scala.inline
    def apply(): PartialConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfiguration]
    }
    
    @scala.inline
    implicit class PartialConfigurationMutableBuilder[Self <: PartialConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoTempCleanup(value: Boolean): Self = StObject.set(x, "autoTempCleanup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoTempCleanupUndefined: Self = StObject.set(x, "autoTempCleanup", js.undefined)
      
      @scala.inline
      def setDataDirectory(value: String): Self = StObject.set(x, "dataDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataDirectoryUndefined: Self = StObject.set(x, "dataDirectory", js.undefined)
      
      @scala.inline
      def setExtensionsLocationCache(value: Boolean): Self = StObject.set(x, "extensionsLocationCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsLocationCacheUndefined: Self = StObject.set(x, "extensionsLocationCache", js.undefined)
      
      @scala.inline
      def setLoadConfig(value: Boolean): Self = StObject.set(x, "loadConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadConfigUndefined: Self = StObject.set(x, "loadConfig", js.undefined)
      
      @scala.inline
      def setLogger(value: Silent): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setRootDirectory(value: String): Self = StObject.set(x, "rootDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDirectoryUndefined: Self = StObject.set(x, "rootDirectory", js.undefined)
      
      @scala.inline
      def setScripts(value: AllowedModules): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      @scala.inline
      def setTasks(value: PartialallowedModulesArra): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
      
      @scala.inline
      def setTempDirectory(value: String): Self = StObject.set(x, "tempDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTempDirectoryUndefined: Self = StObject.set(x, "tempDirectory", js.undefined)
    }
  }
  
  /* Inlined std.Partial<jsreport-core.jsreport-core.Request> */
  @js.native
  trait PartialRequest extends StObject {
    
    var data: js.UndefOr[js.Any] = js.native
    
    var options: js.UndefOr[Options] = js.native
    
    var template: js.UndefOr[PartialTemplate] = js.native
  }
  object PartialRequest {
    
    @scala.inline
    def apply(): PartialRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRequest]
    }
    
    @scala.inline
    implicit class PartialRequestMutableBuilder[Self <: PartialRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setTemplate(value: PartialTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  /* Inlined std.Partial<jsreport-core.jsreport-core.Template> */
  @js.native
  trait PartialTemplate extends StObject {
    
    var content: js.UndefOr[String] = js.native
    
    var engine: js.UndefOr[Engine | String] = js.native
    
    var helpers: js.UndefOr[Helpers] = js.native
    
    var recipe: js.UndefOr[Recipe | String] = js.native
  }
  object PartialTemplate {
    
    @scala.inline
    def apply(): PartialTemplate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTemplate]
    }
    
    @scala.inline
    implicit class PartialTemplateMutableBuilder[Self <: PartialTemplate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setEngine(value: Engine | String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      @scala.inline
      def setHelpers(value: Helpers): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpersUndefined: Self = StObject.set(x, "helpers", js.undefined)
      
      @scala.inline
      def setRecipe(value: Recipe | String): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipeUndefined: Self = StObject.set(x, "recipe", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  allowedModules :std.Array<string> | string,   strategy :'dedicated-process' | 'http-server' | 'in-process' | string}> */
  @js.native
  trait PartialallowedModulesArra extends StObject {
    
    var allowedModules: js.UndefOr[js.Array[String] | String] = js.native
    
    var strategy: js.UndefOr[`dedicated-process` | `http-server` | `in-process` | String] = js.native
  }
  object PartialallowedModulesArra {
    
    @scala.inline
    def apply(): PartialallowedModulesArra = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialallowedModulesArra]
    }
    
    @scala.inline
    implicit class PartialallowedModulesArraMutableBuilder[Self <: PartialallowedModulesArra] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedModules(value: js.Array[String] | String): Self = StObject.set(x, "allowedModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedModulesUndefined: Self = StObject.set(x, "allowedModules", js.undefined)
      
      @scala.inline
      def setAllowedModulesVarargs(value: String*): Self = StObject.set(x, "allowedModules", js.Array(value :_*))
      
      @scala.inline
      def setStrategy(value: `dedicated-process` | `http-server` | `in-process` | String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
  
  @js.native
  trait Silent extends StObject {
    
    var silent: Boolean = js.native
  }
  object Silent {
    
    @scala.inline
    def apply(silent: Boolean): Silent = {
      val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Silent]
    }
    
    @scala.inline
    implicit class SilentMutableBuilder[Self <: Silent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    }
  }
}
