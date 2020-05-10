package typingsSlinky.oauth2Server.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface representing the client and associated data
  */
@js.native
trait Client
  extends /* key */ StringDictionary[js.Any] {
  var accessTokenLifetime: js.UndefOr[Double] = js.native
  var grants: String | js.Array[String] = js.native
  var id: String = js.native
  var redirectUris: js.UndefOr[String | js.Array[String]] = js.native
  var refreshTokenLifetime: js.UndefOr[Double] = js.native
}

object Client {
  @scala.inline
  def apply(grants: String | js.Array[String], id: String): Client = {
    val __obj = js.Dynamic.literal(grants = grants.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  @scala.inline
  implicit class ClientOps[Self <: Client] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrants(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessTokenLifetime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessTokenLifetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessTokenLifetime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessTokenLifetime")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectUris(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectUris: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUris")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshTokenLifetime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshTokenLifetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshTokenLifetime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshTokenLifetime")(js.undefined)
        ret
    }
  }
  
}

