package typingsSlinky.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for google.datastore.admin.v1.DatastoreAdmin.ListIndexes.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1ListIndexesResponse extends js.Object {
  /**
    * The indexes.
    */
  var indexes: js.UndefOr[js.Array[SchemaGoogleDatastoreAdminV1Index]] = js.native
  /**
    * The standard List next-page token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleDatastoreAdminV1ListIndexesResponse {
  @scala.inline
  def apply(): SchemaGoogleDatastoreAdminV1ListIndexesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1ListIndexesResponse]
  }
  @scala.inline
  implicit class SchemaGoogleDatastoreAdminV1ListIndexesResponseOps[Self <: SchemaGoogleDatastoreAdminV1ListIndexesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexes(value: js.Array[SchemaGoogleDatastoreAdminV1Index]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexes")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

