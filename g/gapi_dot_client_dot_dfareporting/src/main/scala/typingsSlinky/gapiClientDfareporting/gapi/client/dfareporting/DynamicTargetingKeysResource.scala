package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.Key
import typingsSlinky.gapiClientDfareporting.anon.Name
import typingsSlinky.gapiClientDfareporting.anon.Names
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicTargetingKeysResource extends js.Object {
  /** Deletes an existing dynamic targeting key. */
  def delete(request: Name): Request[Unit] = js.native
  /**
    * Inserts a new dynamic targeting key. Keys must be created at the advertiser level before being assigned to the advertiser's ads, creatives, or
    * placements. There is a maximum of 1000 keys per advertiser, out of which a maximum of 20 keys can be assigned per ad, creative, or placement.
    */
  def insert(request: Key): Request[DynamicTargetingKey] = js.native
  /** Retrieves a list of dynamic targeting keys. */
  def list(request: Names): Request[DynamicTargetingKeysListResponse] = js.native
}

object DynamicTargetingKeysResource {
  @scala.inline
  def apply(
    delete: Name => Request[Unit],
    insert: Key => Request[DynamicTargetingKey],
    list: Names => Request[DynamicTargetingKeysListResponse]
  ): DynamicTargetingKeysResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[DynamicTargetingKeysResource]
  }
  @scala.inline
  implicit class DynamicTargetingKeysResourceOps[Self <: DynamicTargetingKeysResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: Name => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Key => Request[DynamicTargetingKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Names => Request[DynamicTargetingKeysListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

