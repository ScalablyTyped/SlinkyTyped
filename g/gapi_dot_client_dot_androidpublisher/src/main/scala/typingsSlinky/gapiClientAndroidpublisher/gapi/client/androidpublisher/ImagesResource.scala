package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidpublisher.AnonFields
import typingsSlinky.gapiClientAndroidpublisher.AnonImageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagesResource extends js.Object {
  /** Deletes the image (specified by id) from the edit. */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /** Deletes all images for the specified language and image type. */
  def deleteall(request: AnonImageType): Request_[ImagesDeleteAllResponse] = js.native
  /** Lists all images for the specified language and image type. */
  def list(request: AnonImageType): Request_[ImagesListResponse] = js.native
  /** Uploads a new image and adds it to the list of images for the specified language and image type. */
  def upload(request: AnonImageType): Request_[ImagesUploadResponse] = js.native
}

object ImagesResource {
  @scala.inline
  def apply(
    delete: AnonFields => Request_[Unit],
    deleteall: AnonImageType => Request_[ImagesDeleteAllResponse],
    list: AnonImageType => Request_[ImagesListResponse],
    upload: AnonImageType => Request_[ImagesUploadResponse]
  ): ImagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), deleteall = js.Any.fromFunction1(deleteall), list = js.Any.fromFunction1(list), upload = js.Any.fromFunction1(upload))
    __obj.asInstanceOf[ImagesResource]
  }
  @scala.inline
  implicit class ImagesResourceOps[Self <: ImagesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteall(value: AnonImageType => Request_[ImagesDeleteAllResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteall")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonImageType => Request_[ImagesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpload(value: AnonImageType => Request_[ImagesUploadResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

