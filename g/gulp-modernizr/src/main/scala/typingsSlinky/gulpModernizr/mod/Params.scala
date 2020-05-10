package typingsSlinky.gulpModernizr.mod

import typingsSlinky.gulpModernizr.AnonClassPrefix
import typingsSlinky.gulpModernizr.AnonSrc
import typingsSlinky.gulpModernizr.gulpModernizrBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Params extends js.Object {
  /**
    * Avoid unnecessary builds (see Caching section below)
    */
  var cache: js.UndefOr[Boolean] = js.native
  /**
    * By default, will crawl your project for references to Modernizr tests
    * Set to false to disable
    */
  var crawl: js.UndefOr[Boolean] = js.native
  /**
    * Have custom Modernizr tests? Add them here.
    */
  var customTests: js.UndefOr[js.Array[String]] = js.native
  /**
    * Path to save out the built file
    */
  var dest: js.UndefOr[String | `false`] = js.native
  /**
    * Path to the build you're using for development.
    */
  var devFile: js.UndefOr[String | `false`] = js.native
  /**
    * Useful for excluding any tests that this tool will match
    * e.g. you use .notification class for notification elements,
    * but don’t want the test for Notification API
    */
  var excludeTests: js.UndefOr[js.Array[String]] = js.native
  /**
    * By default, this task will crawl all *.js, *.css, *.scss files.
    */
  var files: js.UndefOr[AnonSrc] = js.native
  /**
    * Based on default settings on http://modernizr.com/download/
    */
  var options: js.UndefOr[AnonClassPrefix] = js.native
  /**
    * Define any tests you want to explicitly include
    */
  var tests: js.UndefOr[js.Array[String]] = js.native
  /**
    * By default, source is uglified before saving
    */
  var uglify: js.UndefOr[Boolean] = js.native
  /**
    * Set to true to pass in buffers via the "files" parameter below
    */
  var useBuffers: js.UndefOr[Boolean] = js.native
}

object Params {
  @scala.inline
  def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  @scala.inline
  implicit class ParamsOps[Self <: Params] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCrawl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crawl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrawl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crawl")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomTests(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomTests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customTests")(js.undefined)
        ret
    }
    @scala.inline
    def withDest(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dest")(js.undefined)
        ret
    }
    @scala.inline
    def withDevFile(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devFile")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeTests(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeTests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeTests")(js.undefined)
        ret
    }
    @scala.inline
    def withFiles(value: AnonSrc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: AnonClassPrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withTests(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tests")(js.undefined)
        ret
    }
    @scala.inline
    def withUglify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uglify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUglify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uglify")(js.undefined)
        ret
    }
    @scala.inline
    def withUseBuffers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBuffers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseBuffers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBuffers")(js.undefined)
        ret
    }
  }
  
}

