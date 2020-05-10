package typingsSlinky.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response payload for a single Photo in batch operations including
  * BatchGetPhotos and BatchUpdatePhotos.
  */
@js.native
trait SchemaPhotoResponse extends js.Object {
  /**
    * The Photo resource, if the request was successful.
    */
  var photo: js.UndefOr[SchemaPhoto] = js.native
  /**
    * The status for the operation to get or update a single photo in the batch
    * request.
    */
  var status: js.UndefOr[SchemaStatus] = js.native
}

object SchemaPhotoResponse {
  @scala.inline
  def apply(): SchemaPhotoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPhotoResponse]
  }
  @scala.inline
  implicit class SchemaPhotoResponseOps[Self <: SchemaPhotoResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPhoto(value: SchemaPhoto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: SchemaStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

