package typingsSlinky.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait SchemaGdataMedia extends js.Object {
  /**
    * gdata
    */
  var algorithm: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var bigstoreObjectRef: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var blobRef: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var blobstore2Info: js.UndefOr[SchemaGdataBlobstore2Info] = js.native
  /**
    * gdata
    */
  var compositeMedia: js.UndefOr[js.Array[SchemaGdataCompositeMedia]] = js.native
  /**
    * gdata
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var contentTypeInfo: js.UndefOr[SchemaGdataContentTypeInfo] = js.native
  /**
    * gdata
    */
  var cosmoBinaryReference: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var crc32cHash: js.UndefOr[Double] = js.native
  /**
    * gdata
    */
  var diffChecksumsResponse: js.UndefOr[SchemaGdataDiffChecksumsResponse] = js.native
  /**
    * gdata
    */
  var diffDownloadResponse: js.UndefOr[SchemaGdataDiffDownloadResponse] = js.native
  /**
    * gdata
    */
  var diffUploadRequest: js.UndefOr[SchemaGdataDiffUploadRequest] = js.native
  /**
    * gdata
    */
  var diffUploadResponse: js.UndefOr[SchemaGdataDiffUploadResponse] = js.native
  /**
    * gdata
    */
  var diffVersionResponse: js.UndefOr[SchemaGdataDiffVersionResponse] = js.native
  /**
    * gdata
    */
  var downloadParameters: js.UndefOr[SchemaGdataDownloadParameters] = js.native
  /**
    * gdata
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var hash: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var hashVerified: js.UndefOr[Boolean] = js.native
  /**
    * gdata
    */
  var `inline`: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var isPotentialRetry: js.UndefOr[Boolean] = js.native
  /**
    * gdata
    */
  var length: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var md5Hash: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var mediaId: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var objectId: js.UndefOr[SchemaGdataObjectId] = js.native
  /**
    * gdata
    */
  var path: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var referenceType: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var sha1Hash: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var sha256Hash: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var timestamp: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var token: js.UndefOr[String] = js.native
}

object SchemaGdataMedia {
  @scala.inline
  def apply(): SchemaGdataMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataMedia]
  }
  @scala.inline
  implicit class SchemaGdataMediaOps[Self <: SchemaGdataMedia] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withBigstoreObjectRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigstoreObjectRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBigstoreObjectRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigstoreObjectRef")(js.undefined)
        ret
    }
    @scala.inline
    def withBlobRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlobRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobRef")(js.undefined)
        ret
    }
    @scala.inline
    def withBlobstore2Info(value: SchemaGdataBlobstore2Info): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobstore2Info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlobstore2Info: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobstore2Info")(js.undefined)
        ret
    }
    @scala.inline
    def withCompositeMedia(value: js.Array[SchemaGdataCompositeMedia]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositeMedia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompositeMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositeMedia")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withContentTypeInfo(value: SchemaGdataContentTypeInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTypeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentTypeInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTypeInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withCosmoBinaryReference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cosmoBinaryReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCosmoBinaryReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cosmoBinaryReference")(js.undefined)
        ret
    }
    @scala.inline
    def withCrc32cHash(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crc32cHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrc32cHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crc32cHash")(js.undefined)
        ret
    }
    @scala.inline
    def withDiffChecksumsResponse(value: SchemaGdataDiffChecksumsResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffChecksumsResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiffChecksumsResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffChecksumsResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withDiffDownloadResponse(value: SchemaGdataDiffDownloadResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffDownloadResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiffDownloadResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffDownloadResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withDiffUploadRequest(value: SchemaGdataDiffUploadRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffUploadRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiffUploadRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffUploadRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withDiffUploadResponse(value: SchemaGdataDiffUploadResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffUploadResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiffUploadResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffUploadResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withDiffVersionResponse(value: SchemaGdataDiffVersionResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffVersionResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiffVersionResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffVersionResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadParameters(value: SchemaGdataDownloadParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadParameters")(js.undefined)
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
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withHashVerified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashVerified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashVerified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashVerified")(js.undefined)
        ret
    }
    @scala.inline
    def withInline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPotentialRetry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPotentialRetry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPotentialRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPotentialRetry")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withMd5Hash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5Hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMd5Hash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5Hash")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaId")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectId(value: SchemaGdataObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceType")(js.undefined)
        ret
    }
    @scala.inline
    def withSha1Hash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha1Hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSha1Hash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha1Hash")(js.undefined)
        ret
    }
    @scala.inline
    def withSha256Hash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256Hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSha256Hash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256Hash")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
  }
  
}

