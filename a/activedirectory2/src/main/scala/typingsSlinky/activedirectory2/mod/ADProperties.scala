package typingsSlinky.activedirectory2.mod

import typingsSlinky.activedirectory2.AnonEnabled
import typingsSlinky.activedirectory2.AnonGroup
import typingsSlinky.activedirectory2.activedirectory2Numbers.`1000`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ADProperties extends js.Object {
  var attributes: js.UndefOr[AnonGroup] = js.native
  var baseDN: String = js.native
  var entryParser: js.UndefOr[
    js.Function3[
      /* entry */ js.Object, 
      /* raw */ String, 
      /* cb */ js.Function1[/* entry */ js.Object, Unit], 
      Unit
    ]
  ] = js.native
  var pageSize: js.UndefOr[`1000`] = js.native
  var password: String = js.native
  var referrals: js.UndefOr[AnonEnabled] = js.native
  var url: String = js.native
  var username: String = js.native
}

object ADProperties {
  @scala.inline
  def apply(baseDN: String, password: String, url: String, username: String): ADProperties = {
    val __obj = js.Dynamic.literal(baseDN = baseDN.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADProperties]
  }
  @scala.inline
  implicit class ADPropertiesOps[Self <: ADProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseDN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: AnonGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withEntryParser(
      value: (/* entry */ js.Object, /* raw */ String, /* cb */ js.Function1[/* entry */ js.Object, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryParser")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutEntryParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryParser")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: `1000`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withReferrals(value: AnonEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferrals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrals")(js.undefined)
        ret
    }
  }
  
}

