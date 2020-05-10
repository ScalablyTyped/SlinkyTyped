package typingsSlinky.expressMinify.ExpressMinifyInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressMinifyResponse extends js.Object {
  /**
    * Pass true to disable caching the response data, suitable for dynamic contents.
    */
  var _no_cache: Boolean = js.native
  /**
    * Pass true to disable minifying, suitable for already-minified contents.
    */
  var _no_minify: Boolean = js.native
  /**
    * Pass true to disable all kind of processing: no compiling, no minifying.
    */
  var _skip: Boolean = js.native
  /**
    * Pass an object to specify custom UglifyJS compressor options (pass false to skip).
    */
  var _uglifyCompress: js.Object | Boolean = js.native
  /**
    * Pass false to disable mangling names
    */
  var _uglifyMangle: Boolean = js.native
  /**
    * Pass an object if you wish to specify additional UglifyJS
    */
  var _uglifyOutput: js.Object = js.native
}

object ExpressMinifyResponse {
  @scala.inline
  def apply(
    _no_cache: Boolean,
    _no_minify: Boolean,
    _skip: Boolean,
    _uglifyCompress: js.Object | Boolean,
    _uglifyMangle: Boolean,
    _uglifyOutput: js.Object
  ): ExpressMinifyResponse = {
    val __obj = js.Dynamic.literal(_no_cache = _no_cache.asInstanceOf[js.Any], _no_minify = _no_minify.asInstanceOf[js.Any], _skip = _skip.asInstanceOf[js.Any], _uglifyCompress = _uglifyCompress.asInstanceOf[js.Any], _uglifyMangle = _uglifyMangle.asInstanceOf[js.Any], _uglifyOutput = _uglifyOutput.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressMinifyResponse]
  }
  @scala.inline
  implicit class ExpressMinifyResponseOps[Self <: ExpressMinifyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_no_cache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_no_cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_no_minify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_no_minify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_skip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_uglifyCompress(value: js.Object | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_uglifyCompress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_uglifyMangle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_uglifyMangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_uglifyOutput(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_uglifyOutput")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

