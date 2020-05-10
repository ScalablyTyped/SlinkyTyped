package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAnalytics.AnonAccountIdAlt
import typingsSlinky.gapiClientAnalytics.AnonCustomDataSourceId
import typingsSlinky.gapiClientAnalytics.AnonUploadId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadsResource extends js.Object {
  /** Delete data associated with a previous upload. */
  def deleteUploadData(request: AnonCustomDataSourceId): Request_[Unit] = js.native
  /** List uploads to which the user has access. */
  def get(request: AnonUploadId): Request_[Upload] = js.native
  /** List uploads to which the user has access. */
  def list(request: AnonAccountIdAlt): Request_[Uploads] = js.native
  /** Upload data for a custom data source. */
  def uploadData(request: AnonCustomDataSourceId): Request_[Upload] = js.native
}

object UploadsResource {
  @scala.inline
  def apply(
    deleteUploadData: AnonCustomDataSourceId => Request_[Unit],
    get: AnonUploadId => Request_[Upload],
    list: AnonAccountIdAlt => Request_[Uploads],
    uploadData: AnonCustomDataSourceId => Request_[Upload]
  ): UploadsResource = {
    val __obj = js.Dynamic.literal(deleteUploadData = js.Any.fromFunction1(deleteUploadData), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), uploadData = js.Any.fromFunction1(uploadData))
    __obj.asInstanceOf[UploadsResource]
  }
  @scala.inline
  implicit class UploadsResourceOps[Self <: UploadsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteUploadData(value: AnonCustomDataSourceId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteUploadData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonUploadId => Request_[Upload]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAccountIdAlt => Request_[Uploads]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUploadData(value: AnonCustomDataSourceId => Request_[Upload]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadData")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

