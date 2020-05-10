package typingsSlinky.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionPolicy extends js.Object {
  /**
    * Flag to disable SSL verification for the requests.
    *
    * SSL verification is enabled by default. Don't set this when targeting production endpoints.
    *
    * This is intended to be used only when targeting emulator endpoint to avoid failing your requests with SSL related error.
    */
  var DisableSSLVerification: Boolean = js.native
  /** Flag to enable/disable automatic redirecting of requests based on read/write operations. */
  var EnableEndpointDiscovery: Boolean = js.native
  /** Attachment content (aka media) download mode.  */
  var MediaReadMode: typingsSlinky.documentdb.mod.MediaReadMode = js.native
  /** Time to wait for response from network peer for attachment content (aka media) operations. Represented in milliseconds. */
  var MediaRequestTimeout: Double = js.native
  /** List of azure regions to be used as preferred locations for read requests. */
  var PreferredLocations: js.Array[_] = js.native
  /** Request timeout (time to wait for response from network peer). Represented in milliseconds. */
  var RequestTimeout: Double = js.native
  /** RetryOptions instance which defines several configurable properties used during retry. */
  var RetryOptions: typingsSlinky.documentdb.mod.RetryOptions = js.native
}

object ConnectionPolicy {
  @scala.inline
  def apply(
    DisableSSLVerification: Boolean,
    EnableEndpointDiscovery: Boolean,
    MediaReadMode: MediaReadMode,
    MediaRequestTimeout: Double,
    PreferredLocations: js.Array[_],
    RequestTimeout: Double,
    RetryOptions: RetryOptions
  ): ConnectionPolicy = {
    val __obj = js.Dynamic.literal(DisableSSLVerification = DisableSSLVerification.asInstanceOf[js.Any], EnableEndpointDiscovery = EnableEndpointDiscovery.asInstanceOf[js.Any], MediaReadMode = MediaReadMode.asInstanceOf[js.Any], MediaRequestTimeout = MediaRequestTimeout.asInstanceOf[js.Any], PreferredLocations = PreferredLocations.asInstanceOf[js.Any], RequestTimeout = RequestTimeout.asInstanceOf[js.Any], RetryOptions = RetryOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionPolicy]
  }
  @scala.inline
  implicit class ConnectionPolicyOps[Self <: ConnectionPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableSSLVerification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableSSLVerification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableEndpointDiscovery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableEndpointDiscovery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaReadMode(value: MediaReadMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaReadMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaRequestTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaRequestTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreferredLocations(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetryOptions(value: RetryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetryOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

