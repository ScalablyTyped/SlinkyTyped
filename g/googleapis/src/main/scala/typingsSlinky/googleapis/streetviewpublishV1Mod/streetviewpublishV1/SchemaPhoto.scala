package typingsSlinky.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Photo is used to store 360 photos along with photo metadata.
  */
@js.native
trait SchemaPhoto extends js.Object {
  /**
    * Absolute time when the photo was captured. When the photo has no exif
    * timestamp, this is used to set a timestamp in the photo metadata.
    */
  var captureTime: js.UndefOr[String] = js.native
  /**
    * Connections to other photos. A connection represents the link from this
    * photo to another photo.
    */
  var connections: js.UndefOr[js.Array[SchemaConnection]] = js.native
  /**
    * Output only. The download URL for the photo bytes. This field is set only
    * when GetPhotoRequest.view is set to PhotoView.INCLUDE_DOWNLOAD_URL.
    */
  var downloadUrl: js.UndefOr[String] = js.native
  /**
    * Output only. Status in Google Maps, whether this photo was published or
    * rejected.
    */
  var mapsPublishStatus: js.UndefOr[String] = js.native
  /**
    * Required when updating a photo. Output only when creating a photo.
    * Identifier for the photo, which is unique among all photos in Google.
    */
  var photoId: js.UndefOr[SchemaPhotoId] = js.native
  /**
    * Places where this photo belongs.
    */
  var places: js.UndefOr[js.Array[SchemaPlace]] = js.native
  /**
    * Pose of the photo.
    */
  var pose: js.UndefOr[SchemaPose] = js.native
  /**
    * Output only. The share link for the photo.
    */
  var shareLink: js.UndefOr[String] = js.native
  /**
    * Output only. The thumbnail URL for showing a preview of the given photo.
    */
  var thumbnailUrl: js.UndefOr[String] = js.native
  /**
    * Output only. Status of rights transfer on this photo.
    */
  var transferStatus: js.UndefOr[String] = js.native
  /**
    * Required when creating a photo. Input only. The resource URL where the
    * photo bytes are uploaded to.
    */
  var uploadReference: js.UndefOr[SchemaUploadRef] = js.native
  /**
    * Output only. View count of the photo.
    */
  var viewCount: js.UndefOr[String] = js.native
}

object SchemaPhoto {
  @scala.inline
  def apply(): SchemaPhoto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPhoto]
  }
  @scala.inline
  implicit class SchemaPhotoOps[Self <: SchemaPhoto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptureTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureTime")(js.undefined)
        ret
    }
    @scala.inline
    def withConnections(value: js.Array[SchemaConnection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connections")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withMapsPublishStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapsPublishStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapsPublishStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapsPublishStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withPhotoId(value: SchemaPhotoId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhotoId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoId")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaces(value: js.Array[SchemaPlace]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("places")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("places")(js.undefined)
        ret
    }
    @scala.inline
    def withPose(value: SchemaPose): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pose")(js.undefined)
        ret
    }
    @scala.inline
    def withShareLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareLink")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTransferStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadReference(value: SchemaUploadRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadReference")(js.undefined)
        ret
    }
    @scala.inline
    def withViewCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewCount")(js.undefined)
        ret
    }
  }
  
}

