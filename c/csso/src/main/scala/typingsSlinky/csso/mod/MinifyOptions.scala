package typingsSlinky.csso.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinifyOptions extends js.Object {
  /**
    * Called right after compress() is run.
    */
  var afterCompress: js.UndefOr[AfterCompressFn | js.Array[AfterCompressFn]] = js.native
  /**
    * Called right after parse is run.
    */
  var beforeCompress: js.UndefOr[BeforeCompressFn | js.Array[BeforeCompressFn]] = js.native
  /**
    * Output debug information to stderr.
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * Filename of input CSS, uses for source map generation.
    * @default '<unknown>'
    */
  var filename: js.UndefOr[String] = js.native
  var restructure: js.UndefOr[Boolean] = js.native
  /**
    * Generate a source map when true.
    * @default false
    */
  var sourceMap: js.UndefOr[Boolean] = js.native
}

object MinifyOptions {
  @scala.inline
  def apply(): MinifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinifyOptions]
  }
  @scala.inline
  implicit class MinifyOptionsOps[Self <: MinifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterCompressFunction2(value: (/* compressResult */ String, /* options */ CompressOptions) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCompress")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAfterCompress(value: AfterCompressFn | js.Array[AfterCompressFn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCompress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterCompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCompress")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeCompressFunction2(value: (/* ast */ js.Object, /* options */ CompressOptions) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCompress")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBeforeCompress(value: BeforeCompressFn | js.Array[BeforeCompressFn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCompress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeCompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCompress")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withRestructure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restructure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestructure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restructure")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(js.undefined)
        ret
    }
  }
  
}

