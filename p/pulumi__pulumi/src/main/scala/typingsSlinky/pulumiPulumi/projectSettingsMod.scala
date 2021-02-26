package typingsSlinky.pulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectSettingsMod {
  
  @js.native
  trait ProjectBackend extends StObject {
    
    var url: js.UndefOr[String] = js.native
  }
  object ProjectBackend {
    
    @scala.inline
    def apply(): ProjectBackend = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProjectBackend]
    }
    
    @scala.inline
    implicit class ProjectBackendMutableBuilder[Self <: ProjectBackend] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pulumiPulumi.pulumiPulumiStrings.nodejs
    - typingsSlinky.pulumiPulumi.pulumiPulumiStrings.go
    - typingsSlinky.pulumiPulumi.pulumiPulumiStrings.python
    - typingsSlinky.pulumiPulumi.pulumiPulumiStrings.dotnet
  */
  trait ProjectRuntime extends StObject
  object ProjectRuntime {
    
    @scala.inline
    def dotnet: typingsSlinky.pulumiPulumi.pulumiPulumiStrings.dotnet = "dotnet".asInstanceOf[typingsSlinky.pulumiPulumi.pulumiPulumiStrings.dotnet]
    
    @scala.inline
    def go: typingsSlinky.pulumiPulumi.pulumiPulumiStrings.go = "go".asInstanceOf[typingsSlinky.pulumiPulumi.pulumiPulumiStrings.go]
    
    @scala.inline
    def nodejs: typingsSlinky.pulumiPulumi.pulumiPulumiStrings.nodejs = "nodejs".asInstanceOf[typingsSlinky.pulumiPulumi.pulumiPulumiStrings.nodejs]
    
    @scala.inline
    def python: typingsSlinky.pulumiPulumi.pulumiPulumiStrings.python = "python".asInstanceOf[typingsSlinky.pulumiPulumi.pulumiPulumiStrings.python]
  }
  
  @js.native
  trait ProjectRuntimeInfo extends StObject {
    
    var name: String = js.native
    
    var options: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  object ProjectRuntimeInfo {
    
    @scala.inline
    def apply(name: String): ProjectRuntimeInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectRuntimeInfo]
    }
    
    @scala.inline
    implicit class ProjectRuntimeInfoMutableBuilder[Self <: ProjectRuntimeInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  @js.native
  trait ProjectSettings extends StObject {
    
    var author: js.UndefOr[String] = js.native
    
    var backend: js.UndefOr[ProjectBackend] = js.native
    
    var config: js.UndefOr[String] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var license: js.UndefOr[String] = js.native
    
    var main: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var runtime: ProjectRuntimeInfo | ProjectRuntime = js.native
    
    var template: js.UndefOr[ProjectTemplate] = js.native
    
    var website: js.UndefOr[String] = js.native
  }
  object ProjectSettings {
    
    @scala.inline
    def apply(name: String, runtime: ProjectRuntimeInfo | ProjectRuntime): ProjectSettings = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectSettings]
    }
    
    @scala.inline
    implicit class ProjectSettingsMutableBuilder[Self <: ProjectSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      @scala.inline
      def setBackend(value: ProjectBackend): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
      
      @scala.inline
      def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      @scala.inline
      def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntime(value: ProjectRuntimeInfo | ProjectRuntime): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplate(value: ProjectTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
    }
  }
  
  @js.native
  trait ProjectTemplate extends StObject {
    
    var config: js.UndefOr[StringDictionary[ProjectTemplateConfigValue]] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var important: js.UndefOr[Boolean] = js.native
    
    var quickstart: js.UndefOr[String] = js.native
  }
  object ProjectTemplate {
    
    @scala.inline
    def apply(): ProjectTemplate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProjectTemplate]
    }
    
    @scala.inline
    implicit class ProjectTemplateMutableBuilder[Self <: ProjectTemplate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: StringDictionary[ProjectTemplateConfigValue]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setImportant(value: Boolean): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportantUndefined: Self = StObject.set(x, "important", js.undefined)
      
      @scala.inline
      def setQuickstart(value: String): Self = StObject.set(x, "quickstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuickstartUndefined: Self = StObject.set(x, "quickstart", js.undefined)
    }
  }
  
  @js.native
  trait ProjectTemplateConfigValue extends StObject {
    
    var default: js.UndefOr[String] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var secret: js.UndefOr[Boolean] = js.native
  }
  object ProjectTemplateConfigValue {
    
    @scala.inline
    def apply(): ProjectTemplateConfigValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProjectTemplateConfigValue]
    }
    
    @scala.inline
    implicit class ProjectTemplateConfigValueMutableBuilder[Self <: ProjectTemplateConfigValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setSecret(value: Boolean): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    }
  }
}
