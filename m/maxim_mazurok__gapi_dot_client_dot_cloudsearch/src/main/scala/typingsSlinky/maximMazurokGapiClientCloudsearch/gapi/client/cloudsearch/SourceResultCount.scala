package typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceResultCount extends js.Object {
  
  /** Whether there are more search results for this source. */
  var hasMoreResults: js.UndefOr[Boolean] = js.native
  
  /** The estimated result count for this source. */
  var resultCountEstimate: js.UndefOr[String] = js.native
  
  /** The exact result count for this source. */
  var resultCountExact: js.UndefOr[String] = js.native
  
  /** The source the result count information is associated with. */
  var source: js.UndefOr[Source] = js.native
}
object SourceResultCount {
  
  @scala.inline
  def apply(): SourceResultCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceResultCount]
  }
  
  @scala.inline
  implicit class SourceResultCountOps[Self <: SourceResultCount] (val x: Self) extends AnyVal {
    
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
    def setHasMoreResults(value: Boolean): Self = this.set("hasMoreResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasMoreResults: Self = this.set("hasMoreResults", js.undefined)
    
    @scala.inline
    def setResultCountEstimate(value: String): Self = this.set("resultCountEstimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultCountEstimate: Self = this.set("resultCountEstimate", js.undefined)
    
    @scala.inline
    def setResultCountExact(value: String): Self = this.set("resultCountExact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultCountExact: Self = this.set("resultCountExact", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
