package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAnalytics.anon.AccountIdAlt
import typingsSlinky.gapiClientAnalytics.anon.CustomDataSourceId
import typingsSlinky.gapiClientAnalytics.anon.UploadId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadsResource extends js.Object {
  /** Delete data associated with a previous upload. */
  def deleteUploadData(request: CustomDataSourceId): Request[Unit] = js.native
  /** List uploads to which the user has access. */
  def get(request: UploadId): Request[Upload] = js.native
  /** List uploads to which the user has access. */
  def list(request: AccountIdAlt): Request[Uploads] = js.native
  /** Upload data for a custom data source. */
  def uploadData(request: CustomDataSourceId): Request[Upload] = js.native
}

object UploadsResource {
  @scala.inline
  def apply(
    deleteUploadData: CustomDataSourceId => Request[Unit],
    get: UploadId => Request[Upload],
    list: AccountIdAlt => Request[Uploads],
    uploadData: CustomDataSourceId => Request[Upload]
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
    def withDeleteUploadData(value: CustomDataSourceId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteUploadData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: UploadId => Request[Upload]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AccountIdAlt => Request[Uploads]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUploadData(value: CustomDataSourceId => Request[Upload]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadData")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

