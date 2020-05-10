package typingsSlinky.fastGlob.managersOptionsMod

import typingsSlinky.fastGlob.typesEntriesMod.EntryItem
import typingsSlinky.fastGlob.typesPatternsMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions[T] extends js.Object {
  /**
    * Return absolute paths for matched entries.
    */
  var absolute: Boolean = js.native
  /**
    * Enable expansion of brace patterns.
    */
  var brace: Boolean = js.native
  /**
    * Enable a case-insensitive regex for matching files.
    */
  var `case`: Boolean = js.native
  /**
    * The current working directory in which to search.
    */
  var cwd: String = js.native
  /**
    * The deep option can be set to true to traverse the entire directory structure,
    * or it can be set to a number to only traverse that many levels deep.
    */
  var deep: Double | Boolean = js.native
  /**
    * Allow patterns to match filenames starting with a period (files & directories),
    * even if the pattern does not explicitly have a period in that spot.
    */
  var dot: Boolean = js.native
  /**
    * Enable extglob support, so that extglobs are regarded as literal characters.
    */
  var extension: Boolean = js.native
  /**
    * Follow symlinked directories when expanding `**` patterns.
    */
  var followSymlinkedDirectories: Boolean = js.native
  /**
    * Enable matching with globstars (`**`).
    */
  var globstar: Boolean = js.native
  /**
    * Add an array of glob patterns to exclude matches.
    */
  var ignore: js.Array[Pattern] = js.native
  /**
    * Add a `/` character to directory entries.
    */
  var markDirectories: Boolean = js.native
  /**
    * Allow glob patterns without slashes to match a file path based on its basename.
    * For example, `a?b` would match the path `/xyz/123/acb`, but not `/xyz/acb/123`.
    */
  var matchBase: Boolean = js.native
  /**
    * Disable expansion of brace patterns.
    */
  var nobrace: Boolean = js.native
  /**
    * Disable a case-insensitive regex for matching files.
    */
  var nocase: Boolean = js.native
  /**
    * Disable extglob support, so that extglobs are regarded as literal characters.
    */
  var noext: Boolean = js.native
  /**
    * Disable matching with globstars (`**`).
    */
  var noglobstar: Boolean = js.native
  /**
    * Return only directories.
    */
  var onlyDirectories: Boolean = js.native
  /**
    * Return only files.
    */
  var onlyFiles: Boolean = js.native
  /**
    * Return `fs.Stats` with `path` property instead of file path.
    */
  var stats: Boolean = js.native
  /**
    * Allows you to transform a path or `fs.Stats` object before sending to the array.
    */
  var transform: TransformFunction[T] | Null = js.native
  /**
    * Prevent duplicate results.
    */
  var unique: Boolean = js.native
}

object IOptions {
  @scala.inline
  def apply[T](
    absolute: Boolean,
    brace: Boolean,
    `case`: Boolean,
    cwd: String,
    deep: Double | Boolean,
    dot: Boolean,
    extension: Boolean,
    followSymlinkedDirectories: Boolean,
    globstar: Boolean,
    ignore: js.Array[Pattern],
    markDirectories: Boolean,
    matchBase: Boolean,
    nobrace: Boolean,
    nocase: Boolean,
    noext: Boolean,
    noglobstar: Boolean,
    onlyDirectories: Boolean,
    onlyFiles: Boolean,
    stats: Boolean,
    unique: Boolean
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], brace = brace.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], deep = deep.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], followSymlinkedDirectories = followSymlinkedDirectories.asInstanceOf[js.Any], globstar = globstar.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], markDirectories = markDirectories.asInstanceOf[js.Any], matchBase = matchBase.asInstanceOf[js.Any], nobrace = nobrace.asInstanceOf[js.Any], nocase = nocase.asInstanceOf[js.Any], noext = noext.asInstanceOf[js.Any], noglobstar = noglobstar.asInstanceOf[js.Any], onlyDirectories = onlyDirectories.asInstanceOf[js.Any], onlyFiles = onlyFiles.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    __obj.updateDynamic("case")(`case`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
  @scala.inline
  implicit class IOptionsOps[Self[t] <: IOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAbsolute(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrace(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCase(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("case")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCwd(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeep(value: Double | Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDot(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtension(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowSymlinkedDirectories(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followSymlinkedDirectories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobstar(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globstar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnore(value: js.Array[Pattern]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkDirectories(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markDirectories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchBase(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNobrace(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nobrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNocase(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nocase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoext(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoglobstar(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noglobstar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnlyDirectories(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyDirectories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnlyFiles(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStats(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnique(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: /* entry */ EntryItem => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransformNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(null)
        ret
    }
  }
  
}

