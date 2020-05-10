package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAnalytics.AnonPrettyPrint
import typingsSlinky.gapiClientAnalytics.AnonQuotaUser
import typingsSlinky.gapiClientAnalytics.AnonWebPropertyAdWordsLinkId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPropertyAdWordsLinksResource extends js.Object {
  /** Deletes a web property-AdWords link. */
  def delete(request: AnonWebPropertyAdWordsLinkId): Request_[Unit] = js.native
  /** Returns a web property-AdWords link to which the user has access. */
  def get(request: AnonWebPropertyAdWordsLinkId): Request_[EntityAdWordsLink] = js.native
  /** Creates a webProperty-AdWords link. */
  def insert(request: AnonQuotaUser): Request_[EntityAdWordsLink] = js.native
  /** Lists webProperty-AdWords links for a given web property. */
  def list(request: AnonPrettyPrint): Request_[EntityAdWordsLinks] = js.native
  /** Updates an existing webProperty-AdWords link. This method supports patch semantics. */
  def patch(request: AnonWebPropertyAdWordsLinkId): Request_[EntityAdWordsLink] = js.native
  /** Updates an existing webProperty-AdWords link. */
  def update(request: AnonWebPropertyAdWordsLinkId): Request_[EntityAdWordsLink] = js.native
}

object WebPropertyAdWordsLinksResource {
  @scala.inline
  def apply(
    delete: AnonWebPropertyAdWordsLinkId => Request_[Unit],
    get: AnonWebPropertyAdWordsLinkId => Request_[EntityAdWordsLink],
    insert: AnonQuotaUser => Request_[EntityAdWordsLink],
    list: AnonPrettyPrint => Request_[EntityAdWordsLinks],
    patch: AnonWebPropertyAdWordsLinkId => Request_[EntityAdWordsLink],
    update: AnonWebPropertyAdWordsLinkId => Request_[EntityAdWordsLink]
  ): WebPropertyAdWordsLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[WebPropertyAdWordsLinksResource]
  }
  @scala.inline
  implicit class WebPropertyAdWordsLinksResourceOps[Self <: WebPropertyAdWordsLinksResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonWebPropertyAdWordsLinkId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonWebPropertyAdWordsLinkId => Request_[EntityAdWordsLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonQuotaUser => Request_[EntityAdWordsLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonPrettyPrint => Request_[EntityAdWordsLinks]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonWebPropertyAdWordsLinkId => Request_[EntityAdWordsLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonWebPropertyAdWordsLinkId => Request_[EntityAdWordsLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

