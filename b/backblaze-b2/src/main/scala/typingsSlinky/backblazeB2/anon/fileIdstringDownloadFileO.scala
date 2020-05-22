package typingsSlinky.backblazeB2.anon

import typingsSlinky.backblazeB2.backblazeB2Strings.arraybuffer
import typingsSlinky.backblazeB2.backblazeB2Strings.blob
import typingsSlinky.backblazeB2.backblazeB2Strings.document
import typingsSlinky.backblazeB2.backblazeB2Strings.json
import typingsSlinky.backblazeB2.backblazeB2Strings.stream
import typingsSlinky.backblazeB2.backblazeB2Strings.text
import typingsSlinky.backblazeB2.mod.UploadProgressFn
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  fileId  :string} & backblaze-b2.backblaze-b2.DownloadFileOpts */
trait fileIdstringDownloadFileO extends js.Object {
  var axios: js.UndefOr[Record[String, _]] = js.undefined
  var axiosOverride: js.UndefOr[Record[String, _]] = js.undefined
  var fileId: String
  var onDownloadProgress: js.UndefOr[UploadProgressFn | Null] = js.undefined
  var responseType: arraybuffer | blob | document | json | text | stream
}

object fileIdstringDownloadFileO {
  @scala.inline
  def apply(
    fileId: String,
    responseType: arraybuffer | blob | document | json | text | stream,
    axios: Record[String, _] = null,
    axiosOverride: Record[String, _] = null,
    onDownloadProgress: js.UndefOr[Null | (/* event */ js.Any => Unit)] = js.undefined
  ): fileIdstringDownloadFileO = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    if (axios != null) __obj.updateDynamic("axios")(axios.asInstanceOf[js.Any])
    if (axiosOverride != null) __obj.updateDynamic("axiosOverride")(axiosOverride.asInstanceOf[js.Any])
    if (!js.isUndefined(onDownloadProgress)) __obj.updateDynamic("onDownloadProgress")(if (onDownloadProgress != null) js.Any.fromFunction1(onDownloadProgress.asInstanceOf[/* event */ js.Any => Unit]) else null)
    __obj.asInstanceOf[fileIdstringDownloadFileO]
  }
}

