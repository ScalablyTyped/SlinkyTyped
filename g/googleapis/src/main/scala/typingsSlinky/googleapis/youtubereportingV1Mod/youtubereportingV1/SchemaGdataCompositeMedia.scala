package typingsSlinky.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait SchemaGdataCompositeMedia extends js.Object {
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
  var cosmoBinaryReference: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var crc32cHash: js.UndefOr[Double] = js.native
  /**
    * gdata
    */
  var `inline`: js.UndefOr[String] = js.native
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
}

object SchemaGdataCompositeMedia {
  @scala.inline
  def apply(): SchemaGdataCompositeMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataCompositeMedia]
  }
  @scala.inline
  implicit class SchemaGdataCompositeMediaOps[Self <: SchemaGdataCompositeMedia] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

