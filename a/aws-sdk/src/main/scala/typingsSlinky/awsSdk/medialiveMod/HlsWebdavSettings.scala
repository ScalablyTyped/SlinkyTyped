package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsWebdavSettings extends js.Object {
  /**
    * Number of seconds to wait before retrying connection to the CDN if the connection is lost.
    */
  var ConnectionRetryInterval: js.UndefOr[integerMin0] = js.native
  /**
    * Size in seconds of file cache for streaming outputs.
    */
  var FilecacheDuration: js.UndefOr[integerMin0Max600] = js.native
  /**
    * Specify whether or not to use chunked transfer encoding to WebDAV.
    */
  var HttpTransferMode: js.UndefOr[HlsWebdavHttpTransferMode] = js.native
  /**
    * Number of retry attempts that will be made before the Live Event is put into an error state.
    */
  var NumRetries: js.UndefOr[integerMin0] = js.native
  /**
    * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never restart.
    */
  var RestartDelay: js.UndefOr[integerMin0Max15] = js.native
}

object HlsWebdavSettings {
  @scala.inline
  def apply(): HlsWebdavSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsWebdavSettings]
  }
  @scala.inline
  implicit class HlsWebdavSettingsOps[Self <: HlsWebdavSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionRetryInterval(value: integerMin0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionRetryInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionRetryInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionRetryInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withFilecacheDuration(value: integerMin0Max600): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilecacheDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilecacheDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilecacheDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpTransferMode(value: HlsWebdavHttpTransferMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpTransferMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpTransferMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpTransferMode")(js.undefined)
        ret
    }
    @scala.inline
    def withNumRetries(value: integerMin0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withRestartDelay(value: integerMin0Max15): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestartDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestartDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestartDelay")(js.undefined)
        ret
    }
  }
  
}

