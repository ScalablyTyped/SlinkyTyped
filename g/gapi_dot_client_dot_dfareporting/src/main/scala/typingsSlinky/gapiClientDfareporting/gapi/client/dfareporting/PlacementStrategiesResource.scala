package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.Fields
import typingsSlinky.gapiClientDfareporting.anon.Key
import typingsSlinky.gapiClientDfareporting.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementStrategiesResource extends js.Object {
  /** Deletes an existing placement strategy. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Gets one placement strategy by ID. */
  def get(request: Fields): Request[PlacementStrategy] = js.native
  /** Inserts a new placement strategy. */
  def insert(request: Key): Request[PlacementStrategy] = js.native
  /** Retrieves a list of placement strategies, possibly filtered. This method supports paging. */
  def list(request: Oauthtoken): Request[PlacementStrategiesListResponse] = js.native
  /** Updates an existing placement strategy. This method supports patch semantics. */
  def patch(request: Fields): Request[PlacementStrategy] = js.native
  /** Updates an existing placement strategy. */
  def update(request: Key): Request[PlacementStrategy] = js.native
}

object PlacementStrategiesResource {
  @scala.inline
  def apply(
    delete: Fields => Request[Unit],
    get: Fields => Request[PlacementStrategy],
    insert: Key => Request[PlacementStrategy],
    list: Oauthtoken => Request[PlacementStrategiesListResponse],
    patch: Fields => Request[PlacementStrategy],
    update: Key => Request[PlacementStrategy]
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
    def withDelete(value: Fields => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Fields => Request[PlacementStrategy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Key => Request[PlacementStrategy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Oauthtoken => Request[PlacementStrategiesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Fields => Request[PlacementStrategy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Key => Request[PlacementStrategy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

