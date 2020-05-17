package typingsSlinky.hapiHapi.anon

import typingsSlinky.hapiHapi.mod.RouteExtObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in @hapi/hapi.@hapi/hapi.RouteRequestExtType ]:? @hapi/hapi.@hapi/hapi.RouteExtObject | std.Array<@hapi/hapi.@hapi/hapi.RouteExtObject>} */
@js.native
trait keyinRouteRequestExtTypeR extends js.Object {
  var onCredentials: js.UndefOr[RouteExtObject | js.Array[RouteExtObject]] = js.native
  var onPostAuth: js.UndefOr[RouteExtObject | js.Array[RouteExtObject]] = js.native
  var onPostHandler: js.UndefOr[RouteExtObject | js.Array[RouteExtObject]] = js.native
  var onPreAuth: js.UndefOr[RouteExtObject | js.Array[RouteExtObject]] = js.native
  var onPreHandler: js.UndefOr[RouteExtObject | js.Array[RouteExtObject]] = js.native
  var onPreResponse: js.UndefOr[RouteExtObject | js.Array[RouteExtObject]] = js.native
}

object keyinRouteRequestExtTypeR {
  @scala.inline
  def apply(): keyinRouteRequestExtTypeR = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[keyinRouteRequestExtTypeR]
  }
  @scala.inline
  implicit class keyinRouteRequestExtTypeROps[Self <: keyinRouteRequestExtTypeR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnCredentials(value: RouteExtObject | js.Array[RouteExtObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPostAuth(value: RouteExtObject | js.Array[RouteExtObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPostAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPostAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPostAuth")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPostHandler(value: RouteExtObject | js.Array[RouteExtObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPostHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPostHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPostHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPreAuth(value: RouteExtObject | js.Array[RouteExtObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPreAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreAuth")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPreHandler(value: RouteExtObject | js.Array[RouteExtObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPreHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPreResponse(value: RouteExtObject | js.Array[RouteExtObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPreResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreResponse")(js.undefined)
        ret
    }
  }
  
}

