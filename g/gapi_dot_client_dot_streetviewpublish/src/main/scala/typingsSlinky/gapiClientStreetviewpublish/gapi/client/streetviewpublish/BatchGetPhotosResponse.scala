package typingsSlinky.gapiClientStreetviewpublish.gapi.client.streetviewpublish

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetPhotosResponse extends js.Object {
  /**
    * List of results for each individual
    * Photo requested, in the same order as
    * the requests in
    * BatchGetPhotos.
    */
  var results: js.UndefOr[js.Array[PhotoResponse]] = js.native
}

object BatchGetPhotosResponse {
  @scala.inline
  def apply(): BatchGetPhotosResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetPhotosResponse]
  }
  @scala.inline
  implicit class BatchGetPhotosResponseOps[Self <: BatchGetPhotosResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResults(value: js.Array[PhotoResponse]): Self = {
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

