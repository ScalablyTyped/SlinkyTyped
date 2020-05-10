package typingsSlinky.gulpGzip.mod

import typingsSlinky.node.zlibMod.ZlibOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Appends .gz file extension if true.
    * @default true
    */
  var append: js.UndefOr[Boolean] = js.native
  /**
    * Appends an arbitrary extension to the filename. Disables append and preExtension options.
    */
  var extension: js.UndefOr[String] = js.native
  /**
    * Options object to pass through to zlib.Gzip.
    * See <a href='https://nodejs.org/api/zlib.html#zlib_options'>zlib</a> documentation for more information.
    */
  var gzipOptions: js.UndefOr[ZlibOptions] = js.native
  /**
    * Appends an arbitrary pre-extension to the filename. Disables append and extension options.
    */
  var preExtension: js.UndefOr[String] = js.native
  /**
    * Minimum size required to compress a file.
    * @default false
    */
  var threshold: js.UndefOr[Double | String | Boolean] = js.native
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
    def withAppend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.undefined)
        ret
    }
    @scala.inline
    def withExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(js.undefined)
        ret
    }
    @scala.inline
    def withGzipOptions(value: ZlibOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gzipOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGzipOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gzipOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPreExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double | String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
  }
  
}

