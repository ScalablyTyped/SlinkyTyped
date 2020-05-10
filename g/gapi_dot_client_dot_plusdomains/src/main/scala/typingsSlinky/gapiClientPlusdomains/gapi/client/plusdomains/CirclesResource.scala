package typingsSlinky.gapiClientPlusdomains.gapi.client.plusdomains

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientPlusdomains.AnonCircleId
import typingsSlinky.gapiClientPlusdomains.AnonFields
import typingsSlinky.gapiClientPlusdomains.AnonKey
import typingsSlinky.gapiClientPlusdomains.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CirclesResource extends js.Object {
  /** Add a person to a circle. Google+ limits certain circle operations, including the number of circle adds. Learn More. */
  def addPeople(request: AnonCircleId): Request_[Circle] = js.native
  /** Get a circle. */
  def get(request: AnonKey): Request_[Circle] = js.native
  /** Create a new circle for the authenticated user. */
  def insert(request: AnonOauthtoken): Request_[Circle] = js.native
  /** List all of the circles for a user. */
  def list(request: AnonFields): Request_[CircleFeed] = js.native
  /** Update a circle's description. This method supports patch semantics. */
  def patch(request: AnonKey): Request_[Circle] = js.native
  /** Delete a circle. */
  def remove(request: AnonKey): Request_[Unit] = js.native
  /** Remove a person from a circle. */
  def removePeople(request: AnonCircleId): Request_[Unit] = js.native
  /** Update a circle's description. */
  def update(request: AnonKey): Request_[Circle] = js.native
}

object CirclesResource {
  @scala.inline
  def apply(
    addPeople: AnonCircleId => Request_[Circle],
    get: AnonKey => Request_[Circle],
    insert: AnonOauthtoken => Request_[Circle],
    list: AnonFields => Request_[CircleFeed],
    patch: AnonKey => Request_[Circle],
    remove: AnonKey => Request_[Unit],
    removePeople: AnonCircleId => Request_[Unit],
    update: AnonKey => Request_[Circle]
  ): CirclesResource = {
    val __obj = js.Dynamic.literal(addPeople = js.Any.fromFunction1(addPeople), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), remove = js.Any.fromFunction1(remove), removePeople = js.Any.fromFunction1(removePeople), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CirclesResource]
  }
  @scala.inline
  implicit class CirclesResourceOps[Self <: CirclesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddPeople(value: AnonCircleId => Request_[Circle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPeople")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonKey => Request_[Circle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonOauthtoken => Request_[Circle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[CircleFeed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonKey => Request_[Circle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: AnonKey => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemovePeople(value: AnonCircleId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removePeople")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonKey => Request_[Circle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

