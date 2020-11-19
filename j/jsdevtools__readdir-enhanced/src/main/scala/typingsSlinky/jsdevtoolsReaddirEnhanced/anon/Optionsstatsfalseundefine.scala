package typingsSlinky.jsdevtoolsReaddirEnhanced.anon

import typingsSlinky.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedBooleans.`false`
import typingsSlinky.jsdevtoolsReaddirEnhanced.typesPublicMod.FilterFunction
import typingsSlinky.jsdevtoolsReaddirEnhanced.typesPublicMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :false | undefined} */
@js.native
trait Optionsstatsfalseundefine extends js.Object {
  
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
  var stats: js.UndefOr[Boolean] with js.UndefOr[`false`] = js.native
  
  /**
    * Alias for the `stats` option. This property is supported for compatibility with the Node.js
    * built-in `fs.readdir()` function.
    */
  var withFileTypes: js.UndefOr[Boolean] = js.native
}
object Optionsstatsfalseundefine {
  
  @scala.inline
  def apply(stats: js.UndefOr[Boolean] with js.UndefOr[`false`]): Optionsstatsfalseundefine = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionsstatsfalseundefine]
  }
  
  @scala.inline
  implicit class OptionsstatsfalseundefineOps[Self <: Optionsstatsfalseundefine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStats(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = this.set("stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
    
    @scala.inline
    def setDeepFunction1(value: /* stat */ Stats => js.Any): Self = this.set("deep", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeepRegExp(value: js.RegExp): Self = this.set("deep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeep(value: Boolean | Double | String | js.RegExp | FilterFunction): Self = this.set("deep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeep: Self = this.set("deep", js.undefined)
    
    @scala.inline
    def setFilterFunction1(value: /* stat */ Stats => js.Any): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterRegExp(value: js.RegExp): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: Boolean | String | js.RegExp | FilterFunction): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFs(value: PartialFileSystem): Self = this.set("fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFs: Self = this.set("fs", js.undefined)
    
    @scala.inline
    def setSep(value: String): Self = this.set("sep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSep: Self = this.set("sep", js.undefined)
    
    @scala.inline
    def setWithFileTypes(value: Boolean): Self = this.set("withFileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithFileTypes: Self = this.set("withFileTypes", js.undefined)
  }
}
