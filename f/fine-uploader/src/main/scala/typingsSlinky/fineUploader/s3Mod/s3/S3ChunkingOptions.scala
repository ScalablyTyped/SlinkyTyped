package typingsSlinky.fineUploader.s3Mod.s3

import typingsSlinky.fineUploader.coreMod.ChunkingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ChunkingOptions extends ChunkingOptions {
  /**
    * The maximum size of each part, in bytes
    *
    * @default `5242880`
    */
  @JSName("partSize")
  var partSize_S3ChunkingOptions: js.UndefOr[Double] = js.native
}

object S3ChunkingOptions {
  @scala.inline
  def apply(): S3ChunkingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ChunkingOptions]
  }
  @scala.inline
  implicit class S3ChunkingOptionsOps[Self <: S3ChunkingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPartSize(value: Double): Self = {
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
  }
  
}

