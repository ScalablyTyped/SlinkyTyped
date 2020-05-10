package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAnalytics.AnonMaxresults
import typingsSlinky.gapiClientAnalytics.AnonOauthtoken
import typingsSlinky.gapiClientAnalytics.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebpropertiesResource extends js.Object {
  /** Gets a web property to which the user has access. */
  def get(request: AnonQuotaUser): Request_[Webproperty] = js.native
  /**
    * Create a new property if the account has fewer than 20 properties. Web properties are visible in the Google Analytics interface only if they have at
    * least one profile.
    */
  def insert(request: AnonOauthtoken): Request_[Webproperty] = js.native
  /** Lists web properties to which the user has access. */
  def list(request: AnonMaxresults): Request_[Webproperties] = js.native
  /** Updates an existing web property. This method supports patch semantics. */
  def patch(request: AnonQuotaUser): Request_[Webproperty] = js.native
  /** Updates an existing web property. */
  def update(request: AnonQuotaUser): Request_[Webproperty] = js.native
}

object WebpropertiesResource {
  @scala.inline
  def apply(
    get: AnonQuotaUser => Request_[Webproperty],
    insert: AnonOauthtoken => Request_[Webproperty],
    list: AnonMaxresults => Request_[Webproperties],
    patch: AnonQuotaUser => Request_[Webproperty],
    update: AnonQuotaUser => Request_[Webproperty]
  ): WebpropertiesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[WebpropertiesResource]
  }
  @scala.inline
  implicit class WebpropertiesResourceOps[Self <: WebpropertiesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonQuotaUser => Request_[Webproperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonOauthtoken => Request_[Webproperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonMaxresults => Request_[Webproperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonQuotaUser => Request_[Webproperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonQuotaUser => Request_[Webproperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

