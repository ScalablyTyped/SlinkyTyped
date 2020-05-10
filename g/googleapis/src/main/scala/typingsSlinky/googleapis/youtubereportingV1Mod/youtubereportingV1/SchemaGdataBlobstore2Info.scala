package typingsSlinky.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait SchemaGdataBlobstore2Info extends js.Object {
  /**
    * gdata
    */
  var blobGeneration: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var blobId: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var downloadReadHandle: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var readToken: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var uploadMetadataContainer: js.UndefOr[String] = js.native
}

object SchemaGdataBlobstore2Info {
  @scala.inline
  def apply(): SchemaGdataBlobstore2Info = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataBlobstore2Info]
  }
  @scala.inline
  implicit class SchemaGdataBlobstore2InfoOps[Self <: SchemaGdataBlobstore2Info] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlobGeneration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobGeneration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlobGeneration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobGeneration")(js.undefined)
        ret
    }
    @scala.inline
    def withBlobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobId")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadReadHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadReadHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadReadHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadReadHandle")(js.undefined)
        ret
    }
    @scala.inline
    def withReadToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readToken")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadMetadataContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadMetadataContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadMetadataContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadMetadataContainer")(js.undefined)
        ret
    }
  }
  
}

