package typingsSlinky.mapboxMapboxSdk.uploadsMod

import typingsSlinky.mapboxMapboxSdk.anon.MapId
import typingsSlinky.mapboxMapboxSdk.anon.Reverse
import typingsSlinky.mapboxMapboxSdk.anon.UploadId
import typingsSlinky.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadsService extends js.Object {
  /**
    * Create an upload.
    * @param config
    */
  def createUpload(config: MapId): MapiRequest = js.native
  /**
    * Create S3 credentials.
    */
  def createUploadCredentials(): MapiRequest = js.native
  /**
    * Delete an upload.
    * @param config
    */
  // implicit any
  def deleteUpload(config: UploadId): js.Any = js.native
  /**
    * Get an upload's status.
    * @param config
    */
  // implicit any
  def getUpload(config: UploadId): js.Any = js.native
  /**
    * List the statuses of all recent uploads.
    * @param config
    */
  def listUploads(config: Reverse): MapiRequest = js.native
}

object UploadsService {
  @scala.inline
  def apply(
    createUpload: MapId => MapiRequest,
    createUploadCredentials: () => MapiRequest,
    deleteUpload: UploadId => js.Any,
    getUpload: UploadId => js.Any,
    listUploads: Reverse => MapiRequest
  ): UploadsService = {
    val __obj = js.Dynamic.literal(createUpload = js.Any.fromFunction1(createUpload), createUploadCredentials = js.Any.fromFunction0(createUploadCredentials), deleteUpload = js.Any.fromFunction1(deleteUpload), getUpload = js.Any.fromFunction1(getUpload), listUploads = js.Any.fromFunction1(listUploads))
    __obj.asInstanceOf[UploadsService]
  }
  @scala.inline
  implicit class UploadsServiceOps[Self <: UploadsService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateUpload(value: MapId => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createUpload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateUploadCredentials(value: () => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createUploadCredentials")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeleteUpload(value: UploadId => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteUpload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetUpload(value: UploadId => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUpload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListUploads(value: Reverse => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listUploads")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

