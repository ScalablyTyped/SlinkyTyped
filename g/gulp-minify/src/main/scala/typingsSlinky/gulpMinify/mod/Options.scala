package typingsSlinky.gulpMinify.mod

import typingsSlinky.gulpMinify.anon.Asciionly
import typingsSlinky.gulpMinify.anon.Booleans
import typingsSlinky.gulpMinify.anon.Min
import typingsSlinky.gulpMinify.gulpMinifyStrings.all
import typingsSlinky.gulpMinify.gulpMinifyStrings.some
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Pass an object to specify custom compressor options. Pass false to skip compression completely.
    */
  var compress: js.UndefOr[Booleans | Boolean] = js.native
  /**
    * Will not minify files in the dirs.
    */
  var exclude: js.UndefOr[js.Array[String]] = js.native
  /**
    * An object that specifies output src and minified file extensions.
    */
  var ext: js.UndefOr[Min] = js.native
  /**
    * Will not minify files which matches the pattern.
    */
  var ignoreFiles: js.UndefOr[js.Array[String]] = js.native
  /**
    * If true, will mangle variable names.
    */
  var mangle: js.UndefOr[Boolean] = js.native
  /**
    * If true, will not output the source code in the dest dirs.
    */
  var noSource: js.UndefOr[Boolean] = js.native
  /**
    * Pass an object if you wish to specify additional output options.The defaults are optimized for best compression.
    */
  var output: js.UndefOr[Asciionly] = js.native
  /**
    * A convenience option for options.output.comments. Defaults to preserving no comments.
    *
    * * **all**: Preserve all comments in code blocks.
    *
    * * **some**: preserve comments that start with a bang(!) or include a Closure Compiler directive(@preserve, @license, @cc_on).
    *
    * * **function**: specify your own comment preservation function. You will be passed the current node and the current comment and are expected to return a boolean.
    */
  var preserveComments: js.UndefOr[
    all | some | (js.Function2[/* node */ js.UndefOr[js.Any], /* comment */ js.UndefOr[js.Any], Boolean])
  ] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompress(value: Booleans | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withExt(value: Min): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withMangle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mangle")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSource(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSource")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: Asciionly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveCommentsFunction2(value: (/* node */ js.UndefOr[js.Any], /* comment */ js.UndefOr[js.Any]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveComments")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPreserveComments(
      value: all | some | (js.Function2[/* node */ js.UndefOr[js.Any], /* comment */ js.UndefOr[js.Any], Boolean])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveComments")(js.undefined)
        ret
    }
  }
  
}

