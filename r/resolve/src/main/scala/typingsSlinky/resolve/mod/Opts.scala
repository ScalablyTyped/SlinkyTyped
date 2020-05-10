package typingsSlinky.resolve.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Opts extends js.Object {
  /** package.json data applicable to the module being loaded */
  @JSName("package")
  var _package: js.UndefOr[js.Any] = js.native
  /** directory to begin resolving from (defaults to __dirname) */
  var basedir: js.UndefOr[String] = js.native
  /** array of file extensions to search in order (defaults to ['.js']) */
  var extensions: js.UndefOr[String | js.Array[String]] = js.native
  /** directory (or directories) in which to recursively look for modules. (default to 'node_modules') */
  var moduleDirectory: js.UndefOr[String | js.Array[String]] = js.native
  /** transform the parsed package.json contents before looking at the "main" field */
  var packageFilter: js.UndefOr[js.Function2[/* pkg */ js.Any, /* pkgfile */ String, _]] = js.native
  /** transform a path within a package */
  var pathFilter: js.UndefOr[
    js.Function3[/* pkg */ js.Any, /* path */ String, /* relativePath */ String, String]
  ] = js.native
  /** require.paths array to use if nothing is found on the normal node_modules recursive walk (probably don't use this) */
  var paths: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * if true, doesn't resolve `basedir` to real path before resolving.
    * This is the way Node resolves dependencies when executed with the --preserve-symlinks flag.
    *
    * Note: this property is currently true by default but it will be changed to false in the next major version because Node's resolution
    * algorithm does not preserve symlinks by default.
    */
  var preserveSymlinks: js.UndefOr[Boolean] = js.native
}

object Opts {
  @scala.inline
  def apply(): Opts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Opts]
  }
  @scala.inline
  implicit class OptsOps[Self <: Opts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_package(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_package: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(js.undefined)
        ret
    }
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
    def withExtensions(value: String | js.Array[String]): Self = {
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
    def withModuleDirectory(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageFilter(value: (/* pkg */ js.Any, /* pkgfile */ String) => _): Self = {
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
    def withPathFilter(value: (/* pkg */ js.Any, /* path */ String, /* relativePath */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathFilter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPathFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withPaths(value: String | js.Array[String]): Self = {
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
    def withPreserveSymlinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveSymlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveSymlinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveSymlinks")(js.undefined)
        ret
    }
  }
  
}

