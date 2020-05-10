package typingsSlinky.authmosphere.oauthconfigMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantConfigBase extends js.Object {
  var accessTokenEndpoint: String = js.native
  var bodyParams: js.UndefOr[StringDictionary[String]] = js.native
  var grantType: String = js.native
  var queryParams: js.UndefOr[StringDictionary[String]] = js.native
  var scopes: js.UndefOr[js.Array[String]] = js.native
}

object GrantConfigBase {
  @scala.inline
  def apply(accessTokenEndpoint: String, grantType: String): GrantConfigBase = {
    val __obj = js.Dynamic.literal(accessTokenEndpoint = accessTokenEndpoint.asInstanceOf[js.Any], grantType = grantType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantConfigBase]
  }
  @scala.inline
  implicit class GrantConfigBaseOps[Self <: GrantConfigBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessTokenEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessTokenEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrantType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grantType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyParams(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyParams")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryParams(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(js.undefined)
        ret
    }
    @scala.inline
    def withScopes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(js.undefined)
        ret
    }
  }
  
}

