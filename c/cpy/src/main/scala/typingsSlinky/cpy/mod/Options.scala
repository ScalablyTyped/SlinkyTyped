package typingsSlinky.cpy.mod

import typingsSlinky.fastGlob.entriesMod.EntryItem
import typingsSlinky.fastGlob.optionsMod.TransformFunction
import typingsSlinky.fastGlob.patternsMod.Pattern
import typingsSlinky.globby.mod.ExpandDirectoriesOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Readonly<globby.globby.GlobbyOptions> */
/* Inlined parent cp-file.cp-file.Options */
trait Options extends js.Object {
  val absolute: js.UndefOr[Boolean] = js.undefined
  val brace: js.UndefOr[Boolean] = js.undefined
  val `case`: js.UndefOr[Boolean] = js.undefined
  /**
  		Working directory to find source files.
  		@default process.cwd()
  		*/
  val cwd: js.UndefOr[String] = js.undefined
  val deep: js.UndefOr[Double | Boolean] = js.undefined
  val dot: js.UndefOr[Boolean] = js.undefined
  val expandDirectories: js.UndefOr[ExpandDirectoriesOption] = js.undefined
  val extension: js.UndefOr[Boolean] = js.undefined
  val followSymlinkedDirectories: js.UndefOr[Boolean] = js.undefined
  val gitignore: js.UndefOr[Boolean] = js.undefined
  val globstar: js.UndefOr[Boolean] = js.undefined
  val ignore: js.UndefOr[js.Array[Pattern]] = js.undefined
  val markDirectories: js.UndefOr[Boolean] = js.undefined
  val matchBase: js.UndefOr[Boolean] = js.undefined
  val nobrace: js.UndefOr[Boolean] = js.undefined
  val nocase: js.UndefOr[Boolean] = js.undefined
  val noext: js.UndefOr[Boolean] = js.undefined
  val noglobstar: js.UndefOr[Boolean] = js.undefined
  val onlyDirectories: js.UndefOr[Boolean] = js.undefined
  val onlyFiles: js.UndefOr[Boolean] = js.undefined
  /**
  		Overwrite existing file.
  		@default true
  		*/
  val overwrite: js.UndefOr[Boolean] = js.undefined
  /**
  		Preserve path structure.
  		@default false
  		*/
  val parents: js.UndefOr[Boolean] = js.undefined
  /**
  		Filename or function returning a filename used to rename every file in `source`.
  		@example
  		```
  		cpy('foo.js', 'destination', {
  			rename: basename => `prefix-${basename}`
  		});
  		```
  		*/
  val rename: js.UndefOr[String | (js.Function1[/* basename */ String, String])] = js.undefined
  val stats: js.UndefOr[Boolean] = js.undefined
  val transform: js.UndefOr[TransformFunction[EntryItem]] = js.undefined
  val unique: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    absolute: js.UndefOr[Boolean] = js.undefined,
    brace: js.UndefOr[Boolean] = js.undefined,
    `case`: js.UndefOr[Boolean] = js.undefined,
    cwd: String = null,
    deep: Double | Boolean = null,
    dot: js.UndefOr[Boolean] = js.undefined,
    expandDirectories: ExpandDirectoriesOption = null,
    extension: js.UndefOr[Boolean] = js.undefined,
    followSymlinkedDirectories: js.UndefOr[Boolean] = js.undefined,
    gitignore: js.UndefOr[Boolean] = js.undefined,
    globstar: js.UndefOr[Boolean] = js.undefined,
    ignore: js.Array[Pattern] = null,
    markDirectories: js.UndefOr[Boolean] = js.undefined,
    matchBase: js.UndefOr[Boolean] = js.undefined,
    nobrace: js.UndefOr[Boolean] = js.undefined,
    nocase: js.UndefOr[Boolean] = js.undefined,
    noext: js.UndefOr[Boolean] = js.undefined,
    noglobstar: js.UndefOr[Boolean] = js.undefined,
    onlyDirectories: js.UndefOr[Boolean] = js.undefined,
    onlyFiles: js.UndefOr[Boolean] = js.undefined,
    overwrite: js.UndefOr[Boolean] = js.undefined,
    parents: js.UndefOr[Boolean] = js.undefined,
    rename: String | (js.Function1[/* basename */ String, String]) = null,
    stats: js.UndefOr[Boolean] = js.undefined,
    transform: /* entry */ EntryItem => EntryItem = null,
    unique: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute.asInstanceOf[js.Any])
    if (!js.isUndefined(brace)) __obj.updateDynamic("brace")(brace.asInstanceOf[js.Any])
    if (!js.isUndefined(`case`)) __obj.updateDynamic("case")(`case`.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (deep != null) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.asInstanceOf[js.Any])
    if (expandDirectories != null) __obj.updateDynamic("expandDirectories")(expandDirectories.asInstanceOf[js.Any])
    if (!js.isUndefined(extension)) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (!js.isUndefined(followSymlinkedDirectories)) __obj.updateDynamic("followSymlinkedDirectories")(followSymlinkedDirectories.asInstanceOf[js.Any])
    if (!js.isUndefined(gitignore)) __obj.updateDynamic("gitignore")(gitignore.asInstanceOf[js.Any])
    if (!js.isUndefined(globstar)) __obj.updateDynamic("globstar")(globstar.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(markDirectories)) __obj.updateDynamic("markDirectories")(markDirectories.asInstanceOf[js.Any])
    if (!js.isUndefined(matchBase)) __obj.updateDynamic("matchBase")(matchBase.asInstanceOf[js.Any])
    if (!js.isUndefined(nobrace)) __obj.updateDynamic("nobrace")(nobrace.asInstanceOf[js.Any])
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase.asInstanceOf[js.Any])
    if (!js.isUndefined(noext)) __obj.updateDynamic("noext")(noext.asInstanceOf[js.Any])
    if (!js.isUndefined(noglobstar)) __obj.updateDynamic("noglobstar")(noglobstar.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyDirectories)) __obj.updateDynamic("onlyDirectories")(onlyDirectories.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyFiles)) __obj.updateDynamic("onlyFiles")(onlyFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    if (!js.isUndefined(parents)) __obj.updateDynamic("parents")(parents.asInstanceOf[js.Any])
    if (rename != null) __obj.updateDynamic("rename")(rename.asInstanceOf[js.Any])
    if (!js.isUndefined(stats)) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

