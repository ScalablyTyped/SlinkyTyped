package typingsSlinky.naverWhale.whale.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadData extends js.Object {
  /** Optional. An ArrayBuffer with a copy of the data. */
  var bytes: js.UndefOr[scala.scalajs.js.typedarray.ArrayBuffer] = js.undefined
  /** Optional. A string with the file's path and name. */
  var file: js.UndefOr[String] = js.undefined
}

object UploadData {
  @scala.inline
  def apply(bytes: scala.scalajs.js.typedarray.ArrayBuffer = null, file: String = null): UploadData = {
    val __obj = js.Dynamic.literal()
    if (bytes != null) __obj.updateDynamic("bytes")(bytes.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadData]
  }
}

