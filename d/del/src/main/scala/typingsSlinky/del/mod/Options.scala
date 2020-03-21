package typingsSlinky.del.mod

import typingsSlinky.fastGlob.entriesMod.EntryItem
import typingsSlinky.fastGlob.patternsMod.Pattern
import typingsSlinky.globby.mod.ExpandDirectoriesOption
import typingsSlinky.globby.mod.GlobbyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends GlobbyOptions {
  /**
  		Concurrency limit. Minimum: `1`.
  		@default Infinity
  		*/
  val concurrency: js.UndefOr[Double] = js.undefined
  /**
  		See what would be deleted.
  		@default false
  		@example
  		```
  		import del = require('del');
  		(async () => {
  			const deletedPaths = await del(['temp/ *.js'], {dryRun: true});
  			console.log('Files and directories that would be deleted:\n', deletedPaths.join('\n'));
  		})();
  		```
  		*/
  val dryRun: js.UndefOr[Boolean] = js.undefined
  /**
  		Allow deleting the current working directory and outside.
  		@default false
  		*/
  val force: js.UndefOr[Boolean] = js.undefined
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
    transform: /* entry */ EntryItem => EntryItem = null,
    unique: js.UndefOr[Boolean] = js.undefined
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
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(markDirectories)) __obj.updateDynamic("markDirectories")(markDirectories.asInstanceOf[js.Any])
    if (!js.isUndefined(matchBase)) __obj.updateDynamic("matchBase")(matchBase.asInstanceOf[js.Any])
    if (!js.isUndefined(nobrace)) __obj.updateDynamic("nobrace")(nobrace.asInstanceOf[js.Any])
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase.asInstanceOf[js.Any])
    if (!js.isUndefined(noext)) __obj.updateDynamic("noext")(noext.asInstanceOf[js.Any])
    if (!js.isUndefined(noglobstar)) __obj.updateDynamic("noglobstar")(noglobstar.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyDirectories)) __obj.updateDynamic("onlyDirectories")(onlyDirectories.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyFiles)) __obj.updateDynamic("onlyFiles")(onlyFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(stats)) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

