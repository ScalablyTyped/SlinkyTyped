package typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchApplicationSessionStats extends js.Object {
  
  /** Date for which session stats were calculated. Stats calculated on the next day close to midnight are returned. */
  var date: js.UndefOr[Date] = js.native
  
  /** The count of search sessions on the day */
  var searchSessionsCount: js.UndefOr[String] = js.native
}
object SearchApplicationSessionStats {
  
  @scala.inline
  def apply(): SearchApplicationSessionStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchApplicationSessionStats]
  }
  
  @scala.inline
  implicit class SearchApplicationSessionStatsOps[Self <: SearchApplicationSessionStats] (val x: Self) extends AnyVal {
    
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
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setSearchSessionsCount(value: String): Self = this.set("searchSessionsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchSessionsCount: Self = this.set("searchSessionsCount", js.undefined)
  }
}
