package typingsSlinky.frctlFractal.mod.fractal.api.files

import typingsSlinky.frctlFractal.frctlFractalBooleans.`true`
import typingsSlinky.node.Buffer
import typingsSlinky.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  var base: String = js.native
  val contents: Buffer = js.native
  var cwd: String = js.native
  var dir: String = js.native
  var editorMode: String = js.native
  var editorScope: String = js.native
  var ext: String = js.native
  var githubColor: String = js.native
  var handle: String = js.native
  var id: String = js.native
  val isAsset: js.UndefOr[scala.Nothing] = js.native
  var isBinary: Boolean = js.native
  val isCollection: js.UndefOr[scala.Nothing] = js.native
  val isComponent: js.UndefOr[scala.Nothing] = js.native
  val isDoc: js.UndefOr[scala.Nothing] = js.native
  val isFile: `true` = js.native
  val isImage: Boolean = js.native
  val isVariant: js.UndefOr[scala.Nothing] = js.native
  var lang: String = js.native
  var mime: String = js.native
  var name: String = js.native
  var path: String = js.native
  var relPath: String = js.native
  var stat: Stats | Null = js.native
  def getContent(): js.Promise[String] = js.native
  def getContentSync(): String = js.native
  def getContext(): js.Any = js.native
  def read(): js.Promise[String] = js.native
  def readSync(): String = js.native
  def toVinyl(): typingsSlinky.vinyl.mod.File = js.native
}

object File {
  @scala.inline
  def apply(
    base: String,
    contents: Buffer,
    cwd: String,
    dir: String,
    editorMode: String,
    editorScope: String,
    ext: String,
    getContent: () => js.Promise[String],
    getContentSync: () => String,
    getContext: () => js.Any,
    githubColor: String,
    handle: String,
    id: String,
    isBinary: Boolean,
    isFile: `true`,
    isImage: Boolean,
    lang: String,
    mime: String,
    name: String,
    path: String,
    read: () => js.Promise[String],
    readSync: () => String,
    relPath: String,
    toVinyl: () => typingsSlinky.vinyl.mod.File
  ): File = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], editorMode = editorMode.asInstanceOf[js.Any], editorScope = editorScope.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], getContent = js.Any.fromFunction0(getContent), getContentSync = js.Any.fromFunction0(getContentSync), getContext = js.Any.fromFunction0(getContext), githubColor = githubColor.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isBinary = isBinary.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], isImage = isImage.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], read = js.Any.fromFunction0(read), readSync = js.Any.fromFunction0(readSync), relPath = relPath.asInstanceOf[js.Any], toVinyl = js.Any.fromFunction0(toVinyl))
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
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
    def withContents(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditorMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditorScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetContent(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContentSync(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentSync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContext(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGithubColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("githubColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBinary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBinary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFile(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsImage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime")(value.asInstanceOf[js.Any])
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
    def withRead(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadSync(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readSync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRelPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToVinyl(value: () => typingsSlinky.vinyl.mod.File): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toVinyl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStat(value: Stats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stat")(null)
        ret
    }
  }
  
}

