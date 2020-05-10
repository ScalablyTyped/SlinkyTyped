package typingsSlinky.gulpTypescript.typesMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VinylFile extends js.Object {
  var base: String = js.native
  var basename: String = js.native
  var contents: Buffer | ReadableStream | Null = js.native
  var cwd: String = js.native
  var dirname: String = js.native
  var extname: String = js.native
  var path: String = js.native
  var sourceMap: js.UndefOr[js.Any] = js.native
  var stem: String = js.native
}

object VinylFile {
  @scala.inline
  def apply(
    base: String,
    basename: String,
    cwd: String,
    dirname: String,
    extname: String,
    path: String,
    stem: String
  ): VinylFile = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], basename = basename.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], dirname = dirname.asInstanceOf[js.Any], extname = extname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any])
    __obj.asInstanceOf[VinylFile]
  }
  @scala.inline
  implicit class VinylFileOps[Self <: VinylFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContents(value: Buffer | ReadableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(null)
        ret
    }
    @scala.inline
    def withSourceMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(js.undefined)
        ret
    }
  }
  
}

