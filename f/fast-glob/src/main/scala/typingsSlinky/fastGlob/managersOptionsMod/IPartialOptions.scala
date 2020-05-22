package typingsSlinky.fastGlob.managersOptionsMod

import typingsSlinky.fastGlob.typesEntriesMod.EntryItem
import typingsSlinky.fastGlob.typesPatternsMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fast-glob.fast-glob/package/out/managers/options.IOptions<T>> */
trait IPartialOptions[T] extends js.Object {
  var absolute: js.UndefOr[Boolean] = js.undefined
  var brace: js.UndefOr[Boolean] = js.undefined
  var `case`: js.UndefOr[Boolean] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
  var deep: js.UndefOr[Double | Boolean] = js.undefined
  var dot: js.UndefOr[Boolean] = js.undefined
  var extension: js.UndefOr[Boolean] = js.undefined
  var followSymlinkedDirectories: js.UndefOr[Boolean] = js.undefined
  var globstar: js.UndefOr[Boolean] = js.undefined
  var ignore: js.UndefOr[js.Array[Pattern]] = js.undefined
  var markDirectories: js.UndefOr[Boolean] = js.undefined
  var matchBase: js.UndefOr[Boolean] = js.undefined
  var nobrace: js.UndefOr[Boolean] = js.undefined
  var nocase: js.UndefOr[Boolean] = js.undefined
  var noext: js.UndefOr[Boolean] = js.undefined
  var noglobstar: js.UndefOr[Boolean] = js.undefined
  var onlyDirectories: js.UndefOr[Boolean] = js.undefined
  var onlyFiles: js.UndefOr[Boolean] = js.undefined
  var stats: js.UndefOr[Boolean] = js.undefined
  var transform: js.UndefOr[TransformFunction[T]] = js.undefined
  var unique: js.UndefOr[Boolean] = js.undefined
}

object IPartialOptions {
  @scala.inline
  def apply[T](
    absolute: js.UndefOr[Boolean] = js.undefined,
    brace: js.UndefOr[Boolean] = js.undefined,
    `case`: js.UndefOr[Boolean] = js.undefined,
    cwd: String = null,
    deep: Double | Boolean = null,
    dot: js.UndefOr[Boolean] = js.undefined,
    extension: js.UndefOr[Boolean] = js.undefined,
    followSymlinkedDirectories: js.UndefOr[Boolean] = js.undefined,
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
    stats: js.UndefOr[Boolean] = js.undefined,
    transform: /* entry */ EntryItem => T = null,
    unique: js.UndefOr[Boolean] = js.undefined
  ): IPartialOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(brace)) __obj.updateDynamic("brace")(brace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`case`)) __obj.updateDynamic("case")(`case`.get.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (deep != null) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.get.asInstanceOf[js.Any])
    if (!js.isUndefined(extension)) __obj.updateDynamic("extension")(extension.get.asInstanceOf[js.Any])
    if (!js.isUndefined(followSymlinkedDirectories)) __obj.updateDynamic("followSymlinkedDirectories")(followSymlinkedDirectories.get.asInstanceOf[js.Any])
    if (!js.isUndefined(globstar)) __obj.updateDynamic("globstar")(globstar.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(markDirectories)) __obj.updateDynamic("markDirectories")(markDirectories.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchBase)) __obj.updateDynamic("matchBase")(matchBase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nobrace)) __obj.updateDynamic("nobrace")(nobrace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noext)) __obj.updateDynamic("noext")(noext.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noglobstar)) __obj.updateDynamic("noglobstar")(noglobstar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyDirectories)) __obj.updateDynamic("onlyDirectories")(onlyDirectories.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyFiles)) __obj.updateDynamic("onlyFiles")(onlyFiles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stats)) __obj.updateDynamic("stats")(stats.get.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPartialOptions[T]]
  }
}

