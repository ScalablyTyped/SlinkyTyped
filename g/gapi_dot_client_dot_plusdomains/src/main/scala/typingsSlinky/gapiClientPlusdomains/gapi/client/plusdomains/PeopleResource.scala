package typingsSlinky.gapiClientPlusdomains.gapi.client.plusdomains

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientPlusdomains.AnonOauthtoken
import typingsSlinky.gapiClientPlusdomains.AnonOrderBy
import typingsSlinky.gapiClientPlusdomains.AnonPageToken
import typingsSlinky.gapiClientPlusdomains.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeopleResource extends js.Object {
  /** Get a person's profile. */
  def get(request: AnonOauthtoken): Request_[Person] = js.native
  /** List all of the people in the specified collection. */
  def list(request: AnonOrderBy): Request_[PeopleFeed] = js.native
  /** List all of the people in the specified collection for a particular activity. */
  def listByActivity(request: AnonPageToken): Request_[PeopleFeed] = js.native
  /** List all of the people who are members of a circle. */
  def listByCircle(request: AnonQuotaUser): Request_[PeopleFeed] = js.native
}

object PeopleResource {
  @scala.inline
  def apply(
    get: AnonOauthtoken => Request_[Person],
    list: AnonOrderBy => Request_[PeopleFeed],
    listByActivity: AnonPageToken => Request_[PeopleFeed],
    listByCircle: AnonQuotaUser => Request_[PeopleFeed]
  ): PeopleResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listByActivity = js.Any.fromFunction1(listByActivity), listByCircle = js.Any.fromFunction1(listByCircle))
    __obj.asInstanceOf[PeopleResource]
  }
  @scala.inline
  implicit class PeopleResourceOps[Self <: PeopleResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonOauthtoken => Request_[Person]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonOrderBy => Request_[PeopleFeed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListByActivity(value: AnonPageToken => Request_[PeopleFeed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listByActivity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListByCircle(value: AnonQuotaUser => Request_[PeopleFeed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listByCircle")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

