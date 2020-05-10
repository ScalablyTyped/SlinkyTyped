package typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.Context

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUser extends js.Object {
  /**
    * The account acquisition date.
    */
  var accountAcquisitionDate: String = js.native
  /**
    * The account ID.
    */
  var accountId: String = js.native
  /**
    * The user agent string.
    */
  var agent: String = js.native
  /**
    * Authenticated user id
    */
  var authenticatedId: String = js.native
  /**
    * The telemetry configuration.
    */
  var config: js.Any = js.native
  /**
    * The user ID.
    */
  var id: String = js.native
  /**
    * The store region.
    */
  var storeRegion: String = js.native
}

object IUser {
  @scala.inline
  def apply(
    accountAcquisitionDate: String,
    accountId: String,
    agent: String,
    authenticatedId: String,
    config: js.Any,
    id: String,
    storeRegion: String
  ): IUser = {
    val __obj = js.Dynamic.literal(accountAcquisitionDate = accountAcquisitionDate.asInstanceOf[js.Any], accountId = accountId.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], authenticatedId = authenticatedId.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], storeRegion = storeRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUser]
  }
  @scala.inline
  implicit class IUserOps[Self <: IUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountAcquisitionDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountAcquisitionDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthenticatedId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticatedId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoreRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeRegion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

