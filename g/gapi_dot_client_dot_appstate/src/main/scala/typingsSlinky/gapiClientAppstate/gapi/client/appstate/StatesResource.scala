package typingsSlinky.gapiClientAppstate.gapi.client.appstate

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAppstate.AnonAlt
import typingsSlinky.gapiClientAppstate.AnonCurrentStateVersion
import typingsSlinky.gapiClientAppstate.AnonFields
import typingsSlinky.gapiClientAppstate.AnonIncludeData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatesResource extends js.Object {
  /**
    * Clears (sets to empty) the data for the passed key if and only if the passed version matches the currently stored version. This method results in a
    * conflict error on version mismatch.
    */
  def clear(request: AnonAlt): Request_[WriteResult] = js.native
  /**
    * Deletes a key and the data associated with it. The key is removed and no longer counts against the key quota. Note that since this method is not safe
    * in the face of concurrent modifications, it should only be used for development and testing purposes. Invoking this method in shipping code can result
    * in data loss and data corruption.
    */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /** Retrieves the data corresponding to the passed key. If the key does not exist on the server, an HTTP 404 will be returned. */
  def get(request: AnonFields): Request_[GetResponse] = js.native
  /** Lists all the states keys, and optionally the state data. */
  def list(request: AnonIncludeData): Request_[ListResponse] = js.native
  /**
    * Update the data associated with the input key if and only if the passed version matches the currently stored version. This method is safe in the face
    * of concurrent writes. Maximum per-key size is 128KB.
    */
  def update(request: AnonCurrentStateVersion): Request_[WriteResult] = js.native
}

object StatesResource {
  @scala.inline
  def apply(
    clear: AnonAlt => Request_[WriteResult],
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[GetResponse],
    list: AnonIncludeData => Request_[ListResponse],
    update: AnonCurrentStateVersion => Request_[WriteResult]
  ): StatesResource = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[StatesResource]
  }
  @scala.inline
  implicit class StatesResourceOps[Self <: StatesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: AnonAlt => Request_[WriteResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFields => Request_[GetResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonIncludeData => Request_[ListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonCurrentStateVersion => Request_[WriteResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

