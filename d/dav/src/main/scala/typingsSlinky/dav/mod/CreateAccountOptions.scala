package typingsSlinky.dav.mod

import typingsSlinky.dav.davStrings.caldav
import typingsSlinky.dav.davStrings.carddav
import typingsSlinky.dav.mod.transport.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccountOptions extends js.Object {
  /**
    * one of 'caldav' or 'carddav'. Defaults to 'caldav'.
    */
  var accountType: js.UndefOr[caldav | carddav] = js.native
  /**
    * list of caldav filters to send with request.
    */
  var filters: js.UndefOr[js.Array[js.Object]] = js.native
  /**
    *  whether or not to load dav collections.
    */
  var loadCollections: js.UndefOr[Boolean] = js.native
  /**
    * whether or not to load dav objects.
    */
  var loadObjects: js.UndefOr[Boolean] = js.native
  /**
    * request sandox.
    */
  var sandbox: js.UndefOr[Sandbox | js.Object] = js.native
  /**
    *  some url for server (needn't be base url).
    */
  var server: String = js.native
  /**
    * VTIMEZONE calendar object.
    */
  var timezone: js.UndefOr[String] = js.native
  /**
    * request sender.
    */
  var xhr: js.UndefOr[Transport] = js.native
}

object CreateAccountOptions {
  @scala.inline
  def apply(server: String): CreateAccountOptions = {
    val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccountOptions]
  }
  @scala.inline
  implicit class CreateAccountOptionsOps[Self <: CreateAccountOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccountType(value: caldav | carddav): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountType")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadCollections(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadCollections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadCollections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadCollections")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withSandbox(value: Sandbox | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSandbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(js.undefined)
        ret
    }
    @scala.inline
    def withXhr(value: Transport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXhr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhr")(js.undefined)
        ret
    }
  }
  
}

