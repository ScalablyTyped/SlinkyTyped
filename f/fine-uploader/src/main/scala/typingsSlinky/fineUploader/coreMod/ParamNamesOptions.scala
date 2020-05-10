package typingsSlinky.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamNamesOptions extends js.Object {
  /**
    * Name of the parameter passed with a chunked request that specifies the size in bytes of the associated chunk
    *
    * @default `'qqchunksize'`
    */
  var chunkSize: js.UndefOr[String] = js.native
  /**
    * Name of the parameter passed with a chunked request that specifies the starting byte of the associated chunk
    *
    * @default `'qqpartbyteoffset'`
    */
  var partByteOffset: js.UndefOr[String] = js.native
  /**
    * Name of the parameter passed with a chunked request that specifies the index of the associated partition
    *
    * @default `'qqpartindex'`
    */
  var partIndex: js.UndefOr[String] = js.native
  /**
    * Sent with the first request of the resume with a value of `true`
    *
    * @default `'qqresume'`
    */
  var resuming: js.UndefOr[String] = js.native
  /**
    * totalFileSize
    *
    * @default `'qqtotalfilesize'`
    */
  var totalFileSize: js.UndefOr[String] = js.native
  /**
    * Name of the parameter passed with a chunked request that specifies the total number of chunks associated with the `File` or `Blob`
    *
    * @default `'qqtotalparts'`
    */
  var totalParts: js.UndefOr[String] = js.native
}

object ParamNamesOptions {
  @scala.inline
  def apply(): ParamNamesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamNamesOptions]
  }
  @scala.inline
  implicit class ParamNamesOptionsOps[Self <: ParamNamesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunkSize(value: String): Self = {
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
    def withPartByteOffset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partByteOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartByteOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partByteOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withPartIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withResuming(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resuming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResuming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resuming")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalFileSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalFileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalFileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalParts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalParts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalParts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalParts")(js.undefined)
        ret
    }
  }
  
}

