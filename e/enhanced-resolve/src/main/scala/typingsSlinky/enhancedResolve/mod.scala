package typingsSlinky.enhancedResolve

import typingsSlinky.enhancedResolve.anon.Encoding
import typingsSlinky.enhancedResolve.anon.Flag
import typingsSlinky.enhancedResolve.anon.FnCall
import typingsSlinky.enhancedResolve.anon.FnCallContextPathRequestCallback
import typingsSlinky.enhancedResolve.commonTypesMod.AbstractInputFileSystem
import typingsSlinky.enhancedResolve.commonTypesMod.LoggingCallbackWrapper
import typingsSlinky.enhancedResolve.commonTypesMod.ResolveContext
import typingsSlinky.enhancedResolve.commonTypesMod.ResolverRequest
import typingsSlinky.enhancedResolve.concordMod.Dictionary
import typingsSlinky.enhancedResolve.mod.ResolverFactory.ResolverOption
import typingsSlinky.enhancedResolve.resolverMod.^
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.Stats
import typingsSlinky.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("enhanced-resolve", JSImport.Namespace)
  @js.native
  def apply(context: ResolveContext, path: String, request: String, callback: LoggingCallbackWrapper): Unit = js.native
  @JSImport("enhanced-resolve", JSImport.Namespace)
  @js.native
  def apply(path: String, request: String, callback: LoggingCallbackWrapper): Unit = js.native
  
  @JSImport("enhanced-resolve", "CachedInputFileSystem")
  @js.native
  class CachedInputFileSystem protected () extends StObject {
    def this(fileSystem: AbstractInputFileSystem, duration: Double) = this()
    
    var fileSystem: AbstractInputFileSystem = js.native
    
    def purge(): Unit = js.native
    def purge(what: String): Unit = js.native
    def purge(what: js.Array[String]): Unit = js.native
    
    var readFile: js.UndefOr[
        js.Function2[
          /* path */ String, 
          /* callback */ js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit], 
          Unit
        ]
      ] = js.native
    
    var readFileSync: js.UndefOr[js.Function2[/* filename */ String, /* options */ js.UndefOr[Flag], Buffer]] = js.native
    
    var readJson: js.UndefOr[
        js.Function2[
          /* path */ String, 
          /* callback */ js.Function2[/* err */ ErrnoException, /* data */ js.Any, Unit], 
          Unit
        ]
      ] = js.native
    
    var readJsonSync: js.UndefOr[js.Function1[/* path */ String, _]] = js.native
    
    var readdir: js.UndefOr[
        js.Function2[
          /* path */ String, 
          /* callback */ js.Function2[/* err */ ErrnoException, /* files */ js.Array[String], Unit], 
          Unit
        ]
      ] = js.native
    
    var readdirSync: js.UndefOr[js.Function1[/* path */ String, js.Array[String]]] = js.native
    
    var readlink: js.UndefOr[
        js.Function2[
          /* path */ String, 
          /* callback */ js.Function2[/* err */ ErrnoException, /* linkString */ String, Unit], 
          Unit
        ]
      ] = js.native
    
    var readlinkSync: js.UndefOr[js.Function1[/* path */ String | Buffer, String]] = js.native
    
    var stat: js.UndefOr[
        js.Function2[
          /* path */ String, 
          /* callback */ js.Function2[/* err */ ErrnoException, /* stats */ Stats, Unit], 
          Unit
        ]
      ] = js.native
    
    var statSync: js.UndefOr[js.Function1[/* path */ String | Buffer, Stats]] = js.native
  }
  
  @JSImport("enhanced-resolve", "NodeJsInputFileSystem")
  @js.native
  class NodeJsInputFileSystem () extends StObject {
    
    def readFile(filename: String, callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]): Unit = js.native
    def readFile(
      filename: String,
      encoding: String,
      callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
    ): Unit = js.native
    def readFile(
      filename: String,
      options: Encoding,
      callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
    ): Unit = js.native
    def readFile(
      filename: String,
      options: Flag,
      callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
    ): Unit = js.native
    
    def readFileSync(filename: String): Buffer = js.native
    def readFileSync(filename: String, encoding: String): String = js.native
    def readFileSync(filename: String, options: Encoding): String = js.native
    def readFileSync(filename: String, options: Flag): Buffer = js.native
    
    def readdir(path: String, callback: js.Function2[/* err */ js.Error, /* files */ js.Array[String], Unit]): Unit = js.native
    
    def readdirSync(path: String): js.Array[String] = js.native
    
    def readlink(path: String): Unit = js.native
    def readlink(path: String, callback: js.Function2[/* err */ ErrnoException, /* linkString */ String, _]): Unit = js.native
    
    def readlinkSync(path: String): String = js.native
    def readlinkSync(path: Buffer): String = js.native
    
    def stat(path: String): Unit = js.native
    def stat(path: String, callback: js.Function2[/* err */ ErrnoException, /* stats */ Stats, _]): Unit = js.native
    
    def statSync(path: String): Stats = js.native
    def statSync(path: Buffer): Stats = js.native
  }
  
  object ResolverFactory {
    
    @JSImport("enhanced-resolve", "ResolverFactory.createResolver")
    @js.native
    def createResolver(options: ResolverOption): ^ = js.native
    
    @js.native
    trait AliasItem extends StObject {
      
      var alias: String = js.native
      
      var name: String = js.native
      
      var onlyModule: js.UndefOr[Boolean] = js.native
    }
    object AliasItem {
      
      @scala.inline
      def apply(alias: String, name: String): AliasItem = {
        val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[AliasItem]
      }
      
      @scala.inline
      implicit class AliasItemMutableBuilder[Self <: AliasItem] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnlyModule(value: Boolean): Self = StObject.set(x, "onlyModule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnlyModuleUndefined: Self = StObject.set(x, "onlyModule", js.undefined)
      }
    }
    
    @js.native
    trait ResolverOption extends StObject {
      
      var alias: js.UndefOr[js.Array[AliasItem] | Dictionary[String]] = js.native
      
      var aliasFields: js.UndefOr[js.Array[String]] = js.native
      
      var cachePredicate: js.UndefOr[js.Function1[/* val */ ResolverRequest, Boolean]] = js.native
      
      var descriptionFiles: js.UndefOr[js.Array[String]] = js.native
      
      var enforceExtension: js.UndefOr[Boolean] = js.native
      
      var enforceModuleExtension: js.UndefOr[Boolean] = js.native
      
      var extensions: js.UndefOr[js.Array[String]] = js.native
      
      var fileSystem: js.UndefOr[AbstractInputFileSystem] = js.native
      
      var mainFields: js.UndefOr[js.Array[String]] = js.native
      
      var mainFiles: js.UndefOr[js.Array[String]] = js.native
      
      var moduleExtensions: js.UndefOr[js.Array[String]] = js.native
      
      var modules: js.UndefOr[js.Array[String]] = js.native
      
      var plugins: js.UndefOr[js.Array[Plugin]] = js.native
      
      var resolveToContext: js.UndefOr[Boolean] = js.native
      
      var resolver: js.UndefOr[^] = js.native
      
      var symlinks: js.UndefOr[js.Array[String] | Boolean] = js.native
      
      var unsafeCache: js.UndefOr[Boolean | Dictionary[_]] = js.native
      
      var useSyncFileSystemCalls: js.UndefOr[Boolean] = js.native
    }
    object ResolverOption {
      
      @scala.inline
      def apply(): ResolverOption = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ResolverOption]
      }
      
      @scala.inline
      implicit class ResolverOptionMutableBuilder[Self <: ResolverOption] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlias(value: js.Array[AliasItem] | Dictionary[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAliasFields(value: js.Array[String]): Self = StObject.set(x, "aliasFields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAliasFieldsUndefined: Self = StObject.set(x, "aliasFields", js.undefined)
        
        @scala.inline
        def setAliasFieldsVarargs(value: String*): Self = StObject.set(x, "aliasFields", js.Array(value :_*))
        
        @scala.inline
        def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
        
        @scala.inline
        def setAliasVarargs(value: AliasItem*): Self = StObject.set(x, "alias", js.Array(value :_*))
        
        @scala.inline
        def setCachePredicate(value: /* val */ ResolverRequest => Boolean): Self = StObject.set(x, "cachePredicate", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCachePredicateUndefined: Self = StObject.set(x, "cachePredicate", js.undefined)
        
        @scala.inline
        def setDescriptionFiles(value: js.Array[String]): Self = StObject.set(x, "descriptionFiles", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionFilesUndefined: Self = StObject.set(x, "descriptionFiles", js.undefined)
        
        @scala.inline
        def setDescriptionFilesVarargs(value: String*): Self = StObject.set(x, "descriptionFiles", js.Array(value :_*))
        
        @scala.inline
        def setEnforceExtension(value: Boolean): Self = StObject.set(x, "enforceExtension", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnforceExtensionUndefined: Self = StObject.set(x, "enforceExtension", js.undefined)
        
        @scala.inline
        def setEnforceModuleExtension(value: Boolean): Self = StObject.set(x, "enforceModuleExtension", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnforceModuleExtensionUndefined: Self = StObject.set(x, "enforceModuleExtension", js.undefined)
        
        @scala.inline
        def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
        
        @scala.inline
        def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
        
        @scala.inline
        def setFileSystem(value: AbstractInputFileSystem): Self = StObject.set(x, "fileSystem", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFileSystemUndefined: Self = StObject.set(x, "fileSystem", js.undefined)
        
        @scala.inline
        def setMainFields(value: js.Array[String]): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMainFieldsUndefined: Self = StObject.set(x, "mainFields", js.undefined)
        
        @scala.inline
        def setMainFieldsVarargs(value: String*): Self = StObject.set(x, "mainFields", js.Array(value :_*))
        
        @scala.inline
        def setMainFiles(value: js.Array[String]): Self = StObject.set(x, "mainFiles", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMainFilesUndefined: Self = StObject.set(x, "mainFiles", js.undefined)
        
        @scala.inline
        def setMainFilesVarargs(value: String*): Self = StObject.set(x, "mainFiles", js.Array(value :_*))
        
        @scala.inline
        def setModuleExtensions(value: js.Array[String]): Self = StObject.set(x, "moduleExtensions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModuleExtensionsUndefined: Self = StObject.set(x, "moduleExtensions", js.undefined)
        
        @scala.inline
        def setModuleExtensionsVarargs(value: String*): Self = StObject.set(x, "moduleExtensions", js.Array(value :_*))
        
        @scala.inline
        def setModules(value: js.Array[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
        
        @scala.inline
        def setModulesVarargs(value: String*): Self = StObject.set(x, "modules", js.Array(value :_*))
        
        @scala.inline
        def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
        
        @scala.inline
        def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value :_*))
        
        @scala.inline
        def setResolveToContext(value: Boolean): Self = StObject.set(x, "resolveToContext", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResolveToContextUndefined: Self = StObject.set(x, "resolveToContext", js.undefined)
        
        @scala.inline
        def setResolver(value: ^): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
        
        @scala.inline
        def setSymlinks(value: js.Array[String] | Boolean): Self = StObject.set(x, "symlinks", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSymlinksUndefined: Self = StObject.set(x, "symlinks", js.undefined)
        
        @scala.inline
        def setSymlinksVarargs(value: String*): Self = StObject.set(x, "symlinks", js.Array(value :_*))
        
        @scala.inline
        def setUnsafeCache(value: Boolean | Dictionary[_]): Self = StObject.set(x, "unsafeCache", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnsafeCacheUndefined: Self = StObject.set(x, "unsafeCache", js.undefined)
        
        @scala.inline
        def setUseSyncFileSystemCalls(value: Boolean): Self = StObject.set(x, "useSyncFileSystemCalls", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseSyncFileSystemCallsUndefined: Self = StObject.set(x, "useSyncFileSystemCalls", js.undefined)
      }
    }
  }
  
  object context {
    
    @JSImport("enhanced-resolve", "context")
    @js.native
    def apply(context: ResolveContext, path: String, request: String, callback: LoggingCallbackWrapper): Unit = js.native
    @JSImport("enhanced-resolve", "context")
    @js.native
    def apply(path: String, request: String, callback: LoggingCallbackWrapper): Unit = js.native
    
    @JSImport("enhanced-resolve", "context.sync")
    @js.native
    def sync(context: ResolveContext, path: String, request: String): String = js.native
    @JSImport("enhanced-resolve", "context.sync")
    @js.native
    def sync(path: String, request: String): String = js.native
  }
  
  object create {
    
    @JSImport("enhanced-resolve", "create")
    @js.native
    def apply(options: ResolverOption): FnCallContextPathRequestCallback = js.native
    
    @JSImport("enhanced-resolve", "create.sync")
    @js.native
    def sync(options: ResolverOption): FnCall = js.native
  }
  
  object loader {
    
    @JSImport("enhanced-resolve", "loader")
    @js.native
    def apply(context: ResolveContext, path: String, request: String, callback: LoggingCallbackWrapper): Unit = js.native
    @JSImport("enhanced-resolve", "loader")
    @js.native
    def apply(path: String, request: String, callback: LoggingCallbackWrapper): Unit = js.native
    
    @JSImport("enhanced-resolve", "loader.sync")
    @js.native
    def sync(context: ResolveContext, path: String, request: String): String = js.native
    @JSImport("enhanced-resolve", "loader.sync")
    @js.native
    def sync(path: String, request: String): String = js.native
  }
  
  @JSImport("enhanced-resolve", "sync")
  @js.native
  def sync(context: ResolveContext, path: String, request: String): String = js.native
  @JSImport("enhanced-resolve", "sync")
  @js.native
  def sync(path: String, request: String): String = js.native
}
