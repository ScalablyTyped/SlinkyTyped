package typingsSlinky.postcssImport.mod

import typingsSlinky.postcss.mod.AcceptedPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AtImportOptions extends js.Object {
  /**
    * An array of folder names to add to Node's resolver. Values will be appended to the default resolve directories: `["node_modules", "web_modules"]`.
    *
    * This option is only for adding additional directories to default resolver. If you provide your own resolver via the `resolve` configuration option above, then this value will be ignored.
    */
  var addModulesDirectories: js.UndefOr[js.Array[String]] = js.native
  /**
    * You can overwrite the default loading way by setting this option. This function gets `(filename, importOptions)` arguments and returns content or promised content.
    */
  var load: js.UndefOr[
    js.Function2[
      /* filename */ String, 
      /* importOptions */ AtImportOptions, 
      String | js.Promise[String]
    ]
  ] = js.native
  /**
    * A string or an array of paths in where to look for files.
    */
  var path: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * An array of plugins to be applied on each imported files.
    */
  var plugins: js.UndefOr[js.Array[AcceptedPlugin]] = js.native
  /**
    * You can provide a custom path resolver with this option. This function gets `(id, basedir, importOptions)` arguments and should return a path, an array of paths or a promise resolving to
    * the path(s). If you do not return an absolute path, your path will be resolved to an absolute path using the default resolver. You can use
    * [resolve](https://github.com/substack/node-resolve) for this.
    */
  var resolve: js.UndefOr[
    js.Function3[
      /* id */ String, 
      /* basedir */ String, 
      /* importOptions */ AtImportOptions, 
      String | js.Array[String] | (js.Thenable[String | js.Array[String]])
    ]
  ] = js.native
  /**
    * Define the root where to resolve path (eg: place where `node_modules` are). Should not be used that much.
    *
    * _Note: nested @import will additionally benefit of the relative dirname of imported files._
    *
    * Default: `process.cwd()` or dirname of [the postcss from](https://github.com/postcss/postcss#node-source)
    */
  var root: js.UndefOr[String] = js.native
  /**
    * By default, similar files (based on the same content) are being skipped. It's to optimize output and skip similar files like `normalize.css` for example. If this behavior is not what you
    * want, just set this option to false to disable it.
    *
    * @default true
    */
  var skipDuplicates: js.UndefOr[Boolean] = js.native
}

object AtImportOptions {
  @scala.inline
  def apply(): AtImportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AtImportOptions]
  }
  @scala.inline
  implicit class AtImportOptionsOps[Self <: AtImportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddModulesDirectories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addModulesDirectories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddModulesDirectories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addModulesDirectories")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: (/* filename */ String, /* importOptions */ AtImportOptions) => String | js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[AcceptedPlugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withResolve(
      value: (/* id */ String, /* basedir */ String, /* importOptions */ AtImportOptions) => String | js.Array[String] | (js.Thenable[String | js.Array[String]])
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
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipDuplicates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipDuplicates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipDuplicates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipDuplicates")(js.undefined)
        ret
    }
  }
  
}

