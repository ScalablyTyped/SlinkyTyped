package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAnalytics.anon.Maxresults
import typingsSlinky.gapiClientAnalytics.anon.Oauthtoken
import typingsSlinky.gapiClientAnalytics.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebpropertiesResource extends js.Object {
  /** Gets a web property to which the user has access. */
  def get(request: QuotaUser): Request[Webproperty] = js.native
  /**
    * Create a new property if the account has fewer than 20 properties. Web properties are visible in the Google Analytics interface only if they have at
    * least one profile.
    */
  def insert(request: Oauthtoken): Request[Webproperty] = js.native
  /** Lists web properties to which the user has access. */
  def list(request: Maxresults): Request[Webproperties] = js.native
  /** Updates an existing web property. This method supports patch semantics. */
  def patch(request: QuotaUser): Request[Webproperty] = js.native
  /** Updates an existing web property. */
  def update(request: QuotaUser): Request[Webproperty] = js.native
}

object WebpropertiesResource {
  @scala.inline
  def apply(
    get: QuotaUser => Request[Webproperty],
    insert: Oauthtoken => Request[Webproperty],
    list: Maxresults => Request[Webproperties],
    patch: QuotaUser => Request[Webproperty],
    update: QuotaUser => Request[Webproperty]
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
    def withGet(value: QuotaUser => Request[Webproperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Oauthtoken => Request[Webproperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Maxresults => Request[Webproperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: QuotaUser => Request[Webproperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: QuotaUser => Request[Webproperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

