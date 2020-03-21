package typingsSlinky.rollupPluginDelete.mod

import typingsSlinky.fastGlob.entriesMod.EntryItem
import typingsSlinky.fastGlob.patternsMod.Pattern
import typingsSlinky.globby.mod.ExpandDirectoriesOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typingsSlinky.del.mod.Options {
  /**
    * Rollup hook the plugin should use.
    * @default 'buildStart'
    */
  val hook: js.UndefOr[String] = js.undefined
  /**
    * Delete items once. Useful in watch mode.
    * @default false
    */
  val runOnce: js.UndefOr[Boolean] = js.undefined
  /**
    * Patterns of files and folders to be deleted.
    * @default []
    */
  val targets: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Outputs removed files and folders to console.
    * @default false
    */
  val verbose: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    absolute: js.UndefOr[Boolean] = js.undefined,
    brace: js.UndefOr[Boolean] = js.undefined,
    `case`: js.UndefOr[Boolean] = js.undefined,
    concurrency: Int | Double = null,
    cwd: String = null,
    deep: Double | Boolean = null,
    dot: js.UndefOr[Boolean] = js.undefined,
    dryRun: js.UndefOr[Boolean] = js.undefined,
    expandDirectories: ExpandDirectoriesOption = null,
    extension: js.UndefOr[Boolean] = js.undefined,
    followSymlinkedDirectories: js.UndefOr[Boolean] = js.undefined,
    force: js.UndefOr[Boolean] = js.undefined,
    gitignore: js.UndefOr[Boolean] = js.undefined,
    globstar: js.UndefOr[Boolean] = js.undefined,
    hook: String = null,
    ignore: js.Array[Pattern] = null,
    markDirectories: js.UndefOr[Boolean] = js.undefined,
    matchBase: js.UndefOr[Boolean] = js.undefined,
    nobrace: js.UndefOr[Boolean] = js.undefined,
    nocase: js.UndefOr[Boolean] = js.undefined,
    noext: js.UndefOr[Boolean] = js.undefined,
    noglobstar: js.UndefOr[Boolean] = js.undefined,
    onlyDirectories: js.UndefOr[Boolean] = js.undefined,
    onlyFiles: js.UndefOr[Boolean] = js.undefined,
    runOnce: js.UndefOr[Boolean] = js.undefined,
    stats: js.UndefOr[Boolean] = js.undefined,
    targets: String | js.Array[String] = null,
    transform: /* entry */ EntryItem => EntryItem = null,
    unique: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute.asInstanceOf[js.Any])
    if (!js.isUndefined(brace)) __obj.updateDynamic("brace")(brace.asInstanceOf[js.Any])
    if (!js.isUndefined(`case`)) __obj.updateDynamic("case")(`case`.asInstanceOf[js.Any])
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (deep != null) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.asInstanceOf[js.Any])
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun.asInstanceOf[js.Any])
    if (expandDirectories != null) __obj.updateDynamic("expandDirectories")(expandDirectories.asInstanceOf[js.Any])
    if (!js.isUndefined(extension)) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (!js.isUndefined(followSymlinkedDirectories)) __obj.updateDynamic("followSymlinkedDirectories")(followSymlinkedDirectories.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (!js.isUndefined(gitignore)) __obj.updateDynamic("gitignore")(gitignore.asInstanceOf[js.Any])
    if (!js.isUndefined(globstar)) __obj.updateDynamic("globstar")(globstar.asInstanceOf[js.Any])
    if (hook != null) __obj.updateDynamic("hook")(hook.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(markDirectories)) __obj.updateDynamic("markDirectories")(markDirectories.asInstanceOf[js.Any])
    if (!js.isUndefined(matchBase)) __obj.updateDynamic("matchBase")(matchBase.asInstanceOf[js.Any])
    if (!js.isUndefined(nobrace)) __obj.updateDynamic("nobrace")(nobrace.asInstanceOf[js.Any])
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase.asInstanceOf[js.Any])
    if (!js.isUndefined(noext)) __obj.updateDynamic("noext")(noext.asInstanceOf[js.Any])
    if (!js.isUndefined(noglobstar)) __obj.updateDynamic("noglobstar")(noglobstar.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyDirectories)) __obj.updateDynamic("onlyDirectories")(onlyDirectories.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyFiles)) __obj.updateDynamic("onlyFiles")(onlyFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(runOnce)) __obj.updateDynamic("runOnce")(runOnce.asInstanceOf[js.Any])
    if (!js.isUndefined(stats)) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

