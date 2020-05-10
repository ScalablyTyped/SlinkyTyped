package typingsSlinky.firebaseRemoteConfig.remoteConfigFetchClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchResponse extends js.Object {
  /**
    * Defines the map of parameters returned as "entries" in the fetch response body.
    *
    * <p>Only defined for 200 responses.
    */
  var config: js.UndefOr[FirebaseRemoteConfigObject] = js.native
  /**
    * Defines the ETag response header value.
    *
    * <p>Only defined for 200 and 304 responses.
    */
  var eTag: js.UndefOr[String] = js.native
  /**
    * The HTTP status, which is useful for differentiating success responses with data from
    * those without.
    *
    * <p>{@link RemoteConfigClient} is modeled after the native {@link GlobalFetch} interface, so
    * HTTP status is first-class.
    *
    * <p>Disambiguation: the fetch response returns a legacy "state" value that is redundant with the
    * HTTP status code. The former is normalized into the latter.
    */
  var status: Double = js.native
}

object FetchResponse {
  @scala.inline
  def apply(status: Double): FetchResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchResponse]
  }
  @scala.inline
  implicit class FetchResponseOps[Self <: FetchResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: FirebaseRemoteConfigObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withETag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutETag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eTag")(js.undefined)
        ret
    }
  }
  
}

