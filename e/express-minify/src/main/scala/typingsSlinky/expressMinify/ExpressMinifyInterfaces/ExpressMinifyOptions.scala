package typingsSlinky.expressMinify.ExpressMinifyInterfaces

import typingsSlinky.node.NodeRequire
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressMinifyOptions extends js.Object {
  /**
    * The directory for cache storage (must be writeable). Pass false to cache in the memory (not recommended).
    */
  var cache: js.UndefOr[String | Boolean] = js.native
  /**
    * Matches CoffeeScript content-type.
    */
  var coffee_match: js.UndefOr[js.RegExp] = js.native
  /**
    * Matches CSS content-type.
    */
  var css_match: js.UndefOr[js.RegExp] = js.native
  /**
    * Customize cssmin instance (require('cssmin')).
    */
  var cssmin: js.UndefOr[NodeRequire] = js.native
  /**
    * Matches JavaScript content-type.
    */
  var js_match: js.UndefOr[js.RegExp] = js.native
  /**
    * Matches JSON content-type.
    */
  var json_match: js.UndefOr[js.RegExp] = js.native
  /**
    * Matches LESS content-type.
    */
  var less_match: js.UndefOr[js.RegExp] = js.native
  /**
    * Handle compiling errors or minifying errors. You can determine what to respond when facing such errors.
    */
  var onerror: js.UndefOr[js.Function] = js.native
  /**
    * Matches SASS content-type.
    */
  var sass_match: js.UndefOr[js.RegExp] = js.native
  /**
    * Matches Stylus content-type.
    */
  var stylus_match: js.UndefOr[js.RegExp] = js.native
  /**
    * Customize UglifyJS instance (require('uglify-js')).
    */
  var uglifyJS: js.UndefOr[NodeRequire] = js.native
}

object ExpressMinifyOptions {
  @scala.inline
  def apply(): ExpressMinifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpressMinifyOptions]
  }
  @scala.inline
  implicit class ExpressMinifyOptionsOps[Self <: ExpressMinifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: String | Boolean): Self = {
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
    def withCoffee_match(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coffee_match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoffee_match: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coffee_match")(js.undefined)
        ret
    }
    @scala.inline
    def withCss_match(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css_match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss_match: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css_match")(js.undefined)
        ret
    }
    @scala.inline
    def withCssmin(value: NodeRequire): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssmin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssmin")(js.undefined)
        ret
    }
    @scala.inline
    def withJs_match(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("js_match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJs_match: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("js_match")(js.undefined)
        ret
    }
    @scala.inline
    def withJson_match(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json_match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJson_match: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json_match")(js.undefined)
        ret
    }
    @scala.inline
    def withLess_match(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("less_match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLess_match: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("less_match")(js.undefined)
        ret
    }
    @scala.inline
    def withOnerror(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.undefined)
        ret
    }
    @scala.inline
    def withSass_match(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sass_match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSass_match: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sass_match")(js.undefined)
        ret
    }
    @scala.inline
    def withStylus_match(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylus_match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStylus_match: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylus_match")(js.undefined)
        ret
    }
    @scala.inline
    def withUglifyJS(value: NodeRequire): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uglifyJS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUglifyJS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uglifyJS")(js.undefined)
        ret
    }
  }
  
}

