package typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Firestore.ListCollectionIds.
  */
@js.native
trait SchemaListCollectionIdsRequest extends js.Object {
  /**
    * The maximum number of results to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A page token. Must be a value from ListCollectionIdsResponse.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object SchemaListCollectionIdsRequest {
  @scala.inline
  def apply(): SchemaListCollectionIdsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCollectionIdsRequest]
  }
  @scala.inline
  implicit class SchemaListCollectionIdsRequestOps[Self <: SchemaListCollectionIdsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
  }
  
}

