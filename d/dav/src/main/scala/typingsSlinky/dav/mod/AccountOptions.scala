package typingsSlinky.dav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined dav.dav.Partial<dav.dav.Account> */
@js.native
trait AccountOptions extends js.Object {
  var addressBooks: js.UndefOr[js.Array[AddressBook]] = js.native
  var calendars: js.UndefOr[js.Array[Calendar]] = js.native
  var constructor: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], js.Any]] = js.native
  var credentials: js.UndefOr[Credentials] = js.native
  var homeUrl: js.UndefOr[String] = js.native
  var principalUrl: js.UndefOr[String] = js.native
  var rootUrl: js.UndefOr[String] = js.native
  var server: js.UndefOr[String] = js.native
}

object AccountOptions {
  @scala.inline
  def apply(): AccountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountOptions]
  }
  @scala.inline
  implicit class AccountOptionsOps[Self <: AccountOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressBooks(value: js.Array[AddressBook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressBooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressBooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressBooks")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendars(value: js.Array[Calendar]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendars")(js.undefined)
        ret
    }
    @scala.inline
    def withConstructor(value: /* options */ js.UndefOr[AccountOptions] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutConstructor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentials(value: Credentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withHomeUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPrincipalUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principalUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipalUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principalUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRootUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withServer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(js.undefined)
        ret
    }
  }
  
}

