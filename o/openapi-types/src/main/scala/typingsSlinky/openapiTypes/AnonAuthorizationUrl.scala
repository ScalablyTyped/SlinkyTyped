package typingsSlinky.openapiTypes

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAuthorizationUrl extends js.Object {
  var authorizationUrl: String = js.native
  var refreshUrl: js.UndefOr[String] = js.native
  var scopes: StringDictionary[String] = js.native
}

object AnonAuthorizationUrl {
  @scala.inline
  def apply(authorizationUrl: String, scopes: StringDictionary[String]): AnonAuthorizationUrl = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthorizationUrl]
  }
  @scala.inline
  implicit class AnonAuthorizationUrlOps[Self <: AnonAuthorizationUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopes(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshUrl")(js.undefined)
        ret
    }
  }
  
}

