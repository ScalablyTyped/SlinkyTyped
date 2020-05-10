package typingsSlinky.globby.mod

import typingsSlinky.fastGlob.entriesMod.EntryItem
import typingsSlinky.fastGlob.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  val expandDirectories: js.UndefOr[ExpandDirectoriesOption] = js.native
  /**
  		Respect ignore patterns in `.gitignore` files that apply to the globbed files.
  		@default false
  		*/
  val gitignore: js.UndefOr[Boolean] = js.native
}

object GlobbyOptions {
  @scala.inline
  def apply(): GlobbyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobbyOptions]
  }
  @scala.inline
  implicit class GlobbyOptionsOps[Self <: GlobbyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpandDirectories(value: ExpandDirectoriesOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandDirectories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandDirectories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandDirectories")(js.undefined)
        ret
    }
    @scala.inline
    def withGitignore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGitignore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitignore")(js.undefined)
        ret
    }
  }
  
}

