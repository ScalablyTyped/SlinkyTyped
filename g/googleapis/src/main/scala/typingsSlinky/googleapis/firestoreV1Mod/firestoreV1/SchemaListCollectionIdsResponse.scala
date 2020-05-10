package typingsSlinky.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response from Firestore.ListCollectionIds.
  */
@js.native
trait SchemaListCollectionIdsResponse extends js.Object {
  /**
    * The collection ids.
    */
  var collectionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * A page token that may be used to continue the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListCollectionIdsResponse {
  @scala.inline
  def apply(): SchemaListCollectionIdsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCollectionIdsResponse]
  }
  @scala.inline
  implicit class SchemaListCollectionIdsResponseOps[Self <: SchemaListCollectionIdsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollectionIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionIds")(js.undefined)
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

