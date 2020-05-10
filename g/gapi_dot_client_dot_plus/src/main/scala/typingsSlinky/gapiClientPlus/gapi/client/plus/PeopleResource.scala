package typingsSlinky.gapiClientPlus.gapi.client.plus

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientPlus.AnonCollection
import typingsSlinky.gapiClientPlus.AnonLanguage
import typingsSlinky.gapiClientPlus.AnonMaxResults
import typingsSlinky.gapiClientPlus.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeopleResource extends js.Object {
  /** Get a person's profile. If your app uses scope https://www.googleapis.com/auth/plus.login, this method is guaranteed to return ageRange and language. */
  def get(request: AnonOauthtoken): Request_[Person] = js.native
  /** List all of the people in the specified collection. */
  def list(request: AnonCollection): Request_[PeopleFeed] = js.native
  /** List all of the people in the specified collection for a particular activity. */
  def listByActivity(request: AnonMaxResults): Request_[PeopleFeed] = js.native
  /** Search all public profiles. */
  def search(request: AnonLanguage): Request_[PeopleFeed] = js.native
}

object PeopleResource {
  @scala.inline
  def apply(
    get: AnonOauthtoken => Request_[Person],
    list: AnonCollection => Request_[PeopleFeed],
    listByActivity: AnonMaxResults => Request_[PeopleFeed],
    search: AnonLanguage => Request_[PeopleFeed]
  ): PeopleResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listByActivity = js.Any.fromFunction1(listByActivity), search = js.Any.fromFunction1(search))
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
    def withList(value: AnonCollection => Request_[PeopleFeed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListByActivity(value: AnonMaxResults => Request_[PeopleFeed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listByActivity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSearch(value: AnonLanguage => Request_[PeopleFeed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

