package typingsSlinky.moduleDeps.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.browserResolve.mod.SyncOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasedir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basedir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasedir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basedir")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withDetect(value: /* source */ String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDetect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detect")(js.undefined)
        ret
    }
    @scala.inline
    def withExpose(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expose")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withFileCache(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileCache")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: /* id */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalTransform(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreMissing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreMissing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreMissing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreMissing")(js.undefined)
        ret
    }
    @scala.inline
    def withModules(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(js.undefined)
        ret
    }
    @scala.inline
    def withNoParse(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noParse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noParse")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageCache(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageCache")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageFilter(value: (/* pkg */ PackageObject, /* dir */ String) => PackageObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageFilter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPackageFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistentCache(
      value: (/* file */ String, /* id */ String, /* pkg */ PackageObject, /* fallback */ js.Function2[/* dataAsString */ String, /* cb */ CacheCallback, Unit], /* cb */ CacheCallback) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentCache")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutPersistentCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentCache")(js.undefined)
        ret
    }
    @scala.inline
    def withPostFilter(value: (/* id */ String, /* file */ String, /* pkg */ PackageObject) => Unit | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postFilter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPostFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withResolve(
      value: (/* id */ String, /* opts */ SyncOpts, /* cb */ js.Function4[
          /* err */ js.UndefOr[js.Error | Null], 
          /* file */ js.UndefOr[String], 
          /* pkg */ js.UndefOr[PackageObject], 
          /* fakePath */ js.UndefOr[js.Any], 
          Unit
        ]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutResolve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformKey(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformKey")(js.undefined)
        ret
    }
  }
  
}

