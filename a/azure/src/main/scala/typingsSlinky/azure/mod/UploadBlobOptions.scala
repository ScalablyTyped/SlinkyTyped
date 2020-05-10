package typingsSlinky.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadBlobOptions extends SetBlobPropertiesOptions {
  var metadata: js.UndefOr[StorageMetadata] = js.native
  var parallelOperationThreadCount: js.UndefOr[Double] = js.native
  var speedSummary: js.UndefOr[SpeedSummary] = js.native
  var storeBlobContentMD5: js.UndefOr[Boolean] = js.native
  var useTransactionalMD5: js.UndefOr[Boolean] = js.native
}

object UploadBlobOptions {
  @scala.inline
  def apply(): UploadBlobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadBlobOptions]
  }
  @scala.inline
  implicit class UploadBlobOptionsOps[Self <: UploadBlobOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadata(value: StorageMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withParallelOperationThreadCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelOperationThreadCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelOperationThreadCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelOperationThreadCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeedSummary(value: SpeedSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeedSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreBlobContentMD5(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeBlobContentMD5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreBlobContentMD5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeBlobContentMD5")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTransactionalMD5(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTransactionalMD5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTransactionalMD5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTransactionalMD5")(js.undefined)
        ret
    }
  }
  
}

