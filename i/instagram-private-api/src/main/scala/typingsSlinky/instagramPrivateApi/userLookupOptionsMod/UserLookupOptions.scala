package typingsSlinky.instagramPrivateApi.userLookupOptionsMod

import typingsSlinky.instagramPrivateApi.anon.Countrycode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserLookupOptions extends js.Object {
  var countryCodes: js.UndefOr[js.Array[Countrycode]] = js.native
  var directlySignIn: js.UndefOr[Boolean] = js.native
  var query: String = js.native
  var waterfallId: js.UndefOr[String] = js.native
}

object UserLookupOptions {
  @scala.inline
  def apply(query: String): UserLookupOptions = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserLookupOptions]
  }
  @scala.inline
  implicit class UserLookupOptionsOps[Self <: UserLookupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountryCodes(value: js.Array[Countrycode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCodes")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectlySignIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directlySignIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectlySignIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directlySignIn")(js.undefined)
        ret
    }
    @scala.inline
    def withWaterfallId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waterfallId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaterfallId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waterfallId")(js.undefined)
        ret
    }
  }
  
}

