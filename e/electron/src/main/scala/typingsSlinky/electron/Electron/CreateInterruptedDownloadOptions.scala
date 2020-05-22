package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInterruptedDownloadOptions extends js.Object {
  /**
    * ETag header value.
    */
  var eTag: String
  /**
    * Last-Modified header value.
    */
  var lastModified: String
  /**
    * Total length of the download.
    */
  var length: Double
  var mimeType: js.UndefOr[String] = js.undefined
  /**
    * Start range for the download.
    */
  var offset: Double
  /**
    * Absolute path of the download.
    */
  var path: String
  /**
    * Time when download was started in number of seconds since UNIX epoch.
    */
  var startTime: js.UndefOr[Double] = js.undefined
  /**
    * Complete URL chain for the download.
    */
  var urlChain: js.Array[String]
}

object CreateInterruptedDownloadOptions {
  @scala.inline
  def apply(
    eTag: String,
    lastModified: String,
    length: Double,
    offset: Double,
    path: String,
    urlChain: js.Array[String],
    mimeType: String = null,
    startTime: js.UndefOr[Double] = js.undefined
  ): CreateInterruptedDownloadOptions = {
    val __obj = js.Dynamic.literal(eTag = eTag.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], urlChain = urlChain.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (!js.isUndefined(startTime)) __obj.updateDynamic("startTime")(startTime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInterruptedDownloadOptions]
  }
}

