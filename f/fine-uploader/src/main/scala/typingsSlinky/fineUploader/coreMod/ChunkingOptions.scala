package typingsSlinky.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChunkingOptions extends js.Object {
  /**
    * concurrent Chunking options
    */
  var concurrent: js.UndefOr[ConcurrentOptions] = js.native
  /**
    * Enable or disable splitting the file separate chunks. Each chunks is sent in a separate requested
    *
    * @default `false`
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Ensure every file is uploaded in chunks, even if the file can only be split up into 1 chunk.
    *
    * Does not apply if chunking is not possible in the current browser
    *
    * @default `false`
    */
  var mandatory: js.UndefOr[Boolean] = js.native
  /**
    * ParamNamesOptions
    */
  var paramNames: js.UndefOr[ParamNamesOptions] = js.native
  /**
    * The maximum size of each chunk, in bytes
    * If a function value is provided, the file's ID will be passed when invoking the function (which should only be called once per file)
    *
    * @default `2000000`
    */
  var partSize: js.UndefOr[Double | js.Function] = js.native
  /**
    * SuccessOptions
    */
  var success: js.UndefOr[SuccessOptions] = js.native
}

object ChunkingOptions {
  @scala.inline
  def apply(): ChunkingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkingOptions]
  }
  @scala.inline
  implicit class ChunkingOptionsOps[Self <: ChunkingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcurrent(value: ConcurrentOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrent")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMandatory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mandatory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMandatory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mandatory")(js.undefined)
        ret
    }
    @scala.inline
    def withParamNames(value: ParamNamesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramNames")(js.undefined)
        ret
    }
    @scala.inline
    def withPartSize(value: Double | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: SuccessOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

