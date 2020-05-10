package typingsSlinky.node.zlibMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrotliOptions extends js.Object {
  /**
    * @default 16*1024
    */
  var chunkSize: js.UndefOr[Double] = js.native
  /**
    * @default constants.BROTLI_OPERATION_FINISH
    */
  var finishFlush: js.UndefOr[Double] = js.native
  /**
    * @default constants.BROTLI_OPERATION_PROCESS
    */
  var flush: js.UndefOr[Double] = js.native
  var params: js.UndefOr[
    /**
    * Each key is a `constants.BROTLI_*` constant.
    */
  NumberDictionary[Boolean | Double]
  ] = js.native
}

object BrotliOptions {
  @scala.inline
  def apply(): BrotliOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrotliOptions]
  }
  @scala.inline
  implicit class BrotliOptionsOps[Self <: BrotliOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunkSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFinishFlush(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishFlush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinishFlush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishFlush")(js.undefined)
        ret
    }
    @scala.inline
    def withFlush(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(
      value: /**
      * Each key is a `constants.BROTLI_*` constant.
      */
    NumberDictionary[Boolean | Double]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
  }
  
}

