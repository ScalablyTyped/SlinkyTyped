package typingsSlinky.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to batch update of metadata of one or more Photos.
  */
@js.native
trait SchemaBatchUpdatePhotosResponse extends js.Object {
  /**
    * List of results for each individual Photo updated, in the same order as
    * the request.
    */
  var results: js.UndefOr[js.Array[SchemaPhotoResponse]] = js.native
}

object SchemaBatchUpdatePhotosResponse {
  @scala.inline
  def apply(): SchemaBatchUpdatePhotosResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdatePhotosResponse]
  }
  @scala.inline
  implicit class SchemaBatchUpdatePhotosResponseOps[Self <: SchemaBatchUpdatePhotosResponse] (val x: Self) extends AnyVal {
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

