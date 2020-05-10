package typingsSlinky.hapi.mod

import typingsSlinky.hapi.AnonAccess
import typingsSlinky.hapi.mod.Util.HTTP_METHODS_PARTIAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestRoute extends js.Object {
  var auth: AnonAccess = js.native
  /** the route internal normalized string representing the normalized path. */
  var fingerprint: String = js.native
  /** the route HTTP method. */
  var method: HTTP_METHODS_PARTIAL = js.native
  /** the route path. */
  var path: String = js.native
  /** the active realm associated with the route. */
  var realm: ServerRealm = js.native
  /** the route options object with all defaults applied. */
  var settings: RouteOptions = js.native
  /** the route vhost option if configured. */
  var vhost: js.UndefOr[String | js.Array[String]] = js.native
}

object RequestRoute {
  @scala.inline
  def apply(
    auth: AnonAccess,
    fingerprint: String,
    method: HTTP_METHODS_PARTIAL,
    path: String,
    realm: ServerRealm,
    settings: RouteOptions
  ): RequestRoute = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestRoute]
  }
  @scala.inline
  implicit class RequestRouteOps[Self <: RequestRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: AnonAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: HTTP_METHODS_PARTIAL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRealm(value: ServerRealm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettings(value: RouteOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVhost(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vhost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVhost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vhost")(js.undefined)
        ret
    }
  }
  
}

