package typingsSlinky.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Datastore.ReserveIds.
  */
@js.native
trait SchemaReserveIdsRequest extends js.Object {
  /**
    * If not empty, the ID of the database against which to make the request.
    */
  var databaseId: js.UndefOr[String] = js.native
  /**
    * A list of keys with complete key paths whose numeric IDs should not be
    * auto-allocated.
    */
  var keys: js.UndefOr[js.Array[SchemaKey]] = js.native
}

object SchemaReserveIdsRequest {
  @scala.inline
  def apply(): SchemaReserveIdsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReserveIdsRequest]
  }
  @scala.inline
  implicit class SchemaReserveIdsRequestOps[Self <: SchemaReserveIdsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabaseId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseId")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: js.Array[SchemaKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
  }
  
}

