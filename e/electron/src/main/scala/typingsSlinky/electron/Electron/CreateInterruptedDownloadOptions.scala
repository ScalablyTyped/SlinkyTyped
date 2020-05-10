package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInterruptedDownloadOptions extends js.Object {
  /**
    * ETag header value.
    */
  var eTag: String = js.native
  /**
    * Last-Modified header value.
    */
  var lastModified: String = js.native
  /**
    * Total length of the download.
    */
  var length: Double = js.native
  var mimeType: js.UndefOr[String] = js.native
  /**
    * Start range for the download.
    */
  var offset: Double = js.native
  /**
    * Absolute path of the download.
    */
  var path: String = js.native
  /**
    * Time when download was started in number of seconds since UNIX epoch.
    */
  var startTime: js.UndefOr[Double] = js.native
  /**
    * Complete URL chain for the download.
    */
  var urlChain: js.Array[String] = js.native
}

object CreateInterruptedDownloadOptions {
  @scala.inline
  def apply(
    eTag: String,
    lastModified: String,
    length: Double,
    offset: Double,
    path: String,
    urlChain: js.Array[String]
  ): CreateInterruptedDownloadOptions = {
    val __obj = js.Dynamic.literal(eTag = eTag.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], urlChain = urlChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInterruptedDownloadOptions]
  }
  @scala.inline
  implicit class CreateInterruptedDownloadOptionsOps[Self <: CreateInterruptedDownloadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withETag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModified(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrlChain(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlChain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
  }
  
}

