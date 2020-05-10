package typingsSlinky.parseFilepath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedPath extends js.Object {
  /**
    * fully resolved, absolute filepath
    */
  var absolute: String = js.native
  /**
    * The file name including extension (if any) such as `'index.html'`
    */
  var base: String = js.native
  /**
    * alias for `base`
    */
  var basename: String = js.native
  /**
    * The full directory path such as `'/home/user/dir'` or `'c:\path\dir'`
    */
  var dir: String = js.native
  /**
    * alias for `dir`
    */
  var dirname: String = js.native
  /**
    * The file extension (if any) such as `'.html'`
    */
  var ext: String = js.native
  /**
    * alias for `ext`
    */
  var extname: String = js.native
  /**
    * `true` if the given path is absolute
    */
  var isAbsolute: Boolean = js.native
  /**
    * The file name without extension (if any) such as `'index'`
    */
  var name: String = js.native
  /**
    * the original filepath
    */
  var path: String = js.native
  /**
    * The root of the path such as `'/'` or `'c:\'`
    */
  var root: String = js.native
  /**
    * alias for `name`
    */
  var stem: String = js.native
}

object ParsedPath {
  @scala.inline
  def apply(
    absolute: String,
    base: String,
    basename: String,
    dir: String,
    dirname: String,
    ext: String,
    extname: String,
    isAbsolute: Boolean,
    name: String,
    path: String,
    root: String,
    stem: String
  ): ParsedPath = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], basename = basename.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], dirname = dirname.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], extname = extname.asInstanceOf[js.Any], isAbsolute = isAbsolute.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedPath]
  }
  @scala.inline
  implicit class ParsedPathOps[Self <: ParsedPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsolute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAbsolute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAbsolute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stem")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

