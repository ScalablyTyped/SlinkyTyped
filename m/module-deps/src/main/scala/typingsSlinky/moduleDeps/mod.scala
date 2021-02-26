package typingsSlinky.moduleDeps

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.browserResolve.mod.SyncOpts
import typingsSlinky.moduleDeps.anon.Builtin
import typingsSlinky.moduleDeps.anon.Deps
import typingsSlinky.moduleDeps.anon.Dictprop
import typingsSlinky.moduleDeps.anon.Entry
import typingsSlinky.moduleDeps.anon.Id
import typingsSlinky.moduleDeps.anon.Modules
import typingsSlinky.moduleDeps.moduleDepsStrings._package
import typingsSlinky.moduleDeps.moduleDepsStrings.file
import typingsSlinky.moduleDeps.moduleDepsStrings.missing
import typingsSlinky.moduleDeps.moduleDepsStrings.transform
import typingsSlinky.node.NodeJS.ReadWriteStream
import typingsSlinky.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Return an object transform stream 'd' that expects entry filenames or '{ id: ..., file: ... }' objects
    * as input and produces objects for every dependency from a recursive module traversal as output.
    */
  @JSImport("module-deps", JSImport.Namespace)
  @js.native
  def apply(): ModuleDepsObject = js.native
  @JSImport("module-deps", JSImport.Namespace)
  @js.native
  def apply(opts: Options): ModuleDepsObject = js.native
  
  type CacheCallback = js.Function2[/* err */ js.Error | Null, /* res */ js.UndefOr[Deps], Unit]
  
  @js.native
  trait InputRow extends StObject {
    
    var entry: js.UndefOr[Boolean] = js.native
    
    var expose: String = js.native
    
    var file: String = js.native
    
    var id: String = js.native
    
    var noparse: js.UndefOr[Boolean] = js.native
  }
  object InputRow {
    
    @scala.inline
    def apply(expose: String, file: String, id: String): InputRow = {
      val __obj = js.Dynamic.literal(expose = expose.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputRow]
    }
    
    @scala.inline
    implicit class InputRowMutableBuilder[Self <: InputRow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntry(value: Boolean): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
      
      @scala.inline
      def setExpose(value: String): Self = StObject.set(x, "expose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoparse(value: Boolean): Self = StObject.set(x, "noparse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoparseUndefined: Self = StObject.set(x, "noparse", js.undefined)
    }
  }
  
  @js.native
  trait InputTransform extends StObject {
    
    var global: js.UndefOr[Boolean] = js.native
    
    var options: js.Any = js.native
    
    var transform: String | js.Function0[_] = js.native
  }
  object InputTransform {
    
    @scala.inline
    def apply(options: js.Any, transform: String | js.Function0[_]): InputTransform = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputTransform]
    }
    
    @scala.inline
    implicit class InputTransformMutableBuilder[Self <: InputTransform] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(value: String | js.Function0[_]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformFunction0(value: () => _): Self = StObject.set(x, "transform", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ModuleDepsObject extends ReadWriteStream {
    
    def _flush(): Unit = js.native
    
    def _isTopLevel(file: String): Boolean = js.native
    
    def _transform(row: String, enc: String, next: js.Function0[Unit]): Unit = js.native
    def _transform(row: InputRow, enc: String, next: js.Function0[Unit]): Unit = js.native
    def _transform(row: InputTransform, enc: String, next: js.Function0[Unit]): Unit = js.native
    
    def getTransforms(file: String, pkg: PackageObject): ReadWriteStream = js.native
    def getTransforms(file: String, pkg: PackageObject, opts: Builtin): ReadWriteStream = js.native
    
    def lookupPackage(file: String, cb: js.Function3[/* a */ js.Any, /* b */ js.Any, /* c */ js.UndefOr[js.Any], _]): Unit = js.native
    
    /**
      * Every time a file is read, this event fires with the file path.
      */
    @JSName("on")
    def on_file(event: file, listener: js.Function2[/* file */ String, /* id */ String, _]): this.type = js.native
    /**
      * When opts.ignoreMissing is enabled, this event fires for each missing package.
      */
    @JSName("on")
    def on_missing(event: missing, listener: js.Function2[/* id */ String, /* parent */ Dictprop, _]): this.type = js.native
    /**
      * Every time a package is read, this event fires. The directory name of the package is available in pkg.__dirname.
      */
    @JSName("on")
    def on_package(event: _package, listener: js.Function1[/* package */ PackageObject, _]): this.type = js.native
    /**
      * Every time a transform is applied to a file, a 'transform' event fires with the instantiated transform stream tr.
      */
    @JSName("on")
    def on_transform(event: transform, listener: js.Function2[/* tr */ js.Any, /* file */ String, _]): this.type = js.native
    
    def parseDeps(file: String, src: String, cb: js.Any): js.Array[_] = js.native
    
    def readFile(file: String): ReadableStream = js.native
    def readFile(file: String, id: js.UndefOr[scala.Nothing], pkg: PackageObject): ReadableStream = js.native
    def readFile(file: String, id: js.Any): ReadableStream = js.native
    def readFile(file: String, id: js.Any, pkg: PackageObject): ReadableStream = js.native
    
    def resolve(
      id: String,
      parent: Id,
      cb: js.Function4[
          /* err */ js.Error | Null, 
          /* file */ js.UndefOr[String], 
          /* pkg */ js.UndefOr[PackageObject], 
          /* fakePath */ js.UndefOr[js.Any], 
          _
        ]
    ): js.Any = js.native
    
    def walk(
      id: String,
      parent: Modules,
      cb: js.Function2[/* err */ js.Error | Null, /* file */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def walk(
      id: Entry,
      parent: Modules,
      cb: js.Function2[/* err */ js.Error | Null, /* file */ js.UndefOr[String], Unit]
    ): Unit = js.native
  }
  
  /**
    * module-deps constructor options
    */
  @js.native
  trait Options
    extends /* prop */ StringDictionary[js.Any] {
    
    // un-documented options used by module-deps
    var basedir: js.UndefOr[String] = js.native
    
    /**
      * An object mapping filenames to file objects to skip costly io
      */
    var cache: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    /**
      * A custom dependency detection function. opts.detect(source) should return an array of dependency module names. By default detective is used
      */
    var detect: js.UndefOr[js.Function1[/* source */ String, js.Array[String]]] = js.native
    
    var expose: js.UndefOr[StringDictionary[String]] = js.native
    
    var extensions: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * An object mapping filenames to raw source to avoid reading from disk.
      */
    var fileCache: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * A function (id) to skip resolution of some module id strings. If defined,
      * opts.filter(id) should return truthy for all the ids to include and falsey for all the ids to skip.
      */
    var filter: js.UndefOr[js.Function1[/* id */ String, Boolean]] = js.native
    
    var globalTransform: js.UndefOr[js.Array[_]] = js.native
    
    /**
      * Ignore files that failed to resolve
      */
    var ignoreMissing: js.UndefOr[Boolean] = js.native
    
    var modules: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    /**
      * An array of absolute paths to not parse for dependencies.
      * Use this for large dependencies like jquery or threejs which take forever to parse.
      */
    var noParse: js.UndefOr[Boolean | js.Array[String]] = js.native
    
    /**
      * An object mapping filenames to their parent package.json contents
      * for browser fields, main entries, and transforms
      */
    var packageCache: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    // tslint:disable-line:void-return
    /**
      * Transform the parsed package.json contents before using the values.
      * opts.packageFilter(pkg, dir) should return the new pkg object to use.
      */
    var packageFilter: js.UndefOr[js.Function2[/* pkg */ PackageObject, /* dir */ String, PackageObject]] = js.native
    
    /**
      * Array of global paths to search. Defaults to splitting on ':' in process.env.NODE_PATH
      */
    var paths: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * A complex cache handler that allows async and persistent caching of data.
      */
    var persistentCache: js.UndefOr[
        js.Function5[
          /* file */ String, 
          /* id */ String, 
          /* pkg */ PackageObject, 
          /* fallback */ js.Function2[/* dataAsString */ String, /* cb */ CacheCallback, Unit], 
          /* cb */ CacheCallback, 
          Unit
        ]
      ] = js.native
    
    /**
      * A function (id, file, pkg) that gets called after id has been resolved.
      * Return false to skip this file
      */
    var postFilter: js.UndefOr[
        js.Function3[/* id */ String, /* file */ String, /* pkg */ PackageObject, Unit | Boolean]
      ] = js.native
    
    /**
      * Custom resolve function using the opts.resolve(id, parent, cb) signature that browser-resolve has
      */
    var resolve: js.UndefOr[
        js.Function3[
          /* id */ String, 
          /* opts */ SyncOpts, 
          /* cb */ js.Function4[
            /* err */ js.UndefOr[js.Error | Null], 
            /* file */ js.UndefOr[String], 
            /* pkg */ js.UndefOr[PackageObject], 
            /* fakePath */ js.UndefOr[js.Any], 
            Unit
          ], 
          Unit
        ]
      ] = js.native
    
    /**
      * A string or array of string transforms
      */
    var transform: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * An array path of strings showing where to look in the package.json
      * for source transformations. If falsy, don't look at the package.json at all
      */
    var transformKey: js.UndefOr[js.Array[String]] = js.native
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
      def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasedirUndefined: Self = StObject.set(x, "basedir", js.undefined)
      
      @scala.inline
      def setCache(value: StringDictionary[js.Any]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setDetect(value: /* source */ String => js.Array[String]): Self = StObject.set(x, "detect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDetectUndefined: Self = StObject.set(x, "detect", js.undefined)
      
      @scala.inline
      def setExpose(value: StringDictionary[String]): Self = StObject.set(x, "expose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExposeUndefined: Self = StObject.set(x, "expose", js.undefined)
      
      @scala.inline
      def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setFileCache(value: StringDictionary[String]): Self = StObject.set(x, "fileCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileCacheUndefined: Self = StObject.set(x, "fileCache", js.undefined)
      
      @scala.inline
      def setFilter(value: /* id */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setGlobalTransform(value: js.Array[_]): Self = StObject.set(x, "globalTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTransformUndefined: Self = StObject.set(x, "globalTransform", js.undefined)
      
      @scala.inline
      def setGlobalTransformVarargs(value: js.Any*): Self = StObject.set(x, "globalTransform", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreMissing(value: Boolean): Self = StObject.set(x, "ignoreMissing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreMissingUndefined: Self = StObject.set(x, "ignoreMissing", js.undefined)
      
      @scala.inline
      def setModules(value: StringDictionary[js.Any]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      @scala.inline
      def setNoParse(value: Boolean | js.Array[String]): Self = StObject.set(x, "noParse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoParseUndefined: Self = StObject.set(x, "noParse", js.undefined)
      
      @scala.inline
      def setNoParseVarargs(value: String*): Self = StObject.set(x, "noParse", js.Array(value :_*))
      
      @scala.inline
      def setPackageCache(value: StringDictionary[js.Any]): Self = StObject.set(x, "packageCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageCacheUndefined: Self = StObject.set(x, "packageCache", js.undefined)
      
      @scala.inline
      def setPackageFilter(value: (/* pkg */ PackageObject, /* dir */ String) => PackageObject): Self = StObject.set(x, "packageFilter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPackageFilterUndefined: Self = StObject.set(x, "packageFilter", js.undefined)
      
      @scala.inline
      def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      @scala.inline
      def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
      
      @scala.inline
      def setPersistentCache(
        value: (/* file */ String, /* id */ String, /* pkg */ PackageObject, /* fallback */ js.Function2[/* dataAsString */ String, /* cb */ CacheCallback, Unit], /* cb */ CacheCallback) => Unit
      ): Self = StObject.set(x, "persistentCache", js.Any.fromFunction5(value))
      
      @scala.inline
      def setPersistentCacheUndefined: Self = StObject.set(x, "persistentCache", js.undefined)
      
      @scala.inline
      def setPostFilter(value: (/* id */ String, /* file */ String, /* pkg */ PackageObject) => Unit | Boolean): Self = StObject.set(x, "postFilter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPostFilterUndefined: Self = StObject.set(x, "postFilter", js.undefined)
      
      @scala.inline
      def setResolve(
        value: (/* id */ String, /* opts */ SyncOpts, /* cb */ js.Function4[
              /* err */ js.UndefOr[js.Error | Null], 
              /* file */ js.UndefOr[String], 
              /* pkg */ js.UndefOr[PackageObject], 
              /* fakePath */ js.UndefOr[js.Any], 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "resolve", js.Any.fromFunction3(value))
      
      @scala.inline
      def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      @scala.inline
      def setTransform(value: String | js.Array[String]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformKey(value: js.Array[String]): Self = StObject.set(x, "transformKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformKeyUndefined: Self = StObject.set(x, "transformKey", js.undefined)
      
      @scala.inline
      def setTransformKeyVarargs(value: String*): Self = StObject.set(x, "transformKey", js.Array(value :_*))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setTransformVarargs(value: String*): Self = StObject.set(x, "transform", js.Array(value :_*))
    }
  }
  
  /**
    * Placeholder, feel free to redefine or put in a pull request to improve
    */
  type PackageObject = StringDictionary[js.Any]
  
  @js.native
  trait TransformObject extends StObject {
    
    var deps: StringDictionary[js.Any] = js.native
    
    var entry: Boolean = js.native
    
    var expose: String = js.native
    
    var file: String = js.native
    
    var id: String = js.native
    
    var source: String = js.native
  }
  object TransformObject {
    
    @scala.inline
    def apply(
      deps: StringDictionary[js.Any],
      entry: Boolean,
      expose: String,
      file: String,
      id: String,
      source: String
    ): TransformObject = {
      val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], expose = expose.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformObject]
    }
    
    @scala.inline
    implicit class TransformObjectMutableBuilder[Self <: TransformObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeps(value: StringDictionary[js.Any]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntry(value: Boolean): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpose(value: String): Self = StObject.set(x, "expose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
