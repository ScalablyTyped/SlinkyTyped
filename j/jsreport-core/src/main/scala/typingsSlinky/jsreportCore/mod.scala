package typingsSlinky.jsreportCore

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jsreportCore.anon.AllowedModules
import typingsSlinky.jsreportCore.anon.PartialConfiguration
import typingsSlinky.jsreportCore.anon.PartialRequest
import typingsSlinky.jsreportCore.anon.PartialTemplate
import typingsSlinky.jsreportCore.anon.PartialallowedModulesArra
import typingsSlinky.jsreportCore.anon.Silent
import typingsSlinky.jsreportCore.jsreportCoreStrings.html
import typingsSlinky.jsreportCore.jsreportCoreStrings.none
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsreport-core", JSImport.Namespace)
  @js.native
  def apply(): Reporter = js.native
  @JSImport("jsreport-core", JSImport.Namespace)
  @js.native
  def apply(config: PartialConfiguration): Reporter = js.native
  
  @js.native
  trait Collection extends StObject {
    
    def find(query: StringDictionary[js.Any]): js.Promise[js.Array[js.Object]] = js.native
    
    def insert(obj: js.Object): js.Promise[js.Object] = js.native
    
    def remove(query: StringDictionary[js.Any]): js.Promise[_] = js.native
    
    def update(query: StringDictionary[js.Any], update: js.Object): js.Promise[_] = js.native
    def update(query: StringDictionary[js.Any], update: js.Object, options: js.Object): js.Promise[_] = js.native
  }
  
  @js.native
  trait Configuration extends StObject {
    
    var autoTempCleanup: Boolean = js.native
    
    var dataDirectory: String = js.native
    
    var extensionsLocationCache: Boolean = js.native
    
    var loadConfig: Boolean = js.native
    
    var logger: Silent = js.native
    
    var rootDirectory: String = js.native
    
    var scripts: AllowedModules = js.native
    
    var tasks: PartialallowedModulesArra = js.native
    
    var tempDirectory: String = js.native
  }
  object Configuration {
    
    @scala.inline
    def apply(
      autoTempCleanup: Boolean,
      dataDirectory: String,
      extensionsLocationCache: Boolean,
      loadConfig: Boolean,
      logger: Silent,
      rootDirectory: String,
      scripts: AllowedModules,
      tasks: PartialallowedModulesArra,
      tempDirectory: String
    ): Configuration = {
      val __obj = js.Dynamic.literal(autoTempCleanup = autoTempCleanup.asInstanceOf[js.Any], dataDirectory = dataDirectory.asInstanceOf[js.Any], extensionsLocationCache = extensionsLocationCache.asInstanceOf[js.Any], loadConfig = loadConfig.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], rootDirectory = rootDirectory.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], tempDirectory = tempDirectory.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoTempCleanup(value: Boolean): Self = StObject.set(x, "autoTempCleanup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataDirectory(value: String): Self = StObject.set(x, "dataDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsLocationCache(value: Boolean): Self = StObject.set(x, "extensionsLocationCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadConfig(value: Boolean): Self = StObject.set(x, "loadConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogger(value: Silent): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDirectory(value: String): Self = StObject.set(x, "rootDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScripts(value: AllowedModules): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTasks(value: PartialallowedModulesArra): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTempDirectory(value: String): Self = StObject.set(x, "tempDirectory", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DocumentStore extends StObject {
    
    def collection(name: String): Collection = js.native
  }
  object DocumentStore {
    
    @scala.inline
    def apply(collection: String => Collection): DocumentStore = {
      val __obj = js.Dynamic.literal(collection = js.Any.fromFunction1(collection))
      __obj.asInstanceOf[DocumentStore]
    }
    
    @scala.inline
    implicit class DocumentStoreMutableBuilder[Self <: DocumentStore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollection(value: String => Collection): Self = StObject.set(x, "collection", js.Any.fromFunction1(value))
    }
  }
  
  type Engine = none
  
  type Extension = js.Function2[/* reporter */ Reporter, /* definition */ js.Object, Unit]
  
  @js.native
  trait ExtensionDefinition extends StObject {
    
    var directory: String = js.native
    
    var main: js.Any = js.native
    
    var options: js.Any = js.native
  }
  object ExtensionDefinition {
    
    @scala.inline
    def apply(directory: String, main: js.Any, options: js.Any): ExtensionDefinition = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtensionDefinition]
    }
    
    @scala.inline
    implicit class ExtensionDefinitionMutableBuilder[Self <: ExtensionDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMain(value: js.Any): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  type Helpers = String | (StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]])
  
  @js.native
  trait ListenerCollection extends StObject {
    
    def add(
      `type`: String,
      callback: js.Function3[
          /* req */ Request, 
          /* res */ Response, 
          /* err */ js.UndefOr[js.Any], 
          js.Promise[_] | Unit
        ]
    ): Unit = js.native
  }
  object ListenerCollection {
    
    @scala.inline
    def apply(
      add: (String, js.Function3[
          /* req */ Request, 
          /* res */ Response, 
          /* err */ js.UndefOr[js.Any], 
          js.Promise[_] | Unit
        ]) => Unit
    ): ListenerCollection = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add))
      __obj.asInstanceOf[ListenerCollection]
    }
    
    @scala.inline
    implicit class ListenerCollectionMutableBuilder[Self <: ListenerCollection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(
        value: (String, js.Function3[
              /* req */ Request, 
              /* res */ Response, 
              /* err */ js.UndefOr[js.Any], 
              js.Promise[_] | Unit
            ]) => Unit
      ): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var preview: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    }
  }
  
  type Recipe = html
  
  @js.native
  trait Reporter extends StObject {
    
    var afterRenderListeners: ListenerCollection = js.native
    
    var afterTemplatingEnginesExecutedListeners: ListenerCollection = js.native
    
    var beforeRenderListeners: ListenerCollection = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def createListenerCollection(): ListenerCollection = js.native
    
    def discover(): Reporter = js.native
    
    var documentStore: DocumentStore = js.native
    
    def init(): js.Promise[Reporter] = js.native
    
    var initializeListeners: ListenerCollection = js.native
    
    // it would be nice to add winston.LoggerInstance here
    // however adding import winston = require('winston') breaks exported enums
    var logger: js.Any = js.native
    
    def render(options: PartialRequest): js.Promise[Response] = js.native
    
    def use(extension: Extension): Reporter = js.native
    def use(extension: ExtensionDefinition): Reporter = js.native
    
    var validateRenderListeners: ListenerCollection = js.native
    
    var version: String = js.native
  }
  
  @js.native
  trait Request extends StObject {
    
    var data: js.Any = js.native
    
    var options: js.UndefOr[Options] = js.native
    
    var template: PartialTemplate = js.native
  }
  object Request {
    
    @scala.inline
    def apply(data: js.Any, template: PartialTemplate): Request = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setTemplate(value: PartialTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Response extends StObject {
    
    var content: Buffer = js.native
    
    var headers: StringDictionary[String | Double | Boolean] = js.native
    
    var stream: ReadableStream = js.native
  }
  object Response {
    
    @scala.inline
    def apply(content: Buffer, headers: StringDictionary[String | Double | Boolean], stream: ReadableStream): Response = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: StringDictionary[String | Double | Boolean]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStream(value: ReadableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Template extends StObject {
    
    var content: String = js.native
    
    var engine: Engine | String = js.native
    
    var helpers: Helpers = js.native
    
    var recipe: Recipe | String = js.native
  }
  object Template {
    
    @scala.inline
    def apply(content: String, engine: Engine | String, helpers: Helpers, recipe: Recipe | String): Template = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], recipe = recipe.asInstanceOf[js.Any])
      __obj.asInstanceOf[Template]
    }
    
    @scala.inline
    implicit class TemplateMutableBuilder[Self <: Template] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngine(value: Engine | String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpers(value: Helpers): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipe(value: Recipe | String): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
    }
  }
}
