package typingsSlinky.gulpUglify.mod

import typingsSlinky.uglifyJs.mod.CompressOptions
import typingsSlinky.uglifyJs.mod.MangleOptions
import typingsSlinky.uglifyJs.mod.OutputOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Pass an object to specify custom compressor options. Pass false to skip compression completely.
    */
  var compress: js.UndefOr[CompressOptions | Boolean] = js.native
  /**
    * Pass false to skip mangling names.
    */
  var mangle: js.UndefOr[MangleOptions | Boolean] = js.native
  /**
    * Pass if you wish to specify additional output options. The defaults are optimized for best compression.
    */
  var output: js.UndefOr[OutputOptions] = js.native
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
    def withCompress(value: CompressOptions | Boolean): Self = {
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
    def withMangle(value: MangleOptions | Boolean): Self = {
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
    def withOutput(value: OutputOptions): Self = {
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
  }
  
}

