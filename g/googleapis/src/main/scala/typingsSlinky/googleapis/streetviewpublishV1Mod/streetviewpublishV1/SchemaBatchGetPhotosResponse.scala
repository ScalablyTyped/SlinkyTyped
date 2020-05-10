package typingsSlinky.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to batch get of Photos.
  */
@js.native
trait SchemaBatchGetPhotosResponse extends js.Object {
  /**
    * List of results for each individual Photo requested, in the same order as
    * the requests in BatchGetPhotos.
    */
  var results: js.UndefOr[js.Array[SchemaPhotoResponse]] = js.native
}

object SchemaBatchGetPhotosResponse {
  @scala.inline
  def apply(): SchemaBatchGetPhotosResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchGetPhotosResponse]
  }
  @scala.inline
  implicit class SchemaBatchGetPhotosResponseOps[Self <: SchemaBatchGetPhotosResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResults(value: js.Array[SchemaPhotoResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
  }
  
}

