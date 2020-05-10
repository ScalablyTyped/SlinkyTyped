package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonFields
import typingsSlinky.gapiClientDfareporting.AnonKey
import typingsSlinky.gapiClientDfareporting.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementStrategiesResource extends js.Object {
  /** Deletes an existing placement strategy. */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /** Gets one placement strategy by ID. */
  def get(request: AnonFields): Request_[PlacementStrategy] = js.native
  /** Inserts a new placement strategy. */
  def insert(request: AnonKey): Request_[PlacementStrategy] = js.native
  /** Retrieves a list of placement strategies, possibly filtered. This method supports paging. */
  def list(request: AnonOauthtoken): Request_[PlacementStrategiesListResponse] = js.native
  /** Updates an existing placement strategy. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[PlacementStrategy] = js.native
  /** Updates an existing placement strategy. */
  def update(request: AnonKey): Request_[PlacementStrategy] = js.native
}

object PlacementStrategiesResource {
  @scala.inline
  def apply(
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[PlacementStrategy],
    insert: AnonKey => Request_[PlacementStrategy],
    list: AnonOauthtoken => Request_[PlacementStrategiesListResponse],
    patch: AnonFields => Request_[PlacementStrategy],
    update: AnonKey => Request_[PlacementStrategy]
  ): PlacementStrategiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PlacementStrategiesResource]
  }
  @scala.inline
  implicit class PlacementStrategiesResourceOps[Self <: PlacementStrategiesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFields => Request_[PlacementStrategy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonKey => Request_[PlacementStrategy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonOauthtoken => Request_[PlacementStrategiesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonFields => Request_[PlacementStrategy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonKey => Request_[PlacementStrategy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

