package typingsSlinky.antd.esUploadInterfaceMod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFile extends js.Object {
  var error: js.UndefOr[js.Any] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var lastModified: js.UndefOr[Double] = js.undefined
  var lastModifiedDate: js.UndefOr[js.Date] = js.undefined
  var linkProps: js.UndefOr[js.Any] = js.undefined
  var name: String
  var originFileObj: js.UndefOr[File | Blob] = js.undefined
  var percent: js.UndefOr[Double] = js.undefined
  var response: js.UndefOr[js.Any] = js.undefined
  var size: Double
  var status: js.UndefOr[UploadFileStatus] = js.undefined
  var thumbUrl: js.UndefOr[String] = js.undefined
  var `type`: String
  var uid: String
  var url: js.UndefOr[String] = js.undefined
}

object UploadFile {
  @scala.inline
  def apply(
    name: String,
    size: Double,
    `type`: String,
    uid: String,
    error: js.Any = null,
    fileName: String = null,
    lastModified: Int | Double = null,
    lastModifiedDate: js.Date = null,
    linkProps: js.Any = null,
    originFileObj: File | Blob = null,
    percent: Int | Double = null,
    response: js.Any = null,
    status: UploadFileStatus = null,
    thumbUrl: String = null,
    url: String = null
  ): UploadFile = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    if (linkProps != null) __obj.updateDynamic("linkProps")(linkProps.asInstanceOf[js.Any])
    if (originFileObj != null) __obj.updateDynamic("originFileObj")(originFileObj.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (thumbUrl != null) __obj.updateDynamic("thumbUrl")(thumbUrl.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFile]
  }
}

