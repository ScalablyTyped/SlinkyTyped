package typingsSlinky.gapiClientStreetviewpublish.gapi.client.streetviewpublish

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResultsVarargs(value: PhotoResponse*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[PhotoResponse]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
}
