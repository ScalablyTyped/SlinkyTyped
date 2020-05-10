package typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceRepresentativesRepresentativeinfobyaddress extends StandardParameters {
  /**
    * The address to look up. May only be specified if the field ocdId is not
    * given in the URL.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Whether to return information about offices and officials. If false, only
    * the top-level district information will be returned.
    */
  var includeOffices: js.UndefOr[Boolean] = js.native
  /**
    * A list of office levels to filter by. Only offices that serve at least
    * one of these levels will be returned. Divisions that don't contain a
    * matching office will not be returned.
    */
  var levels: js.UndefOr[js.Array[String]] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRepresentativeInfoRequest] = js.native
  /**
    * A list of office roles to filter by. Only offices fulfilling one of these
    * roles will be returned. Divisions that don't contain a matching office
    * will not be returned.
    */
  var roles: js.UndefOr[js.Array[String]] = js.native
}

object ParamsResourceRepresentativesRepresentativeinfobyaddress {
  @scala.inline
  def apply(): ParamsResourceRepresentativesRepresentativeinfobyaddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRepresentativesRepresentativeinfobyaddress]
  }
  @scala.inline
  implicit class ParamsResourceRepresentativesRepresentativeinfobyaddressOps[Self <: ParamsResourceRepresentativesRepresentativeinfobyaddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeOffices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeOffices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeOffices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeOffices")(js.undefined)
        ret
    }
    @scala.inline
    def withLevels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestBody(value: SchemaRepresentativeInfoRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(js.undefined)
        ret
    }
    @scala.inline
    def withRoles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(js.undefined)
        ret
    }
  }
  
}

