package typingsSlinky.globby.mod

import typingsSlinky.fastGlob.entriesMod.EntryItem
import typingsSlinky.fastGlob.mod.Options
import typingsSlinky.fastGlob.patternsMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobbyOptions extends Options[EntryItem] {
  /**
  		If set to `true`, `globby` will automatically glob directories for you. If you define an `Array` it will only glob files that matches the patterns inside the `Array`. You can also define an `Object` with `files` and `extensions` like in the example below.
  		Note that if you set this option to `false`, you won't get back matched directories unless you set `onlyFiles: false`.
  		@default true
  		@example
  		```
  		import globby = require('globby');
  		(async () => {
  			const paths = await globby('images', {
  				expandDirectories: {
  					files: ['cat', 'unicorn', '*.jpg'],
  					extensions: ['png']
  				}
  			});
  			console.log(paths);
  			//=> ['cat.png', 'unicorn.png', 'cow.jpg', 'rainbow.jpg']
  		})();
  		```
  		*/
  val expandDirectories: js.UndefOr[ExpandDirectoriesOption] = js.undefined
  /**
  		Respect ignore patterns in `.gitignore` files that apply to the globbed files.
  		@default false
  		*/
  val gitignore: js.UndefOr[Boolean] = js.undefined
}

object GlobbyOptions {
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
    stats: js.UndefOr[Boolean] = js.undefined,
    transform: /* entry */ EntryItem => EntryItem = null,
    unique: js.UndefOr[Boolean] = js.undefined
  ): GlobbyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(brace)) __obj.updateDynamic("brace")(brace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`case`)) __obj.updateDynamic("case")(`case`.get.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (deep != null) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.get.asInstanceOf[js.Any])
    if (expandDirectories != null) __obj.updateDynamic("expandDirectories")(expandDirectories.asInstanceOf[js.Any])
    if (!js.isUndefined(extension)) __obj.updateDynamic("extension")(extension.get.asInstanceOf[js.Any])
    if (!js.isUndefined(followSymlinkedDirectories)) __obj.updateDynamic("followSymlinkedDirectories")(followSymlinkedDirectories.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gitignore)) __obj.updateDynamic("gitignore")(gitignore.get.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[GlobbyOptions]
  }
}

