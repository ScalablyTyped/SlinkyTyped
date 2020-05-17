package typingsSlinky.readdirEnhanced.anon

import typingsSlinky.readdirEnhanced.readdirEnhancedBooleans.`true`
import typingsSlinky.readdirEnhanced.typesPublicMod.FilterFunction
import typingsSlinky.readdirEnhanced.typesPublicMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined readdir-enhanced.readdir-enhanced/lib/types-public.Options & {  stats  :true} */
@js.native
trait Optionsstatstrue extends js.Object {
  /**
    * The baase path to prefix results with.
    *
    * Defaults to an empty string, which means results will be relative to the directory path.
    */
  var basePath: js.UndefOr[String] = js.native
  /**
    * The depth to crawl. Can be `true` to crawl indefinitely, a number to crawl only to that
    * depth, or a filter (see the `filter` option) to crawl only directories that match the filter.
    *
    * Defaults to zero, which will not crawl subdirectories.
    */
  var deep: js.UndefOr[Boolean | Double | String | js.RegExp | FilterFunction] = js.native
  /**
    * Filter critiera. Can be a glob pattern, a regular expression, or a filter function.
    *
    * Defaults to returning all files.
    */
  var filter: js.UndefOr[Boolean | String | js.RegExp | FilterFunction] = js.native
  /**
    * Custom implementations of filesystem methods.
    *
    * Defaults to the Node "fs" module.
    */
  var fs: js.UndefOr[PartialFileSystem] = js.native
  /**
    * The path separator to use.
    *
    * Defaults to "\" on Windows and "/" on other platforms.
    */
  var sep: js.UndefOr[String] = js.native
  /**
    * Return `Stats` objects instead of just path strings.
    *
    * Defaults to `false`.
    */
  var stats: js.UndefOr[Boolean with `true`] = js.native
  /**
    * Alias for the `stats` option. This property is supported for compatibility with the Node.js
    * built-in `fs.readdir()` function.
    */
  var withFileTypes: js.UndefOr[Boolean] = js.native
}

object Optionsstatstrue {
  @scala.inline
  def apply(): Optionsstatstrue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Optionsstatstrue]
  }
  @scala.inline
  implicit class OptionsstatstrueOps[Self <: Optionsstatstrue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(js.undefined)
        ret
    }
    @scala.inline
    def withDeepFunction1(value: /* stat */ Stats => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeepRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeep(value: Boolean | Double | String | js.RegExp | FilterFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterFunction1(value: /* stat */ Stats => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilterRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: Boolean | String | js.RegExp | FilterFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFs(value: PartialFileSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(js.undefined)
        ret
    }
    @scala.inline
    def withSep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sep")(js.undefined)
        ret
    }
    @scala.inline
    def withStats(value: Boolean with `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(js.undefined)
        ret
    }
    @scala.inline
    def withWithFileTypes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withFileTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithFileTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withFileTypes")(js.undefined)
        ret
    }
  }
  
}

