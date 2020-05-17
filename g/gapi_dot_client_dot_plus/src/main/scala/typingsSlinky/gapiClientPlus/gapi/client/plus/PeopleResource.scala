package typingsSlinky.gapiClientPlus.gapi.client.plus

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientPlus.anon.Collection
import typingsSlinky.gapiClientPlus.anon.Language
import typingsSlinky.gapiClientPlus.anon.MaxResults
import typingsSlinky.gapiClientPlus.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeopleResource extends js.Object {
  /** Get a person's profile. If your app uses scope https://www.googleapis.com/auth/plus.login, this method is guaranteed to return ageRange and language. */
  def get(request: Oauthtoken): Request[Person] = js.native
  /** List all of the people in the specified collection. */
  def list(request: Collection): Request[PeopleFeed] = js.native
  /** List all of the people in the specified collection for a particular activity. */
  def listByActivity(request: MaxResults): Request[PeopleFeed] = js.native
  /** Search all public profiles. */
  def search(request: Language): Request[PeopleFeed] = js.native
}

object PeopleResource {
  @scala.inline
  def apply(
    get: Oauthtoken => Request[Person],
    list: Collection => Request[PeopleFeed],
    listByActivity: MaxResults => Request[PeopleFeed],
    search: Language => Request[PeopleFeed]
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
    def withGet(value: Oauthtoken => Request[Person]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Collection => Request[PeopleFeed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListByActivity(value: MaxResults => Request[PeopleFeed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listByActivity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSearch(value: Language => Request[PeopleFeed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

