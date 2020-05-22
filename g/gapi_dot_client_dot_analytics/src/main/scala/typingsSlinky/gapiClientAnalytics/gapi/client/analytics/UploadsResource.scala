package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAnalytics.anon.AccountIdAlt
import typingsSlinky.gapiClientAnalytics.anon.CustomDataSourceId
import typingsSlinky.gapiClientAnalytics.anon.UploadId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadsResource extends js.Object {
  /** Delete data associated with a previous upload. */
  def deleteUploadData(request: CustomDataSourceId): Request[Unit]
  /** List uploads to which the user has access. */
  def get(request: UploadId): Request[Upload]
  /** List uploads to which the user has access. */
  def list(request: AccountIdAlt): Request[Uploads]
  /** Upload data for a custom data source. */
  def uploadData(request: CustomDataSourceId): Request[Upload]
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
}

